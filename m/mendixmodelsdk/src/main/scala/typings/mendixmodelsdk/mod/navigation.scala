package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IProject
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigation {
  
  @JSImport("mendixmodelsdk", "navigation.DeviceType")
  @js.native
  open class DeviceType protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.DeviceType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DeviceType {
    
    @JSImport("mendixmodelsdk", "navigation.DeviceType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Desktop")
    @js.native
    def Desktop: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType = js.native
    inline def Desktop_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Phone")
    @js.native
    def Phone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType = js.native
    inline def Phone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.DeviceType.Tablet")
    @js.native
    def Tablet: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType = js.native
    inline def Tablet_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.DeviceType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.HomePage")
  @js.native
  open class HomePage protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.HomePage {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object HomePage {
    
    @JSImport("mendixmodelsdk", "navigation.HomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.HomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.HomePage]
    
    /**
      * Creates and returns a new HomePage instance in the SDK and on the server.
      * The new HomePage will be automatically stored in the 'homePage' property
      * of the parent NavigationProfile element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile): typings.mendixmodelsdk.srcGenNavigationMod.navigation.HomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.HomePage]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Navigation`.
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "navigation.HomePageBase")
  @js.native
  open class HomePageBase protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.HomePageBase {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object HomePageBase {
    
    @JSImport("mendixmodelsdk", "navigation.HomePageBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePageBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.HomePageBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.4.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.NativeHomePage")
  @js.native
  open class NativeHomePage protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NativeHomePage {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeHomePage {
    
    @JSImport("mendixmodelsdk", "navigation.NativeHomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeHomePage]
    
    /**
      * Creates and returns a new NativeHomePage instance in the SDK and on the server.
      * The new NativeHomePage will be automatically stored in the 'nativeHomePage' property
      * of the parent NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.4.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeHomePage]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeHomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeHomePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 9.4.0: introduced
    */
  /* note: abstract class */ @JSImport("mendixmodelsdk", "navigation.NativeHomePageBase")
  @js.native
  open class NativeHomePageBase protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NativeHomePageBase {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeHomePageBase {
    
    @JSImport("mendixmodelsdk", "navigation.NativeHomePageBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeHomePageBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeHomePageBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.22.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile")
  @js.native
  open class NativeNavigationProfile protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NativeNavigationProfile {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NativeNavigationProfile {
    
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile]
    
    /**
      * Creates and returns a new NativeNavigationProfile instance in the SDK and on the server.
      * The new NativeNavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NativeNavigationProfile.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/navigation relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "navigation.NavigationDocument")
  @js.native
  open class NavigationDocument protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NavigationDocument {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IProject
    ) = this()
  }
  object NavigationDocument {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new NavigationDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IProject in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IProject): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 7.2.0: added public
    */
  @JSImport("mendixmodelsdk", "navigation.NavigationProfile")
  @js.native
  open class NavigationProfile protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NavigationProfile {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NavigationProfile {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'desktopProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    inline def createInNavigationDocumentUnderDesktopProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderDesktopProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    /* static member */
    inline def createInNavigationDocumentUnderHybridPhoneProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridPhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridPhoneProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    /* static member */
    inline def createInNavigationDocumentUnderHybridPhoneProfile6(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridPhoneProfile6")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.0.2 to 7.1.0
      */
    /* static member */
    inline def createInNavigationDocumentUnderHybridTabletProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridTabletProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'hybridTabletProfile6' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.10.4 to 6.10.4
      */
    /* static member */
    inline def createInNavigationDocumentUnderHybridTabletProfile6(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderHybridTabletProfile6")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'offlinePhoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.0.1
      */
    /* static member */
    inline def createInNavigationDocumentUnderOfflinePhoneProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderOfflinePhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'phoneProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    inline def createInNavigationDocumentUnderPhoneProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderPhoneProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'profiles' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.2.0 and higher
      */
    /* static member */
    inline def createInNavigationDocumentUnderProfiles(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderProfiles")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /**
      * Creates and returns a new NavigationProfile instance in the SDK and on the server.
      * The new NavigationProfile will be automatically stored in the 'tabletProfile' property
      * of the parent NavigationDocument element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  6.0.0 to 7.1.0
      */
    /* static member */
    inline def createInNavigationDocumentUnderTabletProfile(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationDocument): typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createInNavigationDocumentUnderTabletProfile")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfile.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
  @js.native
  open class NavigationProfileBase protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.NavigationProfileBase {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object NavigationProfileBase {
    
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.NavigationProfileBase.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 7.22.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
  @js.native
  open class OfflineEntityConfig protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.OfflineEntityConfig {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OfflineEntityConfig {
    
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntityConfig]
    
    /**
      * Creates and returns a new OfflineEntityConfig instance in the SDK and on the server.
      * The new OfflineEntityConfig will be automatically stored in the 'offlineEntityConfigs' property
      * of the parent NavigationProfileBase element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  7.22.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfileBase): typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntityConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntityConfig]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntityConfig.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode")
  @js.native
  open class OfflineEntitySyncDownloadMode protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.OfflineEntitySyncDownloadMode {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object OfflineEntitySyncDownloadMode {
    
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.All")
    @js.native
    def All: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    inline def All_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("All")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.Constrained")
    @js.native
    def Constrained: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    inline def Constrained_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Constrained")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.None")
    @js.native
    def None: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.OfflineEntitySyncDownloadMode.NoneAndPreserveData")
    @js.native
    def NoneAndPreserveData: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode = js.native
    inline def NoneAndPreserveData_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoneAndPreserveData")(x.asInstanceOf[js.Any])
    
    inline def None_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.OfflineEntitySyncDownloadMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.ProfileKind")
  @js.native
  open class ProfileKind protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.ProfileKind {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ProfileKind {
    
    @JSImport("mendixmodelsdk", "navigation.ProfileKind")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Hybrid")
    @js.native
    def Hybrid: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridOffline")
    @js.native
    def HybridOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def HybridOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridOffline")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridPhone")
    @js.native
    def HybridPhone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridPhoneOffline")
    @js.native
    def HybridPhoneOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def HybridPhoneOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhoneOffline")(x.asInstanceOf[js.Any])
    
    inline def HybridPhone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridTablet")
    @js.native
    def HybridTablet: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.HybridTabletOffline")
    @js.native
    def HybridTabletOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def HybridTabletOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTabletOffline")(x.asInstanceOf[js.Any])
    
    inline def HybridTablet_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
    
    inline def Hybrid_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Hybrid")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.NativePhone")
    @js.native
    def NativePhone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def NativePhone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NativePhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Phone")
    @js.native
    def Phone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.PhoneOffline")
    @js.native
    def PhoneOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def PhoneOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PhoneOffline")(x.asInstanceOf[js.Any])
    
    inline def Phone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Responsive")
    @js.native
    def Responsive: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.ResponsiveOffline")
    @js.native
    def ResponsiveOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def ResponsiveOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ResponsiveOffline")(x.asInstanceOf[js.Any])
    
    inline def Responsive_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Responsive")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.Tablet")
    @js.native
    def Tablet: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileKind.TabletOffline")
    @js.native
    def TabletOffline: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind = js.native
    inline def TabletOffline_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabletOffline")(x.asInstanceOf[js.Any])
    
    inline def Tablet_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileKind): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.ProfileType")
  @js.native
  open class ProfileType protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.ProfileType {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object ProfileType {
    
    @JSImport("mendixmodelsdk", "navigation.ProfileType")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Desktop")
    @js.native
    def Desktop: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def Desktop_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Desktop")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridPhone")
    @js.native
    def HybridPhone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridPhone6")
    @js.native
    def HybridPhone6: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def HybridPhone6_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone6")(x.asInstanceOf[js.Any])
    
    inline def HybridPhone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridPhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridTablet")
    @js.native
    def HybridTablet: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.HybridTablet6")
    @js.native
    def HybridTablet6: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def HybridTablet6_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet6")(x.asInstanceOf[js.Any])
    
    inline def HybridTablet_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HybridTablet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.OfflinePhone")
    @js.native
    def OfflinePhone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def OfflinePhone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OfflinePhone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Phone")
    @js.native
    def Phone: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def Phone_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Phone")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProfileType.Tablet")
    @js.native
    def Tablet: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType = js.native
    inline def Tablet_=(x: typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProfileType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tablet")(x.asInstanceOf[js.Any])
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
  @JSImport("mendixmodelsdk", "navigation.ProgressiveWebAppSettings")
  @js.native
  open class ProgressiveWebAppSettings protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.ProgressiveWebAppSettings {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ProgressiveWebAppSettings {
    
    @JSImport("mendixmodelsdk", "navigation.ProgressiveWebAppSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ProgressiveWebAppSettings instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProgressiveWebAppSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProgressiveWebAppSettings]
    
    /**
      * Creates and returns a new ProgressiveWebAppSettings instance in the SDK and on the server.
      * The new ProgressiveWebAppSettings will be automatically stored in the 'progressiveWebAppSettings' property
      * of the parent NavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.3 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile): typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProgressiveWebAppSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.ProgressiveWebAppSettings]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProgressiveWebAppSettings.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.ProgressiveWebAppSettings.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
  @js.native
  open class RoleBasedHomePage protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.RoleBasedHomePage {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object RoleBasedHomePage {
    
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedHomePage]
    
    /**
      * Creates and returns a new RoleBasedHomePage instance in the SDK and on the server.
      * The new RoleBasedHomePage will be automatically stored in the 'roleBasedHomePages' property
      * of the parent NavigationProfile element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NavigationProfile): typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedHomePage]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedHomePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * In version 8.0.0: introduced
    */
  @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage")
  @js.native
  open class RoleBasedNativeHomePage protected ()
    extends typings.mendixmodelsdk.srcGenAllModelClassesMod.navigation.RoleBasedNativeHomePage {
    def this(
      model: typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object RoleBasedNativeHomePage {
    
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedNativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedNativeHomePage]
    
    /**
      * Creates and returns a new RoleBasedNativeHomePage instance in the SDK and on the server.
      * The new RoleBasedNativeHomePage will be automatically stored in the 'roleBasedNativeHomePages' property
      * of the parent NativeNavigationProfile element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.0.0 and higher
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenNavigationMod.navigation.NativeNavigationProfile): typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedNativeHomePage = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenNavigationMod.navigation.RoleBasedNativeHomePage]
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "navigation.RoleBasedNativeHomePage.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenNavigationMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
