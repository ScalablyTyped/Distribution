package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Controls
import typings.openui5.anon.ElementException
import typings.openui5.anon.Exception
import typings.openui5.anon.Name
import typings.openui5.anon.Url
import typings.openui5.sapUiCoreConfigurationMod.Configuration
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreCoreMod extends Shortcut {
  
  @JSImport("sap/ui/core/Core", JSImport.Default)
  @js.native
  val default: Core = js.native
  
  /**
    * Core Class of the SAP UI Library.
    *
    * This class boots the Core framework and makes it available for the application via method `sap.ui.getCore()`.
    *
    * Example:
    * ```javascript
    *
    *
    *   var oCore = sap.ui.getCore();
    *
    * ```
    *
    *
    * With methods of the Core framework you can {@link #attachInit execute code} after the framework has been
    * initialized. It provides access to the {@link #getConfiguration configuration} and exposes events that
    * an application or a control can register to (e.g. {@link #event:localizationChanged localizationChanged},
    * {@link #event:parseError parseError}, {@link #event:validationError validationError}, {@link #event:formatError
    * formatError}, {@link #event:validationSuccess validationSuccess}).
    *
    * Example:
    * ```javascript
    *
    *
    *   oCore.attachInit(function() {
    *     if ( oCore.getConfiguration().getRTL() ) {
    *       ...
    *     }
    *   });
    *
    *   oCore.attachLocalizationChanged(function(oEvent) {
    *     ...
    *   });
    *
    * ```
    */
  @js.native
  trait Core extends StObject {
    
    /**
      * Enforces an immediate update of the visible UI (aka "rendering").
      *
      * In general, applications should avoid calling this method and instead let the framework manage any necessary
      * rendering.
      */
    def applyChanges(): Unit = js.native
    
    /**
      * Applies the theme with the given name (by loading the respective style sheets, which does not disrupt
      * the application).
      *
      * By default, the theme files are expected to be located at path relative to the respective control library
      * ([libraryLocation]/themes/[themeName]). Different locations can be configured by using the method setThemePath()
      * or by using the second parameter "sThemeBaseUrl" of applyTheme(). Usage of this second parameter is a
      * shorthand for setThemePath and internally calls setThemePath, so the theme location is then known.
      *
      * sThemeBaseUrl is a single URL to specify the default location of all theme files. This URL is the base
      * folder below which the control library folders are located. E.g. if the CSS files are not located relative
      * to the root location of UI5, but instead they are at locations like http://my.server/myapp/resources/sap/ui/core/themes/my_theme/library.css
      * then the URL that needs to be given is: http://my.server/myapp/resources All theme resources are then
      * loaded from below this folder - except if for a certain library a different location has been registered.
      *
      * If the theme resources are not all either below this base location or with their respective libraries,
      * then setThemePath must be used to configure individual locations.
      */
    def applyTheme(/**
      * the name of the theme to be loaded
      */
    sThemeName: String): Unit = js.native
    def applyTheme(
      /**
      * the name of the theme to be loaded
      */
    sThemeName: String,
      /**
      * the (optional) base location of the theme
      */
    sThemeBaseUrl: String
    ): Unit = js.native
    
    /**
      * Registers a listener for control events.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      */
    def attachControlEvent(/**
      * Callback to be called for each control event
      */
    fnFunction: js.Function): Unit = js.native
    def attachControlEvent(
      /**
      * Callback to be called for each control event
      */
    fnFunction: js.Function,
      /**
      * Optional context object to call the callback on
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:formatError formatError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFormatError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachFormatError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:formatError formatError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFormatError(
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachFormatError(
      /**
      * An object that will be passed to the handler along with the event object when the event is fired
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.13.2
      *
      * Registers a given function that is executed after the framework has been initialized.
      *
      * The given function will either be called as soon as the framework has been initialized or, if it has
      * been initialized already, it will be called immediately.
      *
      * More information about the initialization process and the steps it consists of can be found in the documentation
      * topic "{@link topic:91f2c9076f4d1014b6dd926db0e91070 Initialization Process}".
      */
    def attachInit(/**
      * Function to be after initialization of the framework
      */
    fnFunction: js.Function): Unit = js.native
    
    /**
      * @deprecated (since 1.13.2) - Register with the more convenient {@link #attachInit} function instead
      *
      * Registers a given function that is executed after the framework has been initialized.
      *
      * The method is executed only once and only if the framework has not been initialized already. This could
      * be checked by calling {@link #isInitialized}, but in most cases it is more convenient to use {@link #attachInit}
      * instead. This guarantees that the given function is executed exactly once, independent of the state of
      * the framework.
      */
    def attachInitEvent(/**
      * Function that is called after initialization of the framework
      */
    fnFunction: js.Function): Unit = js.native
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.61) - Use `IntervalTrigger.addListener()` from "sap/ui/core/IntervalTrigger" module.
      *
      * Registers a listener to the central interval timer.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to the interval timer instance.
      */
    def attachIntervalTimer(/**
      * Callback to be called periodically
      */
    fnFunction: js.Function): Unit = js.native
    def attachIntervalTimer(
      /**
      * Callback to be called periodically
      */
    fnFunction: js.Function,
      /**
      * Optional context object to call the callback on
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Register a listener for the {@link #event:localizationChanged localizationChanged} event.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      */
    def attachLocalizationChanged(/**
      * Callback to be called when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachLocalizationChanged(
      /**
      * Callback to be called when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the function on
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachParseError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachParseError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachParseError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachParseError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:ThemeChanged ThemeChanged} event of this `sap.ui.core.Core`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to a dummy event provider object.
      */
    def attachThemeChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def attachThemeChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validationError validationError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidationError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachValidationError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validationError validationError} event of `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidationError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachValidationError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validationSuccess validationSuccess} event of
      * `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidationSuccess(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachValidationSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:validationSuccess validationSuccess} event of
      * `sap.ui.core.Core`.
      *
      * When called, the context of the listener (its `this`) will be bound to `oListener` if specified, otherwise
      * it will be bound to a dummy event provider object.
      *
      * Please note that this event is a bubbling event and may already be canceled before reaching the core.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachValidationSuccess(
      /**
      * The object, that should be passed along with the event-object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachValidationSuccess(
      /**
      * The object, that should be passed along with the event-object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Returns a list of all controls with a field group ID. See {@link sap.ui.core.Control#checkFieldGroupIds
      * Control.prototype.checkFieldGroupIds} for a description of the `vFieldGroupIds` parameter.
      *
      * @returns The list of controls with matching field group IDs
      */
    def byFieldGroupId(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    def byFieldGroupId(/**
      * ID of the field group or an array of field group IDs to match
      */
    vFieldGroupIds: String): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    def byFieldGroupId(
      /**
      * ID of the field group or an array of field group IDs to match
      */
    vFieldGroupIds: js.Array[String]
    ): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Returns the registered element with the given ID, if any.
      *
      * The ID must be the globally unique ID of an element, the same as returned by `oElement.getId()`.
      *
      * When the element has been created from a declarative source (e.g. XMLView), that source might have used
      * a shorter, non-unique local ID. A search for such a local ID cannot be executed with this method. It
      * can only be executed on the corresponding scope (e.g. on an XMLView instance), by using the {@link sap.ui.core.mvc.View#byId
      * View#byId} method of that scope.
      *
      * @returns Element with the given ID or `undefined`
      */
    def byId(): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    def byId(/**
      * ID of the element to search for
      */
    sId: ID): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * @deprecated (since 1.95) - Please use {@link sap.ui.core.Component.create Component.create} instead.
      *
      * Creates a component with the provided id and settings.
      *
      * When the optional parameter `sUrl` is given, then all request for resources of the library will be redirected
      * to the given URL. This is convenience for a call to
      * ```javascript
      *
      *   sap.ui.loader.config({
      *       paths: {
      *         "lib/with/slashes": vUrl
      *       }
      *   });
      * ```
      *
      *
      * @returns The created component instance or a promise on it in the async use case
      */
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: String,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: Unit,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: String,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: String,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: Unit,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: String,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: String,
      /**
      * the ID for the component instance
      */
    sId: Unit,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: String
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: String,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    def createComponent(
      /**
      * name of the component to import or object containing all needed parameters
      */
    vComponent: Name,
      /**
      * the URL to load the component from
      */
    sUrl: Unit,
      /**
      * the ID for the component instance
      */
    sId: Unit,
      /**
      * the settings object for the component
      */
    mSettings: js.Object
    ): typings.openui5.sapUiCoreComponentMod.default | js.Promise[typings.openui5.sapUiCoreComponentMod.default] = js.native
    
    /**
      * Returns a new instance of the RenderManager for exclusive use by the caller.
      *
      * The caller must take care to destroy the render manager when it is no longer needed. Calling this method
      * before the Core has been {@link #isInitialized initialized}, is not recommended.
      *
      * @returns New instance of the RenderManager
      */
    def createRenderManager(): typings.openui5.sapUiCoreRenderManagerMod.default = js.native
    
    /**
      * @deprecated (since 1.1) - use {@link sap.ui.core.Control#placeAt Control#placeAt} instead!
      *
      * Creates a new {@link sap.ui.core.UIArea UIArea}.
      *
      * @returns a new UIArea
      */
    def createUIArea(/**
      * a DOM Element or ID string of the UIArea
      */
    oDomRef: String): typings.openui5.sapUiCoreUiareaMod.default = js.native
    def createUIArea(/**
      * a DOM Element or ID string of the UIArea
      */
    oDomRef: Element): typings.openui5.sapUiCoreUiareaMod.default = js.native
    
    /**
      * Unregisters a listener for control events.
      *
      * The passed function and listener object must match the ones used for event registration.
      */
    def detachControlEvent(/**
      * Function to unregister
      */
    fnFunction: js.Function): Unit = js.native
    def detachControlEvent(
      /**
      * Function to unregister
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:formatError formatError} event of `sap.ui.core.Core`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFormatError(/**
      * The callback function to unregister
      */
    fnFunction: js.Function): this.type = js.native
    def detachFormatError(
      /**
      * The callback function to unregister
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      * @deprecated (since 1.61) - Use `IntervalTrigger.removeListener()` from "sap/ui/core/IntervalTrigger"
      * module.
      *
      * Unregisters a listener for the central interval timer.
      *
      * A listener will only be unregistered if the same function/context combination is given as in the `attachIntervalTimer`
      * call.
      */
    def detachIntervalTimer(/**
      * function to unregister
      */
    fnFunction: js.Function): Unit = js.native
    def detachIntervalTimer(
      /**
      * function to unregister
      */
    fnFunction: js.Function,
      /**
      * context object given during registration
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Unregister a listener from the {@link #event:localizationChanged localizationChanged} event.
      *
      * The listener will only be unregistered if the same function/context combination is given as in the call
      * to `attachLocalizationListener`.
      */
    def detachLocalizationChanged(/**
      * Callback to be deregistered
      */
    fnFunction: js.Function): Unit = js.native
    def detachLocalizationChanged(
      /**
      * Callback to be deregistered
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:parseError parseError} event of `sap.ui.core.Core`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachParseError(/**
      * The callback function to unregister.
      */
    fnFunction: js.Function): this.type = js.native
    def detachParseError(
      /**
      * The callback function to unregister.
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:ThemeChanged ThemeChanged} event of this `sap.ui.core.Core`.
      *
      * The passed function and listener object must match the ones used for event registration.
      */
    def detachThemeChanged(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachThemeChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which the given function had to be called.
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:validationError validationError} event of
      * `sap.ui.core.Core`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValidationError(/**
      * The callback function to unregister
      */
    fnFunction: js.Function): this.type = js.native
    def detachValidationError(
      /**
      * The callback function to unregister
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:validationSuccess validationSuccess} event
      * of `sap.ui.core.Core`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachValidationSuccess(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachValidationSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Core with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    def extend(/**
      * Name of the class being created
      */
    sClassName: String): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object
    ): js.Function = js.native
    def extend(
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: js.Object,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = js.native
    def extend(
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
    ): js.Function = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:formatError formatError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFormatError(): this.type = js.native
    def fireFormatError(/**
      * Parameters to pass along with the event.
      */
    oParameters: Exception): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:parseError parseError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireParseError(): this.type = js.native
    def fireParseError(/**
      * Parameters to pass along with the event.
      */
    oParameters: ElementException): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:validationError validationError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValidationError(): this.type = js.native
    def fireValidationError(/**
      * Parameters to pass along with the event.
      */
    oParameters: ElementException): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:validationSuccess validationSuccess} to attached listeners.
      *
      * Expects following event parameters:
      * 	 - 'element' of type `sap.ui.core.Element`
      * 	 - 'property' of type `string`
      * 	 - 'type' of type `string`
      * 	 - 'newValue' of type `object`
      * 	 - 'oldValue' of type `object`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireValidationSuccess(): this.type = js.native
    def fireValidationSuccess(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.15.1) - The Component class is enhanced to take care about the Application code.
      *
      * Returns the instance of the application (if exists).
      *
      * @returns instance of the current application
      */
    def getApplication(): typings.openui5.sapUiAppApplicationMod.default = js.native
    
    /**
      * @deprecated (since 1.95) - Please use {@link sap.ui.core.Component.get Component.get} instead.
      *
      * Returns the registered component for the given id, if any.
      *
      * @returns the component for the given id
      */
    def getComponent(sId: String): typings.openui5.sapUiCoreComponentMod.default = js.native
    
    /**
      * Returns the Configuration of the Core.
      *
      * @returns the Configuration of the current Core.
      */
    def getConfiguration(): Configuration = js.native
    
    /**
      * @deprecated (since 1.1) - use `sap.ui.core.Core.byId` instead!
      *
      * Returns the registered element for the given ID, if any.
      *
      * @returns Element for the given ID or `undefined`
      */
    def getControl(): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    def getControl(/**
      * ID of the control to retrieve
      */
    sId: ID): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Returns the Id of the control/element currently in focus.
      *
      * @returns the Id of the control/element currently in focus.
      */
    def getCurrentFocusedControlId(): String = js.native
    
    /**
      * @deprecated (since 1.1) - use `sap.ui.core.Core.byId` instead!
      *
      * Returns the registered element for the given ID, if any.
      *
      * @returns Element for the given ID or `undefined`
      */
    def getElementById(): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    def getElementById(/**
      * ID of the element to retrieve
      */
    sId: ID): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * @SINCE 1.8.0
      *
      * Returns the event bus.
      *
      * @returns the event bus
      */
    def getEventBus(): typings.openui5.sapUiCoreEventBusMod.default = js.native
    
    /**
      * Retrieves a resource bundle for the given library and locale.
      *
      * If only one argument is given, it is assumed to be the libraryName. The locale then falls back to the
      * current {@link sap.ui.core.Configuration#getLanguage session locale}. If no argument is given, the library
      * also falls back to a default: "sap.ui.core".
      *
      * Configuration via App Descriptor: When the App Descriptor for the library is available without further
      * request (manifest.json has been preloaded) and when the App Descriptor is at least of version 1.9.0 or
      * higher, then this method will evaluate the App Descriptor entry `"sap.ui5" / "library" / "i18n"`.
      *
      * 	 - When the entry is `true`, a bundle with the default name "messagebundle.properties" will be loaded
      *
      * 	 - If it is a string, then that string will be used as name of the bundle
      * 	 - If it is `false`, no bundle will be loaded and the result will be `undefined`
      *
      * Caching: Once a resource bundle for a library has been loaded, it will be cached by this method. Further
      * calls for the same library and locale won't create new requests, but return the already loaded bundle.
      * There's therefore no need for control code to cache the returned bundle for a longer period of time.
      * Not further caching the result also prevents stale texts after a locale change.
      *
      * Asynchronous Loading: The asynchronous variant of {@link #loadLibrary} will evaluate the same descriptor
      * entry as described above. If it is not `false`, loading the main resource bundle of the library will
      * become a subtask of the asynchronous loading of the library.
      *
      * Due to this preload of the main bundle and the caching behavior of this method, controls in such a library
      * still can use the synchronous variant of `getLibraryResourceBundle` in their API, behavior and rendering
      * code. Only when the bundle is needed at module execution time (by top level code in a control module),
      * then the asynchronous variant of this method should be preferred.
      *
      * @returns The best matching resource bundle for the given parameters or `undefined`; in asynchronous case
      * a Promise on that bundle is returned
      */
    def getLibraryResourceBundle(): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(/**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: String): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: String,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: String,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: String
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: String,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: String,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: String,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: Unit,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: Unit,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: Unit,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: String
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: Unit,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: String,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    def getLibraryResourceBundle(
      /**
      * Name of the library to retrieve the bundle for
      */
    sLibraryName: Unit,
      /**
      * Locale to retrieve the resource bundle for
      */
    sLocale: Unit,
      /**
      * Whether the resource bundle is loaded asynchronously
      */
    bAsync: Boolean
    ): js.UndefOr[
        typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[js.UndefOr[typings.openui5.sapBaseI18nResourceBundleMod.default]]
      ] = js.native
    
    /**
      * Returns a map of library info objects for all currently loaded libraries, keyed by their names.
      *
      * The structure of the library info objects matches the structure of the info object that the {@link #initLibrary}
      * method expects. Only property names documented with `initLibrary` should be accessed, any additional
      * properties might change or disappear in future. When a property does not exists, its default value (as
      * documented with `initLibrary`) should be assumed.
      *
      * **Note:** The returned info objects must not be modified. They might be a living copy of the internal
      * data (for efficiency reasons) and the framework is not prepared to handle modifications to these objects.
      *
      * @returns Map of library info objects keyed by the library names.
      */
    def getLoadedLibraries(): Record[String, js.Object] = js.native
    
    /**
      * @SINCE 1.33.0
      *
      * Returns the active `MessageManager` instance.
      */
    def getMessageManager(): typings.openui5.sapUiCoreMessageMessageManagerMod.default = js.native
    
    /**
      * Returns a metadata object for class sap.ui.core.Core.
      *
      * @returns Metadata object describing this class
      */
    def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = js.native
    
    /**
      * Get the model with the given model name.
      *
      * The name can be omitted to reference the default model or it must be a non-empty string.
      *
      * Note: to be compatible with future versions of this API, applications must not use the value `null`,
      * the empty string `""` or the string literals `"null"` or `"undefined"` as model name.
      *
      * @returns oModel
      */
    def getModel(): typings.openui5.sapUiModelModelMod.default = js.native
    def getModel(/**
      * name of the model to be retrieved
      */
    sName: String): typings.openui5.sapUiModelModelMod.default = js.native
    
    /**
      * @deprecated (since 0.15.0) - Replaced by `createRenderManager()`
      *
      * Creates a new `RenderManager` instance for use by the caller.
      *
      * @returns A newly createdRenderManeger
      */
    def getRenderManager(): typings.openui5.sapUiCoreRenderManagerMod.default = js.native
    
    /**
      * @deprecated (since 1.95) - Please use {@link module:sap/ui/core/ComponentSupport} instead. See also {@link
      * topic:82a0fcecc3cb427c91469bc537ebdddf Declarative API for Initial Components}.
      *
      * Returns the instance of the root component (if exists).
      *
      * @returns instance of the current root component
      */
    def getRootComponent(): typings.openui5.sapUiCoreComponentMod.default = js.native
    
    /**
      * Returns the static, hidden area DOM element belonging to this core instance.
      *
      * It can be used e.g. for hiding elements like Popups, Shadow, Blocklayer etc.
      *
      * If it is not yet available, a DIV is created and appended to the body.
      *
      * @returns the static, hidden area DOM element belonging to this core instance.
      */
    def getStaticAreaRef(): Element = js.native
    
    /**
      * @deprecated (since 1.29.1) - Require 'sap/ui/core/tmpl/Template' and use {@link sap.ui.core.tmpl.Template.byId
      * Template.byId} instead.
      *
      * Returns the registered template for the given id, if any.
      *
      * @returns the template for the given id
      */
    def getTemplate(sId: String): typings.openui5.sapUiCoreComponentMod.default = js.native
    
    /**
      * @deprecated (since 1.107) - use {@link sap.ui.core.UIArea.registry#get UIArea.registry#get} instead,
      * but note that `UIArea.registry.get` only accepts the ID of the UIArea as argument.
      *
      * Returns the {@link sap.ui.core.UIArea UIArea} with the given ID or that belongs to the given DOM element.
      *
      * @returns UIArea with the given ID or DOM element or `null` or `undefined`.
      */
    def getUIArea(/**
      * DOM element or ID of the UIArea
      */
    o: String): js.UndefOr[typings.openui5.sapUiCoreUiareaMod.default | Null] = js.native
    def getUIArea(/**
      * DOM element or ID of the UIArea
      */
    o: Element): js.UndefOr[typings.openui5.sapUiCoreUiareaMod.default | Null] = js.native
    
    /**
      * Returns `true` if there are any pending rendering tasks or when such rendering tasks are currently being
      * executed.
      *
      * @returns true if there are pending (or executing) rendering tasks.
      */
    def getUIDirty(): Boolean = js.native
    
    /**
      * Check if a Model is set to the core
      *
      * @returns true or false
      */
    def hasModel(): Boolean = js.native
    
    /**
      * Includes a library theme into the current page (if a variant is specified it will include the variant
      * library theme)
      */
    def includeLibraryTheme(/**
      * the name of the UI library
      */
    sLibName: String): Unit = js.native
    def includeLibraryTheme(
      /**
      * the name of the UI library
      */
    sLibName: String,
      /**
      * the variant to include (optional)
      */
    sVariant: String
    ): Unit = js.native
    def includeLibraryTheme(
      /**
      * the name of the UI library
      */
    sLibName: String,
      /**
      * the variant to include (optional)
      */
    sVariant: String,
      /**
      * to be used only by the Core
      */
    sQuery: String
    ): Unit = js.native
    def includeLibraryTheme(
      /**
      * the name of the UI library
      */
    sLibName: String,
      /**
      * the variant to include (optional)
      */
    sVariant: Unit,
      /**
      * to be used only by the Core
      */
    sQuery: String
    ): Unit = js.native
    
    /**
      * Provides the framework with information about a library.
      *
      * This method is intended to be called exactly once while the main module of a library (its `library.js`
      * module) is executing, typically at its begin. The single parameter `oLibInfo` is an info object that
      * describes the content of the library.
      *
      * When the `oLibInfo` has been processed, a normalized version of it will be kept and will be returned
      * as library information in later calls to {@link #getLoadedLibraries}. Finally, `initLibrary` fires (the
      * currently private) {@link #event:LibraryChanged} event with operation 'add' for the newly loaded library.
      *
      * Side Effects:
      *
      * While analyzing the `oLibInfo`, the framework takes some additional actions:
      *
      *
      * 	 - If the info object contains a list of `interfaces`, they will be registered with the {@link sap.ui.base.DataType}
      * 			class to make them available as aggregation types in managed objects.
      *
      *
      * 	 - If the object contains a list of `controls` or `elements`, {@link sap.ui.lazyRequire lazy stubs}
      * 			will be created for their constructor as well as for their static `extend` and `getMetadata` methods.
      *  **Note:** Future versions might abandon the concept of lazy stubs as it requires synchronous XMLHttpRequests
      * which have been deprecated (see {@link http://xhr.spec.whatwg.org}). To be on the safe side, productive
      * applications should always require any modules that they directly depend on.
      *
      *
      * 	 - With the `noLibraryCSS` property, the library can be marked as 'theming-free'. Otherwise, the framework
      * 			will add a <link> tag to the page's head, pointing to the library's theme-specific stylesheet.
      * 			The creation of such a <link> tag can be suppressed with the {@link sap.ui.core.Configuration global
      * 			configuration option} `preloadLibCss`. It can contain a list of library names for which no stylesheet
      * 			should be included. This is e.g. useful when an application merges the CSS for multiple libraries and
      * 			already loaded the resulting stylesheet.
      *
      *
      * 	 - If a list of library `dependencies` is specified in the info object, those libraries will be loaded
      * 			synchronously by `initLibrary`.
      *  **Note:** Dependencies between libraries don't have to be modeled as AMD dependencies. Only when enums
      * or types from an additional library are used in the coding of the `library.js` module, the library should
      * be additionally listed in the AMD dependencies.
      *
      * Last but not least, higher layer frameworks might want to include their own metadata for libraries. The
      * property `extensions` might contain such additional metadata. Its structure is not defined by the framework,
      * but it is strongly suggested that each extension only occupies a single property in the `extensions`
      * object and that the name of that property contains some namespace information (e.g. library name that
      * introduces the feature) to avoid conflicts with other extensions. The framework won't touch the content
      * of `extensions` but will make it available in the library info objects returned by {@link #getLoadedLibraries}.
      *
      * Relationship to Descriptor for Libraries (manifest.json):
      *
      * The information contained in `oLibInfo` is partially redundant to the content of the descriptor for the
      * same library (its `manifest.json` file). Future versions of UI5 might ignore the information provided
      * in `oLibInfo` and might evaluate the descriptor file instead. Library developers therefore should keep
      * the information in both files in sync.
      *
      * When the `manifest.json` is generated from the `.library` file (which is the default for UI5 libraries
      * built with Maven), then the content of the `.library` and `library.js` files must be kept in sync.
      *
      * @returns As of version 1.101; returns the library namespace, based on the given library name. Returns
      * 'undefined' if no library name is provided.
      */
    def initLibrary(/**
      * Info object for the library
      */
    oLibInfo: Controls): js.UndefOr[js.Object] = js.native
    
    /**
      * Returns true if the Core has already been initialized. This means that instances of RenderManager etc.
      * do already exist and the init event has already been fired (and will not be fired again).
      *
      * @returns whether the Core has already been initialized
      */
    def isInitialized(): Boolean = js.native
    
    /**
      * Returns the locked state of the `sap.ui.core.Core`
      *
      * @returns locked state
      */
    def isLocked(): Boolean = js.native
    
    /**
      * Check if the script is running on mobile
      *
      * @returns true or false
      */
    def isMobile(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Checks whether the given DOM element is the root of the static area.
      *
      * @returns Whether the given DOM element is the root of the static area
      */
    def isStaticAreaRef(/**
      * DOM element to check
      */
    oDomRef: Element): Boolean = js.native
    
    /**
      * Returns true, if the styles of the current theme are already applied, false otherwise.
      *
      * This function must not be used before the init event of the Core. If the styles are not yet applied a
      * theme changed event will follow when the styles will be applied.
      *
      * @returns whether the styles of the current theme are already applied
      */
    def isThemeApplied(): Boolean = js.native
    
    /**
      * Loads the given library and its dependencies and makes its content available to the application.
      *
      * What it does:
      *
      * When library preloads are not suppressed for the given library, then a library-preload bundle will be
      * loaded for it. By default, the bundle will be loaded synchronously (for compatibility reasons). Only
      * when the optional parameter `vUrl` is given as `true` or as a configuration object with a property of
      * `async:true`, then the bundle will be loaded asynchronously and a `Promise` will be returned (preferred
      * usage).
      *
      * After preloading the bundle, dependency information from the bundle is evaluated and any missing libraries
      * are also preloaded.
      *
      * Only then the library entry module (named `your/lib/library.js`) will be required and executed.
      * The module is supposed to call `sap.ui.getCore().initLibrary(...)` providing the framework with additional
      * metadata about the library, e.g. its version, the set of contained enums, types, interfaces, controls
      * and elements and whether the library requires CSS. If the library requires CSS, a <link> will be
      * added to the page referring to the corresponding `library.css` stylesheet for the library and the current
      * theme.
      *
      * When the optional parameter `vUrl` is given as a string or when a configuration object is given with
      * a non-empty, string-valued property `url`, then that URL will be registered for the namespace of the
      * library and all resources will be loaded from that location. This is convenience for a call like
      * ```javascript
      *
      *   sap.ui.loader.config({
      *     paths: {
      *       "lib/with/slashes": vUrl
      *     }
      *   });
      * ```
      *
      *
      * When the given library has been loaded already, no further action will be taken, especially, a given
      * URL will not be registered! In the case of asynchronous loading, a Promise will be returned, but will
      * be resolved immediately.
      *
      * When to use:
      *
      * For applications that follow the best practices and use components with component descriptors (manifest.json),
      * the framework will load all declared mandatory libraries and their dependencies automatically before
      * instantiating the application component.
      *
      * The same is true for libraries that are listed in the bootstrap configuration (e.g. with the attribute
      * `data-sap-ui-libs`). They will be loaded before the `init` event of the UI5 Core is fired.
      *
      * Only when an app declares a library to be a lazy library dependency or when code does not use descriptors
      * at all, then an explicit call to `loadLibrary` becomes necessary. The call should be made before artifacts
      * (controls, elements, types, helpers, modules etc.) from the library are used or required. This allows
      * the framework to optimize access to those artifacts.
      *
      * For example, when an app uses a heavy-weight charting library that shouldn't be loaded during startup,
      * it can declare it as "lazy" and load it just before it loads and displays a view that uses the charting
      * library:
      * ```javascript
      *
      *   sap.ui.getCore().loadLibrary("heavy.charting", {async: true})
      *     .then(function() {
      *       View.create({
      *         name: "myapp.views.HeavyChartingView",
      *         type: ViewType.XML
      *       });
      *     });
      * ```
      *
      *
      * @returns An info object for the library (sync) or a Promise on it (async).
      */
    def loadLibrary(/**
      * Name of the library to load
      */
    sLibrary: String): js.Object | js.Promise[js.Object] = js.native
    def loadLibrary(
      /**
      * Name of the library to load
      */
    sLibrary: String,
      /**
      * URL to load the library from or the async flag or a complex configuration object
      */
    vUrl: String
    ): js.Object | js.Promise[js.Object] = js.native
    def loadLibrary(
      /**
      * Name of the library to load
      */
    sLibrary: String,
      /**
      * URL to load the library from or the async flag or a complex configuration object
      */
    vUrl: Boolean
    ): js.Object | js.Promise[js.Object] = js.native
    def loadLibrary(
      /**
      * Name of the library to load
      */
    sLibrary: String,
      /**
      * URL to load the library from or the async flag or a complex configuration object
      */
    vUrl: Url
    ): js.Object | js.Promise[js.Object] = js.native
    
    /**
      * Locks the Core. No browser events are dispatched to the controls.
      *
      * Lock should be called before and after the DOM is modified for rendering, roundtrips... Exceptions might
      * be the case for asynchronous UI behavior
      */
    def lock(): Unit = js.native
    
    /**
      * Triggers a realignment of controls
      *
      * This method should be called after changing the cozy/compact CSS class of a DOM element at runtime, for
      * example at the `<body>` tag. Controls can listen to the themeChanged event to realign their appearance
      * after changing the theme. Changing the cozy/compact CSS class should then also be handled as a theme
      * change. In more simple scenarios where the cozy/compact CSS class is added to a DOM element which contains
      * only a few controls it might not be necessary to trigger the realigment of all controls placed in the
      * DOM, for example changing the cozy/compact CSS class at a single control
      */
    def notifyContentDensityChanged(): Unit = js.native
    
    /**
      * @deprecated (since 1.73) - Plugins never have been meant as a public offering, but were intended for
      * internal usage only. They unfortunately allow access to all internals of the Core and therefore break
      * encapsulation and hinder evolution of the Core. The most common use case of accessing the set of all
      * controls/elements or all components can now be addressed by using the APIs {@link sap.ui.core.Element.registry}
      * or {@link sap.ui.core.Component.registry}, respectively. Future refactorings of the Core will only take
      * existing plugins in the OpenUI5 repository into account.
      *
      * Registers a Plugin to the `sap.ui.core.Core`, which lifecycle will be managed (start and stop).
      *
      * Plugin object need to implement two methods:
      * 	 - `startPlugin(oCore)`: will be invoked, when the Plugin should start (as parameter the reference to
      * 			the Core will be provided
      * 	 - `stopPlugin()`: will be invoked, when the Plugin should stop
      */
    def registerPlugin(/**
      * reference to a Plugin object
      */
    oPlugin: js.Object): Unit = js.native
    
    /**
      * Sets or unsets a model for the given model name.
      *
      * The `sName` must either be `undefined` (or omitted) or a non-empty string. When the name is omitted,
      * the default model is set/unset.
      *
      * When `oModel` is `null` or `undefined`, a previously set model with that name is removed from the Core.
      *
      * Any change (new model, removed model) is propagated to all existing UIAreas and their descendants as
      * long as a descendant doesn't have its own model set for the given name.
      *
      * Note: to be compatible with future versions of this API, applications must not use the value `null`,
      * the empty string `""` or the string literals `"null"` or `"undefined"` as model name.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModel(
      /**
      * the model to be set or `null` or `undefined`
      */
    oModel: typings.openui5.sapUiModelModelMod.default
    ): this.type = js.native
    def setModel(
      /**
      * the model to be set or `null` or `undefined`
      */
    oModel: typings.openui5.sapUiModelModelMod.default,
      /**
      * the name of the model or `undefined`
      */
    sName: String
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.1) - use {@link sap.ui.core.Control#placeAt oControl.placeAt(oDomRef, "only")} instead.
      *
      * Implicitly creates a new `UIArea` (or reuses an exiting one) for the given DOM reference and adds the
      * given control reference to the UIAreas content (existing content will be removed).
      */
    def setRoot(
      /**
      * a DOM Element or Id (string) of the UIArea
      */
    oDomRef: String,
      /**
      * the Control that should be the added to the `UIArea`.
      */
    oControl: typings.openui5.sapUiBaseInterfaceMod.default
    ): Unit = js.native
    def setRoot(
      /**
      * a DOM Element or Id (string) of the UIArea
      */
    oDomRef: String,
      /**
      * the Control that should be the added to the `UIArea`.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    def setRoot(
      /**
      * a DOM Element or Id (string) of the UIArea
      */
    oDomRef: Element,
      /**
      * the Control that should be the added to the `UIArea`.
      */
    oControl: typings.openui5.sapUiBaseInterfaceMod.default
    ): Unit = js.native
    def setRoot(
      /**
      * a DOM Element or Id (string) of the UIArea
      */
    oDomRef: Element,
      /**
      * the Control that should be the added to the `UIArea`.
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    
    /**
      * @SINCE 1.10
      *
      * Defines the root directory from below which UI5 should load the theme with the given name. Optionally
      * allows restricting the setting to parts of a theme covering specific control libraries.
      *
      * Example:
      * ```javascript
      *
      *   sap.ui.getCore().setThemeRoot("my_theme", "https://mythemeserver.com/allThemes");
      *   sap.ui.getCore().applyTheme("my_theme");
      * ```
      *
      *
      * will cause the following file to be loaded (assuming that the bootstrap is configured to load libraries
      * `sap.m` and `sap.ui.layout`):
      * ```javascript
      *
      *   https://mythemeserver.com/allThemes/sap/ui/core/themes/my_theme/library.css
      *   https://mythemeserver.com/allThemes/sap/ui/layout/themes/my_theme/library.css
      *   https://mythemeserver.com/allThemes/sap/m/themes/my_theme/library.css
      * ```
      *
      *
      * If parts of the theme are at different locations (e.g. because you provide a standard theme like "sap_belize"
      * for a custom control library and this self-made part of the standard theme is at a different location
      * than the UI5 resources), you can also specify for which control libraries the setting should be used,
      * by giving an array with the names of the respective control libraries as second parameter:
      * ```javascript
      *
      *   sap.ui.getCore().setThemeRoot("sap_belize", ["my.own.library"], "https://mythemeserver.com/allThemes");
      * ```
      *
      *
      * This will cause the Belize theme to be loaded from the UI5 location for all standard libraries. Resources
      * for styling the `my.own.library` controls will be loaded from the configured location:
      * ```javascript
      *
      *   https://sdk.openui5.org/resources/sap/ui/core/themes/sap_belize/library.css
      *   https://sdk.openui5.org/resources/sap/ui/layout/themes/sap_belize/library.css
      *   https://sdk.openui5.org/resources/sap/m/themes/sap_belize/library.css
      *   https://mythemeserver.com/allThemes/my/own/library/themes/sap_belize/library.css
      * ```
      *
      *
      * If the custom theme should be loaded initially (via bootstrap attribute), the `themeRoots` property of
      * the `window["sap-ui-config"]` object must be used instead of calling `sap.ui.getCore().setThemeRoot(...)`
      * in order to configure the theme location early enough.
      *
      * @returns the Core, to allow method chaining
      */
    def setThemeRoot(
      /**
      * Name of the theme for which to configure the location
      */
    sThemeName: String,
      /**
      * Optional library names to which the configuration should be restricted
      */
    aLibraryNames: js.Array[String],
      /**
      * Base URL below which the CSS file(s) will be loaded from
      */
    sThemeBaseUrl: String
    ): this.type = js.native
    def setThemeRoot(
      /**
      * Name of the theme for which to configure the location
      */
    sThemeName: String,
      /**
      * Optional library names to which the configuration should be restricted
      */
    aLibraryNames: js.Array[String],
      /**
      * Base URL below which the CSS file(s) will be loaded from
      */
    sThemeBaseUrl: String,
      /**
      * Force updating URLs of currently loaded theme
      */
    bForceUpdate: Boolean
    ): this.type = js.native
    /**
      * @SINCE 1.10
      *
      * Defines the root directory from below which UI5 should load the theme with the given name. Optionally
      * allows restricting the setting to parts of a theme covering specific control libraries.
      *
      * Example:
      * ```javascript
      *
      *   sap.ui.getCore().setThemeRoot("my_theme", "https://mythemeserver.com/allThemes");
      *   sap.ui.getCore().applyTheme("my_theme");
      * ```
      *
      *
      * will cause the following file to be loaded (assuming that the bootstrap is configured to load libraries
      * `sap.m` and `sap.ui.layout`):
      * ```javascript
      *
      *   https://mythemeserver.com/allThemes/sap/ui/core/themes/my_theme/library.css
      *   https://mythemeserver.com/allThemes/sap/ui/layout/themes/my_theme/library.css
      *   https://mythemeserver.com/allThemes/sap/m/themes/my_theme/library.css
      * ```
      *
      *
      * If parts of the theme are at different locations (e.g. because you provide a standard theme like "sap_belize"
      * for a custom control library and this self-made part of the standard theme is at a different location
      * than the UI5 resources), you can also specify for which control libraries the setting should be used,
      * by giving an array with the names of the respective control libraries as second parameter:
      * ```javascript
      *
      *   sap.ui.getCore().setThemeRoot("sap_belize", ["my.own.library"], "https://mythemeserver.com/allThemes");
      * ```
      *
      *
      * This will cause the Belize theme to be loaded from the UI5 location for all standard libraries. Resources
      * for styling the `my.own.library` controls will be loaded from the configured location:
      * ```javascript
      *
      *   https://sdk.openui5.org/resources/sap/ui/core/themes/sap_belize/library.css
      *   https://sdk.openui5.org/resources/sap/ui/layout/themes/sap_belize/library.css
      *   https://sdk.openui5.org/resources/sap/m/themes/sap_belize/library.css
      *   https://mythemeserver.com/allThemes/my/own/library/themes/sap_belize/library.css
      * ```
      *
      *
      * If the custom theme should be loaded initially (via bootstrap attribute), the `themeRoots` property of
      * the `window["sap-ui-config"]` object must be used instead of calling `sap.ui.getCore().setThemeRoot(...)`
      * in order to configure the theme location early enough.
      *
      * @returns the Core, to allow method chaining
      */
    def setThemeRoot(
      /**
      * Name of the theme for which to configure the location
      */
    sThemeName: String,
      /**
      * Base URL below which the CSS file(s) will be loaded from
      */
    sThemeBaseUrl: String
    ): this.type = js.native
    def setThemeRoot(
      /**
      * Name of the theme for which to configure the location
      */
    sThemeName: String,
      /**
      * Base URL below which the CSS file(s) will be loaded from
      */
    sThemeBaseUrl: String,
      /**
      * Force updating URLs of currently loaded theme
      */
    bForceUpdate: Boolean
    ): this.type = js.native
    
    /**
      * Unlocks the Core.
      *
      * Browser events are dispatched to the controls again after this method is called.
      */
    def unlock(): Unit = js.native
    
    /**
      * @deprecated (since 1.73) - Plugins never have been meant as a public offering, but were intended for
      * internal usage only. They unfortunately allow access to all internals of the Core and therefore break
      * encapsulation and hinder evolution of the Core. The most common use case of accessing the set of all
      * controls/elements or all components can now be addressed by using the APIs {@link sap.ui.core.Element.registry}
      * or {@link sap.ui.core.Component.registry}, respectively. Future refactorings of the Core will only take
      * existing plugins in the OpenUI5 repository into account.
      *
      * Unregisters a Plugin out of the `sap.ui.core.Core`
      */
    def unregisterPlugin(/**
      * reference to a Plugin object
      */
    oPlugin: js.Object): Unit = js.native
  }
  
  type _To = Core
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreCoreMod.foo` */
  override def _to: Core = default
}
