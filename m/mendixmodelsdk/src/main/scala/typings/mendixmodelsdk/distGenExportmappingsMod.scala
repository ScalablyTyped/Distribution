package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.NullValueOption
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/exportmappings", JSImport.Namespace)
@js.native
object distGenExportmappingsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object exportmappings extends js.Object {
    /**
      * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument because Already inherited
    - typings.mendixmodelsdk.distGenExportmappingsMod.exportmappings.IExportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class ExportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FExportMapping: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MExportMapping(): FolderBase = js.native
      def isHeader(): Boolean = js.native
      def isHeader(newValue: Boolean): js.Any = js.native
      /**
        * In version 6.7.0: introduced
        */
      def nullValueOption(): NullValueOption = js.native
      def nullValueOption(newValue: NullValueOption): js.Any = js.native
      def parameterName(): String = js.native
      def parameterName(newValue: String): js.Any = js.native
      /**
        * In version 6.1.0: deleted
        */
      def parameterTypeName(): String = js.native
      def parameterTypeName(newValue: String): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
      */
    @js.native
    class ExportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FExportObjectMappingElement: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
      */
    @js.native
    class ExportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FExportValueMappingElement: IModel = js.native
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ExportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
      */
    @js.native
    trait IExportMapping extends IMappingDocument
    
    /* static members */
    @js.native
    object ExportMapping extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ExportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ExportMapping = js.native
    }
    
    /* static members */
    @js.native
    object ExportObjectMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ExportObjectMappingElement = js.native
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ExportObjectMappingElement = js.native
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ExportObjectMappingElement = js.native
    }
    
    /* static members */
    @js.native
    object ExportValueMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ExportValueMappingElement = js.native
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * The new ExportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createIn(container: ObjectMappingElement): ExportValueMappingElement = js.native
    }
    
  }
  
}

