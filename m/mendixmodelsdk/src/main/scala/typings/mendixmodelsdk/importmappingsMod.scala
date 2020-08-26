package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.mappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.mappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/importmappings", JSImport.Namespace)
@js.native
object importmappingsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
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
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.mappingsMod.mappings.IMappingDocument because Already inherited
    - typings.mendixmodelsdk.importmappingsMod.importmappings.IImportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
      def containerAsFolderBase_MImportMapping: FolderBase = js.native
      /**
        * In version 7.16.0: deleted
        */
      def parameter: IEntity | Null = js.native
      def parameterQualifiedName: String | Null = js.native
      /**
        * In version 7.16.0: introduced
        */
      def parameterType: DataType = js.native
      def parameterType_=(newValue: DataType): Unit = js.native
      def parameter_=(newValue: IEntity | Null): Unit = js.native
      def useSubtransactionsForMicroflows: Boolean = js.native
      def useSubtransactionsForMicroflows_=(newValue: Boolean): Unit = js.native
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

