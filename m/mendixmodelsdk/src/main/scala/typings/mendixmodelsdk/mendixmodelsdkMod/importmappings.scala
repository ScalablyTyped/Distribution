package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMappingsMod.mappings.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappings.ObjectMappingElement
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "importmappings")
@js.native
object importmappings extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportMapping protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.importmappings.ImportMapping {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportObjectMappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.importmappings.ImportObjectMappingElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportValueMappingElement protected ()
    extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.importmappings.ImportValueMappingElement {
    def this(
      model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
      container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object ImportMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportMapping = js.native
  }
  
  /* static members */
  @js.native
  object ImportObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportObjectMappingElement = js.native
  }
  
  /* static members */
  @js.native
  object ImportValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.distGenImportmappingsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportValueMappingElement = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createIn(container: ObjectMappingElement): typings.mendixmodelsdk.distGenImportmappingsMod.importmappings.ImportValueMappingElement = js.native
  }
  
}

