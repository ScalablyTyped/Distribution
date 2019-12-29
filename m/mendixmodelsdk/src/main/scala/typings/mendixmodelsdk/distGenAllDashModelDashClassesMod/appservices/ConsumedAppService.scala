package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices

import typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
class ConsumedAppService protected ()
  extends typings.mendixmodelsdk.distGenAppservicesMod.appservices.ConsumedAppService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenAppservicesMod.appservices.ConsumedAppService = js.native
}

