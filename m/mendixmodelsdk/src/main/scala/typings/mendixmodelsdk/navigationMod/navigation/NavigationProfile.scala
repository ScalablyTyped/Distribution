package typings.mendixmodelsdk.navigationMod.navigation

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItemCollection
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.2.0: added public
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because Already inherited
- typings.mendixmodelsdk.navigationMod.navigation.INavigationProfile because var conflicts: containerAsNavigationDocument, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfile")
@js.native
class NavigationProfile protected () extends NavigationProfileBase {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FNavigationProfile: IModel = js.native
  def applicationTitle: String = js.native
  def applicationTitle(newValue: String): js.Any = js.native
  @JSName("containerAsNavigationDocument")
  def containerAsNavigationDocument_MNavigationProfile: NavigationDocument = js.native
  /**
    * In version 7.2.0: deleted
    */
  def enabled: Boolean = js.native
  def enabled(newValue: Boolean): js.Any = js.native
  def homePage: HomePage = js.native
  def homePage(newValue: HomePage): js.Any = js.native
  /**
    * In version 7.2.0: introduced
    */
  def kind: ProfileKind = js.native
  def kind(newValue: ProfileKind): js.Any = js.native
  /**
    * In version 7.0.2: introduced
    */
  def loginPageSettings: PageSettings = js.native
  def loginPageSettings(newValue: PageSettings): js.Any = js.native
  def menuItemCollection: MenuItemCollection = js.native
  def menuItemCollection(newValue: MenuItemCollection): js.Any = js.native
  /**
    * In version 7.2.0: deleted
    * In version 7.0.2: introduced
    */
  def offlineEnabled: Boolean = js.native
  def offlineEnabled(newValue: Boolean): js.Any = js.native
  /**
    * In version 7.0.0: deleted
    * In version 6.10.4: introduced
    */
  def offlineEnabled6: Boolean = js.native
  def offlineEnabled6(newValue: Boolean): js.Any = js.native
  def roleBasedHomePages: IList[RoleBasedHomePage] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfile")
@js.native
object NavigationProfile extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createIn(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderDesktopProfile(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridPhoneProfile(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridPhoneProfile6(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridTabletProfile(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridTabletProfile6(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationDocumentUnderOfflinePhoneProfile(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderPhoneProfile(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createInNavigationDocumentUnderProfiles(container: NavigationDocument): NavigationProfile = js.native
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderTabletProfile(container: NavigationDocument): NavigationProfile = js.native
}

