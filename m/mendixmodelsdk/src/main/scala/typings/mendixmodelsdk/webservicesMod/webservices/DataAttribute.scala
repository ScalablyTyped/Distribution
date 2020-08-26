package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.appservicesMod.appservices.MsdAttribute
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute")
@js.native
class DataAttribute protected () extends DataMember {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDataAttribute: IModel = js.native
  def attribute: IAttribute | Null = js.native
  def attributeByContract: MsdAttribute | Null = js.native
  def attributeByContract_=(newValue: MsdAttribute | Null): Unit = js.native
  def attributeQualifiedName: String | Null = js.native
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  /**
    * In version 8.5.0: introduced
    */
  def description: String = js.native
  def description_=(newValue: String): Unit = js.native
  /**
    * In version 8.5.0: introduced
    */
  def summary: String = js.native
  def summary_=(newValue: String): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataAttribute")
@js.native
object DataAttribute extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataAttribute = js.native
  /**
    * Creates and returns a new DataAttribute instance in the SDK and on the server.
    * The new DataAttribute will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createIn(container: DataEntityBase): DataAttribute = js.native
}

