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
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.NanoflowCall")
@js.native
class NanoflowCall protected ()
  extends typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCall {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "microflows.NanoflowCall")
@js.native
object NanoflowCall extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCall = js.native
  /**
    * Creates and returns a new NanoflowCall instance in the SDK and on the server.
    * The new NanoflowCall will be automatically stored in the 'nanoflowCall' property
    * of the parent NanoflowCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCallAction): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCall = js.native
}

