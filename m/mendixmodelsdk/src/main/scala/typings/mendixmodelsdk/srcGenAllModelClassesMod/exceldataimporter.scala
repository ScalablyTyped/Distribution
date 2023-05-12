package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.ColumnAttributeMapping")
  @js.native
  open class ColumnAttributeMapping protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ColumnAttributeMapping {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.ColumnAttributeMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ColumnAttributeMapping instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping]
    
    /**
      * Creates and returns a new ColumnAttributeMapping instance in the SDK and on the server.
      * The new ColumnAttributeMapping will be automatically stored in the 'columnAttributeMappings' property
      * of the parent Sheet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.ColumnAttributeMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.ColumnAttributeMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.IndexReference")
  @js.native
  open class IndexReference protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object IndexReference {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.IndexReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new IndexReference instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference]
    
    /**
      * Creates and returns a new IndexReference instance in the SDK and on the server.
      * The new IndexReference will be automatically stored in the 'reference' property
      * of the parent ColumnAttributeMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInColumnAttributeMappingUnderReference(
      container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping
    ): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnAttributeMappingUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference]
    
    /**
      * Creates and returns a new IndexReference instance in the SDK and on the server.
      * The new IndexReference will be automatically stored in the 'reference' property
      * of the parent Sheet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInSheetUnderReference(container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSheetUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.IndexReference]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.IndexReference.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.IndexReference.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.NameReference")
  @js.native
  open class NameReference protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NameReference {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.NameReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NameReference instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference]
    
    /**
      * Creates and returns a new NameReference instance in the SDK and on the server.
      * The new NameReference will be automatically stored in the 'reference' property
      * of the parent ColumnAttributeMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInColumnAttributeMappingUnderReference(
      container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.ColumnAttributeMapping
    ): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInColumnAttributeMappingUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference]
    
    /**
      * Creates and returns a new NameReference instance in the SDK and on the server.
      * The new NameReference will be automatically stored in the 'reference' property
      * of the parent Sheet element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createInSheetUnderReference(container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSheetUnderReference")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.NameReference]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.NameReference.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.NameReference.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Reference")
  @js.native
  open class Reference protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Reference {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Reference {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Reference")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Reference.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Reference.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Sheet")
  @js.native
  open class Sheet protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Sheet {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Sheet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Sheet instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet]
    
    /**
      * Creates and returns a new Sheet instance in the SDK and on the server.
      * The new Sheet will be automatically stored in the 'sheets' property
      * of the parent Template element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.24.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Template): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Sheet]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Sheet.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Sheet.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.24.0: introduced
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Template")
  @js.native
  open class Template protected ()
    extends typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Template {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Template {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Template")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Template unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Template = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExceldataimporterMod.exceldataimporter.Template]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Template.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "exceldataimporter.Template.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExceldataimporterMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
