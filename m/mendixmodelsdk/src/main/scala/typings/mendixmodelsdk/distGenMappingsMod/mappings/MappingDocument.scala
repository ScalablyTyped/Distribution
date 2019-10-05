package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.IJsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.IMessageDefinition
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IImportedWebService
import typings.mendixmodelsdk.distGenXmlschemasMod.xmlschemas.IXmlSchema
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/mapping-documents relevant section in reference guide}
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
- typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
- typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
abstract class MappingDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  var importedWebService: IImportedWebService | Null = js.native
  val importedWebServiceQualifiedName: String | Null = js.native
  /**
    * In version 6.4.0: introduced
    */
  var jsonStructure: IJsonStructure | Null = js.native
  val jsonStructureQualifiedName: String | Null = js.native
  /**
    * In version 7.6.0: introduced
    */
  var messageDefinition: IMessageDefinition | Null = js.native
  val messageDefinitionQualifiedName: String | Null = js.native
  var operationName: String = js.native
  /**
    * In version 7.14.0: introduced
    */
  var publicName: String = js.native
  var rootElementName: String = js.native
  val rootMappingElements: IList[ObjectMappingElement] = js.native
  var serviceName: String = js.native
  var xmlSchema: IXmlSchema | Null = js.native
  val xmlSchemaQualifiedName: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
object MappingDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

