package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMStandardListItemMod {
  
  @JSImport("sap/m/StandardListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new StandardListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:/standard-list-item/ Standard List Item}
    */
  open class default () extends StandardListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: StandardListItemSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: StandardListItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: StandardListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/StandardListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.StandardListItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, StandardListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, StandardListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.StandardListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait StandardListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * @SINCE 1.98
      *
      * Destroys the avatar in the aggregation {@link #getAvatar avatar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAvatar(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveIcon activeIcon}.
      *
      * Defines the icon that is shown while the list item is pressed.
      *
      * @returns Value of property `activeIcon`
      */
    def getActiveIcon(): URI = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Gets current value of property {@link #getAdaptTitleSize adaptTitleSize}.
      *
      * By default, the title size adapts to the available space and gets bigger if the description is empty.
      * If you have list items with and without descriptions, this results in titles with different sizes. In
      * this case, it can be better to switch the size adaption off by setting this property to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `adaptTitleSize`
      */
    def getAdaptTitleSize(): Boolean = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets content of aggregation {@link #getAvatar avatar}.
      *
      * A `sap.m.Avatar` control instance that, if set, is used instead of an icon or image.
      *
      * The size of the `Avatar` control depends on the `insetIcon` property of `StandardListItem`. The `displaySize`
      * property of the `Avatar` control is not supported. If the `insetIcon` property of `StandardListItem`
      * is set to `true`, the size of the `Avatar` control is set to XS; if the `insetIcon` property of `StandardListItem`
      * is set to `false`, the size of the `Avatar` control is set to "S".
      */
    def getAvatar(): typings.openui5.sapMAvatarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the additional information for the title. **Note:** This is only visible when the `title` property
      * is not empty.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the list item icon.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, one or more requests are sent to get the density perfect version of the icon if the given
      * version of the icon doesn't exist on the server. **Note:** If bandwidth is a key factor for the application,
      * set this value to `false`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconDensityAware`
      */
    def getIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getIconInset iconInset}.
      *
      * Defines the indentation of the icon. If set to `false`, the icon will not be shown as embedded. Instead
      * it will take the full height of the list item.
      *
      * Default value is `true`.
      *
      * @returns Value of property `iconInset`
      */
    def getIconInset(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getInfo info}.
      *
      * Defines an additional information text. **Note:** A wrapping of the information text is also supported
      * as of version 1.95, if `wrapping=true`. Although long strings are supported for the information text,
      * it is recommended to use short strings. For more details, see {@link #getWrapping wrapping}.
      *
      * @returns Value of property `info`
      */
    def getInfo(): String = js.native
    
    /**
      * Gets current value of property {@link #getInfoState infoState}.
      *
      * Defines the state of the information text, e.g. `Error`, `Warning`, `Success`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `infoState`
      */
    def getInfoState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * @SINCE 1.74
      *
      * Gets current value of property {@link #getInfoStateInverted infoStateInverted}.
      *
      * Determines the inverted rendering behavior of the info text and the info state. The color defined by
      * the `infoState` property is rendered as the background color for the info text, if this property is set
      * to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `infoStateInverted`
      */
    def getInfoStateInverted(): Boolean = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getInfoTextDirection infoTextDirection}.
      *
      * Defines the `info` directionality with enumerated options. By default, the control inherits text direction
      * from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `infoTextDirection`
      */
    def getInfoTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the title of the list item.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Defines the `title` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `titleTextDirection`
      */
    def getTitleTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.94
      *
      * Gets current value of property {@link #getWrapCharLimit wrapCharLimit}.
      *
      * This property can be used to change the default character limits for the wrapping behavior.
      *
      * If this property is set to 0, then the default character limit used by the wrapping behavior is used.
      * For details see {@link #getWrapping wrapping}.
      *
      * **Note:**
      *
      * 0 or a positive integer must be used for this property.
      *
      * Default value is `0`.
      *
      * @returns Value of property `wrapCharLimit`
      */
    def getWrapCharLimit(): int = js.native
    
    /**
      * @SINCE 1.67
      *
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Defines the wrapping behavior of title and description texts.
      *
      * **Note:**
      *
      * In the desktop mode, initial rendering of the control contains 300 characters along with a button to
      * expand and collapse the text whereas in the phone mode, the character limit is set to 100 characters.
      *  A wrapping of the information text is supported as of 1.95. But expanding and collapsing the information
      * text is not possible. A wrapping of the information text is disabled if `infoStateInverted` is set to
      * `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getActiveIcon activeIcon}.
      *
      * Defines the icon that is shown while the list item is pressed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveIcon(): this.type = js.native
    def setActiveIcon(/**
      * New value for property `activeIcon`
      */
    sActiveIcon: URI): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Sets a new value for property {@link #getAdaptTitleSize adaptTitleSize}.
      *
      * By default, the title size adapts to the available space and gets bigger if the description is empty.
      * If you have list items with and without descriptions, this results in titles with different sizes. In
      * this case, it can be better to switch the size adaption off by setting this property to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdaptTitleSize(): this.type = js.native
    def setAdaptTitleSize(/**
      * New value for property `adaptTitleSize`
      */
    bAdaptTitleSize: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.98
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
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the additional information for the title. **Note:** This is only visible when the `title` property
      * is not empty.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the list item icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconDensityAware iconDensityAware}.
      *
      * By default, one or more requests are sent to get the density perfect version of the icon if the given
      * version of the icon doesn't exist on the server. **Note:** If bandwidth is a key factor for the application,
      * set this value to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconDensityAware(): this.type = js.native
    def setIconDensityAware(/**
      * New value for property `iconDensityAware`
      */
    bIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconInset iconInset}.
      *
      * Defines the indentation of the icon. If set to `false`, the icon will not be shown as embedded. Instead
      * it will take the full height of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconInset(): this.type = js.native
    def setIconInset(/**
      * New value for property `iconInset`
      */
    bIconInset: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInfo info}.
      *
      * Defines an additional information text. **Note:** A wrapping of the information text is also supported
      * as of version 1.95, if `wrapping=true`. Although long strings are supported for the information text,
      * it is recommended to use short strings. For more details, see {@link #getWrapping wrapping}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfo(): this.type = js.native
    def setInfo(/**
      * New value for property `info`
      */
    sInfo: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInfoState infoState}.
      *
      * Defines the state of the information text, e.g. `Error`, `Warning`, `Success`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoState(): this.type = js.native
    def setInfoState(
      /**
      * New value for property `infoState`
      */
    sInfoState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setInfoState(/**
      * New value for property `infoState`
      */
    sInfoState: ValueState): this.type = js.native
    
    /**
      * @SINCE 1.74
      *
      * Sets a new value for property {@link #getInfoStateInverted infoStateInverted}.
      *
      * Determines the inverted rendering behavior of the info text and the info state. The color defined by
      * the `infoState` property is rendered as the background color for the info text, if this property is set
      * to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoStateInverted(): this.type = js.native
    def setInfoStateInverted(/**
      * New value for property `infoStateInverted`
      */
    bInfoStateInverted: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getInfoTextDirection infoTextDirection}.
      *
      * Defines the `info` directionality with enumerated options. By default, the control inherits text direction
      * from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoTextDirection(): this.type = js.native
    def setInfoTextDirection(
      /**
      * New value for property `infoTextDirection`
      */
    sInfoTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setInfoTextDirection(/**
      * New value for property `infoTextDirection`
      */
    sInfoTextDirection: TextDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the title of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getTitleTextDirection titleTextDirection}.
      *
      * Defines the `title` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleTextDirection(): this.type = js.native
    def setTitleTextDirection(
      /**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTitleTextDirection(/**
      * New value for property `titleTextDirection`
      */
    sTitleTextDirection: TextDirection): this.type = js.native
    
    /**
      * @SINCE 1.94
      *
      * Sets a new value for property {@link #getWrapCharLimit wrapCharLimit}.
      *
      * This property can be used to change the default character limits for the wrapping behavior.
      *
      * If this property is set to 0, then the default character limit used by the wrapping behavior is used.
      * For details see {@link #getWrapping wrapping}.
      *
      * **Note:**
      *
      * 0 or a positive integer must be used for this property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapCharLimit(): this.type = js.native
    def setWrapCharLimit(/**
      * New value for property `wrapCharLimit`
      */
    iWrapCharLimit: int): this.type = js.native
    
    /**
      * @SINCE 1.67
      *
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Defines the wrapping behavior of title and description texts.
      *
      * **Note:**
      *
      * In the desktop mode, initial rendering of the control contains 300 characters along with a button to
      * expand and collapse the text whereas in the phone mode, the character limit is set to 100 characters.
      *  A wrapping of the information text is supported as of 1.95. But expanding and collapsing the information
      * text is not possible. A wrapping of the information text is disabled if `infoStateInverted` is set to
      * `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
  }
  
  trait StandardListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Defines the icon that is shown while the list item is pressed.
      */
    var activeIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * By default, the title size adapts to the available space and gets bigger if the description is empty.
      * If you have list items with and without descriptions, this results in titles with different sizes. In
      * this case, it can be better to switch the size adaption off by setting this property to `false`.
      */
    var adaptTitleSize: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * A `sap.m.Avatar` control instance that, if set, is used instead of an icon or image.
      *
      * The size of the `Avatar` control depends on the `insetIcon` property of `StandardListItem`. The `displaySize`
      * property of the `Avatar` control is not supported. If the `insetIcon` property of `StandardListItem`
      * is set to `true`, the size of the `Avatar` control is set to XS; if the `insetIcon` property of `StandardListItem`
      * is set to `false`, the size of the `Avatar` control is set to "S".
      */
    var avatar: js.UndefOr[typings.openui5.sapMAvatarMod.default] = js.undefined
    
    /**
      * Defines the additional information for the title. **Note:** This is only visible when the `title` property
      * is not empty.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the list item icon.
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * By default, one or more requests are sent to get the density perfect version of the icon if the given
      * version of the icon doesn't exist on the server. **Note:** If bandwidth is a key factor for the application,
      * set this value to `false`.
      */
    var iconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the indentation of the icon. If set to `false`, the icon will not be shown as embedded. Instead
      * it will take the full height of the list item.
      */
    var iconInset: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines an additional information text. **Note:** A wrapping of the information text is also supported
      * as of version 1.95, if `wrapping=true`. Although long strings are supported for the information text,
      * it is recommended to use short strings. For more details, see {@link #getWrapping wrapping}.
      */
    var info: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the state of the information text, e.g. `Error`, `Warning`, `Success`.
      */
    var infoState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.74
      *
      * Determines the inverted rendering behavior of the info text and the info state. The color defined by
      * the `infoState` property is rendered as the background color for the info text, if this property is set
      * to `true`.
      */
    var infoStateInverted: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Defines the `info` directionality with enumerated options. By default, the control inherits text direction
      * from the DOM.
      */
    var infoTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the title of the list item.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Defines the `title` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      */
    var titleTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.94
      *
      * This property can be used to change the default character limits for the wrapping behavior.
      *
      * If this property is set to 0, then the default character limit used by the wrapping behavior is used.
      * For details see {@link #getWrapping wrapping}.
      *
      * **Note:**
      *
      * 0 or a positive integer must be used for this property.
      */
    var wrapCharLimit: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.67
      *
      * Defines the wrapping behavior of title and description texts.
      *
      * **Note:**
      *
      * In the desktop mode, initial rendering of the control contains 300 characters along with a button to
      * expand and collapse the text whereas in the phone mode, the character limit is set to 100 characters.
      *  A wrapping of the information text is supported as of 1.95. But expanding and collapsing the information
      * text is not possible. A wrapping of the information text is disabled if `infoStateInverted` is set to
      * `true`.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object StandardListItemSettings {
    
    inline def apply(): StandardListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardListItemSettings]
    }
    
    extension [Self <: StandardListItemSettings](x: Self) {
      
      inline def setActiveIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveIconUndefined: Self = StObject.set(x, "activeIcon", js.undefined)
      
      inline def setAdaptTitleSize(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "adaptTitleSize", value.asInstanceOf[js.Any])
      
      inline def setAdaptTitleSizeUndefined: Self = StObject.set(x, "adaptTitleSize", js.undefined)
      
      inline def setAvatar(value: typings.openui5.sapMAvatarMod.default): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setIconDensityAwareUndefined: Self = StObject.set(x, "iconDensityAware", js.undefined)
      
      inline def setIconInset(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconInset", value.asInstanceOf[js.Any])
      
      inline def setIconInsetUndefined: Self = StObject.set(x, "iconInset", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInfo(value: String | PropertyBindingInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "infoState", value.asInstanceOf[js.Any])
      
      inline def setInfoStateInverted(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "infoStateInverted", value.asInstanceOf[js.Any])
      
      inline def setInfoStateInvertedUndefined: Self = StObject.set(x, "infoStateInverted", js.undefined)
      
      inline def setInfoStateUndefined: Self = StObject.set(x, "infoState", js.undefined)
      
      inline def setInfoTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "infoTextDirection", value.asInstanceOf[js.Any])
      
      inline def setInfoTextDirectionUndefined: Self = StObject.set(x, "infoTextDirection", js.undefined)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleTextDirection", value.asInstanceOf[js.Any])
      
      inline def setTitleTextDirectionUndefined: Self = StObject.set(x, "titleTextDirection", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWrapCharLimit(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapCharLimit", value.asInstanceOf[js.Any])
      
      inline def setWrapCharLimitUndefined: Self = StObject.set(x, "wrapCharLimit", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
