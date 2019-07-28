package typings.mendixmodelsdk.distGenImportmappingsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.ImportMapping
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.ImportObjectMappingElement
import typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.ImportValueMappingElement
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.IMappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.MappingDocument
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ObjectMappingElement
import typings.mendixmodelsdk.distGenMappingsMod.mappingsNs.ValueMappingElement
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  trait IImportMapping extends IMappingDocument
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenImportmappingsMod.importmappingsNs.IImportMapping because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
  class ImportMapping protected () extends MappingDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    /**
      * In version 7.16.0: deleted
      */
    var parameter: IEntity | Null = js.native
    val parameterQualifiedName: String | Null = js.native
    /**
      * In version 7.16.0: introduced
      */
    var parameterType: DataType = js.native
    var useSubtransactionsForMicroflows: Boolean = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportObjectMappingElement protected () extends ObjectMappingElement {
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
    * See: {@link https://docs.mendix.com/refguide7/import-mappings relevant section in reference guide}
    */
  @js.native
  class ImportValueMappingElement protected () extends ValueMappingElement {
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
  object ImportMapping extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new ImportMapping unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): ImportMapping = js.native
  }
  
  /* static members */
  @js.native
  object ImportObjectMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'rootMappingElements' property
      * of the parent mappings.MappingDocument element passed as argument.
      */
    def createInMappingDocumentUnderRootMappingElements(container: MappingDocument): ImportObjectMappingElement = js.native
    /**
      * Creates and returns a new ImportObjectMappingElement instance in the SDK and on the server.
      * The new ImportObjectMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createInObjectMappingElementUnderChildren(container: ObjectMappingElement): ImportObjectMappingElement = js.native
  }
  
  /* static members */
  @js.native
  object ImportValueMappingElement extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): ImportValueMappingElement = js.native
    /**
      * Creates and returns a new ImportValueMappingElement instance in the SDK and on the server.
      * The new ImportValueMappingElement will be automatically stored in the 'children' property
      * of the parent mappings.ObjectMappingElement element passed as argument.
      */
    def createIn(container: ObjectMappingElement): ImportValueMappingElement = js.native
  }
  
}

