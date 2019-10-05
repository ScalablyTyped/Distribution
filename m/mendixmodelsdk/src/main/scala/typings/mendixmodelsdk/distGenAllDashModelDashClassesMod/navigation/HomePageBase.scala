package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation

import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.HomePageBase")
@js.native
abstract class HomePageBase protected ()
  extends typings.mendixmodelsdk.distGenNavigationMod.navigation.HomePageBase {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo = js.native
}

