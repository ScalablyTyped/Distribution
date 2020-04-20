package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.constantsMod.constants.IConstant
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.ServiceInfo")
@js.native
class ServiceInfo protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FServiceInfo: IModel = js.native
  def containerAsWsdlDescription: WsdlDescription = js.native
  def documentation: String = js.native
  def documentation(newValue: String): js.Any = js.native
  def location: String = js.native
  def location(newValue: String): js.Any = js.native
  def locationConstant(): js.Any = js.native
  def locationConstant(newValue: IConstant): js.Any = js.native
  def locationConstantQualifiedName: String | Null = js.native
  @JSName("locationConstant")
  def locationConstant_Union: IConstant | Null = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  def operations: IList[OperationInfo] = js.native
  def portName: String = js.native
  def portName(newValue: String): js.Any = js.native
  def soapVersion: SoapVersion = js.native
  def soapVersion(newValue: SoapVersion): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.ServiceInfo")
@js.native
object ServiceInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ServiceInfo = js.native
  /**
    * Creates and returns a new ServiceInfo instance in the SDK and on the server.
    * The new ServiceInfo will be automatically stored in the 'services' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: WsdlDescription): ServiceInfo = js.native
}

