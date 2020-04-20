package typings.mendixmodelsdk.webservicesMod.webservices

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.webservicesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedOperation")
@js.native
class PublishedOperation protected () extends PublishedResource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FPublishedOperation: IModel = js.native
  def description: String = js.native
  def description(newValue: String): js.Any = js.native
  def documentation: String = js.native
  def documentation(newValue: String): js.Any = js.native
  def entityExposedName: String = js.native
  def entityExposedName(newValue: String): js.Any = js.native
  def entityExposedNameByContract: String = js.native
  def entityExposedNameByContract(newValue: String): js.Any = js.native
  def image(): js.Any = js.native
  def image(newValue: IImage): js.Any = js.native
  def imageQualifiedName: String | Null = js.native
  @JSName("image")
  def image_Union: IImage | Null = js.native
  def isLockedByContract: Boolean = js.native
  def isLockedByContract(newValue: Boolean): js.Any = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName: String | Null = js.native
  @JSName("microflow")
  def microflow_Union: IMicroflow | Null = js.native
  def name: String = js.native
  def name(newValue: String): js.Any = js.native
  /**
    * In version 7.9.0: introduced
    */
  def operationReturnType: DataType = js.native
  def operationReturnType(newValue: DataType): js.Any = js.native
  def parameters: IList[PublishedParameter] = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  def returnType: String = js.native
  def returnType(newValue: String): js.Any = js.native
  def returnTypeIsNillable: Boolean = js.native
  def returnTypeIsNillable(newValue: Boolean): js.Any = js.native
  def returnTypeIsOptional: Boolean = js.native
  def returnTypeIsOptional(newValue: Boolean): js.Any = js.native
  def returnTypeNameByContract: String = js.native
  def returnTypeNameByContract(newValue: String): js.Any = js.native
  def returnTypeSpecificationByContract: String = js.native
  def returnTypeSpecificationByContract(newValue: String): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.PublishedOperation")
@js.native
object PublishedOperation extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PublishedOperation = js.native
  /**
    * Creates and returns a new PublishedOperation instance in the SDK and on the server.
    * The new PublishedOperation will be automatically stored in the 'operations' property
    * of the parent VersionedService element passed as argument.
    */
  def createIn(container: VersionedService): PublishedOperation = js.native
}

