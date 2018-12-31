package typings
package mendixmodelsdkLib.distGenImportmappingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/importmappings", "importmappings")
@js.native
object importmappingsNs extends js.Object {
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `ImportMappings`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  trait IImportMapping
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.IMappingDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.IImportMapping because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class ImportMapping protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    /**
      * In version 7.16.0: deleted
      */
    var parameter: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity | scala.Null = js.native
    val parameterQualifiedName: java.lang.String | scala.Null = js.native
    /**
      * In version 7.16.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    var useSubtransactionsForMicroflows: scala.Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportObjectMappingElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportValueMappingElement protected ()
    extends mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ValueMappingElement {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  object ImportMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportMapping = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  object ImportObjectMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    def createInMappingDocumentUnderRootMappingElements(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.MappingDocument): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createInObjectMappingElementUnderChildren(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportObjectMappingElement = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  object ImportValueMappingElement extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportValueMappingElement = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenMappingsMod.mappingsNs.ObjectMappingElement): mendixmodelsdkLib.distGenImportmappingsMod.importmappingsNs.ImportValueMappingElement = js.native
  }
  
}

