package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings

import typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettingsPart")
@js.native
abstract class ProjectSettingsPart protected ()
  extends typings.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettingsPart {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettingsPart")
@js.native
object ProjectSettingsPart extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

