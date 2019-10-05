package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/synchronize relevant section in reference guide}
  *
  * In version 7.22.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SynchronizeAction")
@js.native
class SynchronizeAction protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SynchronizeAction {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.SynchronizeAction")
@js.native
object SynchronizeAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SynchronizeAction = js.native
  /**
    * Creates and returns a new SynchronizeAction instance in the SDK and on the server.
    * The new SynchronizeAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.22.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.ActionActivity): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.SynchronizeAction = js.native
}

