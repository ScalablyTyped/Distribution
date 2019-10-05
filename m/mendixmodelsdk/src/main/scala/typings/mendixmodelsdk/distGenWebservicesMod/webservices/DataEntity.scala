package typings.mendixmodelsdk.distGenWebservicesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntity")
@js.native
class DataEntity protected () extends DataEntityBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/webservices", "webservices.DataEntity")
@js.native
object DataEntity extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'childMembers' property
    * of the parent DataEntityBase element passed as argument.
    */
  def createInDataEntityBaseUnderChildMembers(container: DataEntityBase): DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedParameter element passed as argument.
    */
  def createInPublishedParameterUnderDataEntity(container: PublishedParameter): DataEntity = js.native
  /**
    * Creates and returns a new DataEntity instance in the SDK and on the server.
    * The new DataEntity will be automatically stored in the 'dataEntity' property
    * of the parent PublishedResource element passed as argument.
    */
  def createInPublishedResourceUnderDataEntity(container: PublishedResource): DataEntity = js.native
}

