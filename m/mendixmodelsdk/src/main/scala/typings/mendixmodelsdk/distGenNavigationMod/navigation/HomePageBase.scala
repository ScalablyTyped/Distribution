package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
abstract class HomePageBase protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  val containerAsNavigationProfile: NavigationProfile = js.native
  var microflow: IMicroflow | Null = js.native
  val microflowQualifiedName: String | Null = js.native
  @JSName("model")
  var model_HomePageBase: IModel = js.native
  var page: IPage | Null = js.native
  val pageQualifiedName: String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
@js.native
object HomePageBase extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

