package typings.mendixmodelsdk.mendixmodelsdkMod.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.ProjectSettingsPart")
@js.native
abstract class ProjectSettingsPart protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings.ProjectSettingsPart {
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
@JSImport("mendixmodelsdk", "settings.ProjectSettingsPart")
@js.native
object ProjectSettingsPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo = js.native
}

