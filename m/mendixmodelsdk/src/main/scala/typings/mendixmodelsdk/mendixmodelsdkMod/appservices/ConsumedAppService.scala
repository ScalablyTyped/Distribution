package typings.mendixmodelsdk.mendixmodelsdkMod.appservices

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-app-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "appservices.ConsumedAppService")
@js.native
class ConsumedAppService protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.appservices.ConsumedAppService {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "appservices.ConsumedAppService")
@js.native
object ConsumedAppService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenAppservicesMod.StructureVersionInfo = js.native
  /**
    * Creates a new ConsumedAppService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenAppservicesMod.appservices.ConsumedAppService = js.native
}

