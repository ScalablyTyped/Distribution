package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-call relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.MicroflowCallAction")
@js.native
class MicroflowCallAction protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.MicroflowCallAction {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "microflows.MicroflowCallAction")
@js.native
object MicroflowCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowCallAction = js.native
  /**
    * Creates and returns a new MicroflowCallAction instance in the SDK and on the server.
    * The new MicroflowCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowCallAction = js.native
}

