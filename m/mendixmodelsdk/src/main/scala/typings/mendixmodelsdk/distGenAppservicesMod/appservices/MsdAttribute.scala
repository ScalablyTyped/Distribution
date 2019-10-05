package typings.mendixmodelsdk.distGenAppservicesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.webservices.DataAttribute
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var attributeType: String = js.native
  val containerAsDataAttribute: DataAttribute = js.native
  val containerAsMsdEntity: MsdEntity = js.native
  var defaultValue: String = js.native
  var enumerationName: String = js.native
  var guid: String = js.native
  var length: Double = js.native
  @JSName("model")
  var model_MsdAttribute: IModel = js.native
  var name: String = js.native
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

