package typings.mendixmodelsdk.distGenNavigationMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodelsNs.IEntity
import typings.mendixmodelsdk.distGenMenusMod.menusNs.MenuItemCollection
import typings.mendixmodelsdk.distGenMicroflowsMod.microflowsNs.IMicroflow
import typings.mendixmodelsdk.distGenNativepagesMod.nativepagesNs.BottomBarItem
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.DeviceType
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.HomePage
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.HomePageBase
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationDocument
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationProfileBase
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NativeNavigationProfile
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NavigationDocument
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NavigationProfile
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.NavigationProfileBase
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.OfflineEntityConfig
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.ProfileKind
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.ProfileType
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.RoleBasedHomePage
import typings.mendixmodelsdk.distGenNavigationMod.navigationNs.RoleBasedNativeHomePage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.IPage
import typings.mendixmodelsdk.distGenPagesMod.pagesNs.PageSettings
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProjectDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Project
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.ProjectDocument
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IUserRole
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/navigation", "navigation")
@js.native
object navigationNs extends js.Object {
  @js.native
  class DeviceType () extends AbstractEnum
  
  @js.native
  class HomePage protected () extends HomePageBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
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
  
  /**
    * In version 7.22.0: introduced
    */
  @js.native
  trait INativeNavigationProfile extends INavigationProfileBase
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  @js.native
  trait INavigationDocument extends IProjectDocument {
    /**
      * In version 7.2.0: introduced
      */
    val profiles: IList[INavigationProfileBase] = js.native
  }
  
  /**
    * In version 7.2.0: added public
    */
  @js.native
  trait INavigationProfile extends INavigationProfileBase
  
  @js.native
  trait INavigationProfileBase
    extends IElement
       with IByNameReferrable {
    val containerAsNavigationDocument: INavigationDocument = js.native
    @JSName("model")
    val model_INavigationProfileBase: IModel = js.native
    /**
      * In version 7.2.0: introduced
      */
    val name: String = js.native
  }
  
