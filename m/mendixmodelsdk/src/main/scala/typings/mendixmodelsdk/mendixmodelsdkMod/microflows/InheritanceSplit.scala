package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/inheritance-split relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.InheritanceSplit")
@js.native
class InheritanceSplit protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.InheritanceSplit {
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
@JSImport("mendixmodelsdk", "microflows.InheritanceSplit")
@js.native
object InheritanceSplit extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceSplit = js.native
  /**
    * Creates and returns a new InheritanceSplit instance in the SDK and on the server.
    * The new InheritanceSplit will be automatically stored in the 'objects' property
    * of the parent MicroflowObjectCollection element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowObjectCollection): typings.mendixmodelsdk.distGenMicroflowsMod.microflows.InheritanceSplit = js.native
}

