package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItemCollection
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.pages.IPage
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import typings.mendixmodelsdk.projectsMod.projects.IProject
import typings.mendixmodelsdk.projectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.projectsMod.projects.Project
import typings.mendixmodelsdk.projectsMod.projects.ProjectDocument
import typings.mendixmodelsdk.securityMod.security.IUserRole
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationMod {
  
  @JSImport("mendixmodelsdk/dist/gen/navigation", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object navigation {
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.DeviceType")
    @js.native
    class DeviceType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DeviceType {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.DeviceType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.DeviceType.Desktop")
      @js.native
      def Desktop: DeviceType = js.native
      inline def Desktop_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.DeviceType.Phone")
      @js.native
      def Phone: DeviceType = js.native
      inline def Phone_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.DeviceType.Tablet")
      @js.native
      def Tablet: DeviceType = js.native
      inline def Tablet_=(x: DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePage")
    @js.native
    class HomePage protected () extends HomePageBase {
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
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePage")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
      */
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
    @js.native
    abstract class HomePageBase protected () extends Element[IModel] {
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
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.HomePageBase.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.22.0: introduced
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because Already inherited
    - typings.mendixmodelsdk.navigationMod.navigation.INativeNavigationProfile because var conflicts: containerAsNavigationDocument, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
    @js.native
    class NativeNavigationProfile protected () extends NavigationProfileBase {
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
      
      def homePage: IPage | Null = js.native
      
      def homePageQualifiedName: String | Null = js.native
      
      def homePage_=(newValue: IPage | Null): Unit = js.native
      
      /**
        * In version 8.0.0: introduced
        */
      def roleBasedNativeHomePages: IList[RoleBasedNativeHomePage] = js.native
    }
    object NativeNavigationProfile {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NativeNavigationProfile.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IProjectDocument because Already inherited
    - typings.mendixmodelsdk.navigationMod.navigation.INavigationDocument because var conflicts: containerAsProject, id, isLoaded, model, structureTypeName, unit. Inlined profiles */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
    @js.native
    class NavigationDocument protected () extends ProjectDocument {
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
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new NavigationDocument unit in the SDK and on the server.
        * Expects one argument, the projects.IProject in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IProject): NavigationDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[NavigationDocument]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationDocument.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * In version 7.2.0: added public
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
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
      
      def roleBasedHomePages: IList[RoleBasedHomePage] = js.native
    }
    object NavigationProfile {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfile")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfile.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfile.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.navigationMod.navigation.INavigationProfileBase because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsNavigationDocument, name */ @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
    @js.native
    abstract class NavigationProfileBase protected ()
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
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.NavigationProfileBase.versionInfo")
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
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
    @js.native
    class OfflineEntityConfig protected () extends Element[IModel] {
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
    }
    object OfflineEntityConfig {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntityConfig.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode")
    @js.native
    class OfflineEntitySyncDownloadMode protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object OfflineEntitySyncDownloadMode {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.All")
      @js.native
      def All: OfflineEntitySyncDownloadMode = js.native
      inline def All_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.Constrained")
      @js.native
      def Constrained: OfflineEntitySyncDownloadMode = js.native
      inline def Constrained_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constrained")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.None")
      @js.native
      def None: OfflineEntitySyncDownloadMode = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.OfflineEntitySyncDownloadMode.NoneAndPreserveData")
      @js.native
      def NoneAndPreserveData: OfflineEntitySyncDownloadMode = js.native
      inline def NoneAndPreserveData_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoneAndPreserveData")(x.asInstanceOf[js.Any])
      
      inline def None_=(x: OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind")
    @js.native
    class ProfileKind protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ProfileKind {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.Hybrid")
      @js.native
      def Hybrid: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.HybridOffline")
      @js.native
      def HybridOffline: ProfileKind = js.native
      inline def HybridOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridOffline")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.HybridPhone")
      @js.native
      def HybridPhone: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.HybridPhoneOffline")
      @js.native
      def HybridPhoneOffline: ProfileKind = js.native
      inline def HybridPhoneOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhoneOffline")(x.asInstanceOf[js.Any])
      
      inline def HybridPhone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.HybridTablet")
      @js.native
      def HybridTablet: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.HybridTabletOffline")
      @js.native
      def HybridTabletOffline: ProfileKind = js.native
      inline def HybridTabletOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTabletOffline")(x.asInstanceOf[js.Any])
      
      inline def HybridTablet_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
      
      inline def Hybrid_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hybrid")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.NativePhone")
      @js.native
      def NativePhone: ProfileKind = js.native
      inline def NativePhone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativePhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.Phone")
      @js.native
      def Phone: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.PhoneOffline")
      @js.native
      def PhoneOffline: ProfileKind = js.native
      inline def PhoneOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PhoneOffline")(x.asInstanceOf[js.Any])
      
      inline def Phone_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.Responsive")
      @js.native
      def Responsive: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.ResponsiveOffline")
      @js.native
      def ResponsiveOffline: ProfileKind = js.native
      inline def ResponsiveOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResponsiveOffline")(x.asInstanceOf[js.Any])
      
      inline def Responsive_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Responsive")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.Tablet")
      @js.native
      def Tablet: ProfileKind = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileKind.TabletOffline")
      @js.native
      def TabletOffline: ProfileKind = js.native
      inline def TabletOffline_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabletOffline")(x.asInstanceOf[js.Any])
      
      inline def Tablet_=(x: ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType")
    @js.native
    class ProfileType protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object ProfileType {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.Desktop")
      @js.native
      def Desktop: ProfileType = js.native
      inline def Desktop_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.HybridPhone")
      @js.native
      def HybridPhone: ProfileType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.HybridPhone6")
      @js.native
      def HybridPhone6: ProfileType = js.native
      inline def HybridPhone6_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone6")(x.asInstanceOf[js.Any])
      
      inline def HybridPhone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.HybridTablet")
      @js.native
      def HybridTablet: ProfileType = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.HybridTablet6")
      @js.native
      def HybridTablet6: ProfileType = js.native
      inline def HybridTablet6_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet6")(x.asInstanceOf[js.Any])
      
      inline def HybridTablet_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.OfflinePhone")
      @js.native
      def OfflinePhone: ProfileType = js.native
      inline def OfflinePhone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OfflinePhone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.Phone")
      @js.native
      def Phone: ProfileType = js.native
      inline def Phone_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.ProfileType.Tablet")
      @js.native
      def Tablet: ProfileType = js.native
      inline def Tablet_=(x: ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage")
    @js.native
    class RoleBasedHomePage protected () extends HomePageBase {
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
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedHomePage.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
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
    object RoleBasedNativeHomePage {
      
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage")
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
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/navigation", "navigation.RoleBasedNativeHomePage.versionInfo")
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
