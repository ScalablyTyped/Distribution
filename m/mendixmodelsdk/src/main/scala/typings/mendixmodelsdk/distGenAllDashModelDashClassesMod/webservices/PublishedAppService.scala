package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedAppService")
@js.native
class PublishedAppService protected ()
  extends typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "webservices.PublishedAppService")
@js.native
object PublishedAppService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
  /**
    * Creates a new PublishedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenWebservicesMod.webservices.PublishedAppService = js.native
}

