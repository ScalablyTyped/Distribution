package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ListenTargetWidget")
@js.native
abstract class ListenTargetWidget protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ListenTargetWidget {
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
@JSImport("mendixmodelsdk", "pages.ListenTargetWidget")
@js.native
object ListenTargetWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
}

