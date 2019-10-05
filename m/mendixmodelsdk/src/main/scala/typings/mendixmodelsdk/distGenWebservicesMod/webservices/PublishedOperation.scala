package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatatypesMod.datatypes.DataType
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
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
  var description: String = js.native
  var documentation: String = js.native
  var entityExposedName: String = js.native
  var entityExposedNameByContract: String = js.native
  var image: IImage | Null = js.native
  val imageQualifiedName: String | Null = js.native
  var isLockedByContract: Boolean = js.native
  var microflow: IMicroflow | Null = js.native
  val microflowQualifiedName: String | Null = js.native
  var name: String = js.native
  /**
    * In version 7.9.0: introduced
    */
  var operationReturnType: DataType = js.native
  val parameters: IList[PublishedParameter] = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 7.9.0: deleted
    */
  var returnType: String = js.native
  var returnTypeIsNillable: Boolean = js.native
  var returnTypeIsOptional: Boolean = js.native
  var returnTypeNameByContract: String = js.native
  var returnTypeSpecificationByContract: String = js.native
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

