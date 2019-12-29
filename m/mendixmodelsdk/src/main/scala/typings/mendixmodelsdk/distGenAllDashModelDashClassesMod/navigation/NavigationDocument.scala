package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation

import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NavigationDocument")
@js.native
class NavigationDocument protected ()
  extends typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationDocument {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IProject
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "navigation.NavigationDocument")
@js.native
object NavigationDocument extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates a new NavigationDocument unit in the SDK and on the server.
    * Expects one argument, the projects.IProject in which this unit is contained.
    */
  def createIn(container: IProject): typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationDocument = js.native
}

