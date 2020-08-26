package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry")
@js.native
class WsdlEntry protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FWsdlEntry: IModel = js.native
  def containerAsWsdlDescription: WsdlDescription = js.native
  def contents: String = js.native
  def contents_=(newValue: String): Unit = js.native
  def localizedContentsFormat: String = js.native
  def localizedContentsFormat_=(newValue: String): Unit = js.native
  def localizedLocationFormat: String = js.native
  def localizedLocationFormat_=(newValue: String): Unit = js.native
  def location: String = js.native
  def location_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.WsdlEntry")
@js.native
object WsdlEntry extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WsdlEntry = js.native
  /**
    * Creates and returns a new WsdlEntry instance in the SDK and on the server.
    * The new WsdlEntry will be automatically stored in the 'wsdlEntries' property
    * of the parent WsdlDescription element passed as argument.
    */
  def createIn(container: WsdlDescription): WsdlEntry = js.native
}

