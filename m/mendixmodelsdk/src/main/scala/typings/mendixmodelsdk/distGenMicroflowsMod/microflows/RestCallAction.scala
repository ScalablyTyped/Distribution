package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/call-rest-action relevant section in reference guide}
  *
  * In version 6.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RestCallAction")
@js.native
class RestCallAction protected () extends MicroflowAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRestCallAction: IModel = js.native
  /**
    * In version 7.0.2: introduced
    */
  def errorResultHandlingType(): ErrorResultHandlingType = js.native
  def errorResultHandlingType(newValue: ErrorResultHandlingType): js.Any = js.native
  def httpConfiguration(): HttpConfiguration = js.native
  def httpConfiguration(newValue: HttpConfiguration): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def proxyConfiguration(): ProxyConfiguration | Null = js.native
  def proxyConfiguration(newValue: ProxyConfiguration): js.Any = js.native
  @JSName("proxyConfiguration")
  def proxyConfiguration_Any(): js.Any = js.native
  def requestHandling(): RequestHandling = js.native
  def requestHandling(newValue: RequestHandling): js.Any = js.native
  /**
    * In version 6.9.0: introduced
    */
  def requestHandlingType(): RequestHandlingType = js.native
  def requestHandlingType(newValue: RequestHandlingType): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def requestProxyType(): RequestProxyType = js.native
  def requestProxyType(newValue: RequestProxyType): js.Any = js.native
  def resultHandling(): ResultHandling = js.native
  def resultHandling(newValue: ResultHandling): js.Any = js.native
  /**
    * In version 6.9.0: introduced
    */
  def resultHandlingType(): ResultHandlingType = js.native
  def resultHandlingType(newValue: ResultHandlingType): js.Any = js.native
  /**
    * In version 7.15.0: deleted
    * In version 7.1.0: introduced
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
  /**
    * In version 7.1.0: introduced
    */
  def useRequestTimeOut(): Boolean = js.native
  def useRequestTimeOut(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.RestCallAction")
@js.native
object RestCallAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RestCallAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RestCallAction = js.native
  /**
    * Creates and returns a new RestCallAction instance in the SDK and on the server.
    * The new RestCallAction will be automatically stored in the 'action' property
    * of the parent ActionActivity element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createIn(container: ActionActivity): RestCallAction = js.native
}

