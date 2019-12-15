package typings.mendixmodelsdk.distGenMappingsMod.mappings

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJsonstructuresMod.jsonstructures.IJsonStructure
import typings.mendixmodelsdk.distGenMappingsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenMessagedefinitionsMod.messagedefinitions.IMessageDefinition
import typings.mendixmodelsdk.distGenProjectsMod.projects.Document
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
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
- typings.mendixmodelsdk.distGenMappingsMod.mappings.IMappingDocument because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
abstract class MappingDocument protected () extends Document {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
  @JSName("model")
  var model_FMappingDocument: IModel = js.native
  @JSName("containerAsFolderBase")
  def containerAsFolderBase_MMappingDocument(): FolderBase = js.native
  def importedWebService(): IImportedWebService | Null = js.native
  def importedWebService(newValue: IImportedWebService): js.Any = js.native
  def importedWebServiceQualifiedName(): String | Null = js.native
  @JSName("importedWebService")
  def importedWebService_Any(): js.Any = js.native
  /**
    * In version 6.4.0: introduced
    */
  def jsonStructure(): IJsonStructure | Null = js.native
  def jsonStructure(newValue: IJsonStructure): js.Any = js.native
  def jsonStructureQualifiedName(): String | Null = js.native
  @JSName("jsonStructure")
  def jsonStructure_Any(): js.Any = js.native
  /**
    * In version 7.6.0: introduced
    */
  def messageDefinition(): IMessageDefinition | Null = js.native
  def messageDefinition(newValue: IMessageDefinition): js.Any = js.native
  def messageDefinitionQualifiedName(): String | Null = js.native
  @JSName("messageDefinition")
  def messageDefinition_Any(): js.Any = js.native
  def operationName(): String = js.native
  def operationName(newValue: String): js.Any = js.native
  /**
    * In version 7.14.0: introduced
    */
  def publicName(): String = js.native
  def publicName(newValue: String): js.Any = js.native
  def rootElementName(): String = js.native
  def rootElementName(newValue: String): js.Any = js.native
  def rootMappingElements(): IList[ObjectMappingElement] = js.native
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  def xmlSchema(): IXmlSchema | Null = js.native
  def xmlSchema(newValue: IXmlSchema): js.Any = js.native
  def xmlSchemaQualifiedName(): String | Null = js.native
  @JSName("xmlSchema")
  def xmlSchema_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/mappings", "mappings.MappingDocument")
@js.native
object MappingDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

