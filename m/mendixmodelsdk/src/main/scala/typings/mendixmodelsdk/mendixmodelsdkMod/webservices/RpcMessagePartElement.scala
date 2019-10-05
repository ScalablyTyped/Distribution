package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.RpcMessagePartElement")
@js.native
class RpcMessagePartElement protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.RpcMessagePartElement {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.RpcMessagePartElement")
@js.native
object RpcMessagePartElement extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.RpcMessagePartElement = js.native
  /**
    * Creates and returns a new RpcMessagePartElement instance in the SDK and on the server.
    * The new RpcMessagePartElement will be automatically stored in the 'messagePartElements' property
    * of the parent RpcOperationElement element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.RpcOperationElement): typings.mendixmodelsdk.distGenWebservicesMod.webservices.RpcMessagePartElement = js.native
}

