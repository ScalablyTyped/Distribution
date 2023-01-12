package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewPageMod {
  
  @JSImport("sap/m/QuickViewPage", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickViewPage.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickViewPage {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewPageSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewPageSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewPageSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickViewPage", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickViewPage with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, QuickViewPage]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickViewPage],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.QuickViewPage.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickViewPage
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some group to the aggregation {@link #getGroups groups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addGroup(
      /**
      * The group to add; if empty, nothing is inserted
      */
    oGroup: typings.openui5.sapMQuickViewGroupMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Binds aggregation {@link #getAvatar avatar} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindAvatar(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Binds aggregation {@link #getGroups groups} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindGroups(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Destroys the avatar in the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAvatar(): this.type = js.native
    
    /**
      * Destroys all the groups in the aggregation {@link #getGroups groups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyGroups(): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Gets content of aggregation {@link #getAvatar avatar}.
      *
      * Specifies the avatar displayed under the header of the page. **Note:** To achieve the recommended design
      * and behavior don't use the `displaySize`, `customDisplaySize`, `customFontSize` properties and `detailBox`
      * aggregation of `sap.m.Avatar`.
      */
    def getAvatar(): typings.openui5.sapMAvatarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getCrossAppNavCallback crossAppNavCallback}.
      *
      * Specifies the application which provides target and param configuration for cross-application navigation
      * from the 'page header'.
      *
      * @returns Value of property `crossAppNavCallback`
      */
    def getCrossAppNavCallback(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Specifies the text displayed under the header of the content section.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * @SINCE 1.69
      * @deprecated (since 1.92) - Use the `avatar` aggregation and use its property `fallbackIcon` instead.
      *
      * Gets current value of property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src or loading issues.
      *
      * **Note:** Accepted values are only icons from the SAP icon font.
      *
      * @returns Value of property `fallbackIcon`
      */
    def getFallbackIcon(): URI = js.native
    
    /**
      * Gets content of aggregation {@link #getGroups groups}.
      *
      * QuickViewGroup consists of a title (optional) and an entity of group elements.
      */
    def getGroups(): js.Array[typings.openui5.sapMQuickViewGroupMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeader header}.
      *
      * Specifies the text displayed in the header of the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `header`
      */
    def getHeader(): String = js.native
    
    /**
      * @deprecated (since 1.92) - Use the `avatar` aggregation instead.
      *
      * Gets current value of property {@link #getIcon icon}.
      *
      * Specifies the URL of the icon or image displayed under the header of the page.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getPageId pageId}.
      *
      * Page id
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `pageId`
      */
    def getPageId(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Specifies the text displayed in the header of the content section of the control.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleUrl titleUrl}.
      *
      * Specifies the URL which opens when the title or the avatar is clicked. **Note:** If the avatar has `press`
      * listeners this URL is not opened automatically.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `titleUrl`
      */
    def getTitleUrl(): String = js.native
    
    /**
      * Checks for the provided `sap.m.QuickViewGroup` in the aggregation {@link #getGroups groups}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfGroup(
      /**
      * The group whose index is looked for
      */
    oGroup: typings.openui5.sapMQuickViewGroupMod.default
    ): int = js.native
    
    /**
      * Inserts a group into the aggregation {@link #getGroups groups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertGroup(
      /**
      * The group to insert; if empty, nothing is inserted
      */
    oGroup: typings.openui5.sapMQuickViewGroupMod.default,
      /**
      * The `0`-based index the group should be inserted at; for a negative value of `iIndex`, the group is inserted
      * at position 0; for a value greater than the current size of the aggregation, the group is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getGroups groups}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllGroups(): js.Array[typings.openui5.sapMQuickViewGroupMod.default] = js.native
    
    def removeGroup(/**
      * The group to remove or its index or id
      */
    vGroup: String): typings.openui5.sapMQuickViewGroupMod.default | Null = js.native
    /**
      * Removes a group from the aggregation {@link #getGroups groups}.
      *
      * @returns The removed group or `null`
      */
    def removeGroup(/**
      * The group to remove or its index or id
      */
    vGroup: int): typings.openui5.sapMQuickViewGroupMod.default | Null = js.native
    def removeGroup(
      /**
      * The group to remove or its index or id
      */
    vGroup: typings.openui5.sapMQuickViewGroupMod.default
    ): typings.openui5.sapMQuickViewGroupMod.default | Null = js.native
    
    /**
      * @SINCE 1.92
      *
      * Sets the aggregated {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAvatar(/**
      * The avatar to set
      */
    oAvatar: typings.openui5.sapMAvatarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCrossAppNavCallback crossAppNavCallback}.
      *
      * Specifies the application which provides target and param configuration for cross-application navigation
      * from the 'page header'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCrossAppNavCallback(/**
      * New value for property `crossAppNavCallback`
      */
    oCrossAppNavCallback: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Specifies the text displayed under the header of the content section.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * @SINCE 1.69
      * @deprecated (since 1.92) - Use the `avatar` aggregation and use its property `fallbackIcon` instead.
      *
      * Sets a new value for property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src or loading issues.
      *
      * **Note:** Accepted values are only icons from the SAP icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFallbackIcon(): this.type = js.native
    def setFallbackIcon(/**
      * New value for property `fallbackIcon`
      */
    sFallbackIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeader header}.
      *
      * Specifies the text displayed in the header of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(): this.type = js.native
    def setHeader(/**
      * New value for property `header`
      */
    sHeader: String): this.type = js.native
    
    /**
      * @deprecated (since 1.92) - Use the `avatar` aggregation instead.
      *
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Specifies the URL of the icon or image displayed under the header of the page.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPageId pageId}.
      *
      * Page id
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPageId(): this.type = js.native
    def setPageId(/**
      * New value for property `pageId`
      */
    sPageId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Specifies the text displayed in the header of the content section of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitleUrl titleUrl}.
      *
      * Specifies the URL which opens when the title or the avatar is clicked. **Note:** If the avatar has `press`
      * listeners this URL is not opened automatically.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleUrl(): this.type = js.native
    def setTitleUrl(/**
      * New value for property `titleUrl`
      */
    sTitleUrl: String): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Unbinds aggregation {@link #getAvatar avatar} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindAvatar(): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getGroups groups} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindGroups(): this.type = js.native
  }
  
  trait QuickViewPageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.92
      *
      * Specifies the avatar displayed under the header of the page. **Note:** To achieve the recommended design
      * and behavior don't use the `displaySize`, `customDisplaySize`, `customFontSize` properties and `detailBox`
      * aggregation of `sap.m.Avatar`.
      */
    var avatar: js.UndefOr[typings.openui5.sapMAvatarMod.default] = js.undefined
    
    /**
      * Specifies the application which provides target and param configuration for cross-application navigation
      * from the 'page header'.
      */
    var crossAppNavCallback: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the text displayed under the header of the content section.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.69
      * @deprecated (since 1.92) - Use the `avatar` aggregation and use its property `fallbackIcon` instead.
      *
      * Defines the fallback icon displayed in case of wrong image src or loading issues.
      *
      * **Note:** Accepted values are only icons from the SAP icon font.
      */
    var fallbackIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * QuickViewGroup consists of a title (optional) and an entity of group elements.
      */
    var groups: js.UndefOr[
        js.Array[typings.openui5.sapMQuickViewGroupMod.default] | typings.openui5.sapMQuickViewGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the text displayed in the header of the control.
      */
    var header: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.92) - Use the `avatar` aggregation instead.
      *
      * Specifies the URL of the icon or image displayed under the header of the page.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Page id
      */
    var pageId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the text displayed in the header of the content section of the control.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the URL which opens when the title or the avatar is clicked. **Note:** If the avatar has `press`
      * listeners this URL is not opened automatically.
      */
    var titleUrl: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object QuickViewPageSettings {
    
    inline def apply(): QuickViewPageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewPageSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuickViewPageSettings] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: typings.openui5.sapMAvatarMod.default): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setCrossAppNavCallback(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "crossAppNavCallback", value.asInstanceOf[js.Any])
      
      inline def setCrossAppNavCallbackUndefined: Self = StObject.set(x, "crossAppNavCallback", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFallbackIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fallbackIcon", value.asInstanceOf[js.Any])
      
      inline def setFallbackIconUndefined: Self = StObject.set(x, "fallbackIcon", js.undefined)
      
      inline def setGroups(
        value: js.Array[typings.openui5.sapMQuickViewGroupMod.default] | typings.openui5.sapMQuickViewGroupMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: typings.openui5.sapMQuickViewGroupMod.default*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPageId(value: String | PropertyBindingInfo): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      inline def setPageIdUndefined: Self = StObject.set(x, "pageId", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleUrl", value.asInstanceOf[js.Any])
      
      inline def setTitleUrlUndefined: Self = StObject.set(x, "titleUrl", js.undefined)
    }
  }
}
