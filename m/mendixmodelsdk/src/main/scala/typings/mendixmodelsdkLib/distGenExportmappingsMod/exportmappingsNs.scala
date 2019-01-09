package typings
package mendixmodelsdkLib.distGenExportmappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/exportmappings", "exportmappings")
@js.native
object exportmappingsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.IExportMapping because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined asLoaded, load, load, load, load */ @js.native
  class ExportMapping protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var isHeader: scala.Boolean = js.native
    /**
      * In version 6.7.0: introduced
      */
    var nullValueOption: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.NullValueOption = js.native
    var parameterName: java.lang.String = js.native
    /**
      * In version 6.1.0: deleted
      */
    var parameterTypeName: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  class ExportObjectMappingElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  class ExportValueMappingElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `ExportMappings`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  trait IExportMapping
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.IMappingDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  object ExportMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ExportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportMapping = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  object ExportObjectMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    def createInMappingDocumentUnderRootMappingElements(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingDocument): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
    /**
      * Creates and returns a new ExportObjectMappingElement instance in the SDK and on the server.
      * The new ExportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createInObjectMappingElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportObjectMappingElement = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/export-mappings relevant section in reference guide}
    */
  @js.native
  object ExportValueMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenExportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportValueMappingElement = js.native
    /**
      * Creates and returns a new ExportValueMappingElement instance in the SDK and on the server.
      * The new ExportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenExportmappingsMod.exportmappingsNs.ExportValueMappingElement = js.native
  }
  
}

