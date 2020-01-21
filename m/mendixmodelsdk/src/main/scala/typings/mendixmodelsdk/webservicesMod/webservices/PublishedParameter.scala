package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.appservicesMod.appservices.MsdMicroflowParameter
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
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
  @JSName("model")
  var model_FPublishedParameter: IModel = js.native
  def containerAsPublishedOperation(): PublishedOperation = js.native
  def dataEntity(): DataEntity = js.native
  def dataEntity(newValue: DataEntity): js.Any = js.native
  def entityExposedItemName(): String = js.native
  def entityExposedItemName(newValue: String): js.Any = js.native
  def entityExposedItemNameByContract(): String = js.native
  def entityExposedItemNameByContract(newValue: String): js.Any = js.native
  def entityExposedName(): String = js.native
  def entityExposedName(newValue: String): js.Any = js.native
  def isLockedByContract(): Boolean = js.native
  def isLockedByContract(newValue: Boolean): js.Any = js.native
  def isNillable(): Boolean = js.native
  def isNillable(newValue: Boolean): js.Any = js.native
  def isOptional(): Boolean = js.native
  def isOptional(newValue: Boolean): js.Any = js.native
  def isOptionalByContract(): Boolean = js.native
  def isOptionalByContract(newValue: Boolean): js.Any = js.native
  def parameter(): js.Any = js.native
  def parameter(newValue: IMicroflowParameter): js.Any = js.native
  def parameterByContract(): MsdMicroflowParameter = js.native
  def parameterByContract(newValue: MsdMicroflowParameter): js.Any = js.native
  def parameterQualifiedName(): String | Null = js.native
  /**
    * In version 7.9.0: introduced
    */
  def parameterType(): DataType = js.native
  def parameterType(newValue: DataType): js.Any = js.native
  @JSName("parameter")
  def parameter_Union(): IMicroflowParameter | Null = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def `type`(): String = js.native
  def `type`(newValue: String): js.Any = js.native
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

