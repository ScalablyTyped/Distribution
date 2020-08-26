package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/committing-objects relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitAction")
@js.native
class CommitAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCommitAction: IModel = js.native
  def commitVariableName: String = js.native
  def commitVariableName_=(newValue: String): Unit = js.native
  def refreshInClient: Boolean = js.native
  def refreshInClient_=(newValue: Boolean): Unit = js.native
  def withEvents: Boolean = js.native
  def withEvents_=(newValue: Boolean): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.CommitAction")
@js.native
object CommitAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CommitAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CommitAction = js.native
  /**
    * Creates and returns a new CommitAction instance in the SDK and on the server.
    * The new CommitAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): CommitAction = js.native
}

