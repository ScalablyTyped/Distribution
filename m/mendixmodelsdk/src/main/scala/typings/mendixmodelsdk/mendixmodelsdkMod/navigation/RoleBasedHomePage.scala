package typings.mendixmodelsdk.mendixmodelsdkMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
@js.native
class RoleBasedHomePage protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.navigation.RoleBasedHomePage {
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
@JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
@js.native
object RoleBasedHomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenNavigationMod.navigation.RoleBasedHomePage = js.native
  /**
    * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
    * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
    * of the parent NavigationProfile element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.distGenNavigationMod.navigation.NavigationProfile): typings.mendixmodelsdk.distGenNavigationMod.navigation.RoleBasedHomePage = js.native
}

