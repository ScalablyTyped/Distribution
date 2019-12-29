package typings.mendixmodelsdk.mendixmodelsdkMod.navigation

import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
  */
@JSImport("mendixmodelsdk", "navigation.HomePageBase")
@js.native
abstract class HomePageBase protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.HomePageBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

