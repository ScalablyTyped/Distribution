package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.MicroflowParameterBase")
@js.native
abstract class MicroflowParameterBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.MicroflowParameterBase {
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
@JSImport("mendixmodelsdk", "microflows.MicroflowParameterBase")
@js.native
object MicroflowParameterBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
}

