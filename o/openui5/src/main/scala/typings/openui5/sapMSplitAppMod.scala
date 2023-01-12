package typings.openui5

import typings.openui5.anon.Landscape
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMSplitContainerMod.SplitContainerSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSplitAppMod {
  
  @JSImport("sap/m/SplitApp", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SplitApp.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:eedfe79e4c19462eafe8780aeab16a3c Split App}
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/split-screen/ Split App}
    */
  open class default () extends SplitApp {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SplitAppSettings) = this()
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
    mSettings: SplitAppSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SplitAppSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SplitApp", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SplitApp with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.SplitContainer.extend}.
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
    oClassInfo: ClassInfo[T, SplitApp]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SplitApp],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SplitApp.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SplitApp
    extends typings.openui5.sapMSplitContainerMod.default {
    
    /**
      * @deprecated (since 1.87) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:orientationChange orientationChange} event of
      * this `sap.m.SplitApp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitApp` itself.
      *
      * Fires when orientation (portrait/landscape) is changed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitApp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.87) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:orientationChange orientationChange} event of
      * this `sap.m.SplitApp`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SplitApp` itself.
      *
      * Fires when orientation (portrait/landscape) is changed.
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
      * Context object to call the event handler with. Defaults to this `sap.m.SplitApp` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.87) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:orientationChange orientationChange} event
      * of this `sap.m.SplitApp`.
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
      * @deprecated (since 1.87) - use {@link sap.ui.Device.orientation.attachHandler} instead.
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
      * Gets current value of property {@link #getHomeIcon homeIcon}.
      *
      * Represents the icon to be displayed on the home screen of iOS devices after the user does "add to home
      * screen". Note that only the first attempt to set the homeIcon is executed, subsequent settings are ignored.
      * The icon must be in PNG format. The property can either store the URL of one single icon or an object
      * holding icon URLs for the different required sizes. Note that if single icon is used for all devices,
      * when scaled, its quality can regress. A desktop icon (used for bookmarks and overriding the favicon)
      * can also be configured. This requires an object to be given and the "icon" property of this object then
      * defines the desktop bookmark icon. The ICO format is supported by all browsers. ICO is also preferred
      * for this desktop icon setting as the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The image size is 57/114 px for the phone and 72/144 px for the tablet. If an object is given but one
      * of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android, these icons may or may not be used by the device. Chances can be improved by adding glare
      * effect, rounded corners, setting the file name to end with "-precomposed.png", and setting the homeIconPrecomposed
      * property to true.
      *
      * @returns Value of property `homeIcon`
      */
    def getHomeIcon(): Any = js.native
    
    /**
      * Sets a new value for property {@link #getHomeIcon homeIcon}.
      *
      * Represents the icon to be displayed on the home screen of iOS devices after the user does "add to home
      * screen". Note that only the first attempt to set the homeIcon is executed, subsequent settings are ignored.
      * The icon must be in PNG format. The property can either store the URL of one single icon or an object
      * holding icon URLs for the different required sizes. Note that if single icon is used for all devices,
      * when scaled, its quality can regress. A desktop icon (used for bookmarks and overriding the favicon)
      * can also be configured. This requires an object to be given and the "icon" property of this object then
      * defines the desktop bookmark icon. The ICO format is supported by all browsers. ICO is also preferred
      * for this desktop icon setting as the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The image size is 57/114 px for the phone and 72/144 px for the tablet. If an object is given but one
      * of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android, these icons may or may not be used by the device. Chances can be improved by adding glare
      * effect, rounded corners, setting the file name to end with "-precomposed.png", and setting the homeIconPrecomposed
      * property to true.
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
  }
  
  trait SplitAppSettings
    extends StObject
       with SplitContainerSettings {
    
    /**
      * Represents the icon to be displayed on the home screen of iOS devices after the user does "add to home
      * screen". Note that only the first attempt to set the homeIcon is executed, subsequent settings are ignored.
      * The icon must be in PNG format. The property can either store the URL of one single icon or an object
      * holding icon URLs for the different required sizes. Note that if single icon is used for all devices,
      * when scaled, its quality can regress. A desktop icon (used for bookmarks and overriding the favicon)
      * can also be configured. This requires an object to be given and the "icon" property of this object then
      * defines the desktop bookmark icon. The ICO format is supported by all browsers. ICO is also preferred
      * for this desktop icon setting as the file can contain different images for different resolutions.
      *
      * One example is:
      *
      * app.setHomeIcon({ 'phone':'phone-icon.png', 'phone@2':'phone-retina.png', 'tablet':'tablet-icon.png',
      * 'tablet@2':'tablet-retina.png', 'icon':'desktop.ico' });
      *
      * The image size is 57/114 px for the phone and 72/144 px for the tablet. If an object is given but one
      * of the sizes is not given, the largest given icon will be used for this size.
      *
      * On Android, these icons may or may not be used by the device. Chances can be improved by adding glare
      * effect, rounded corners, setting the file name to end with "-precomposed.png", and setting the homeIconPrecomposed
      * property to true.
      */
    var homeIcon: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @deprecated (since 1.87) - use {@link sap.ui.Device.orientation.attachHandler} instead.
      *
      * Fires when orientation (portrait/landscape) is changed.
      */
    var orientationChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object SplitAppSettings {
    
    inline def apply(): SplitAppSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitAppSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitAppSettings] (val x: Self) extends AnyVal {
      
      inline def setHomeIcon(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "homeIcon", value.asInstanceOf[js.Any])
      
      inline def setHomeIconUndefined: Self = StObject.set(x, "homeIcon", js.undefined)
      
      inline def setOrientationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "orientationChange", js.Any.fromFunction1(value))
      
      inline def setOrientationChangeUndefined: Self = StObject.set(x, "orientationChange", js.undefined)
    }
  }
}
