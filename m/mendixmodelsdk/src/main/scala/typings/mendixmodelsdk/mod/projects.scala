package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "projects")
@js.native
object projects extends js.Object {
  @js.native
  abstract class Document protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.Document {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/resources relevant section in reference guide}
    */
  @js.native
  class Folder protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.Folder {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  @js.native
  abstract class FolderBase protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.FolderBase {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
    */
  @js.native
  class Module protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.Module {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  @js.native
  abstract class ModuleDocument protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.ModuleDocument {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IModule
    ) = this()
  }
  
  @js.native
  class OneTimeConversionMarker protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.OneTimeConversionMarker {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  class Project protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.Project {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IStructuralUnit
    ) = this()
  }
  
  @js.native
  class ProjectConversion protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.ProjectConversion {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
    */
  @js.native
  abstract class ProjectDocument protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.projects.ProjectDocument {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  
  /* static members */
  @js.native
  object Document extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Folder extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Folder unit in the SDK and on the server.
      * Expects one argument, the IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.projectsMod.projects.Folder = js.native
  }
  
  /* static members */
  @js.native
  object FolderBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object Module extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Module unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typings.mendixmodelsdk.projectsMod.projects.Module = js.native
  }
  
  /* static members */
  @js.native
  object ModuleDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object OneTimeConversionMarker extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
    /**
      * Creates and returns a new OneTimeConversionMarker instance in the SDK and on the server.
      * The new OneTimeConversionMarker will be automatically stored in the 'markers' property
      * of the parent ProjectConversion element passed as argument.
      */
    def createIn(container: typings.mendixmodelsdk.projectsMod.projects.ProjectConversion): typings.mendixmodelsdk.projectsMod.projects.OneTimeConversionMarker = js.native
  }
  
  /* static members */
  @js.native
  object Project extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object ProjectConversion extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ProjectConversion unit in the SDK and on the server.
      * Expects one argument, the IProject in which this unit is contained.
      */
    def createIn(container: IProject): typings.mendixmodelsdk.projectsMod.projects.ProjectConversion = js.native
  }
  
  /* static members */
  @js.native
  object ProjectDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.projectsMod.StructureVersionInfo = js.native
  }
  
}

