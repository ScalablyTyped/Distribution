package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.IImportedWebService
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/call-web-service-action relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction")
@js.native
class WebServiceCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var httpConfiguration: HttpConfiguration = js.native
  var importedWebService: IImportedWebService | Null = js.native
  val importedWebServiceQualifiedName: String | Null = js.native
  var isValidationRequired: Boolean = js.native
  var operationName: String = js.native
  /**
    * In version 7.15.0: introduced
    */
  var proxyConfiguration: ProxyConfiguration | Null = js.native
  var requestBodyHandling: RequestHandling = js.native
  var requestHeaderHandling: RequestHandling = js.native
  /**
    * In version 7.15.0: introduced
    */
  var requestProxyType: RequestProxyType = js.native
  var resultHandling: ResultHandling = js.native
  /**
    * In version 6.7.0: deleted
    */
  var sendNullValueChoice: NullValueOption = js.native
  var serviceName: String = js.native
  /**
    * In version 7.15.0: deleted
    */
  var timeOut: Double = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.15.0: introduced
    */
  var timeOutExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.15.0: introduced
    */
  var timeOutModel: Expression = js.native
  var useRequestTimeOut: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.WebServiceCallAction")
@js.native
object WebServiceCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WebServiceCallAction = js.native
  /**
    * Creates and returns a new WebServiceCallAction instance in the SDK and on the server.
    * The new WebServiceCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    */
  def createIn(container: ActionActivity): WebServiceCallAction = js.native
}

