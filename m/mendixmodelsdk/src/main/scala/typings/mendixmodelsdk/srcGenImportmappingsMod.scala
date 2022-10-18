package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenImportmappingsMod {
  
  @JSImport("mendixmodelsdk/src/gen/importmappings", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object importmappings {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.srcGenMappingsMod.mappings.IMappingDocument because Already inherited
    - typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.IImportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportMapping")
    @js.native
    open class ImportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
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
    object ImportMapping {
      
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ImportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ImportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ImportMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportObjectMappingElement")
    @js.native
    open class ImportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ImportObjectMappingElement {
      
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportObjectMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImportObjectMappingElement]
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      /* static member */
      inline def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[ImportObjectMappingElement]
      
      /**
        * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
        * The new ImportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      inline def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[ImportObjectMappingElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportObjectMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportObjectMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportValueMappingElement")
    @js.native
    open class ImportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ImportValueMappingElement {
      
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportValueMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ImportValueMappingElement]
      
      /**
        * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
        * The new ImportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      inline def createIn(container: ObjectMappingElement): ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ImportValueMappingElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportValueMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/importmappings", "importmappings.ImportValueMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ImportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
      */
    @js.native
    trait IImportMapping
      extends StObject
         with IMappingDocument
  }
}
