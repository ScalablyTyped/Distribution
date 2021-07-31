package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.mappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.mappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportmappings {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportMapping")
  @js.native
  class ExportMapping protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.exportmappings.ExportMapping {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
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
    @scala.inline
    def createIn(container: IFolderBase): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportMapping]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportMapping.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement")
  @js.native
  class ExportObjectMappingElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.exportmappings.ExportObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInMappingDocumentUnderRootMappingElements")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @scala.inline
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createInObjectMappingElementUnderChildren")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportObjectMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportObjectMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/export-mappings relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement")
  @js.native
  class ExportValueMappingElement protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.exportmappings.ExportValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
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
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement]
    
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * The new ExportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: ObjectMappingElement): typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.exportmappingsMod.exportmappings.ExportValueMappingElement]
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "exportmappings.ExportValueMappingElement.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.exportmappingsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
