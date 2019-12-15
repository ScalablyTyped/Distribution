package typings.mendixmodelsdk.distGenNavigationMod.navigation

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenNavigationMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.IPage
import typings.mendixmodelsdk.distGenSecurityMod.security.IUserRole
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage")
@js.native
class RoleBasedNativeHomePage protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FRoleBasedNativeHomePage: IModel = js.native
  def containerAsNativeNavigationProfile(): NativeNavigationProfile = js.native
  def page(): IPage | Null = js.native
  def page(newValue: IPage): js.Any = js.native
  def pageQualifiedName(): String | Null = js.native
  @JSName("page")
  def page_Any(): js.Any = js.native
  def userRole(): IUserRole | Null = js.native
  def userRole(newValue: IUserRole): js.Any = js.native
  def userRoleQualifiedName(): String | Null = js.native
  @JSName("userRole")
  def userRole_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage")
@js.native
object RoleBasedNativeHomePage extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RoleBasedNativeHomePage = js.native
  /**
    * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
    * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
    * of the parent NativeNavigationProfile element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: NativeNavigationProfile): RoleBasedNativeHomePage = js.native
}

