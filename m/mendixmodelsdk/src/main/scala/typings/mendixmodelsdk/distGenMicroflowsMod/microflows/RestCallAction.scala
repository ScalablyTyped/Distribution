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
  /**
    * In version 7.0.2: introduced
    */
  var errorResultHandlingType: ErrorResultHandlingType = js.native
  var httpConfiguration: HttpConfiguration = js.native
  /**
    * In version 7.15.0: introduced
    */
  var proxyConfiguration: ProxyConfiguration | Null = js.native
  var requestHandling: RequestHandling = js.native
  /**
    * In version 6.9.0: introduced
    */
  var requestHandlingType: RequestHandlingType = js.native
  /**
    * In version 7.15.0: introduced
    */
  var requestProxyType: RequestProxyType = js.native
  var resultHandling: ResultHandling = js.native
  /**
    * In version 6.9.0: introduced
    */
  var resultHandlingType: ResultHandlingType = js.native
  /**
    * In version 7.15.0: deleted
    * In version 7.1.0: introduced
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
  /**
    * In version 7.1.0: introduced
    */
  var useRequestTimeOut: Boolean = js.native
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

