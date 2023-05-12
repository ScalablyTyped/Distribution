package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.srcGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcGenRestMod.rest.ImplicitExportMapping
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportMapping")
  @js.native
  open class ExportMapping protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.exportmappings.ExportMapping {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object ExportMapping {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new ExportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement")
  @js.native
  open class ExportObjectMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.exportmappings.ExportObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExportObjectMappingElement {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'mapping' property
      * of the parent rest.ImplicitExportMapping element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.23.0 and higher
      */
    /* static member */
    inline def createInImplicitExportMappingUnderMapping(container: ImplicitExportMapping): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInImplicitExportMappingUnderMapping")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    inline def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement")
  @js.native
  open class ExportValueMappingElement protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.exportmappings.ExportValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExportValueMappingElement {
    
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportValueMappingElement]
    
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * The new ExportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    inline def createIn(container: ObjectMappingElement): typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenExportmappingsMod.exportmappings.ExportValueMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenExportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
