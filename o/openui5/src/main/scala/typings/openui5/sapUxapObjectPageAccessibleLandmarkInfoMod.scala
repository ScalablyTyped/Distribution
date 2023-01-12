package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.AccessibleLandmarkRole
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageAccessibleLandmarkInfoMod {
  
  @JSImport("sap/uxap/ObjectPageAccessibleLandmarkInfo", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `sap.uxap.ObjectPageAccessibleLandmarkInfo` element.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageAccessibleLandmarkInfo {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: ObjectPageAccessibleLandmarkInfoSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: ObjectPageAccessibleLandmarkInfoSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: ObjectPageAccessibleLandmarkInfoSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageAccessibleLandmarkInfo", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageAccessibleLandmarkInfo with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageAccessibleLandmarkInfo]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageAccessibleLandmarkInfo],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageAccessibleLandmarkInfo.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageAccessibleLandmarkInfo
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getContentLabel contentLabel}.
      *
      * Texts which describe the landmark of the content container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * @returns Value of property `contentLabel`
      */
    def getContentLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getContentRole contentRole}.
      *
      * Landmark role of the content container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `contentRole`
      */
    def getContentRole(): AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getFooterLabel footerLabel}.
      *
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * @returns Value of property `footerLabel`
      */
    def getFooterLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getFooterRole footerRole}.
      *
      * Landmark role of the footer container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * Default value is `"Region"`.
      *
      * @returns Value of property `footerRole`
      */
    def getFooterRole(): AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeaderLabel headerLabel}.
      *
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * @returns Value of property `headerLabel`
      */
    def getHeaderLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeaderRole headerRole}.
      *
      * Landmark role of the header container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * Default value is `"Banner"`.
      *
      * @returns Value of property `headerRole`
      */
    def getHeaderRole(): AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNavigationLabel navigationLabel}.
      *
      * Texts which describe the landmark of the navigation container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * @returns Value of property `navigationLabel`
      */
    def getNavigationLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getNavigationRole navigationRole}.
      *
      * Landmark role of the navigation container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * Default value is `"Navigation"`.
      *
      * @returns Value of property `navigationRole`
      */
    def getNavigationRole(): AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getRootLabel rootLabel}.
      *
      * Texts which describe the landmark of the root container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * @returns Value of property `rootLabel`
      */
    def getRootLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getRootRole rootRole}.
      *
      * Landmark role of the root container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * Default value is `"Main"`.
      *
      * @returns Value of property `rootRole`
      */
    def getRootRole(): AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getContentLabel contentLabel}.
      *
      * Texts which describe the landmark of the content container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentLabel(): this.type = js.native
    def setContentLabel(/**
      * New value for property `contentLabel`
      */
    sContentLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentRole contentRole}.
      *
      * Landmark role of the content container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentRole(): this.type = js.native
    def setContentRole(
      /**
      * New value for property `contentRole`
      */
    sContentRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String
    ): this.type = js.native
    def setContentRole(/**
      * New value for property `contentRole`
      */
    sContentRole: AccessibleLandmarkRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFooterLabel footerLabel}.
      *
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterLabel(): this.type = js.native
    def setFooterLabel(/**
      * New value for property `footerLabel`
      */
    sFooterLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFooterRole footerRole}.
      *
      * Landmark role of the footer container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Region"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterRole(): this.type = js.native
    def setFooterRole(
      /**
      * New value for property `footerRole`
      */
    sFooterRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String
    ): this.type = js.native
    def setFooterRole(/**
      * New value for property `footerRole`
      */
    sFooterRole: AccessibleLandmarkRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderLabel headerLabel}.
      *
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderLabel(): this.type = js.native
    def setHeaderLabel(/**
      * New value for property `headerLabel`
      */
    sHeaderLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderRole headerRole}.
      *
      * Landmark role of the header container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Banner"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderRole(): this.type = js.native
    def setHeaderRole(
      /**
      * New value for property `headerRole`
      */
    sHeaderRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String
    ): this.type = js.native
    def setHeaderRole(/**
      * New value for property `headerRole`
      */
    sHeaderRole: AccessibleLandmarkRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNavigationLabel navigationLabel}.
      *
      * Texts which describe the landmark of the navigation container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigationLabel(): this.type = js.native
    def setNavigationLabel(/**
      * New value for property `navigationLabel`
      */
    sNavigationLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNavigationRole navigationRole}.
      *
      * Landmark role of the navigation container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Navigation"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigationRole(): this.type = js.native
    def setNavigationRole(
      /**
      * New value for property `navigationRole`
      */
    sNavigationRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String
    ): this.type = js.native
    def setNavigationRole(/**
      * New value for property `navigationRole`
      */
    sNavigationRole: AccessibleLandmarkRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRootLabel rootLabel}.
      *
      * Texts which describe the landmark of the root container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRootLabel(): this.type = js.native
    def setRootLabel(/**
      * New value for property `rootLabel`
      */
    sRootLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRootRole rootRole}.
      *
      * Landmark role of the root container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Main"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRootRole(): this.type = js.native
    def setRootRole(
      /**
      * New value for property `rootRole`
      */
    sRootRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String
    ): this.type = js.native
    def setRootRole(/**
      * New value for property `rootRole`
      */
    sRootRole: AccessibleLandmarkRole): this.type = js.native
  }
  
  trait ObjectPageAccessibleLandmarkInfoSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Texts which describe the landmark of the content container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      */
    var contentLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Landmark role of the content container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      */
    var contentRole: js.UndefOr[
        AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      */
    var footerLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Landmark role of the footer container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      */
    var footerRole: js.UndefOr[
        AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Texts which describe the landmark of the header container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      */
    var headerLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Landmark role of the header container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      */
    var headerRole: js.UndefOr[
        AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Texts which describe the landmark of the navigation container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      */
    var navigationLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Landmark role of the navigation container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      */
    var navigationRole: js.UndefOr[
        AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Texts which describe the landmark of the root container of the corresponding `sap.uxap.ObjectPageLayout`
      * control.
      *
      * If not set (and a landmark different than `sap.ui.core.AccessibleLandmarkRole.None` is defined), no label
      * is set.
      */
    var rootLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Landmark role of the root container of the corresponding `sap.uxap.ObjectPageLayout` control.
      *
      * If set to `sap.ui.core.AccessibleLandmarkRole.None`, no landmark will be added to the container.
      */
    var rootRole: js.UndefOr[
        AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ObjectPageAccessibleLandmarkInfoSettings {
    
    inline def apply(): ObjectPageAccessibleLandmarkInfoSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageAccessibleLandmarkInfoSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageAccessibleLandmarkInfoSettings] (val x: Self) extends AnyVal {
      
      inline def setContentLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "contentLabel", value.asInstanceOf[js.Any])
      
      inline def setContentLabelUndefined: Self = StObject.set(x, "contentLabel", js.undefined)
      
      inline def setContentRole(
        value: AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "contentRole", value.asInstanceOf[js.Any])
      
      inline def setContentRoleUndefined: Self = StObject.set(x, "contentRole", js.undefined)
      
      inline def setFooterLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "footerLabel", value.asInstanceOf[js.Any])
      
      inline def setFooterLabelUndefined: Self = StObject.set(x, "footerLabel", js.undefined)
      
      inline def setFooterRole(
        value: AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "footerRole", value.asInstanceOf[js.Any])
      
      inline def setFooterRoleUndefined: Self = StObject.set(x, "footerRole", js.undefined)
      
      inline def setHeaderLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerLabel", value.asInstanceOf[js.Any])
      
      inline def setHeaderLabelUndefined: Self = StObject.set(x, "headerLabel", js.undefined)
      
      inline def setHeaderRole(
        value: AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerRole", value.asInstanceOf[js.Any])
      
      inline def setHeaderRoleUndefined: Self = StObject.set(x, "headerRole", js.undefined)
      
      inline def setNavigationLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "navigationLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      inline def setNavigationRole(
        value: AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "navigationRole", value.asInstanceOf[js.Any])
      
      inline def setNavigationRoleUndefined: Self = StObject.set(x, "navigationRole", js.undefined)
      
      inline def setRootLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "rootLabel", value.asInstanceOf[js.Any])
      
      inline def setRootLabelUndefined: Self = StObject.set(x, "rootLabel", js.undefined)
      
      inline def setRootRole(
        value: AccessibleLandmarkRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleLandmarkRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "rootRole", value.asInstanceOf[js.Any])
      
      inline def setRootRoleUndefined: Self = StObject.set(x, "rootRole", js.undefined)
    }
  }
}
