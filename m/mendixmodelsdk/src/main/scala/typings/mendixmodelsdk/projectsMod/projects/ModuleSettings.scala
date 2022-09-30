package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/module-settings relevant section in reference guide}
  *
  * In version 9.8.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModuleSettings because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleSettings")
@js.native
open class ModuleSettings protected () extends ModuleDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IModule
  ) = this()
  
  @JSName("containerAsModule")
  def containerAsModule_MModuleSettings: Module = js.native
  
  def exportLevel: ModuleExportLevel = js.native
  def exportLevel_=(newValue: ModuleExportLevel): Unit = js.native
  
  /**
    * In version 9.12.0: introduced
    */
  def protectedModuleType: ProtectedModuleType = js.native
  def protectedModuleType_=(newValue: ProtectedModuleType): Unit = js.native
  
  def version: String = js.native
  def version_=(newValue: String): Unit = js.native
}
object ModuleSettings {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ModuleSettings unit in the SDK and on the server.
    * Expects one argument, the IModule in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IModule): ModuleSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ModuleSettings]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.ModuleSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
