package typings.mendixmodelsdk.mendixmodelsdkMod.pages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.15.0: deleted
  * In version 7.1.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.MasterDetailRegion")
@js.native
abstract class MasterDetailRegion protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.MasterDetailRegion {
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
@JSImport("mendixmodelsdk", "pages.MasterDetailRegion")
@js.native
object MasterDetailRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
}

