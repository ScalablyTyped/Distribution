package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.rest

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenRestMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/published-rest-services relevant section in reference guide}
  *
  * In version 7.11.0: removed experimental
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.PublishedRestService")
@js.native
class PublishedRestService protected ()
  extends typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "rest.PublishedRestService")
@js.native
object PublishedRestService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new PublishedRestService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenRestMod.rest.PublishedRestService = js.native
}

