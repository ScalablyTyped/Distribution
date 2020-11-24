package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.securityMod.security.IUserRole
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage")
@js.native
class RoleBasedNativeHomePage protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
  
  def page: IPage | Null = js.native
  
  def pageQualifiedName: String | Null = js.native
  
  def page_=(newValue: IPage | Null): Unit = js.native
  
  def userRole: IUserRole | Null = js.native
  
  def userRoleQualifiedName: String | Null = js.native
  
  def userRole_=(newValue: IUserRole | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage")
@js.native
object RoleBasedNativeHomePage extends js.Object {
  
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
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
