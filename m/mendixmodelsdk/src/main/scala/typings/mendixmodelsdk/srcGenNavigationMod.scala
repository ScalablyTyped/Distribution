package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcGenMenusMod.menus.MenuItemCollection
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.srcGenMicroflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.srcGenNativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.srcGenPagesMod.pages.IPage
import typings.mendixmodelsdk.srcGenPagesMod.pages.PageSettings
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.srcGenProjectsMod.projects.Project
import typings.mendixmodelsdk.srcGenProjectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.srcGenSecurityMod.security.IUserRole
import typings.mendixmodelsdk.srcGenTextsMod.texts.Text
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.Element
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGenNavigationMod {
  
  @JSImport("mendixmodelsdk/src/gen/navigation", "StructureVersionInfo")
  @js.native
  open class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.srcSdkInternalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object navigation {
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.DeviceType")
    @js.native
    open class DeviceType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DeviceType {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.DeviceType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.DeviceType.Desktop")
      @js.native
      def Desktop: DeviceType = js.native
      inline def Desktop_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.DeviceType.Phone")
      @js.native
      def Phone: DeviceType = js.native
      inline def Phone_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.DeviceType.Tablet")
      @js.native
      def Tablet: DeviceType = js.native
      inline def Tablet_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePage")
    @js.native
    open class HomePage protected () extends HomePageBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object HomePage {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new HomePage instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): HomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[HomePage]
      
      /**
        * Creates and returns a new HomePage instance in the SDK and on the server.
        * The new HomePage will be automatically stored in the 'homePage' property
        * of the parent NavigationProfile element passed as argument.
        */
      /* static member */
      inline def createIn(container: NavigationProfile): HomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[HomePage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePageBase")
    @js.native
    open class HomePageBase protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNavigationProfile: NavigationProfile = js.native
      
      def microflow: IMicroflow | Null = js.native
      
      def microflowQualifiedName: String | Null = js.native
      
      def microflow_=(newValue: IMicroflow | Null): Unit = js.native
      
      def page: IPage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: IPage | Null): Unit = js.native
    }
    object HomePageBase {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePageBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePageBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.HomePageBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.4.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePage")
    @js.native
    open class NativeHomePage protected () extends NativeHomePageBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
    }
    object NativeHomePage {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativeHomePage instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativeHomePage]
      
      /**
        * Creates and returns a new NativeHomePage instance in the SDK and on the server.
        * The new NativeHomePage will be automatically stored in the 'nativeHomePage' property
        * of the parent NativeNavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.4.0 and higher
        */
      /* static member */
      inline def createIn(container: NativeNavigationProfile): NativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativeHomePage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 9.4.0: introduced
      */
    /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePageBase")
    @js.native
    open class NativeHomePageBase protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNativeNavigationProfile: NativeNavigationProfile = js.native
      
      def homePageNanoflow: INanoflow | Null = js.native
      
      def homePageNanoflowQualifiedName: String | Null = js.native
      
      def homePageNanoflow_=(newValue: INanoflow | Null): Unit = js.native
      
      def homePagePage: IPage | Null = js.native
      
      def homePagePageQualifiedName: String | Null = js.native
      
      def homePagePage_=(newValue: IPage | Null): Unit = js.native
    }
    object NativeHomePageBase {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePageBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePageBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeHomePageBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.22.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INavigationProfileBase because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INativeNavigationProfile because var conflicts: containerAsNavigationDocument, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeNavigationProfile")
    @js.native
    open class NativeNavigationProfile protected () extends NavigationProfileBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 8.0.0: introduced
        */
      def bottomBarItems: IList[BottomBarItem] = js.native
      
      @JSName("containerAsNavigationDocument")
      def containerAsNavigationDocument_MNativeNavigationProfile: NavigationDocument = js.native
      
      /**
        * In version 9.18.0: introduced
        */
      def encryptionDbEnabled: Boolean = js.native
      def encryptionDbEnabled_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.4.0: deleted
        */
      def homePage: IPage | Null = js.native
      
      def homePageQualifiedName: String | Null = js.native
      
      def homePage_=(newValue: IPage | Null): Unit = js.native
      
      /**
        * In version 9.22.0: introduced
        */
      def localFileEncryptionEnabled: Boolean = js.native
      def localFileEncryptionEnabled_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.15.0: introduced
        */
      def loggingEnabled: Boolean = js.native
      def loggingEnabled_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.4.0: introduced
        */
      def nativeHomePage: NativeHomePage = js.native
      def nativeHomePage_=(newValue: NativeHomePage): Unit = js.native
      
      /**
        * In version 9.4.0: introduced
        */
      def otaEnabled: Boolean = js.native
      def otaEnabled_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 8.0.0: introduced
        */
      def roleBasedNativeHomePages: IList[RoleBasedNativeHomePage] = js.native
    }
    object NativeNavigationProfile {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeNavigationProfile")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NativeNavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NativeNavigationProfile]
      
      /**
        * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
        * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 and higher
        */
      /* static member */
      inline def createIn(container: NavigationDocument): NativeNavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NativeNavigationProfile]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeNavigationProfile.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NativeNavigationProfile.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.srcGenProjectsMod.projects.IProjectDocument because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INavigationDocument because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationDocument")
    @js.native
    open class NavigationDocument protected () extends ProjectDocument {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IProject
      ) = this()
      
      @JSName("containerAsProject")
      def containerAsProject_MNavigationDocument: Project = js.native
      
      /**
        * In version 7.2.0: deleted
        */
      def desktopProfile: NavigationProfile = js.native
      def desktopProfile_=(newValue: NavigationProfile): Unit = js.native
      
      /**
        * In version 7.2.0: deleted
        * In version 7.0.2: introduced
        */
      def hybridPhoneProfile: NavigationProfile = js.native
      
      /**
        * In version 7.0.0: deleted
        * In version 6.10.4: introduced
        */
      def hybridPhoneProfile6: NavigationProfile = js.native
      def hybridPhoneProfile6_=(newValue: NavigationProfile): Unit = js.native
      
      def hybridPhoneProfile_=(newValue: NavigationProfile): Unit = js.native
      
      /**
        * In version 7.2.0: deleted
        * In version 7.0.2: introduced
        */
      def hybridTabletProfile: NavigationProfile = js.native
      
      /**
        * In version 7.0.0: deleted
        * In version 6.10.4: introduced
        */
      def hybridTabletProfile6: NavigationProfile = js.native
      def hybridTabletProfile6_=(newValue: NavigationProfile): Unit = js.native
      
      def hybridTabletProfile_=(newValue: NavigationProfile): Unit = js.native
      
      /**
        * In version 7.0.2: deleted
        */
      def offlinePhoneProfile: NavigationProfile = js.native
      def offlinePhoneProfile_=(newValue: NavigationProfile): Unit = js.native
      
      /**
        * In version 7.2.0: deleted
        */
      def phoneProfile: NavigationProfile = js.native
      def phoneProfile_=(newValue: NavigationProfile): Unit = js.native
      
      /**
        * In version 7.2.0: introduced
        */
      def profiles: IList[NavigationProfileBase] = js.native
      /**
        * In version 7.2.0: introduced
        */
      @JSName("profiles")
      val profiles_FNavigationDocument: IList[INavigationProfileBase] = js.native
      
      /**
        * In version 7.2.0: deleted
        */
      def tabletProfile: NavigationProfile = js.native
      def tabletProfile_=(newValue: NavigationProfile): Unit = js.native
    }
    object NavigationDocument {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NavigationDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IProject in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IProject): NavigationDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationDocument]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.2.0: added public
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INavigationProfileBase because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INavigationProfile because var conflicts: containerAsNavigationDocument, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfile")
    @js.native
    open class NavigationProfile protected () extends NavigationProfileBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 8.12.0: introduced
        */
      def appIcon: IImage | Null = js.native
      
      def appIconQualifiedName: String | Null = js.native
      
      def appIcon_=(newValue: IImage | Null): Unit = js.native
      
      /**
        * In version 8.12.0: introduced
        */
      def appTitle: Text = js.native
      def appTitle_=(newValue: Text): Unit = js.native
      
      /**
        * In version 8.12.0: deleted
        */
      def applicationTitle: String = js.native
      def applicationTitle_=(newValue: String): Unit = js.native
      
      @JSName("containerAsNavigationDocument")
      def containerAsNavigationDocument_MNavigationProfile: NavigationDocument = js.native
      
      /**
        * In version 7.2.0: deleted
        */
      def enabled: Boolean = js.native
      def enabled_=(newValue: Boolean): Unit = js.native
      
      def homePage: HomePage = js.native
      def homePage_=(newValue: HomePage): Unit = js.native
      
      /**
        * In version 7.2.0: introduced
        */
      def kind: ProfileKind = js.native
      def kind_=(newValue: ProfileKind): Unit = js.native
      
      /**
        * In version 7.0.2: introduced
        */
      def loginPageSettings: PageSettings = js.native
      def loginPageSettings_=(newValue: PageSettings): Unit = js.native
      
      def menuItemCollection: MenuItemCollection = js.native
      def menuItemCollection_=(newValue: MenuItemCollection): Unit = js.native
      
      /**
        * In version 7.2.0: deleted
        * In version 7.0.2: introduced
        */
      def offlineEnabled: Boolean = js.native
      
      /**
        * In version 7.0.0: deleted
        * In version 6.10.4: introduced
        */
      def offlineEnabled6: Boolean = js.native
      def offlineEnabled6_=(newValue: Boolean): Unit = js.native
      
      def offlineEnabled_=(newValue: Boolean): Unit = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 9.0.3: introduced
        */
      def progressiveWebAppSettings: ProgressiveWebAppSettings | Null = js.native
      def progressiveWebAppSettings_=(newValue: ProgressiveWebAppSettings | Null): Unit = js.native
      
      def roleBasedHomePages: IList[RoleBasedHomePage] = js.native
    }
    object NavigationProfile {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfile")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'profiles' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.2.0 and higher
        */
      /* static member */
      inline def createIn(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.1.0
        */
      /* static member */
      inline def createInNavigationDocumentUnderDesktopProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderDesktopProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.0.2 to 7.1.0
        */
      /* static member */
      inline def createInNavigationDocumentUnderHybridPhoneProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridPhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.10.4 to 6.10.4
        */
      /* static member */
      inline def createInNavigationDocumentUnderHybridPhoneProfile6(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridPhoneProfile6")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.0.2 to 7.1.0
        */
      /* static member */
      inline def createInNavigationDocumentUnderHybridTabletProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridTabletProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.10.4 to 6.10.4
        */
      /* static member */
      inline def createInNavigationDocumentUnderHybridTabletProfile6(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridTabletProfile6")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.0.1
        */
      /* static member */
      inline def createInNavigationDocumentUnderOfflinePhoneProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderOfflinePhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.1.0
        */
      /* static member */
      inline def createInNavigationDocumentUnderPhoneProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderPhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'profiles' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.2.0 and higher
        */
      /* static member */
      inline def createInNavigationDocumentUnderProfiles(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderProfiles")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /**
        * Creates and returns a new NavigationProfile instance in the SDK and on the server.
        * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
        * of the parent NavigationDocument element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  6.0.0 to 7.1.0
        */
      /* static member */
      inline def createInNavigationDocumentUnderTabletProfile(container: NavigationDocument): NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderTabletProfile")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationProfile]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfile.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfile.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* note: abstract class */ /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.srcSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.srcGenNavigationMod.navigation.INavigationProfileBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsNavigationDocument, name */ @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfileBase")
    @js.native
    open class NavigationProfileBase protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNavigationDocument: NavigationDocument = js.native
      @JSName("containerAsNavigationDocument")
      val containerAsNavigationDocument_FNavigationProfileBase: INavigationDocument = js.native
      
      /**
        * In version 7.2.0: introduced
        */
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      /**
        * In version 7.2.0: introduced
        */
      @JSName("name")
      val name_FNavigationProfileBase: String = js.native
      
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        *
        * @ignore
        *
        * In version 7.22.0: introduced
        */
      def offlineEntityConfigs: IList[OfflineEntityConfig] | Null = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MNavigationProfileBase: String | Null = js.native
    }
    object NavigationProfileBase {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfileBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfileBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.NavigationProfileBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 7.22.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntityConfig")
    @js.native
    open class OfflineEntityConfig protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
        */
      def constraint: String = js.native
      def constraint_=(newValue: String): Unit = js.native
      
      def containerAsNavigationProfileBase: NavigationProfileBase = js.native
      
      /**
        * In version 9.24.0: deleted
        * In version 8.9.0: introduced
        */
      def downloadMode: OfflineEntitySyncDownloadMode = js.native
      def downloadMode_=(newValue: OfflineEntitySyncDownloadMode): Unit = js.native
      
      def entity: IEntity = js.native
      
      def entityQualifiedName: String = js.native
      
      def entity_=(newValue: IEntity): Unit = js.native
      
      /**
        * In version 8.9.0: deleted
        */
      def shouldDownload: Boolean = js.native
      def shouldDownload_=(newValue: Boolean): Unit = js.native
      
      /**
        * In version 9.24.0: introduced
        */
      def syncMode: OfflineEntitySyncMode = js.native
      def syncMode_=(newValue: OfflineEntitySyncMode): Unit = js.native
    }
    object OfflineEntityConfig {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntityConfig")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): OfflineEntityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[OfflineEntityConfig]
      
      /**
        * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
        * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
        * of the parent NavigationProfileBase element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  7.22.0 and higher
        */
      /* static member */
      inline def createIn(container: NavigationProfileBase): OfflineEntityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[OfflineEntityConfig]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntityConfig.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntityConfig.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode")
    @js.native
    open class OfflineEntitySyncDownloadMode protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object OfflineEntitySyncDownloadMode {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.All")
      @js.native
      def All: OfflineEntitySyncDownloadMode = js.native
      inline def All_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.Constrained")
      @js.native
      def Constrained: OfflineEntitySyncDownloadMode = js.native
      inline def Constrained_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constrained")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.None")
      @js.native
      def None: OfflineEntitySyncDownloadMode = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.NoneAndPreserveData")
      @js.native
      def NoneAndPreserveData: OfflineEntitySyncDownloadMode = js.native
      inline def NoneAndPreserveData_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoneAndPreserveData")(x.asInstanceOf[js.Any])
      
      inline def None_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode")
    @js.native
    open class OfflineEntitySyncMode protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object OfflineEntitySyncMode {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode.All")
      @js.native
      def All: OfflineEntitySyncMode = js.native
      inline def All_=(x: OfflineEntitySyncMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode.Constrained")
      @js.native
      def Constrained: OfflineEntitySyncMode = js.native
      inline def Constrained_=(x: OfflineEntitySyncMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constrained")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode.Never")
      @js.native
      def Never: OfflineEntitySyncMode = js.native
      inline def Never_=(x: OfflineEntitySyncMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Never")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode.None")
      @js.native
      def None: OfflineEntitySyncMode = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.OfflineEntitySyncMode.NoneAndPreserveData")
      @js.native
      def NoneAndPreserveData: OfflineEntitySyncMode = js.native
      inline def NoneAndPreserveData_=(x: OfflineEntitySyncMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoneAndPreserveData")(x.asInstanceOf[js.Any])
      
      inline def None_=(x: OfflineEntitySyncMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind")
    @js.native
    open class ProfileKind protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ProfileKind {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.Hybrid")
      @js.native
      def Hybrid: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.HybridOffline")
      @js.native
      def HybridOffline: ProfileKind = js.native
      inline def HybridOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridOffline")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.HybridPhone")
      @js.native
      def HybridPhone: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.HybridPhoneOffline")
      @js.native
      def HybridPhoneOffline: ProfileKind = js.native
      inline def HybridPhoneOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhoneOffline")(x.asInstanceOf[js.Any])
      
      inline def HybridPhone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.HybridTablet")
      @js.native
      def HybridTablet: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.HybridTabletOffline")
      @js.native
      def HybridTabletOffline: ProfileKind = js.native
      inline def HybridTabletOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTabletOffline")(x.asInstanceOf[js.Any])
      
      inline def HybridTablet_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
      
      inline def Hybrid_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hybrid")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.NativePhone")
      @js.native
      def NativePhone: ProfileKind = js.native
      inline def NativePhone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativePhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.Phone")
      @js.native
      def Phone: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.PhoneOffline")
      @js.native
      def PhoneOffline: ProfileKind = js.native
      inline def PhoneOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PhoneOffline")(x.asInstanceOf[js.Any])
      
      inline def Phone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.Responsive")
      @js.native
      def Responsive: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.ResponsiveOffline")
      @js.native
      def ResponsiveOffline: ProfileKind = js.native
      inline def ResponsiveOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResponsiveOffline")(x.asInstanceOf[js.Any])
      
      inline def Responsive_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Responsive")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.Tablet")
      @js.native
      def Tablet: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileKind.TabletOffline")
      @js.native
      def TabletOffline: ProfileKind = js.native
      inline def TabletOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabletOffline")(x.asInstanceOf[js.Any])
      
      inline def Tablet_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType")
    @js.native
    open class ProfileType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ProfileType {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.Desktop")
      @js.native
      def Desktop: ProfileType = js.native
      inline def Desktop_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.HybridPhone")
      @js.native
      def HybridPhone: ProfileType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.HybridPhone6")
      @js.native
      def HybridPhone6: ProfileType = js.native
      inline def HybridPhone6_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone6")(x.asInstanceOf[js.Any])
      
      inline def HybridPhone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.HybridTablet")
      @js.native
      def HybridTablet: ProfileType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.HybridTablet6")
      @js.native
      def HybridTablet6: ProfileType = js.native
      inline def HybridTablet6_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet6")(x.asInstanceOf[js.Any])
      
      inline def HybridTablet_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.OfflinePhone")
      @js.native
      def OfflinePhone: ProfileType = js.native
      inline def OfflinePhone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OfflinePhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.Phone")
      @js.native
      def Phone: ProfileType = js.native
      inline def Phone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProfileType.Tablet")
      @js.native
      def Tablet: ProfileType = js.native
      inline def Tablet_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/progressive-web-app relevant section in reference guide}
      *
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * @ignore
      *
      * In version 9.0.3: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProgressiveWebAppSettings")
    @js.native
    open class ProgressiveWebAppSettings protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsNavigationProfile: NavigationProfile = js.native
      
      def installPrompt: Boolean = js.native
      def installPrompt_=(newValue: Boolean): Unit = js.native
      
      def precaching: Boolean = js.native
      def precaching_=(newValue: Boolean): Unit = js.native
    }
    object ProgressiveWebAppSettings {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProgressiveWebAppSettings")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new ProgressiveWebAppSettings instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): ProgressiveWebAppSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[ProgressiveWebAppSettings]
      
      /**
        * Creates and returns a new ProgressiveWebAppSettings instance in the SDK and on the server.
        * The new ProgressiveWebAppSettings will be automatically stored in the 'progressiveWebAppSettings' property
        * of the parent NavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  9.0.3 and higher
        */
      /* static member */
      inline def createIn(container: NavigationProfile): ProgressiveWebAppSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[ProgressiveWebAppSettings]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProgressiveWebAppSettings.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.ProgressiveWebAppSettings.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedHomePage")
    @js.native
    open class RoleBasedHomePage protected () extends HomePageBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def userRole: IUserRole | Null = js.native
      
      def userRoleQualifiedName: String | Null = js.native
      
      def userRole_=(newValue: IUserRole | Null): Unit = js.native
    }
    object RoleBasedHomePage {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedHomePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): RoleBasedHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RoleBasedHomePage]
      
      /**
        * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
        * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
        * of the parent NavigationProfile element passed as argument.
        */
      /* static member */
      inline def createIn(container: NavigationProfile): RoleBasedHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RoleBasedHomePage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedHomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedHomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 8.0.0: introduced
      */
    @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedNativeHomePage")
    @js.native
    open class RoleBasedNativeHomePage protected () extends NativeHomePageBase {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 9.4.0: deleted
        */
      def page: IPage | Null = js.native
      
      def pageQualifiedName: String | Null = js.native
      
      def page_=(newValue: IPage | Null): Unit = js.native
      
      def userRole: IUserRole | Null = js.native
      
      def userRoleQualifiedName: String | Null = js.native
      
      def userRole_=(newValue: IUserRole | Null): Unit = js.native
    }
    object RoleBasedNativeHomePage {
      
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedNativeHomePage")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): RoleBasedNativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[RoleBasedNativeHomePage]
      
      /**
        * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
        * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
        * of the parent NativeNavigationProfile element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.0.0 and higher
        */
      /* static member */
      inline def createIn(container: NativeNavigationProfile): RoleBasedNativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[RoleBasedNativeHomePage]
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedNativeHomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/src/gen/navigation", "navigation.RoleBasedNativeHomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.22.0: introduced
      */
    @js.native
    trait INativeNavigationProfile
      extends StObject
         with INavigationProfileBase
    
    /**
      * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
      */
    @js.native
    trait INavigationDocument
      extends StObject
         with IProjectDocument {
      
      /**
        * In version 7.2.0: introduced
        */
      val profiles: IList[INavigationProfileBase] = js.native
    }
    
    /**
      * In version 7.2.0: added public
      */
    @js.native
    trait INavigationProfile
      extends StObject
         with INavigationProfileBase
    
    @js.native
    trait INavigationProfileBase
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsNavigationDocument: INavigationDocument = js.native
      
      @JSName("model")
      val model_INavigationProfileBase: IModel = js.native
      
      /**
        * In version 7.2.0: introduced
        */
      val name: String = js.native
    }
  }
}
