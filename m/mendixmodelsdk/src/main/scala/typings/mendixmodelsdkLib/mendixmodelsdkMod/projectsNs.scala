package typings
package mendixmodelsdkLib.mendixmodelsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "projects")
@js.native
object projectsNs extends js.Object {
  @js.native
  abstract class Document protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
       * See: {@link https://world.mendix.com/display/howto50/Add+documents+to+a+module relevant section in reference guide}
       */
  @js.native
  class Folder protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.Folder {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  @js.native
  abstract class FolderBase protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.FolderBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/modules relevant section in reference guide}
       */
  @js.native
  class Module protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.Module {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  @js.native
  abstract class ModuleDocument protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.ModuleDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule) = this()
  }
  
  @js.native
  class OneTimeConversionMarker protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.OneTimeConversionMarker {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
       */
  @js.native
  class Project protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.Project {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distSdkInternalUnitsMod.IStructuralUnit) = this()
  }
  
  @js.native
  class ProjectConversion protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.ProjectConversion {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/project relevant section in reference guide}
       */
  @js.native
  abstract class ProjectDocument protected ()
    extends mendixmodelsdkLib.distGenAllDashModelDashClassesMod.projectsNs.ProjectDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
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

