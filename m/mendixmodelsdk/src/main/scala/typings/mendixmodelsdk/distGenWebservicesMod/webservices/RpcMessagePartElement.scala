package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement")
@js.native
class RpcMessagePartElement protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsRpcOperationElement: RpcOperationElement = js.native
  var elementName: String = js.native
  @JSName("model")
  var model_RpcMessagePartElement: IModel = js.native
  var partName: String = js.native
  var typeName: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.RpcMessagePartElement")
@js.native
object RpcMessagePartElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RpcMessagePartElement = js.native
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
    * of the parent RpcOperationElement element passed as argument.
    */
  def createIn(container: RpcOperationElement): RpcMessagePartElement = js.native
}

