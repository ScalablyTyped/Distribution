package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: deleted
  */
@JSImport("mendixmodelsdk", "pages.SplitPane")
@js.native
abstract class SplitPane protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.SplitPane {
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
@JSImport("mendixmodelsdk", "pages.SplitPane")
@js.native
object SplitPane extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
}

