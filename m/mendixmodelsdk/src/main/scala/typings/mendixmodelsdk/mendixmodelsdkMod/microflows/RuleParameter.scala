package typings.mendixmodelsdk.mendixmodelsdkMod.microflows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/parameter relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "microflows.RuleParameter")
@js.native
class RuleParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.microflows.RuleParameter {
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
@JSImport("mendixmodelsdk", "microflows.RuleParameter")
@js.native
object RuleParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo = js.native
}

