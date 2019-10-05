package typings.mendixmodelsdk.mendixmodelsdkMod.webservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "webservices.DataEntityBase")
@js.native
abstract class DataEntityBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.webservices.DataEntityBase {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "webservices.DataEntityBase")
@js.native
object DataEntityBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenWebservicesMod.StructureVersionInfo = js.native
}

