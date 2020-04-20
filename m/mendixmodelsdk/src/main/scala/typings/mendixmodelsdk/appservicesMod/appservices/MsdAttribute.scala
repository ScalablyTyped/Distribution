package typings.mendixmodelsdk.appservicesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
@js.native
class MsdAttribute protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMsdAttribute: IModel = js.native
  def attributeType: String = js.native
  def attributeType(newValue: String): js.Any = js.native
  def containerAsDataAttribute: DataAttribute = js.native
  def containerAsMsdEntity: MsdEntity = js.native
  def defaultValue: String = js.native
  def defaultValue(newValue: String): js.Any = js.native
  def enumerationName: String = js.native
  def enumerationName(newValue: String): js.Any = js.native
  def guid: String = js.native
  def guid(newValue: String): js.Any = js.native
  def length: Double = js.native
  def length(newValue: Double): js.Any = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
@js.native
object MsdAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdAttribute = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
    * of the parent webservices.DataAttribute element passed as argument.
    */
  def createInDataAttributeUnderAttributeByContract(container: DataAttribute): MsdAttribute = js.native
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributes' property
    * of the parent MsdEntity element passed as argument.
    */
  def createInMsdEntityUnderAttributes(container: MsdEntity): MsdAttribute = js.native
}

