package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.exportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MappingRequestHandling")
@js.native
class MappingRequestHandling protected () extends RequestHandling {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMappingRequestHandling: IModel = js.native
  /**
    * In version 7.6.0: introduced
    */
  def contentType: ContentType = js.native
  def contentType(newValue: ContentType): js.Any = js.native
  def mapping(): js.Any = js.native
  def mapping(newValue: IExportMapping): js.Any = js.native
  def mappingArgumentVariableName: String = js.native
  def mappingArgumentVariableName(newValue: String): js.Any = js.native
  def mappingQualifiedName: String | Null = js.native
  @JSName("mapping")
  def mapping_Union: IExportMapping | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.MappingRequestHandling")
@js.native
object MappingRequestHandling extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MappingRequestHandling = js.native
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'resultHandling' property
    * of the parent ExportXmlAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInExportXmlActionUnderResultHandling(container: ExportXmlAction): MappingRequestHandling = js.native
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHandling' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderRequestHandling(container: RestCallAction): MappingRequestHandling = js.native
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestBodyHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestBodyHandling(container: WebServiceCallAction): MappingRequestHandling = js.native
  /**
    * Creates and returns a new MappingRequestHandling instance in the SDK and on the server.
    * The new MappingRequestHandling will be automatically stored in the 'requestHeaderHandling' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderRequestHeaderHandling(container: WebServiceCallAction): MappingRequestHandling = js.native
}

