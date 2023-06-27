package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSColor
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMShellMod {
  
  @JSImport("sap/m/Shell", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Shell.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Shell {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ShellSettings) = this()
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
    mSettings: ShellSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ShellSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/Shell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Shell with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Shell]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Shell],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Shell.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Shell
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logout logout} event of this `sap.m.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Shell` itself.
      *
      * Fires when the user presses the logout button/link.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachLogout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logout logout} event of this `sap.m.Shell`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.Shell` itself.
      *
      * Fires when the user presses the logout button/link.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogout(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachLogout(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.Shell` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the app in the aggregation {@link #getApp app}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyApp(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:logout logout} event of this `sap.m.Shell`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLogout(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachLogout(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:logout logout} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLogout(): this.type = js.native
    def fireLogout(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getApp app}.
      *
      * A Shell contains an App or a SplitApp (they may be wrapped in a View). Other control types are not allowed.
      */
    def getApp(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getAppWidthLimited appWidthLimited}.
      *
      * Determines whether the width of the content (the aggregated App) should be limited or extended to the
      * full screen width.
      *
      * Default value is `true`.
      *
      * @returns Value of property `appWidthLimited`
      */
    def getAppWidthLimited(): Boolean = js.native
    
    /**
      * @since 1.11.2
      *
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Defines the background color of the Shell. If set, this color will override the default background defined
      * by the theme. This should only be set when really required. Any configured background image will be placed
      * above this colored background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): CSSColor = js.native
    
    /**
      * @since 1.11.2
      *
      * Gets current value of property {@link #getBackgroundImage backgroundImage}.
      *
      * Defines the background image of the Shell. If set, this image will override the default background defined
      * by the theme. This should only be set when really required. This background image will be placed above
      * any color set for the background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      *
      * @returns Value of property `backgroundImage`
      */
    def getBackgroundImage(): URI = js.native
    
    /**
      * @since 1.11.2
      *
      * Gets current value of property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Defines the opacity of the background image. The opacity can be set between 0 (fully transparent) and
      * 1 (fully opaque). This can be used to improve readability of the Shell content by making the background
      * image partly transparent.
      *
      * Default value is `1`.
      *
      * @returns Value of property `backgroundOpacity`
      */
    def getBackgroundOpacity(): float = js.native
    
    /**
      * @since 1.11.2
      *
      * Gets current value of property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Determines whether the background image (if configured) should be proportionally stretched to cover the
      * whole Shell (false, default) or whether it should be tiled (true). Note: the image will not be displayed
      * when the `sap.m.Shell` content is fully overlapping the `sap.m.Shell` background (e.g. when "appWidthLimited"
      * is set to "false").
      *
      * Default value is `false`.
      *
      * @returns Value of property `backgroundRepeat`
      */
    def getBackgroundRepeat(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeaderRightText headerRightText}.
      *
      * Defines texts, such as the name of the logged-in user, which should be displayed on the right side of
      * the header (if there is enough space to display the header at all - this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden).
      *
      * @returns Value of property `headerRightText`
      */
    def getHeaderRightText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHomeIcon homeIcon}.
      *
      * The icon used for the mobile device home screen and the icon to be used for bookmarks by desktop browsers.
      *
      * This property should be only set once, and as early as possible. Subsequent calls replace the previous
      * icon settings and may lead to different behavior depending on the browser.
      *
      * Different image sizes for device home screen need to be given as PNG images, an ICO file needs to be
      * given as desktop browser bookmark icon (other file formats may not work in all browsers). The `precomposed`
      * flag defines whether there is already a glow effect contained in the home screen images (or whether iOS
      * should add such an effect). The given structure could look like this: { 'phone':'phone-icon_57x57.png',
      * 'phone@2':'phone-retina_114x114.png', 'tablet':'tablet-icon_72x72.png', 'tablet@2':'tablet-retina_144x144.png',
      * 'precomposed':true, 'favicon':'favicon.ico' }
      *
      * See {@link module:sap/ui/util/Mobile.setIcons} for full documentation.
      *
      * @returns Value of property `homeIcon`
      */
    def getHomeIcon(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getLogo logo}.
      *
      * Defines the logo to be displayed next to the App when the screen is sufficiently large.
      *
      * Note: If property value isn't set, then the logo address is taken from the theme parameters. For reference
      * please see: {@link sap.ui.core.theming.Parameters}
      *
      * @returns Value of property `logo`
      */
    def getLogo(): URI = js.native
    
    /**
      * Gets current value of property {@link #getShowLogout showLogout}.
      *
      * Determines whether the Logout button should be displayed. Currently, this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showLogout`
      */
    def getShowLogout(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Defines the application title, which may or may not be displayed outside the actual application, depending
      * on the available screen size.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      *
      * Default value is `H1`.
      *
      * @returns Value of property `titleLevel`
      */
    def getTitleLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * Sets the aggregated {@link #getApp app}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setApp(/**
      * The app to set
      */
    oApp: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAppWidthLimited appWidthLimited}.
      *
      * Determines whether the width of the content (the aggregated App) should be limited or extended to the
      * full screen width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAppWidthLimited(): this.type = js.native
    def setAppWidthLimited(/**
      * New value for property `appWidthLimited`
      */
    bAppWidthLimited: Boolean): this.type = js.native
    
    /**
      * @since 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Defines the background color of the Shell. If set, this color will override the default background defined
      * by the theme. This should only be set when really required. Any configured background image will be placed
      * above this colored background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: CSSColor): this.type = js.native
    
    /**
      * @since 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundImage backgroundImage}.
      *
      * Defines the background image of the Shell. If set, this image will override the default background defined
      * by the theme. This should only be set when really required. This background image will be placed above
      * any color set for the background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundImage(): this.type = js.native
    def setBackgroundImage(/**
      * New value for property `backgroundImage`
      */
    sBackgroundImage: URI): this.type = js.native
    
    /**
      * @since 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Defines the opacity of the background image. The opacity can be set between 0 (fully transparent) and
      * 1 (fully opaque). This can be used to improve readability of the Shell content by making the background
      * image partly transparent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundOpacity(): this.type = js.native
    def setBackgroundOpacity(/**
      * New value for property `backgroundOpacity`
      */
    fBackgroundOpacity: float): this.type = js.native
    
    /**
      * @since 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Determines whether the background image (if configured) should be proportionally stretched to cover the
      * whole Shell (false, default) or whether it should be tiled (true). Note: the image will not be displayed
      * when the `sap.m.Shell` content is fully overlapping the `sap.m.Shell` background (e.g. when "appWidthLimited"
      * is set to "false").
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundRepeat(): this.type = js.native
    def setBackgroundRepeat(/**
      * New value for property `backgroundRepeat`
      */
    bBackgroundRepeat: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderRightText headerRightText}.
      *
      * Defines texts, such as the name of the logged-in user, which should be displayed on the right side of
      * the header (if there is enough space to display the header at all - this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderRightText(): this.type = js.native
    def setHeaderRightText(/**
      * New value for property `headerRightText`
      */
    sHeaderRightText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLogo logo}.
      *
      * Defines the logo to be displayed next to the App when the screen is sufficiently large.
      *
      * Note: If property value isn't set, then the logo address is taken from the theme parameters. For reference
      * please see: {@link sap.ui.core.theming.Parameters}
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLogo(): this.type = js.native
    def setLogo(/**
      * New value for property `logo`
      */
    sLogo: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowLogout showLogout}.
      *
      * Determines whether the Logout button should be displayed. Currently, this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowLogout(): this.type = js.native
    def setShowLogout(/**
      * New value for property `showLogout`
      */
    bShowLogout: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Defines the application title, which may or may not be displayed outside the actual application, depending
      * on the available screen size.
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
      * Sets a new value for property {@link #getTitleLevel titleLevel}.
      *
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `H1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLevel(): this.type = js.native
    def setTitleLevel(
      /**
      * New value for property `titleLevel`
      */
    sTitleLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setTitleLevel(/**
      * New value for property `titleLevel`
      */
    sTitleLevel: TitleLevel): this.type = js.native
  }
  
  trait Shell$LogoutEventParameters extends StObject
  
  type ShellLogoutEvent = typings.openui5.sapUiBaseEventMod.default[Shell$LogoutEventParameters]
  
  type ShellLogoutEventParameters = Shell$LogoutEventParameters
  
  trait ShellSettings
    extends StObject
       with ControlSettings {
    
    /**
      * A Shell contains an App or a SplitApp (they may be wrapped in a View). Other control types are not allowed.
      */
    var app: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Determines whether the width of the content (the aggregated App) should be limited or extended to the
      * full screen width.
      */
    var appWidthLimited: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.2
      *
      * Defines the background color of the Shell. If set, this color will override the default background defined
      * by the theme. This should only be set when really required. Any configured background image will be placed
      * above this colored background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      */
    var backgroundColor: js.UndefOr[
        CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.2
      *
      * Defines the background image of the Shell. If set, this image will override the default background defined
      * by the theme. This should only be set when really required. This background image will be placed above
      * any color set for the background. Use the backgroundRepeat property to define whether this image should
      * be stretched to cover the complete Shell or whether it should be tiled.
      */
    var backgroundImage: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @since 1.11.2
      *
      * Defines the opacity of the background image. The opacity can be set between 0 (fully transparent) and
      * 1 (fully opaque). This can be used to improve readability of the Shell content by making the background
      * image partly transparent.
      */
    var backgroundOpacity: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.11.2
      *
      * Determines whether the background image (if configured) should be proportionally stretched to cover the
      * whole Shell (false, default) or whether it should be tiled (true). Note: the image will not be displayed
      * when the `sap.m.Shell` content is fully overlapping the `sap.m.Shell` background (e.g. when "appWidthLimited"
      * is set to "false").
      */
    var backgroundRepeat: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines texts, such as the name of the logged-in user, which should be displayed on the right side of
      * the header (if there is enough space to display the header at all - this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden).
      */
    var headerRightText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The icon used for the mobile device home screen and the icon to be used for bookmarks by desktop browsers.
      *
      * This property should be only set once, and as early as possible. Subsequent calls replace the previous
      * icon settings and may lead to different behavior depending on the browser.
      *
      * Different image sizes for device home screen need to be given as PNG images, an ICO file needs to be
      * given as desktop browser bookmark icon (other file formats may not work in all browsers). The `precomposed`
      * flag defines whether there is already a glow effect contained in the home screen images (or whether iOS
      * should add such an effect). The given structure could look like this: { 'phone':'phone-icon_57x57.png',
      * 'phone@2':'phone-retina_114x114.png', 'tablet':'tablet-icon_72x72.png', 'tablet@2':'tablet-retina_144x144.png',
      * 'precomposed':true, 'favicon':'favicon.ico' }
      *
      * See {@link module:sap/ui/util/Mobile.setIcons} for full documentation.
      */
    var homeIcon: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the logo to be displayed next to the App when the screen is sufficiently large.
      *
      * Note: If property value isn't set, then the logo address is taken from the theme parameters. For reference
      * please see: {@link sap.ui.core.theming.Parameters}
      */
    var logo: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fires when the user presses the logout button/link.
      */
    var logout: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Determines whether the Logout button should be displayed. Currently, this only happens on very tall screens
      * (1568px height), otherwise, it is always hidden.
      */
    var showLogout: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the application title, which may or may not be displayed outside the actual application, depending
      * on the available screen size.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the semantic level of the title.
      *
      * This information is used by assistive technologies, such as screen readers to create a hierarchical site
      * map for faster navigation. Depending on this setting an HTML h1-h6 element is used.
      */
    var titleLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object ShellSettings {
    
    inline def apply(): ShellSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShellSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShellSettings] (val x: Self) extends AnyVal {
      
      inline def setApp(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setAppWidthLimited(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "appWidthLimited", value.asInstanceOf[js.Any])
      
      inline def setAppWidthLimitedUndefined: Self = StObject.set(x, "appWidthLimited", js.undefined)
      
      inline def setBackgroundColor(value: CSSColor | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOpacity(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
      
      inline def setBackgroundRepeat(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setHeaderRightText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerRightText", value.asInstanceOf[js.Any])
      
      inline def setHeaderRightTextUndefined: Self = StObject.set(x, "headerRightText", js.undefined)
      
      inline def setHomeIcon(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "homeIcon", value.asInstanceOf[js.Any])
      
      inline def setHomeIconUndefined: Self = StObject.set(x, "homeIcon", js.undefined)
      
      inline def setLogo(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setLogout(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "logout", js.Any.fromFunction1(value))
      
      inline def setLogoutUndefined: Self = StObject.set(x, "logout", js.undefined)
      
      inline def setShowLogout(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showLogout", value.asInstanceOf[js.Any])
      
      inline def setShowLogoutUndefined: Self = StObject.set(x, "showLogout", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "titleLevel", value.asInstanceOf[js.Any])
      
      inline def setTitleLevelUndefined: Self = StObject.set(x, "titleLevel", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
