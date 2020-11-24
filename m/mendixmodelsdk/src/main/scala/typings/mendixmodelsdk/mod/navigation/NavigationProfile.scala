package typings.mendixmodelsdk.mod.navigation

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.2.0: added public
  */
@JSImport("mendixmodelsdk", "navigation.NavigationProfile")
@js.native
class NavigationProfile protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.navigation.NavigationProfile {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "navigation.NavigationProfile")
@js.native
object NavigationProfile extends js.Object {
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderDesktopProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridPhoneProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridPhoneProfile6(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.0.2 to 7.1.0
    */
  def createInNavigationDocumentUnderHybridTabletProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.10.4 to 6.10.4
    */
  def createInNavigationDocumentUnderHybridTabletProfile6(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.0.1
    */
  def createInNavigationDocumentUnderOfflinePhoneProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderPhoneProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'profiles' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 and higher
    */
  def createInNavigationDocumentUnderProfiles(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  /**
    * Creates and returns a new NavigationProfile instance in the SDK and on the server.
    * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
    * of the parent NavigationDocument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.1.0
    */
  def createInNavigationDocumentUnderTabletProfile(container: typings.mendixmodelsdk.navigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
