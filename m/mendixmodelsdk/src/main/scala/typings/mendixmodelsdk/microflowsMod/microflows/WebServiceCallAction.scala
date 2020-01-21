package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.webservicesMod.webservices.IImportedWebService
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
  @JSName("model")
  var model_FWebServiceCallAction: IModel = js.native
  def httpConfiguration(): HttpConfiguration = js.native
  def httpConfiguration(newValue: HttpConfiguration): js.Any = js.native
  def importedWebService(): js.Any = js.native
  def importedWebService(newValue: IImportedWebService): js.Any = js.native
  def importedWebServiceQualifiedName(): String | Null = js.native
  @JSName("importedWebService")
  def importedWebService_Union(): IImportedWebService | Null = js.native
  def isValidationRequired(): Boolean = js.native
  def isValidationRequired(newValue: Boolean): js.Any = js.native
  def operationName(): String = js.native
  def operationName(newValue: String): js.Any = js.native
  def proxyConfiguration(): js.Any = js.native
  def proxyConfiguration(newValue: ProxyConfiguration): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  @JSName("proxyConfiguration")
  def proxyConfiguration_Union(): ProxyConfiguration | Null = js.native
  def requestBodyHandling(): RequestHandling = js.native
  def requestBodyHandling(newValue: RequestHandling): js.Any = js.native
  def requestHeaderHandling(): RequestHandling = js.native
  def requestHeaderHandling(newValue: RequestHandling): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def requestProxyType(): RequestProxyType = js.native
  def requestProxyType(newValue: RequestProxyType): js.Any = js.native
  def resultHandling(): ResultHandling = js.native
  def resultHandling(newValue: ResultHandling): js.Any = js.native
  /**
    * In version 6.7.0: deleted
    */
  def sendNullValueChoice(): NullValueOption = js.native
  def sendNullValueChoice(newValue: NullValueOption): js.Any = js.native
  def serviceName(): String = js.native
  def serviceName(newValue: String): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    */
  def timeOut(): Double = js.native
  def timeOut(newValue: Double): js.Any = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.15.0: introduced
    */
  def timeOutExpression(): String = js.native
  def timeOutExpression(newValue: String): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.15.0: introduced
    */
  def timeOutModel(): Expression = js.native
  def timeOutModel(newValue: Expression): js.Any = js.native
  def useRequestTimeOut(): Boolean = js.native
  def useRequestTimeOut(newValue: Boolean): js.Any = js.native
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

