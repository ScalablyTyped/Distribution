package typings.mendixmodelsdk.projectsMod.projects

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.projectsMod.StructureVersionInfo
import typings.mendixmodelsdk.securityMod.security.IModuleSecurity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
- typings.mendixmodelsdk.projectsMod.projects.IModule because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSettings, moduleSecurity, fromAppStore, isReusableComponent, appStoreGuid, appStoreVersionGuid, appStoreVersion, appStorePackageId, exportLevel, isThemeModule */ @JSImport("mendixmodelsdk/src/gen/projects", "projects.Module")
@js.native
open class Module protected () extends FolderBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
  
  def appStoreGuid: String = js.native
  def appStoreGuid_=(newValue: String): Unit = js.native
  @JSName("appStoreGuid")
  var appStoreGuid_FModule: String = js.native
  
  /**
    * In version 8.13.0: introduced
    */
  def appStorePackageId: Double = js.native
  def appStorePackageId_=(newValue: Double): Unit = js.native
  /**
    * In version 8.13.0: introduced
    */
  @JSName("appStorePackageId")
  var appStorePackageId_FModule: Double = js.native
  
  def appStoreVersion: String = js.native
  
  def appStoreVersionGuid: String = js.native
  def appStoreVersionGuid_=(newValue: String): Unit = js.native
  @JSName("appStoreVersionGuid")
  var appStoreVersionGuid_FModule: String = js.native
  
  def appStoreVersion_=(newValue: String): Unit = js.native
  @JSName("appStoreVersion")
  var appStoreVersion_FModule: String = js.native
  
  @JSName("containerAsProject")
  def containerAsProject_MModule: Project = js.native
  
  def domainModel: IDomainModel = js.native
  def domainModel_=(newValue: IDomainModel): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("domainModel")
  var domainModel_FModule: IDomainModel = js.native
  
  /**
    * In version 9.8.0: deleted
    * In version 9.3.0: introduced
    */
  def exportLevel: ModuleExportLevel = js.native
  def exportLevel_=(newValue: ModuleExportLevel): Unit = js.native
  /**
    * In version 9.8.0: deleted
    * In version 9.3.0: introduced
    */
  @JSName("exportLevel")
  var exportLevel_FModule: ModuleExportLevel = js.native
  
  def fromAppStore: Boolean = js.native
  def fromAppStore_=(newValue: Boolean): Unit = js.native
  @JSName("fromAppStore")
  var fromAppStore_FModule: Boolean = js.native
  
  /**
    * In version 9.1.0: deleted
    * In version 8.5.0: introduced
    */
  def isReusableComponent: Boolean = js.native
  def isReusableComponent_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.1.0: deleted
    * In version 8.5.0: introduced
    */
  @JSName("isReusableComponent")
  var isReusableComponent_FModule: Boolean = js.native
  
  /**
    * In version 9.3.0: introduced
    */
  def isThemeModule: Boolean = js.native
  def isThemeModule_=(newValue: Boolean): Unit = js.native
  /**
    * In version 9.3.0: introduced
    */
  @JSName("isThemeModule")
  var isThemeModule_FModule: Boolean = js.native
  
  def moduleSecurity: IModuleSecurity = js.native
  def moduleSecurity_=(newValue: IModuleSecurity): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("moduleSecurity")
  var moduleSecurity_FModule: IModuleSecurity = js.native
  
  /**
    * In version 9.8.0: introduced
    */
  def moduleSettings: IModuleSettings = js.native
  def moduleSettings_=(newValue: IModuleSettings): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 9.8.0: introduced
    */
  @JSName("moduleSettings")
  var moduleSettings_FModule: IModuleSettings = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  @JSName("name")
  var name_FModule: String = js.native
  
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  def sortIndex: Double = js.native
  def sortIndex_=(newValue: Double): Unit = js.native
  /**
    * The index of where this Module appears in the project.
    * This property is <em>required</em>, and of type double.
    * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
    * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
    */
  @JSName("sortIndex")
  var sortIndex_FModule: Double = js.native
}
object Module {
  
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Module")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Module unit in the SDK and on the server.
    * Expects one argument, the IProject in which this unit is contained.
    */
  /* static member */
  inline def createIn(container: IProject): Module = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Module]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Module.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/projects", "projects.Module.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
