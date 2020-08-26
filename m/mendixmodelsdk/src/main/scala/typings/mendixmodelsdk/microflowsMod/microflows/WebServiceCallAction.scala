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
  def httpConfiguration: HttpConfiguration = js.native
  def httpConfiguration_=(newValue: HttpConfiguration): Unit = js.native
  def importedWebService: IImportedWebService | Null = js.native
  def importedWebServiceQualifiedName: String | Null = js.native
  def importedWebService_=(newValue: IImportedWebService | Null): Unit = js.native
  def isValidationRequired: Boolean = js.native
  def isValidationRequired_=(newValue: Boolean): Unit = js.native
  def operationName: String = js.native
  def operationName_=(newValue: String): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def proxyConfiguration: ProxyConfiguration | Null = js.native
  def proxyConfiguration_=(newValue: ProxyConfiguration | Null): Unit = js.native
  def requestBodyHandling: RequestHandling = js.native
  def requestBodyHandling_=(newValue: RequestHandling): Unit = js.native
  def requestHeaderHandling: RequestHandling = js.native
  def requestHeaderHandling_=(newValue: RequestHandling): Unit = js.native
  /**
    * In version 7.15.0: introduced
    */
  def requestProxyType: RequestProxyType = js.native
  def requestProxyType_=(newValue: RequestProxyType): Unit = js.native
  def resultHandling: ResultHandling = js.native
  def resultHandling_=(newValue: ResultHandling): Unit = js.native
  /**
    * In version 6.7.0: deleted
    */
  def sendNullValueChoice: NullValueOption = js.native
  def sendNullValueChoice_=(newValue: NullValueOption): Unit = js.native
  def serviceName: String = js.native
  def serviceName_=(newValue: String): Unit = js.native
  /**
    * In version 7.15.0: deleted
    */
  def timeOut: Double = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 7.15.0: introduced
    */
  def timeOutExpression: String = js.native
  def timeOutExpression_=(newValue: String): Unit = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.15.0: introduced
    */
  def timeOutModel: Expression = js.native
  def timeOutModel_=(newValue: Expression): Unit = js.native
  def timeOut_=(newValue: Double): Unit = js.native
  def useRequestTimeOut: Boolean = js.native
  def useRequestTimeOut_=(newValue: Boolean): Unit = js.native
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

