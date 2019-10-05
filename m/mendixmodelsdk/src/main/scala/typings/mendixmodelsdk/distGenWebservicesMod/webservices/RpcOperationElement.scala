package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement")
@js.native
class RpcOperationElement protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsOperationInfo: OperationInfo = js.native
  val messagePartElements: IList[RpcMessagePartElement] = js.native
  @JSName("model")
  var model_RpcOperationElement: IModel = js.native
  var name: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcOperationElement")
@js.native
object RpcOperationElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'requestHeaderRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestHeaderRpcElement(container: OperationInfo): RpcOperationElement = js.native
  /**
    * Creates and returns a new RpcOperationElement instance in the SDK and on the server.
    * The new RpcOperationElement will be automatically stored in the 'responseBodyRpcElement' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderResponseBodyRpcElement(container: OperationInfo): RpcOperationElement = js.native
}

