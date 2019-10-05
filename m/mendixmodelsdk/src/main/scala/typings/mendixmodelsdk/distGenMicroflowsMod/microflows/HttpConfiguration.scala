package typings.mendixmodelsdk.distGenMicroflowsMod.microflows

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenExpressionsMod.expressions.Expression
import typings.mendixmodelsdk.distGenMicroflowsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
@js.native
class HttpConfiguration protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var authenticationPassword: String = js.native
  val containerAsConsumedODataService: ConsumedODataService = js.native
  val containerAsRestCallAction: RestCallAction = js.native
  val containerAsWebServiceCallAction: WebServiceCallAction = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var customLocation: String = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var customLocationModel: Expression = js.native
  /**
    * In version 6.6.0: introduced
    */
  var customLocationTemplate: StringTemplate | Null = js.native
  val headerEntries: IList[HttpHeaderEntry] = js.native
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  var httpAuthenticationUserName: String = js.native
  /**
    * In version 7.7.0: deleted
    * In version 6.6.0: introduced
    */
  var httpMethod: HttpMethod = js.native
  @JSName("model")
  var model_HttpConfiguration: IModel = js.native
  /**
    * In version 7.7.0: introduced
    */
  var newHttpMethod: typings.mendixmodelsdk.distGenServicesMod.services.HttpMethod = js.native
  var overrideLocation: Boolean = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var password: Expression = js.native
  var useAuthentication: Boolean = js.native
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  var username: Expression = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.HttpConfiguration")
@js.native
object HttpConfiguration extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.5.0
    */
  def createIn(container: WebServiceCallAction): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInConsumedODataServiceUnderHttpConfiguration(container: ConsumedODataService): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 and higher
    */
  def createInRestCallActionUnderHttpConfiguration(container: RestCallAction): HttpConfiguration = js.native
  /**
    * Creates and returns a new HttpConfiguration instance in the SDK and on the server.
    * The new HttpConfiguration will be automatically stored in the 'httpConfiguration' property
    * of the parent WebServiceCallAction element passed as argument.
    */
  def createInWebServiceCallActionUnderHttpConfiguration(container: WebServiceCallAction): HttpConfiguration = js.native
}

