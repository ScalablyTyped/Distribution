package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/consumed-web-services relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "webservices.ImportedWebService")
@js.native
class ImportedWebService protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.ImportedWebService {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.ImportedWebService")
@js.native
object ImportedWebService extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new ImportedWebService unit in the SDK and on the server.
    * Expects one argument, the projects.IFolderBase in which this unit is contained.
    */
  def createIn(container: IFolderBase): typings.mendixmodelsdk.distGenWebservicesMod.webservices.ImportedWebService = js.native
}

