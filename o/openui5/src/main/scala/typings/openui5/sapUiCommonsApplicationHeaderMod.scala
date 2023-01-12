package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsApplicationHeaderMod {
  
  @JSImport("sap/ui/commons/ApplicationHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ApplicationHeader.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ApplicationHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ApplicationHeaderSettings) = this()
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
    mSettings: ApplicationHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ApplicationHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ApplicationHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ApplicationHeader with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ApplicationHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ApplicationHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ApplicationHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ApplicationHeader
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logoff logoff} event of this `sap.ui.commons.ApplicationHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ApplicationHeader` itself.
      *
      * Fires an event to log off the user from the application. No parameters.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogoff(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLogoff(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ApplicationHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:logoff logoff} event of this `sap.ui.commons.ApplicationHeader`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.ApplicationHeader` itself.
      *
      * Fires an event to log off the user from the application. No parameters.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLogoff(
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
    def attachLogoff(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.ApplicationHeader` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:logoff logoff} event of this `sap.ui.commons.ApplicationHeader`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLogoff(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLogoff(
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
      * Fires event {@link #event:logoff logoff} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLogoff(): this.type = js.native
    def fireLogoff(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDisplayLogoff displayLogoff}.
      *
      * Determines if the logoff area will be displayed at the right hand side of the application header.
      *
      * Default value is `true`.
      *
      * @returns Value of property `displayLogoff`
      */
    def getDisplayLogoff(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDisplayWelcome displayWelcome}.
      *
      * Determines if the welcome text is displayed
      *
      * Default value is `true`.
      *
      * @returns Value of property `displayWelcome`
      */
    def getDisplayWelcome(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLogoSrc logoSrc}.
      *
      * Path (src) to the logo icon to be displayed in the application header.
      *
      * @returns Value of property `logoSrc`
      */
    def getLogoSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getLogoText logoText}.
      *
      * The text that will be displayed beside the logo in the application header. This property is optional.
      *
      * @returns Value of property `logoText`
      */
    def getLogoText(): String = js.native
    
    /**
      * Gets current value of property {@link #getUserName userName}.
      *
      * User name that will be displayed beside the welcome text
      *
      * @returns Value of property `userName`
      */
    def getUserName(): String = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayLogoff displayLogoff}.
      *
      * Determines if the logoff area will be displayed at the right hand side of the application header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayLogoff(): this.type = js.native
    def setDisplayLogoff(/**
      * New value for property `displayLogoff`
      */
    bDisplayLogoff: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayWelcome displayWelcome}.
      *
      * Determines if the welcome text is displayed
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayWelcome(): this.type = js.native
    def setDisplayWelcome(/**
      * New value for property `displayWelcome`
      */
    bDisplayWelcome: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLogoSrc logoSrc}.
      *
      * Path (src) to the logo icon to be displayed in the application header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLogoSrc(): this.type = js.native
    def setLogoSrc(/**
      * New value for property `logoSrc`
      */
    sLogoSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLogoText logoText}.
      *
      * The text that will be displayed beside the logo in the application header. This property is optional.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLogoText(): this.type = js.native
    def setLogoText(/**
      * New value for property `logoText`
      */
    sLogoText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUserName userName}.
      *
      * User name that will be displayed beside the welcome text
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUserName(): this.type = js.native
    def setUserName(/**
      * New value for property `userName`
      */
    sUserName: String): this.type = js.native
  }
  
  trait ApplicationHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines if the logoff area will be displayed at the right hand side of the application header.
      */
    var displayLogoff: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines if the welcome text is displayed
      */
    var displayWelcome: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Path (src) to the logo icon to be displayed in the application header.
      */
    var logoSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The text that will be displayed beside the logo in the application header. This property is optional.
      */
    var logoText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fires an event to log off the user from the application. No parameters.
      */
    var logoff: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * User name that will be displayed beside the welcome text
      */
    var userName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ApplicationHeaderSettings {
    
    inline def apply(): ApplicationHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationHeaderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplicationHeaderSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayLogoff(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayLogoff", value.asInstanceOf[js.Any])
      
      inline def setDisplayLogoffUndefined: Self = StObject.set(x, "displayLogoff", js.undefined)
      
      inline def setDisplayWelcome(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayWelcome", value.asInstanceOf[js.Any])
      
      inline def setDisplayWelcomeUndefined: Self = StObject.set(x, "displayWelcome", js.undefined)
      
      inline def setLogoSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "logoSrc", value.asInstanceOf[js.Any])
      
      inline def setLogoSrcUndefined: Self = StObject.set(x, "logoSrc", js.undefined)
      
      inline def setLogoText(value: String | PropertyBindingInfo): Self = StObject.set(x, "logoText", value.asInstanceOf[js.Any])
      
      inline def setLogoTextUndefined: Self = StObject.set(x, "logoText", js.undefined)
      
      inline def setLogoff(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "logoff", js.Any.fromFunction1(value))
      
      inline def setLogoffUndefined: Self = StObject.set(x, "logoff", js.undefined)
      
      inline def setUserName(value: String | PropertyBindingInfo): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
}
