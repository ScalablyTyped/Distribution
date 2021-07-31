package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IDomainModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.internalMod.StructuralUnit
import typings.mendixmodelsdk.securityMod.security.IModuleSecurity
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.IModelUnit
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/projects", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object projects {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because var conflicts: containerAsFolderBase, containerAsModule, id, isLoaded, model, structureTypeName, unit. Inlined name */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document")
    @js.native
    abstract class Document protected ()
      extends ModuleDocument
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MDocument: FolderBase = js.native
      
      def documentation: String = js.native
      def documentation_=(newValue: String): Unit = js.native
      
      def excluded: Boolean = js.native
      def excluded_=(newValue: Boolean): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FDocument: String = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MDocument: String | Null = js.native
    }
    object Document {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Document.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IFolder because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined name */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
    @js.native
    class Folder protected () extends FolderBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MFolder: FolderBase = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      var name_FFolder: String = js.native
    }
    object Folder {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Folder unit in the SDK and on the server.
        * Expects one argument, the IFolderBase in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IFolderBase): Folder = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Folder]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Folder.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
    @js.native
    abstract class FolderBase protected () extends StructuralUnit[IModel] {
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
      
      def containerAsFolderBase: FolderBase = js.native
      @JSName("containerAsFolderBase")
      val containerAsFolderBase_FFolderBase: IFolderBase = js.native
      
      def containerAsProject: Project = js.native
      @JSName("containerAsProject")
      val containerAsProject_FFolderBase: IProject = js.native
      
      def documents: IList[IDocument] = js.native
      @JSName("documents")
      var documents_FFolderBase: IList[IDocument] = js.native
      
      def folders: IList[IFolder] = js.native
      @JSName("folders")
      var folders_FFolderBase: IList[IFolder] = js.native
    }
    object FolderBase {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.FolderBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IFolderBase because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModule because var conflicts: containerAsFolderBase, containerAsProject, documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSecurity, fromAppStore, isReusableComponent, appStoreGuid, appStoreVersionGuid, appStoreVersion, appStorePackageId */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
    @js.native
    class Module protected () extends FolderBase {
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
      
      def fromAppStore: Boolean = js.native
      def fromAppStore_=(newValue: Boolean): Unit = js.native
      @JSName("fromAppStore")
      var fromAppStore_FModule: Boolean = js.native
      
      /**
        * In version 8.5.0: introduced
        */
      def isReusableComponent: Boolean = js.native
      def isReusableComponent_=(newValue: Boolean): Unit = js.native
      /**
        * In version 8.5.0: introduced
        */
      @JSName("isReusableComponent")
      var isReusableComponent_FModule: Boolean = js.native
      
      def moduleSecurity: IModuleSecurity = js.native
      def moduleSecurity_=(newValue: IModuleSecurity): Unit = js.native
      /**
        * This property is required and cannot be set to null.
        */
      @JSName("moduleSecurity")
      var moduleSecurity_FModule: IModuleSecurity = js.native
      
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
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Module unit in the SDK and on the server.
        * Expects one argument, the IProject in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IProject): Module = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Module]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Module.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsModule */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
    @js.native
    abstract class ModuleDocument protected () extends ModelUnit[IModel] {
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
      
      def containerAsFolderBase: FolderBase = js.native
      @JSName("containerAsFolderBase")
      val containerAsFolderBase_FModuleDocument: IFolderBase = js.native
      
      def containerAsModule: Module = js.native
      @JSName("containerAsModule")
      val containerAsModule_FModuleDocument: IModule = js.native
    }
    object ModuleDocument {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ModuleDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker")
    @js.native
    class OneTimeConversionMarker protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsProjectConversion: ProjectConversion = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
    }
    object OneTimeConversionMarker {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      @scala.inline
      def create(model: IModel): OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[OneTimeConversionMarker]
      
      /**
        * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
        * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
        * of the parent ProjectConversion element passed as argument.
        */
      /* static member */
      @scala.inline
      def createIn(container: ProjectConversion): OneTimeConversionMarker = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[OneTimeConversionMarker]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.OneTimeConversionMarker.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IStructuralUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IProject because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined projectDocuments, modules, projectConversion, isSystemProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project")
    @js.native
    class Project protected () extends StructuralUnit[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IStructuralUnit
      ) = this()
      
      def isSystemProject: Boolean = js.native
      def isSystemProject_=(newValue: Boolean): Unit = js.native
      @JSName("isSystemProject")
      var isSystemProject_FProject: Boolean = js.native
      
      def modules: IList[IModule] = js.native
      @JSName("modules")
      var modules_FProject: IList[IModule] = js.native
      
      def projectConversion: IProjectConversion = js.native
      def projectConversion_=(newValue: IProjectConversion): Unit = js.native
      /**
        * This property is required and cannot be set to null.
        */
      @JSName("projectConversion")
      var projectConversion_FProject: IProjectConversion = js.native
      
      def projectDocuments: IList[IProjectDocument] = js.native
      @JSName("projectDocuments")
      var projectDocuments_FProject: IList[IProjectDocument] = js.native
    }
    object Project {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.Project.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IProjectConversion because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
    @js.native
    class ProjectConversion protected () extends ModelUnit[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      
      def containerAsProject: Project = js.native
      @JSName("containerAsProject")
      val containerAsProject_FProjectConversion: IProject = js.native
      
      def markers: IList[OneTimeConversionMarker] = js.native
    }
    object ProjectConversion {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ProjectConversion unit in the SDK and on the server.
        * Expects one argument, the IProject in which this unit is contained.
        */
      /* static member */
      @scala.inline
      def createIn(container: IProject): ProjectConversion = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ProjectConversion]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectConversion.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IProjectDocument because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined containerAsProject */ @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument")
    @js.native
    abstract class ProjectDocument protected () extends ModelUnit[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      
      def containerAsProject: Project = js.native
      @JSName("containerAsProject")
      val containerAsProject_FProjectDocument: IProject = js.native
    }
    object ProjectDocument {
      
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      @scala.inline
      def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/projects", "projects.ProjectDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      @scala.inline
      def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @js.native
    trait IDocument
      extends StObject
         with IModuleDocument
         with IByNameReferrable {
      
      val name: String = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/resources relevant section in reference guide}
      */
    trait IFolder
      extends StObject
         with IFolderBase {
      
      var name: String
    }
    object IFolder {
      
      @scala.inline
      def apply(
        allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        container: IStructuralUnit,
        containerAsFolderBase: IFolderBase,
        containerAsProject: IProject,
        delete: () => Unit,
        documents: IList[IDocument],
        folders: IList[IFolder],
        id: String,
        isLoadable: Boolean,
        isLoaded: Boolean,
        isReadOnly: Boolean,
        loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        model: IModel,
        name: String,
        publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        structureTypeName: String,
        toJSON: () => js.Object,
        traverse: js.Function1[IFolder, Unit] => Unit,
        traverseFind: js.Function1[IFolder, js.Any] => js.Any | Null,
        traversePublicParts: js.Function1[IFolder, Unit] => Unit,
        unit: IAbstractUnit
      ): IFolder = {
        val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFolder]
      }
      
      @scala.inline
      implicit class IFolderMutableBuilder[Self <: IFolder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait IFolderBase
      extends StObject
         with IStructuralUnit {
      
      val containerAsFolderBase: IFolderBase
      
      val containerAsProject: IProject
      
      var documents: IList[IDocument]
      
      var folders: IList[IFolder]
      
      @JSName("model")
      val model_IFolderBase: IModel
    }
    object IFolderBase {
      
      @scala.inline
      def apply(
        allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        container: IStructuralUnit,
        containerAsFolderBase: IFolderBase,
        containerAsProject: IProject,
        delete: () => Unit,
        documents: IList[IDocument],
        folders: IList[IFolder],
        id: String,
        isLoadable: Boolean,
        isLoaded: Boolean,
        isReadOnly: Boolean,
        loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        model: IModel,
        publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        structureTypeName: String,
        toJSON: () => js.Object,
        traverse: js.Function1[IFolderBase, Unit] => Unit,
        traverseFind: js.Function1[IFolderBase, js.Any] => js.Any | Null,
        traversePublicParts: js.Function1[IFolderBase, Unit] => Unit,
        unit: IAbstractUnit
      ): IFolderBase = {
        val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFolderBase]
      }
      
      @scala.inline
      implicit class IFolderBaseMutableBuilder[Self <: IFolderBase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainerAsFolderBase(value: IFolderBase): Self = StObject.set(x, "containerAsFolderBase", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerAsProject(value: IProject): Self = StObject.set(x, "containerAsProject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocuments(value: IList[IDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFolders(value: IList[IFolder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/modules relevant section in reference guide}
      */
    trait IModule
      extends StObject
         with IFolderBase {
      
      var appStoreGuid: String
      
      /**
        * In version 8.13.0: introduced
        */
      var appStorePackageId: Double
      
      var appStoreVersion: String
      
      var appStoreVersionGuid: String
      
      /**
        * This property is required and cannot be set to null.
        */
      var domainModel: IDomainModel
      
      var fromAppStore: Boolean
      
      /**
        * In version 8.5.0: introduced
        */
      var isReusableComponent: Boolean
      
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
    object IModule {
      
      @scala.inline
      def apply(
        allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        appStoreGuid: String,
        appStorePackageId: Double,
        appStoreVersion: String,
        appStoreVersionGuid: String,
        container: IStructuralUnit,
        containerAsFolderBase: IFolderBase,
        containerAsProject: IProject,
        delete: () => Unit,
        documents: IList[IDocument],
        domainModel: IDomainModel,
        folders: IList[IFolder],
        fromAppStore: Boolean,
        id: String,
        isLoadable: Boolean,
        isLoaded: Boolean,
        isReadOnly: Boolean,
        isReusableComponent: Boolean,
        loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        model: IModel,
        moduleSecurity: IModuleSecurity,
        name: String,
        publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        sortIndex: Double,
        structureTypeName: String,
        toJSON: () => js.Object,
        traverse: js.Function1[IModule, Unit] => Unit,
        traverseFind: js.Function1[IModule, js.Any] => js.Any | Null,
        traversePublicParts: js.Function1[IModule, Unit] => Unit,
        unit: IAbstractUnit
      ): IModule = {
        val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), appStoreGuid = appStoreGuid.asInstanceOf[js.Any], appStorePackageId = appStorePackageId.asInstanceOf[js.Any], appStoreVersion = appStoreVersion.asInstanceOf[js.Any], appStoreVersionGuid = appStoreVersionGuid.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], containerAsFolderBase = containerAsFolderBase.asInstanceOf[js.Any], containerAsProject = containerAsProject.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), documents = documents.asInstanceOf[js.Any], domainModel = domainModel.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], fromAppStore = fromAppStore.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isReusableComponent = isReusableComponent.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], moduleSecurity = moduleSecurity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), sortIndex = sortIndex.asInstanceOf[js.Any], structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
        __obj.asInstanceOf[IModule]
      }
      
      @scala.inline
      implicit class IModuleMutableBuilder[Self <: IModule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppStoreGuid(value: String): Self = StObject.set(x, "appStoreGuid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppStorePackageId(value: Double): Self = StObject.set(x, "appStorePackageId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppStoreVersion(value: String): Self = StObject.set(x, "appStoreVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppStoreVersionGuid(value: String): Self = StObject.set(x, "appStoreVersionGuid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainModel(value: IDomainModel): Self = StObject.set(x, "domainModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromAppStore(value: Boolean): Self = StObject.set(x, "fromAppStore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReusableComponent(value: Boolean): Self = StObject.set(x, "isReusableComponent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModuleSecurity(value: IModuleSecurity): Self = StObject.set(x, "moduleSecurity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Projects`.
      */
    @js.native
    trait IModuleDocument
      extends StObject
         with IModelUnit {
      
      val containerAsFolderBase: IFolderBase = js.native
      
      val containerAsModule: IModule = js.native
      
      @JSName("model")
      val model_IModuleDocument: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
      */
    trait IProject
      extends StObject
         with IStructuralUnit {
      
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
    object IProject {
      
      @scala.inline
      def apply(
        allProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        container: IStructuralUnit,
        delete: () => Unit,
        id: String,
        isLoadable: Boolean,
        isLoaded: Boolean,
        isReadOnly: Boolean,
        isSystemProject: Boolean,
        loadedProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        model: IModel,
        modules: IList[IModule],
        projectConversion: IProjectConversion,
        projectDocuments: IList[IProjectDocument],
        publicProperties: () => js.Array[AbstractProperty[js.Any, js.Any]],
        structureTypeName: String,
        toJSON: () => js.Object,
        traverse: js.Function1[IProject, Unit] => Unit,
        traverseFind: js.Function1[IProject, js.Any] => js.Any | Null,
        traversePublicParts: js.Function1[IProject, Unit] => Unit,
        unit: IAbstractUnit
      ): IProject = {
        val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container.asInstanceOf[js.Any], delete = js.Any.fromFunction0(delete), id = id.asInstanceOf[js.Any], isLoadable = isLoadable.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isReadOnly = isReadOnly.asInstanceOf[js.Any], isSystemProject = isSystemProject.asInstanceOf[js.Any], loadedProperties = js.Any.fromFunction0(loadedProperties), model = model.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], projectConversion = projectConversion.asInstanceOf[js.Any], projectDocuments = projectDocuments.asInstanceOf[js.Any], publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProject]
      }
      
      @scala.inline
      implicit class IProjectMutableBuilder[Self <: IProject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsSystemProject(value: Boolean): Self = StObject.set(x, "isSystemProject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModules(value: IList[IModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectConversion(value: IProjectConversion): Self = StObject.set(x, "projectConversion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectDocuments(value: IList[IProjectDocument]): Self = StObject.set(x, "projectDocuments", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IProjectConversion
      extends StObject
         with IModelUnit {
      
      val containerAsProject: IProject = js.native
      
      @JSName("model")
      val model_IProjectConversion: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/project relevant section in reference guide}
      */
    @js.native
    trait IProjectDocument
      extends StObject
         with IModelUnit {
      
      val containerAsProject: IProject = js.native
      
      @JSName("model")
      val model_IProjectDocument: IModel = js.native
    }
  }
}
