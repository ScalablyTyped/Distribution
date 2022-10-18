package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.IMappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ValueMappingElement
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.NullValueOption
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

object srcGenExportmappingsMod {
  
  @JSImport("mendixmodelsdk/src/gen/exportmappings", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object exportmappings {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
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
    - typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.IExportMapping because var conflicts: containerAsFolderBase, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportMapping")
    @js.native
    open class ExportMapping protected () extends MappingDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MExportMapping: FolderBase = js.native
      
      def isHeader: Boolean = js.native
      def isHeader_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 6.7.0: introduced
        */
      def nullValueOption: NullValueOption = js.native
      def nullValueOption_=(newValue: NullValueOption): Unit = js.native
      
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
      
      /**
        * In version 6.1.0: deleted
        */
      def parameterTypeName: String = js.native
      def parameterTypeName_=(newValue: String): Unit = js.native
    }
    object ExportMapping {
      
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ExportMapping unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): ExportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExportMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportObjectMappingElement")
    @js.native
    open class ExportObjectMappingElement protected () extends ObjectMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ExportObjectMappingElement {
      
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportObjectMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExportObjectMappingElement]
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
        * of the parent mappings.MappingDocument element passed as argument.
        */
      /* static member */
      inline def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[ExportObjectMappingElement]
      
      /**
        * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
        * The new ExportObjectMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      inline def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[ExportObjectMappingElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportObjectMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportObjectMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportValueMappingElement")
    @js.native
    open class ExportValueMappingElement protected () extends ValueMappingElement {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object ExportValueMappingElement {
      
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportValueMappingElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ExportValueMappingElement]
      
      /**
        * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
        * The new ExportValueMappingElement will be automatically stored in the 'children' property
        * of the parent mappings.ObjectMappingElement element passed as argument.
        */
      /* static member */
      inline def createIn(container: ObjectMappingElement): ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ExportValueMappingElement]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportValueMappingElement.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exportmappings", "exportmappings.ExportValueMappingElement.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ExportMappings`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
      */
    @js.native
    trait IExportMapping
      extends StObject
         with IMappingDocument
  }
}
