package typings
package mendixmodelsdkLib.distGenNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation")
@js.native
object navigationNs extends js.Object {
  @js.native
  class DeviceType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class HomePage protected () extends HomePageBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
  @js.native
  abstract class HomePageBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsNavigationProfile: NavigationProfile = js.native
    var microflow: mendixmodelsdkLib.distGenMicroflowsMod.microflowsNs.IMicroflow | scala.Null = js.native
    val microflowQualifiedName: java.lang.String | scala.Null = js.native
    @JSName("model")
    var model_HomePageBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var page: mendixmodelsdkLib.distGenPagesMod.pagesNs.IPage | scala.Null = js.native
    val pageQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * In version 7.22.0: introduced
    */
  @js.native
  trait INativeNavigationProfile extends INavigationProfileBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  @js.native
  trait INavigationDocument
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProjectDocument {
    /**
      * In version 7.2.0: introduced
      */
    val profiles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[INavigationProfileBase] = js.native
  }
  
  /**
    * In version 7.2.0: added public
    */
  @js.native
  trait INavigationProfile extends INavigationProfileBase
  
  @js.native
  trait INavigationProfileBase
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsNavigationDocument: INavigationDocument = js.native
    @JSName("model")
    val model_INavigationProfileBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.2.0: introduced
      */
    val name: java.lang.String = js.native
  }
  
  /**
    * In version 7.22.0: introduced
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNavigationMod.navigationNs.INativeNavigationProfile because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class NativeNavigationProfile protected () extends NavigationProfileBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      */
    var homePage: mendixmodelsdkLib.distGenNativepagesMod.nativepagesNs.INativePage | scala.Null = js.native
    val homePageQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNavigationMod.navigationNs.INavigationDocument because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class NavigationDocument protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.ProjectDocument {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject) = this()
    /**
      * In version 7.2.0: deleted
      */
    var desktopProfile: NavigationProfile = js.native
    /**
      * In version 7.2.0: deleted
      * In version 7.0.2: introduced
      */
    var hybridPhoneProfile: NavigationProfile = js.native
    /**
      * In version 7.0.0: deleted
      * In version 6.10.4: introduced
      */
    var hybridPhoneProfile6: NavigationProfile = js.native
    /**
      * In version 7.2.0: deleted
      * In version 7.0.2: introduced
      */
    var hybridTabletProfile: NavigationProfile = js.native
    /**
      * In version 7.0.0: deleted
      * In version 6.10.4: introduced
      */
    var hybridTabletProfile6: NavigationProfile = js.native
    /**
      * In version 7.0.2: deleted
      */
    var offlinePhoneProfile: NavigationProfile = js.native
    /**
      * In version 7.2.0: deleted
      */
    var phoneProfile: NavigationProfile = js.native
    /**
      * In version 7.2.0: introduced
      */
    val profiles: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[NavigationProfileBase] = js.native
    /**
      * In version 7.2.0: deleted
      */
    var tabletProfile: NavigationProfile = js.native
  }
  
  /**
    * In version 7.2.0: added public
    */
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNavigationMod.navigationNs.INavigationProfile because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  class NavigationProfile protected () extends NavigationProfileBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var applicationTitle: java.lang.String = js.native
    /**
      * In version 7.2.0: deleted
      */
    var enabled: scala.Boolean = js.native
    var homePage: HomePage = js.native
    /**
      * In version 7.2.0: introduced
      */
    var kind: ProfileKind = js.native
    /**
      * In version 7.0.2: introduced
      */
    var loginPageSettings: mendixmodelsdkLib.distGenPagesMod.pagesNs.PageSettings = js.native
    var menuItemCollection: mendixmodelsdkLib.distGenMenusMod.menusNs.MenuItemCollection = js.native
    /**
      * In version 7.2.0: deleted
      * In version 7.0.2: introduced
      */
    var offlineEnabled: scala.Boolean = js.native
    /**
      * In version 7.0.0: deleted
      * In version 6.10.4: introduced
      */
    var offlineEnabled6: scala.Boolean = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.22.0: introduced
      */
    val offlineEntityConfigs: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[OfflineEntityConfig] | scala.Null = js.native
    val roleBasedHomePages: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[RoleBasedHomePage] = js.native
  }
  
  /* RemoveMultipleInheritance: Dropped parents List(mendixmodelsdkLib.distGenNavigationMod.navigationNs.INavigationProfileBase because Would inherit conflicting mutable fields List(id, isLoaded, model, structureTypeName, unit))*/
  @js.native
  abstract class NavigationProfileBase protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsNavigationDocument: NavigationDocument = js.native
    @JSName("model")
    var model_NavigationProfileBase: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    /**
      * In version 7.2.0: introduced
      */
    var name: java.lang.String = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class OfflineEntityConfig protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var constraint: java.lang.String = js.native
    val containerAsNavigationProfile: NavigationProfile = js.native
    var entity: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IEntity = js.native
    val entityQualifiedName: java.lang.String = js.native
    @JSName("model")
    var model_OfflineEntityConfig: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var shouldDownload: scala.Boolean = js.native
  }
  
  @js.native
  class ProfileKind ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ProfileType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class RoleBasedHomePage protected () extends HomePageBase {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var userRole: mendixmodelsdkLib.distGenSecurityMod.securityNs.IUserRole | scala.Null = js.native
    val userRoleQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  object DeviceType extends js.Object {
    var Desktop: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.DeviceType = js.native
  }
  
  @js.native
  object HomePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePage = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * The new HomePage will be automatically stored in the 'homePage' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.HomePage = js.native
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
  @js.native
  object HomePageBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
  }
  
  /**
    * In version 7.22.0: introduced
    */
  @js.native
  object NativeNavigationProfile extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NativeNavigationProfile = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  @js.native
  object NavigationDocument extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates a new NavigationDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument = js.native
  }
  
  /**
    * In version 7.2.0: added public
    */
  @js.native
  object NavigationProfile extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderDesktopProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    def createInNavigationDocumentUnderHybridPhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    def createInNavigationDocumentUnderHybridPhoneProfile6(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    def createInNavigationDocumentUnderHybridTabletProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    def createInNavigationDocumentUnderHybridTabletProfile6(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.0.1
      */
    def createInNavigationDocumentUnderOfflinePhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderPhoneProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    def createInNavigationDocumentUnderProfiles(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    def createInNavigationDocumentUnderTabletProfile(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationDocument): mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile = js.native
  }
  
  @js.native
  object NavigationProfileBase extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  object OfflineEntityConfig extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.OfflineEntityConfig = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
      * of the parent NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.OfflineEntityConfig = js.native
  }
  
  @js.native
  object ProfileKind extends js.Object {
    var Hybrid: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridPhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridPhoneOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridTablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var HybridTabletOffline: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var NativePhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Responsive: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileKind = js.native
  }
  
  @js.native
  object ProfileType extends js.Object {
    var Desktop: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridPhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridPhone6: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridTablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var HybridTablet6: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var OfflinePhone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var Phone: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
    var Tablet: mendixmodelsdkLib.distGenNavigationMod.navigationNs.ProfileType = js.native
  }
  
  @js.native
  object RoleBasedHomePage extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenNavigationMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedHomePage = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenNavigationMod.navigationNs.NavigationProfile): mendixmodelsdkLib.distGenNavigationMod.navigationNs.RoleBasedHomePage = js.native
  }
  
}

