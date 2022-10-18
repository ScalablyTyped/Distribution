package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "importmappings.ImportMapping")
  @js.native
  open class ImportMapping protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.importmappings.ImportMapping {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ImportMapping {
    
    @JSImport("mendixmodelsdk", "importmappings.ImportMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "importmappings.ImportObjectMappingElement")
  @js.native
  open class ImportObjectMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.importmappings.ImportObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImportObjectMappingElement {
    
    @JSImport("mendixmodelsdk", "importmappings.ImportObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    inline def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportObjectMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/import-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "importmappings.ImportValueMappingElement")
  @js.native
  open class ImportValueMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.importmappings.ImportValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ImportValueMappingElement {
    
    @JSImport("mendixmodelsdk", "importmappings.ImportValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement]
    
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createIn(container: ObjectMappingElement): typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenImportmappingsMod.importmappings.ImportValueMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "importmappings.ImportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenImportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
