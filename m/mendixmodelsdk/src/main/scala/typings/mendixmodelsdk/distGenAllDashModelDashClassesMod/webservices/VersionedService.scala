package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.VersionedService")
@js.native
class VersionedService protected ()
  extends typings.mendixmodelsdk.distGenWebservicesMod.webservices.VersionedService {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.VersionedService")
@js.native
object VersionedService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenWebservicesMod.webservices.VersionedService = js.native
  /**
    * Creates and returns a new VersionedService instance in the SDK and on the server.
    * The new VersionedService will be automatically stored in the 'versionedServices' property
    * of the parent PublishedServiceBase element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedServiceBase): typings.mendixmodelsdk.distGenWebservicesMod.webservices.VersionedService = js.native
}

