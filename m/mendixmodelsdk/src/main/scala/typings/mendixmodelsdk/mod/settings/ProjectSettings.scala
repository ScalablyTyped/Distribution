package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project-settings relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "settings.ProjectSettings")
@js.native
class ProjectSettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.ProjectSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}
object ProjectSettings {
  
  @JSImport("mendixmodelsdk", "settings.ProjectSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ProjectSettings unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IProject): typings.mendixmodelsdk.settingsMod.settings.ProjectSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.settingsMod.settings.ProjectSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ProjectSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "settings.ProjectSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
