package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
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
  @JSName("model")
  var model_FOperationInfo: IModel = js.native
  /**
    * In version 6.1.0: deleted
    */
  def allowSimpleMappingInheritance: Boolean = js.native
  def allowSimpleMappingInheritance_=(newValue: Boolean): Unit = js.native
  def containerAsServiceInfo: ServiceInfo = js.native
  def documentation: String = js.native
  def documentation_=(newValue: String): Unit = js.native
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  def requestBodyElementName: String = js.native
  def requestBodyElementName_=(newValue: String): Unit = js.native
  def requestBodyEncoded: Boolean = js.native
  def requestBodyEncoded_=(newValue: Boolean): Unit = js.native
  def requestBodyPartEncodings: IList[PartEncoding] = js.native
  def requestBodyRpcElement: RpcOperationElement = js.native
  def requestBodyRpcElement_=(newValue: RpcOperationElement): Unit = js.native
  def requestHeaderElementName: String = js.native
  def requestHeaderElementName_=(newValue: String): Unit = js.native
  def requestHeaderEncoded: Boolean = js.native
  def requestHeaderEncoded_=(newValue: Boolean): Unit = js.native
  def requestHeaderPartEncoding: PartEncoding | Null = js.native
  def requestHeaderPartEncoding_=(newValue: PartEncoding | Null): Unit = js.native
  def requestHeaderRpcElement: RpcOperationElement = js.native
  def requestHeaderRpcElement_=(newValue: RpcOperationElement): Unit = js.native
  def responseBodyElementName: String = js.native
  def responseBodyElementName_=(newValue: String): Unit = js.native
  def responseBodyRpcElement: RpcOperationElement = js.native
  def responseBodyRpcElement_=(newValue: RpcOperationElement): Unit = js.native
  def soapAction: String = js.native
  def soapAction_=(newValue: String): Unit = js.native
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

