package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenAppservicesMod.appservices.MsdMicroflowParameter
import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
@js.native
class PublishedParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsPublishedOperation: PublishedOperation = js.native
  var dataEntity: DataEntity = js.native
  var entityExposedItemName: String = js.native
  var entityExposedItemNameByContract: String = js.native
  var entityExposedName: String = js.native
  var isLockedByContract: Boolean = js.native
  var isNillable: Boolean = js.native
  var isOptional: Boolean = js.native
  var isOptionalByContract: Boolean = js.native
  @JSName("model")
  var model_PublishedParameter: IModel = js.native
  var parameter: IMicroflowParameter | Null = js.native
  var parameterByContract: MsdMicroflowParameter = js.native
  val parameterQualifiedName: String | Null = js.native
  /**
    * In version 7.9.0: introduced
    */
  var parameterType: DataType = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  var `type`: String = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedParameter")
@js.native
object PublishedParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedParameter = js.native
  /**
    * Creates and returns a new PublishedParameter instance in the SDK and on the server.
    * The new PublishedParameter will be automatically stored in the 'parameters' property
    * of the parent PublishedOperation element passed as argument.
    */
  def createIn(container: PublishedOperation): PublishedParameter = js.native
}

