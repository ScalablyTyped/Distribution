package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.PublishedServiceBase")
@js.native
abstract class PublishedServiceBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.PublishedServiceBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IFolderBase
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.PublishedServiceBase")
@js.native
object PublishedServiceBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

