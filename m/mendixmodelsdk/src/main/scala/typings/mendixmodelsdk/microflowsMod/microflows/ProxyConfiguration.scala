package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.expressionsMod.expressions.Expression
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
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
  @JSName("model")
  var model_FProxyConfiguration: IModel = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def hostExpression(): String = js.native
  def hostExpression(newValue: String): js.Any = js.native
  def hostExpressionModel(): js.Any = js.native
  def hostExpressionModel(newValue: Expression): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("hostExpressionModel")
  def hostExpressionModel_Union(): Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def passwordExpression(): String = js.native
  def passwordExpression(newValue: String): js.Any = js.native
  def passwordExpressionModel(): js.Any = js.native
  def passwordExpressionModel(newValue: Expression): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("passwordExpressionModel")
  def passwordExpressionModel_Union(): Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def portExpression(): String = js.native
  def portExpression(newValue: String): js.Any = js.native
  def portExpressionModel(): js.Any = js.native
  def portExpressionModel(newValue: Expression): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("portExpressionModel")
  def portExpressionModel_Union(): Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def useConfigurationExpression(): String = js.native
  def useConfigurationExpression(newValue: String): js.Any = js.native
  def useConfigurationExpressionModel(): js.Any = js.native
  def useConfigurationExpressionModel(newValue: Expression): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("useConfigurationExpressionModel")
  def useConfigurationExpressionModel_Union(): Expression | Null = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def usernameExpression(): String = js.native
  def usernameExpression(newValue: String): js.Any = js.native
  def usernameExpressionModel(): js.Any = js.native
  def usernameExpressionModel(newValue: Expression): js.Any = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    */
  @JSName("usernameExpressionModel")
  def usernameExpressionModel_Union(): Expression | Null = js.native
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

