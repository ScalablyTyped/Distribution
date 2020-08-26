package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/show-page relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowPageAction")
@js.native
class ShowPageAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FShowPageAction: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.11.0: introduced
    */
  def numberOfPagesToClose: String = js.native
  def numberOfPagesToClose_=(newValue: String): Unit = js.native
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
  def passedObjectVariableName: String = js.native
  def passedObjectVariableName_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowPageAction")
@js.native
object ShowPageAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ShowPageAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ShowPageAction = js.native
  /**
    * Creates and returns a new ShowPageAction instance in the SDK and on the server.
    * The new ShowPageAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): ShowPageAction = js.native
}

