package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Document
import typings.mendixmodelsdk.srcGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenExceldataimporterMod {
  
  @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object exceldataimporter {
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `ExcelDataImporter`.
      */
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.ColumnAttributeMapping")
    @js.native
    open class ColumnAttributeMapping protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def attribute: IAttribute = js.native
      
      def attributeQualifiedName: String = js.native
      
      def attribute_=(newValue: IAttribute): Unit = js.native
      
      def containerAsSheet: Sheet = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def reference: Reference = js.native
      def reference_=(newValue: Reference): Unit = js.native
    }
    object ColumnAttributeMapping {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.ColumnAttributeMapping")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ColumnAttributeMapping instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ColumnAttributeMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ColumnAttributeMapping]
      
      /**
        * Creates and returns a new ColumnAttributeMapping instance in the SDK and on the server.
        * The new ColumnAttributeMapping will be automatically stored in the 'columnAttributeMappings' property
        * of the parent Sheet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: Sheet): ColumnAttributeMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ColumnAttributeMapping]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.ColumnAttributeMapping.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.ColumnAttributeMapping.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.IndexReference")
    @js.native
    open class IndexReference protected () extends Reference {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def referencedIndex: Double = js.native
      def referencedIndex_=(newValue: Double): Unit = js.native
    }
    object IndexReference {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.IndexReference")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new IndexReference instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[IndexReference]
      
      /**
        * Creates and returns a new IndexReference instance in the SDK and on the server.
        * The new IndexReference will be automatically stored in the 'reference' property
        * of the parent ColumnAttributeMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createInColumnAttributeMappingUnderReference(container: ColumnAttributeMapping): IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnAttributeMappingUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[IndexReference]
      
      /**
        * Creates and returns a new IndexReference instance in the SDK and on the server.
        * The new IndexReference will be automatically stored in the 'reference' property
        * of the parent Sheet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createInSheetUnderReference(container: Sheet): IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSheetUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[IndexReference]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.IndexReference.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.IndexReference.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.NameReference")
    @js.native
    open class NameReference protected () extends Reference {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def referencedName: String = js.native
      def referencedName_=(newValue: String): Unit = js.native
    }
    object NameReference {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.NameReference")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NameReference instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NameReference]
      
      /**
        * Creates and returns a new NameReference instance in the SDK and on the server.
        * The new NameReference will be automatically stored in the 'reference' property
        * of the parent ColumnAttributeMapping element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createInColumnAttributeMappingUnderReference(container: ColumnAttributeMapping): NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnAttributeMappingUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[NameReference]
      
      /**
        * Creates and returns a new NameReference instance in the SDK and on the server.
        * The new NameReference will be automatically stored in the 'reference' property
        * of the parent Sheet element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createInSheetUnderReference(container: Sheet): NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSheetUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[NameReference]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.NameReference.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.NameReference.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Reference")
    @js.native
    open class Reference protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsColumnAttributeMapping: ColumnAttributeMapping = js.native
      
      def containerAsSheet: Sheet = js.native
    }
    object Reference {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Reference")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Reference.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Reference.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Sheet")
    @js.native
    open class Sheet protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def columnAttributeMappings: IList[ColumnAttributeMapping] = js.native
      
      def containerAsTemplate: Template = js.native
      
      def dataRowStartsAt: Double = js.native
      def dataRowStartsAt_=(newValue: Double): Unit = js.native
      
      def headerRowStartsAt: Double = js.native
      def headerRowStartsAt_=(newValue: Double): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def reference: Reference = js.native
      def reference_=(newValue: Reference): Unit = js.native
    }
    object Sheet {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Sheet")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new Sheet instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): Sheet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[Sheet]
      
      /**
        * Creates and returns a new Sheet instance in the SDK and on the server.
        * The new Sheet will be automatically stored in the 'sheets' property
        * of the parent Template element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.24.0 and higher
        */
      /* static member */
      inline def createIn(container: Template): Sheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Sheet]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Sheet.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Sheet.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
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
    - typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ITemplate because var conflicts: containerAsFolderBase, documentation, excluded, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Template")
    @js.native
    open class Template protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MTemplate: FolderBase = js.native
      
      def fileName: String = js.native
      def fileName_=(newValue: String): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        */
      def sheets: IList[Sheet] = js.native
      
      def templateName: String = js.native
      def templateName_=(newValue: String): Unit = js.native
    }
    object Template {
      
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Template")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Template unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[Template]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Template.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/exceldataimporter", "exceldataimporter.Template.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.24.0: introduced
      */
    @js.native
    trait ITemplate
      extends StObject
         with IDocument
  }
}