  /**
    * In version 7.22.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INativeNavigationProfile because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class NativeNavigationProfile protected () extends NavigationProfileBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.0.0: introduced
      */
    val bottomBarItems: IList[BottomBarItem] = js.native
    @JSName("containerAsNavigationDocument")
    val containerAsNavigationDocument_NativeNavigationProfile: NavigationDocument = js.native
    var homePage: IPage | Null = js.native
    val homePageQualifiedName: String | Null = js.native
    /**
      * In version 8.0.0: introduced
      */
    val roleBasedNativeHomePages: IList[RoleBasedNativeHomePage] = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/navigation relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationDocument because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @js.native
  class NavigationDocument protected () extends ProjectDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
    @JSName("containerAsProject")
    val containerAsProject_NavigationDocument: Project = js.native
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
    val profiles: IList[INavigationProfileBase | NavigationProfileBase] = js.native
    /**
      * In version 7.2.0: deleted
      */
    var tabletProfile: NavigationProfile = js.native
  }
  
  /**
    * In version 7.2.0: added public
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationProfile because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class NavigationProfile protected () extends NavigationProfileBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var applicationTitle: String = js.native
    @JSName("containerAsNavigationDocument")
    val containerAsNavigationDocument_NavigationProfile: NavigationDocument = js.native
    /**
      * In version 7.2.0: deleted
      */
    var enabled: Boolean = js.native
    var homePage: HomePage = js.native
    /**
      * In version 7.2.0: introduced
      */
    var kind: ProfileKind = js.native
    /**
      * In version 7.0.2: introduced
      */
    var loginPageSettings: PageSettings = js.native
    var menuItemCollection: MenuItemCollection = js.native
    /**
      * In version 7.2.0: deleted
      * In version 7.0.2: introduced
      */
    var offlineEnabled: Boolean = js.native
    /**
      * In version 7.0.0: deleted
      * In version 6.10.4: introduced
      */
    var offlineEnabled6: Boolean = js.native
    val roleBasedHomePages: IList[RoleBasedHomePage] = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenNavigationMod.navigationNs.INavigationProfileBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsNavigationDocument, name */ @js.native
  abstract class NavigationProfileBase protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsNavigationDocument: INavigationDocument | NavigationDocument = js.native
    @JSName("model")
    var model_NavigationProfileBase: IModel = js.native
    /**
      * In version 7.2.0: introduced
      */
    var name: String = js.native
    /**
      * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 7.22.0: introduced
      */
    val offlineEntityConfigs: IList[OfflineEntityConfig] | Null = js.native
    val qualifiedName: String | Null = js.native
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.22.0: introduced
    */
  @js.native
  class OfflineEntityConfig protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var constraint: String = js.native
    val containerAsNavigationProfileBase: NavigationProfileBase = js.native
    var entity: IEntity = js.native
    val entityQualifiedName: String = js.native
    @JSName("model")
    var model_OfflineEntityConfig: IModel = js.native
    var shouldDownload: Boolean = js.native
  }
  
  @js.native
  class ProfileKind () extends AbstractEnum
  
  @js.native
  class ProfileType () extends AbstractEnum
  
  @js.native
  class RoleBasedHomePage protected () extends HomePageBase {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var userRole: IUserRole | Null = js.native
    val userRoleQualifiedName: String | Null = js.native
  }
  
  /**
    * In version 8.0.0: introduced
    */
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
    val containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
    @JSName("model")
    var model_RoleBasedNativeHomePage: IModel = js.native
    var page: IPage | Null = js.native
    val pageQualifiedName: String | Null = js.native
    var userRole: IUserRole | Null = js.native
    val userRoleQualifiedName: String | Null = js.native
  }
  
  /* static members */
  @js.native
  object DeviceType extends js.Object {
    var Desktop: DeviceType = js.native
    var Phone: DeviceType = js.native
    var Tablet: DeviceType = js.native
  }
  
  /* static members */
  @js.native
  object HomePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): HomePage = js.native
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * The new HomePage will be automatically stored in the 'homePage' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: NavigationProfile): HomePage = js.native
  }
  
  /* static members */
  @js.native
  object HomePageBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object NativeNavigationProfile extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): NativeNavigationProfile = js.native
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: NavigationDocument): NativeNavigationProfile = js.native
  }
  
  /* static members */
  @js.native
  object NavigationDocument extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new NavigationDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    def createIn(container: IProject): NavigationDocument = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object NavigationProfileBase extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object OfflineEntityConfig extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): OfflineEntityConfig = js.native
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
      * of the parent NavigationProfileBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    def createIn(container: NavigationProfileBase): OfflineEntityConfig = js.native
  }
  
  /* static members */
  @js.native
  object ProfileKind extends js.Object {
    var Hybrid: ProfileKind = js.native
    var HybridOffline: ProfileKind = js.native
    var HybridPhone: ProfileKind = js.native
    var HybridPhoneOffline: ProfileKind = js.native
    var HybridTablet: ProfileKind = js.native
    var HybridTabletOffline: ProfileKind = js.native
    var NativePhone: ProfileKind = js.native
    var Phone: ProfileKind = js.native
    var Responsive: ProfileKind = js.native
    var Tablet: ProfileKind = js.native
  }
  
  /* static members */
  @js.native
  object ProfileType extends js.Object {
    var Desktop: ProfileType = js.native
    var HybridPhone: ProfileType = js.native
    var HybridPhone6: ProfileType = js.native
    var HybridTablet: ProfileType = js.native
    var HybridTablet6: ProfileType = js.native
    var OfflinePhone: ProfileType = js.native
    var Phone: ProfileType = js.native
    var Tablet: ProfileType = js.native
  }
  
  /* static members */
  @js.native
  object RoleBasedHomePage extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): RoleBasedHomePage = js.native
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
      * of the parent NavigationProfile element passed as argument.
      */
    def createIn(container: NavigationProfile): RoleBasedHomePage = js.native
  }
  
  /* static members */
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
  
}

