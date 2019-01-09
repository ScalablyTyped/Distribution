package typings
package mendixmodelsdkLib.distGenProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/projects", "projects")
@js.native
object projectsNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined name, asLoaded, load, load, load, load */ @js.native
  abstract class Document protected () extends ModuleDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IFolderBase) = this()
    var documentation: java.lang.String = js.native
    var excluded: scala.Boolean = js.native
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolder because var conflicts: documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined name */ @js.native
  class Folder protected () extends FolderBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IFolderBase) = this()
    var name: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsProject, folders, documents */ @js.native
  abstract class FolderBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.StructuralUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IFolderBase) = this()
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IProject) = this()
    val containerAsFolderBase: FolderBase | IFolderBase = js.native
    val containerAsProject: IProject | Project = js.native
    val documents: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IDocument] = js.native
    val folders: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IFolder] = js.native
    @JSName("model")
    var model_FolderBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  trait IDocument
    extends IModuleDocument
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val name: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  trait IFolder extends IFolderBase {
    var name: java.lang.String
  }
  
  trait IFolderBase
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit {
    val containerAsFolderBase: IFolderBase
    val containerAsProject: IProject
    var documents: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IDocument]
    var folders: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IFolder]
    @JSName("model")
    val model_IFolderBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  trait IModule extends IFolderBase {
    var appStoreGuid: java.lang.String
    var appStoreVersion: java.lang.String
    var appStoreVersionGuid: java.lang.String
    /**
      * This property is required and cannot be set to null.
      */
    var domainModel: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDomainModel
    var fromAppStore: scala.Boolean
    /**
      * This property is required and cannot be set to null.
      */
    var moduleSecurity: mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleSecurity
    var name: java.lang.String
    /**
      * The index of where this Module appears in the project.
      * This property is <em>required</em>, and of type double.
      * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
      * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
      */
    var sortIndex: scala.Double
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Projects`.
    */
  @js.native
  trait IModuleDocument
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit {
    val containerAsFolderBase: IFolderBase = js.native
    val containerAsModule: IModule = js.native
    @JSName("model")
    val model_IModuleDocument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  trait IProject
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit {
    var isSystemProject: scala.Boolean
    @JSName("model")
    val model_IProject: mendixmodelsdkLib.distGenBaseDashModelMod.IModel
    var modules: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IModule]
    /**
      * This property is required and cannot be set to null.
      */
    var projectConversion: IProjectConversion
    var projectDocuments: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IProjectDocument]
  }
  
  @js.native
  trait IProjectConversion
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit {
    val containerAsProject: IProject = js.native
    @JSName("model")
    val model_IProjectConversion: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  trait IProjectDocument
    extends mendixmodelsdkLib.distSdkInternalUnitsMod.IModelUnit {
    val containerAsProject: IProject = js.native
    @JSName("model")
    val model_IProjectDocument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule because var conflicts: documents, folders, id, isLoaded, model, structureTypeName, unit. Inlined sortIndex, name, domainModel, moduleSecurity, fromAppStore, appStoreGuid, appStoreVersionGuid, appStoreVersion */ @js.native
  class Module protected () extends FolderBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IProject) = this()
    var appStoreGuid: java.lang.String = js.native
    var appStoreVersion: java.lang.String = js.native
    var appStoreVersionGuid: java.lang.String = js.native
    var domainModel: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IDomainModel = js.native
    var fromAppStore: scala.Boolean = js.native
    var moduleSecurity: mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleSecurity = js.native
    var name: java.lang.String = js.native
    /**
      * The index of where this Module appears in the project.
      * This property is <em>required</em>, and of type double.
      * Also, its value needs to be unique among its siblings (meaning, in code: <tt>containerAsProject.modules</tt>) in the project.
      * In other words: <tt>containerAsProject.modules.map(m => m.sortedIndex)</tt> (TS syntax) needs to be a list with unique values.
      */
    var sortIndex: scala.Double = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModuleDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsFolderBase, containerAsModule, asLoaded, load, load, load, load */ @js.native
  abstract class ModuleDocument protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.ModelUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IFolderBase) = this()
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IModule) = this()
    val containerAsFolderBase: FolderBase | IFolderBase = js.native
    val containerAsModule: IModule | Module = js.native
    @JSName("model")
    var model_ModuleDocument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class OneTimeConversionMarker protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsProjectConversion: ProjectConversion = js.native
    @JSName("model")
    var model_OneTimeConversionMarker: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined projectDocuments, modules, projectConversion, isSystemProject */ @js.native
  class Project protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.StructuralUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit) = this()
    var isSystemProject: scala.Boolean = js.native
    @JSName("model")
    var model_Project: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val modules: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IModule] = js.native
    var projectConversion: IProjectConversion = js.native
    val projectDocuments: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IProjectDocument] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectConversion because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProject, asLoaded, load, load, load, load */ @js.native
  class ProjectConversion protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.ModelUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IProject) = this()
    val containerAsProject: IProject | Project = js.native
    val markers: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[OneTimeConversionMarker] = js.native
    @JSName("model")
    var model_ProjectConversion: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsProject, asLoaded, load, load, load, load */ @js.native
  abstract class ProjectDocument protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.ModelUnit {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: IProject) = this()
    val containerAsProject: IProject | Project = js.native
    @JSName("model")
    var model_ProjectDocument: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  object Document extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
    */
  @js.native
  object Folder extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenProjectsMod.projectsNs.Folder = js.native
  }
  
  @js.native
  object FolderBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  @js.native
  object Module extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenProjectsMod.projectsNs.Module = js.native
  }
  
  @js.native
  object ModuleDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object OneTimeConversionMarker extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenProjectsMod.projectsNs.OneTimeConversionMarker = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.ProjectConversion): mendixmodelsdkLib.distGenProjectsMod.projectsNs.OneTimeConversionMarker = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  object Project extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object ProjectConversion extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenProjectsMod.projectsNs.ProjectConversion = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  object ProjectDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenProjectsMod.StructureVersionInfo = js.native
  }
  
}

