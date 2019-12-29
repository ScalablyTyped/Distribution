package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/change-object relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ChangeObjectAction")
@js.native
class ChangeObjectAction protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeObjectAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.ChangeObjectAction")
@js.native
object ChangeObjectAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeObjectAction = js.native
  /**
    * Creates and returns a new ChangeObjectAction instance in the SDK and on the server.
    * The new ChangeObjectAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeObjectAction = js.native
}

