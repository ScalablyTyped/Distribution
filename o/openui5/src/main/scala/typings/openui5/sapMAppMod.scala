package typings.openui5

import typings.openui5.anon.Landscape
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMNavContainerMod.NavContainerSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMAppMod {
  
  @JSImport("sap/m/App", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `App`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:a4afb138acf64a61a038aa5b91a4f082 App}
    */
  open class default () extends App {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AppSettings) = this()
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
    mSettings: AppSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AppSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/App", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.App with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.NavContainer.extend}.
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
    oClassInfo: ClassInfo[T, App]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, App],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.App.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait App
    extends typings.openui5.sapMNavContainerMod.default {
    
    /**
      * @deprecated (since 1.20.0) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:orientationChange orientationChange} event of
      * this `sap.m.App`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.App` itself.
      *
      * Fired when the orientation (portrait/landscape) of the device is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOrientationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOrientationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.App` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.20.0) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:orientationChange orientationChange} event of
      * this `sap.m.App`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.App` itself.
      *
      * Fired when the orientation (portrait/landscape) of the device is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOrientationChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOrientationChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.App` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:orientationChange orientationChange} event
      * of this `sap.m.App`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOrientationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOrientationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Fires event {@link #event:orientationChange orientationChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOrientationChange(): this.type = js.native
    def fireOrientationChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Landscape): this.type = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the App. If set, this color will override the default background defined by the theme.
      * So this should only be set when really required. Any configured background image will be placed above
      * this colored background. But any theme adaptation in the Theme Designer will override this setting. Use
      * the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
      *
      * @returns Value of property `backgroundColor`
      */
    def getBackgroundColor(): String = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundImage backgroundImage}.
      *
      * Background image of the App. If set, this image will override the default background defined by the theme.
      * So this should only be set when really required. This background image will be placed above any color
      * set for the background. But any theme adaptation in the Theme Designer will override this image setting.
      * Use the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
      *
      * @returns Value of property `backgroundImage`
      */
    def getBackgroundImage(): URI = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Opacity of the background image. The opacity can be set between 0 (fully transparent) and 1 fully opaque).
      * This can be used to make the application content better readable by making the background image partly
      * transparent.
      *
      * Default value is `1`.
      *
      * @returns Value of property `backgroundOpacity`
      */
    def getBackgroundOpacity(): float = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Gets current value of property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Whether the background image (if configured) should be proportionally stretched to cover the whole App
      * (false) or whether it should be tiled (true).
      *
      * Default value is `false`.
      *
      * @returns Value of property `backgroundRepeat`
      */
    def getBackgroundRepeat(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHomeIcon homeIcon}.
      *
      * The icon to be displayed on the home screen of iOS devices after the user does "add to home screen".
      *
      * Note that only the first attempt to set the homeIcon will be executed, subsequent settings are ignored.
      *
      * This icon must be in PNG format. The property can either hold the URL of one single icon which is used
      * for all devices (and possibly scaled, which looks not perfect), or an object holding icon URLs for the
      * different required sizes.
      *
      * A desktop icon (used for bookmarks and overriding the favicon) can also be configured. This requires
      * an object to be given and the "icon" property of this object then defines the desktop bookmark icon.
      * The ICO format is supported by all browsers. ICO is also preferred for this desktop icon setting because
      * the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The respective image sizes are 57/114 px for the phone and 72/144 px for the tablet. If an object is
      * given but one of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android these icons may or may not be used by the device. Apparently chances can be improved by adding
      * glare effect and rounded corners, setting the file name so it ends with "-precomposed.png" and setting
      * the "homeIconPrecomposed" property to "true".
      *
      * @returns Value of property `homeIcon`
      */
    def getHomeIcon(): Any = js.native
    
    /**
      * @SINCE 1.91
      *
      * Gets current value of property {@link #getIsTopLevel isTopLevel}.
      *
      * Determines whether `sap.m.App` is used as a top level control.
      *
      * **Note**: When the `isTopLevel` property set to `true`, `sap.m.App` traverses its parent DOM elements
      * and sets their height to 100%.
      *
      * Default value is `true`.
      *
      * @returns Value of property `isTopLevel`
      */
    def getIsTopLevel(): Boolean = js.native
    
    /**
      * @SINCE 1.58.0
      *
      * Gets current value of property {@link #getMobileWebAppCapable mobileWebAppCapable}.
      *
      * Determines whether the `App` is displayed without address bar when opened from an exported home screen
      * icon on a mobile device.
      *
      * Keep in mind that if enabled, there is no back button provided by the browser and the app must provide
      * own navigation on all displayed pages to avoid dead ends.
      *
      * **Note** The property can be toggled, but it doesn't take effect in real time. It takes the set value
      * at the moment when the home screen icon is exported by the user. For example, if the icon is exported
      * while the property is set to `true`, the `App` will have no address bar when opened from that same icon
      * regardless of a changed property value to `false` at a later time.
      *
      * Default value is `true`.
      *
      * @returns Value of property `mobileWebAppCapable`
      */
    def getMobileWebAppCapable(): Boolean = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundColor backgroundColor}.
      *
      * Background color of the App. If set, this color will override the default background defined by the theme.
      * So this should only be set when really required. Any configured background image will be placed above
      * this colored background. But any theme adaptation in the Theme Designer will override this setting. Use
      * the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBackgroundColor(): this.type = js.native
    def setBackgroundColor(/**
      * New value for property `backgroundColor`
      */
    sBackgroundColor: String): this.type = js.native
    
    /**
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundImage backgroundImage}.
      *
      * Background image of the App. If set, this image will override the default background defined by the theme.
      * So this should only be set when really required. This background image will be placed above any color
      * set for the background. But any theme adaptation in the Theme Designer will override this image setting.
      * Use the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
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
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundOpacity backgroundOpacity}.
      *
      * Opacity of the background image. The opacity can be set between 0 (fully transparent) and 1 fully opaque).
      * This can be used to make the application content better readable by making the background image partly
      * transparent.
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
      * @SINCE 1.11.2
      *
      * Sets a new value for property {@link #getBackgroundRepeat backgroundRepeat}.
      *
      * Whether the background image (if configured) should be proportionally stretched to cover the whole App
      * (false) or whether it should be tiled (true).
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
      * Sets a new value for property {@link #getHomeIcon homeIcon}.
      *
      * The icon to be displayed on the home screen of iOS devices after the user does "add to home screen".
      *
      * Note that only the first attempt to set the homeIcon will be executed, subsequent settings are ignored.
      *
      * This icon must be in PNG format. The property can either hold the URL of one single icon which is used
      * for all devices (and possibly scaled, which looks not perfect), or an object holding icon URLs for the
      * different required sizes.
      *
      * A desktop icon (used for bookmarks and overriding the favicon) can also be configured. This requires
      * an object to be given and the "icon" property of this object then defines the desktop bookmark icon.
      * The ICO format is supported by all browsers. ICO is also preferred for this desktop icon setting because
      * the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The respective image sizes are 57/114 px for the phone and 72/144 px for the tablet. If an object is
      * given but one of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android these icons may or may not be used by the device. Apparently chances can be improved by adding
      * glare effect and rounded corners, setting the file name so it ends with "-precomposed.png" and setting
      * the "homeIconPrecomposed" property to "true".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHomeIcon(): this.type = js.native
    def setHomeIcon(/**
      * New value for property `homeIcon`
      */
    oHomeIcon: Any): this.type = js.native
    
    /**
      * @SINCE 1.91
      *
      * Sets a new value for property {@link #getIsTopLevel isTopLevel}.
      *
      * Determines whether `sap.m.App` is used as a top level control.
      *
      * **Note**: When the `isTopLevel` property set to `true`, `sap.m.App` traverses its parent DOM elements
      * and sets their height to 100%.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIsTopLevel(): this.type = js.native
    def setIsTopLevel(/**
      * New value for property `isTopLevel`
      */
    bIsTopLevel: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.58.0
      *
      * Sets a new value for property {@link #getMobileWebAppCapable mobileWebAppCapable}.
      *
      * Determines whether the `App` is displayed without address bar when opened from an exported home screen
      * icon on a mobile device.
      *
      * Keep in mind that if enabled, there is no back button provided by the browser and the app must provide
      * own navigation on all displayed pages to avoid dead ends.
      *
      * **Note** The property can be toggled, but it doesn't take effect in real time. It takes the set value
      * at the moment when the home screen icon is exported by the user. For example, if the icon is exported
      * while the property is set to `true`, the `App` will have no address bar when opened from that same icon
      * regardless of a changed property value to `false` at a later time.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMobileWebAppCapable(): this.type = js.native
    def setMobileWebAppCapable(/**
      * New value for property `mobileWebAppCapable`
      */
    bMobileWebAppCapable: Boolean): this.type = js.native
  }
  
  trait AppSettings
    extends StObject
       with NavContainerSettings {
    
    /**
      * @SINCE 1.11.2
      *
      * Background color of the App. If set, this color will override the default background defined by the theme.
      * So this should only be set when really required. Any configured background image will be placed above
      * this colored background. But any theme adaptation in the Theme Designer will override this setting. Use
      * the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
      */
    var backgroundColor: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Background image of the App. If set, this image will override the default background defined by the theme.
      * So this should only be set when really required. This background image will be placed above any color
      * set for the background. But any theme adaptation in the Theme Designer will override this image setting.
      * Use the "backgroundRepeat" property to define whether this image should be stretched to cover the complete
      * App or whether it should be tiled.
      */
    var backgroundImage: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Opacity of the background image. The opacity can be set between 0 (fully transparent) and 1 fully opaque).
      * This can be used to make the application content better readable by making the background image partly
      * transparent.
      */
    var backgroundOpacity: js.UndefOr[
        float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.11.2
      *
      * Whether the background image (if configured) should be proportionally stretched to cover the whole App
      * (false) or whether it should be tiled (true).
      */
    var backgroundRepeat: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The icon to be displayed on the home screen of iOS devices after the user does "add to home screen".
      *
      * Note that only the first attempt to set the homeIcon will be executed, subsequent settings are ignored.
      *
      * This icon must be in PNG format. The property can either hold the URL of one single icon which is used
      * for all devices (and possibly scaled, which looks not perfect), or an object holding icon URLs for the
      * different required sizes.
      *
      * A desktop icon (used for bookmarks and overriding the favicon) can also be configured. This requires
      * an object to be given and the "icon" property of this object then defines the desktop bookmark icon.
      * The ICO format is supported by all browsers. ICO is also preferred for this desktop icon setting because
      * the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The respective image sizes are 57/114 px for the phone and 72/144 px for the tablet. If an object is
      * given but one of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android these icons may or may not be used by the device. Apparently chances can be improved by adding
      * glare effect and rounded corners, setting the file name so it ends with "-precomposed.png" and setting
      * the "homeIconPrecomposed" property to "true".
      */
    var homeIcon: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.91
      *
      * Determines whether `sap.m.App` is used as a top level control.
      *
      * **Note**: When the `isTopLevel` property set to `true`, `sap.m.App` traverses its parent DOM elements
      * and sets their height to 100%.
      */
    var isTopLevel: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58.0
      *
      * Determines whether the `App` is displayed without address bar when opened from an exported home screen
      * icon on a mobile device.
      *
      * Keep in mind that if enabled, there is no back button provided by the browser and the app must provide
      * own navigation on all displayed pages to avoid dead ends.
      *
      * **Note** The property can be toggled, but it doesn't take effect in real time. It takes the set value
      * at the moment when the home screen icon is exported by the user. For example, if the icon is exported
      * while the property is set to `true`, the `App` will have no address bar when opened from that same icon
      * regardless of a changed property value to `false` at a later time.
      */
    var mobileWebAppCapable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.20.0) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Fired when the orientation (portrait/landscape) of the device is changed.
      */
    var orientationChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object AppSettings {
    
    inline def apply(): AppSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AppSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String | PropertyBindingInfo): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundOpacity(value: float | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundOpacity", value.asInstanceOf[js.Any])
      
      inline def setBackgroundOpacityUndefined: Self = StObject.set(x, "backgroundOpacity", js.undefined)
      
      inline def setBackgroundRepeat(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "backgroundRepeat", value.asInstanceOf[js.Any])
      
      inline def setBackgroundRepeatUndefined: Self = StObject.set(x, "backgroundRepeat", js.undefined)
      
      inline def setHomeIcon(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "homeIcon", value.asInstanceOf[js.Any])
      
      inline def setHomeIconUndefined: Self = StObject.set(x, "homeIcon", js.undefined)
      
      inline def setIsTopLevel(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "isTopLevel", value.asInstanceOf[js.Any])
      
      inline def setIsTopLevelUndefined: Self = StObject.set(x, "isTopLevel", js.undefined)
      
      inline def setMobileWebAppCapable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "mobileWebAppCapable", value.asInstanceOf[js.Any])
      
      inline def setMobileWebAppCapableUndefined: Self = StObject.set(x, "mobileWebAppCapable", js.undefined)
      
      inline def setOrientationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "orientationChange", js.Any.fromFunction1(value))
      
      inline def setOrientationChangeUndefined: Self = StObject.set(x, "orientationChange", js.undefined)
    }
  }
}
