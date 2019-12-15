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

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PartEncoding")
@js.native
class PartEncoding protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPartEncoding: IModel = js.native
  def containerAsOperationInfo(): OperationInfo = js.native
  def partName(): String = js.native
  def partName(newValue: String): js.Any = js.native
  def partXsdType(): String = js.native
  def partXsdType(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PartEncoding")
@js.native
object PartEncoding extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PartEncoding = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestBodyPartEncodings' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestBodyPartEncodings(container: OperationInfo): PartEncoding = js.native
  /**
    * Creates and returns a new PartEncoding instance in the SDK and on the server.
    * The new PartEncoding will be automatically stored in the 'requestHeaderPartEncoding' property
    * of the parent OperationInfo element passed as argument.
    */
  def createInOperationInfoUnderRequestHeaderPartEncoding(container: OperationInfo): PartEncoding = js.native
}

