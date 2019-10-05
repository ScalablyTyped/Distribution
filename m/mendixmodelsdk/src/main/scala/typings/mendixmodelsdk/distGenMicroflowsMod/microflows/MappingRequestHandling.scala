package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExportmappingsMod.exportmappings.IExportMapping
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  /**
    * In version 7.6.0: introduced
    */
  var contentType: ContentType = js.native
  var mapping: IExportMapping | Null = js.native
  var mappingArgumentVariableName: String = js.native
  val mappingQualifiedName: String | Null = js.native
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

