package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ProxyConfiguration")
@js.native
class ProxyConfiguration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsRestCallAction: RestCallAction = js.native
  val containerAsWebServiceCallAction: WebServiceCallAction = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var hostExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var hostExpressionModel: Expression | Null = js.native
  @JSName("model")
  var model_ProxyConfiguration: IModel = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var passwordExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var passwordExpressionModel: Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var portExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var portExpressionModel: Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var useConfigurationExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var useConfigurationExpressionModel: Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var usernameExpression: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  var usernameExpressionModel: Expression | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ProxyConfiguration")
@js.native
object ProxyConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ProxyConfiguration = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderProxyConfiguration(container: RestCallAction): ProxyConfiguration = js.native
  /**
    * Creates and returns a new ProxyConfiguration instance in the SDK and on the server.
    * The new ProxyConfiguration will be automatically stored in the 'proxyConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderProxyConfiguration(container: WebServiceCallAction): ProxyConfiguration = js.native
}

