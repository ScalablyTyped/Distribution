package typings.mendixmodelsdk.settingsMod.settings

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.Project
import typings.mendixmodelsdk.projectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project-settings relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IProjectDocument because Already inherited
- typings.mendixmodelsdk.settingsMod.settings.IProjectSettings because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings")
@js.native
class ProjectSettings protected () extends ProjectDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  @JSName("containerAsProject")
  def containerAsProject_MProjectSettings: Project = js.native
  
  def settingsParts: IList[ProjectSettingsPart] = js.native
}
object ProjectSettings {
  
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ProjectSettings unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  /* static member */
  @scala.inline
  def createIn(container: IProject): ProjectSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ProjectSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/settings", "settings.ProjectSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
