package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectMappingElement
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "exportmappings")
@js.native
object exportmappingsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  class ExportMapping protected ()
    extends typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportMapping {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  class ExportObjectMappingElement protected ()
    extends typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  class ExportValueMappingElement protected ()
    extends typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportValueMappingElement {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object ExportMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ExportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportMapping = js.native
  }
  
  /* static members */
  @js.native
  object ExportObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
  }
  
  /* static members */
  @js.native
  object ExportValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportValueMappingElement = js.native
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * The new ExportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createIn(container: ObjectMappingElement): typings.mendixmodelsdk.distGenExportmappingsMod.exportmappingsNs.ExportValueMappingElement = js.native
  }
  
}

