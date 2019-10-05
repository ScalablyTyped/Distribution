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

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.OperationInfo")
@js.native
class OperationInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  /**
    * In version 6.1.0: deleted
    */
  var allowSimpleMappingInheritance: Boolean = js.native
  val containerAsServiceInfo: ServiceInfo = js.native
  var documentation: String = js.native
  @JSName("model")
  var model_OperationInfo: IModel = js.native
  var name: String = js.native
  var requestBodyElementName: String = js.native
  var requestBodyEncoded: Boolean = js.native
  val requestBodyPartEncodings: IList[PartEncoding] = js.native
  var requestBodyRpcElement: RpcOperationElement = js.native
  var requestHeaderElementName: String = js.native
  var requestHeaderEncoded: Boolean = js.native
  var requestHeaderPartEncoding: PartEncoding | Null = js.native
  var requestHeaderRpcElement: RpcOperationElement = js.native
  var responseBodyElementName: String = js.native
  var responseBodyRpcElement: RpcOperationElement = js.native
  var soapAction: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.OperationInfo")
@js.native
object OperationInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new OperationInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): OperationInfo = js.native
  /**
    * Creates and returns a new OperationInfo instance in the SDK and on the server.
    * The new OperationInfo will be automatically stored in the 'operations' property
    * of the parent ServiceInfo element passed as argument.
    */
  def createIn(container: ServiceInfo): OperationInfo = js.native
}

