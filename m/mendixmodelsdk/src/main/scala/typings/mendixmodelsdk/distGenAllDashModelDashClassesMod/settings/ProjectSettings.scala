package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings

import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-settings relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings")
@js.native
class ProjectSettings protected ()
  extends typings.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.ProjectSettings")
@js.native
object ProjectSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo = js.native
  /**
    * Creates a new ProjectSettings unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): typings.mendixmodelsdk.distGenSettingsMod.settings.ProjectSettings = js.native
}

