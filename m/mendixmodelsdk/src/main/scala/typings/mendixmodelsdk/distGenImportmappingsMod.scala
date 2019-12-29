package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ValueMappingElement
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

@JSImport("mendixmodelsdk/dist/gen/importmappings", JSImport.Namespace)
@js.native
object distGenImportmappingsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object importmappings extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ImportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    trait IImportMapping extends IMappingDocument
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
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
    - typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.IImportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class ImportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FImportMapping: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MImportMapping(): FolderBase = js.native
      /**
        * In version 7.16.0: deleted
        */
      def parameter(): IEntity | Null = js.native
      def parameter(newValue: IEntity): js.Any = js.native
      def parameterQualifiedName(): String | Null = js.native
      /**
        * In version 7.16.0: introduced
        */
      def parameterType(): DataType = js.native
      def parameterType(newValue: DataType): js.Any = js.native
      @JSName("parameter")
      def parameter_Any(): js.Any = js.native
      def useSubtransactionsForMicroflows(): Boolean = js.native
      def useSubtransactionsForMicroflows(newValue: Boolean): js.Any = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    class ImportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FImportObjectMappingElement: IModel = js.native
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
      */
    @js.native
    class ImportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FImportValueMappingElement: IModel = js.native
    }
    
    /* static members */
    @js.native
    object ImportMapping extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new ImportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): ImportMapping = js.native
    }
    
    /* static members */
    @js.native
    object ImportObjectMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ImportObjectMappingElement = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ImportObjectMappingElement = js.native
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ImportObjectMappingElement = js.native
    }
    
    /* static members */
    @js.native
    object ImportValueMappingElement extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): ImportValueMappingElement = js.native
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * The new ImportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      def createIn(container: ObjectMappingElement): ImportValueMappingElement = js.native
    }
    
  }
  
}

