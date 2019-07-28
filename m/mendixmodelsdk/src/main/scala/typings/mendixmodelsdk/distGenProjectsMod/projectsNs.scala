package typings.mendixmodelsdk.distGenProjectsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IDomainModel
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Folder
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolder
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModuleDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectConversion
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Module
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ModuleDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.OneTimeConversionMarker
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Project
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ProjectConversion
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleSecurity
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalMod.StructuralUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/projects", "projects")
@js.native
object projectsNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined name */ @js.native
  abstract class Document protected () extends ModuleDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    @JSName("containerAsFolderBase")
    val containerAsFolderBase_Document: FolderBase = js.native
    var documentation: String = js.native
    var excluded: Boolean = js.native
    var name: String = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolder because var conflicts: documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined name */ @js.native
  class Folder protected () extends FolderBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    @JSName("containerAsFolderBase")
    val containerAsFolderBase_Folder: FolderBase = js.native
    var name: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @js.native
  abstract class FolderBase protected () extends StructuralUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    val containerAsFolderBase: FolderBase | IFolderBase = js.native
    val containerAsProject: IProject | Project = js.native
    val documents: IList[IDocument] = js.native
    val folders: IList[IFolder] = js.native
    @JSName("model")
    var model_FolderBase: IModel = js.native
  }
  
  @js.native
  trait IDocument
    extends IModuleDocument
       with IByNameReferrable {
    val name: String = js.native
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  trait IFolder extends IFolderBase {
    var name: String
  }
  
  trait IFolderBase extends IAbstractUnit {
    val containerAsFolderBase: IFolderBase
    val containerAsProject: IProject
    var documents: IList[IDocument]
    var folders: IList[IFolder]
    @JSName("model")
    val model_IFolderBase: IModel
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  trait IModule extends IFolderBase {
    var appStoreGuid: String
    var appStoreVersion: String
    var appStoreVersionGuid: String
    /**
      * This property is required and cannot be set to null.
      */
    var domainModel: IDomainModel
    var fromAppStore: Boolean
    /**
      * This property is required and cannot be set to null.
      */
    var moduleSecurity: IModuleSecurity
    var name: String
    /**
      * The index of where this Module appears in the project.
      * This property is <em>required</em>, and of type double.
      * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
      * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
      */
    var sortIndex: Double
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Projects`.
    */
  @js.native
  trait IModuleDocument extends IModelUnit {
    val containerAsFolderBase: IFolderBase = js.native
    val containerAsModule: IModule = js.native
    @JSName("model")
    val model_IModuleDocument: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  trait IProject extends IAbstractUnit {
    var isSystemProject: Boolean
    @JSName("model")
    val model_IProject: IModel
    var modules: IList[IModule]
    /**
      * This property is required and cannot be set to null.
      */
    var projectConversion: IProjectConversion
    var projectDocuments: IList[IProjectDocument]
  }
  
  @js.native
  trait IProjectConversion extends IModelUnit {
    val containerAsProject: IProject = js.native
    @JSName("model")
    val model_IProjectConversion: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  trait IProjectDocument extends IModelUnit {
    val containerAsProject: IProject = js.native
    @JSName("model")
    val model_IProjectDocument: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule because var conflicts: documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSecurity, fromAppStore, appStoreGuid, appStoreVersionGuid, appStoreVersion */ @js.native
  class Module protected () extends FolderBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    var appStoreGuid: String = js.native
    var appStoreVersion: String = js.native
    var appStoreVersionGuid: String = js.native
    @JSName("containerAsProject")
    val containerAsProject_Module: Project = js.native
    var domainModel: IDomainModel = js.native
    var fromAppStore: Boolean = js.native
    var moduleSecurity: IModuleSecurity = js.native
    var name: String = js.native
    /**
      * The index of where this Module appears in the project.
      * This property is <em>required</em>, and of type double.
      * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
      * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
      */
    var sortIndex: Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModuleDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsModule */ @js.native
  abstract class ModuleDocument protected () extends ModelUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
    val containerAsFolderBase: FolderBase | IFolderBase = js.native
    val containerAsModule: IModule | Module = js.native
    @JSName("model")
    var model_ModuleDocument: IModel = js.native
  }
  
  @js.native
  class OneTimeConversionMarker protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsProjectConversion: ProjectConversion = js.native
    @JSName("model")
    var model_OneTimeConversionMarker: IModel = js.native
    var name: String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined projectDocuments, modules, projectConversion, isSystemProject */ @js.native
  class Project protected () extends StructuralUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
    var isSystemProject: Boolean = js.native
    @JSName("model")
    var model_Project: IModel = js.native
    val modules: IList[IModule] = js.native
    var projectConversion: IProjectConversion = js.native
    val projectDocuments: IList[IProjectDocument] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectConversion because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProject */ @js.native
  class ProjectConversion protected () extends ModelUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    val containerAsProject: IProject | Project = js.native
    val markers: IList[OneTimeConversionMarker] = js.native
    @JSName("model")
    var model_ProjectConversion: IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProject */ @js.native
  abstract class ProjectDocument protected () extends ModelUnit {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    val containerAsProject: IProject | Project = js.native
    @JSName("model")
    var model_ProjectDocument: IModel = js.native
  }
  
  /* static members */
  @js.native
  object Document extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Folder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): Folder = js.native
  }
  
  /* static members */
  @js.native
  object FolderBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Module extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): Module = js.native
  }
  
  /* static members */
  @js.native
  object ModuleDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object OneTimeConversionMarker extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): OneTimeConversionMarker = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    def createIn(container: ProjectConversion): OneTimeConversionMarker = js.native
  }
  
  /* static members */
  @js.native
  object Project extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ProjectConversion extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): ProjectConversion = js.native
  }
  
  /* static members */
  @js.native
  object ProjectDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
}

