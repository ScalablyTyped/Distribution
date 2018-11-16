package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.Core")
@js.native
class Core ()
  extends openui5Lib.sapNs.uiNs.baseNs.Object {
  /**
           * Enforces an immediate update of the visible UI (aka "rendering").In general, applications should
           * avoid calling this method andinstead let the framework manage any necessary rendering.
          */
  def applyChanges(): scala.Unit = js.native
  /**
           * Applies the theme with the given name (by loading the respective style sheets, which does not
           * disrupt the application).By default, the theme files are expected to be located at path relative to
           * the respective control library ([libraryLocation]/themes/[themeName]).Different locations can be
           * configured by using the method setThemePath() or by using the second parameter "sThemeBaseUrl" of
           * applyTheme().Usage of this second parameter is a shorthand for setThemePath and internally calls
           * setThemePath, so the theme location is then known.sThemeBaseUrl is a single URL to specify the
           * default location of all theme files. This URL is the base folder below which the control library
           * foldersare located. E.g. if the CSS files are not located relative to the root location of UI5, but
           * instead they are at locations like  
           * http://my.server/myapp/resources/sap/ui/core/themes/my_theme/library.cssthen the URL that needs to
           * be given is:   http://my.server/myapp/resourcesAll theme resources are then loaded from below this
           * folder - except if for a certain library a different location has been registered.If the theme
           * resources are not all either below this base location or  with their respective libraries, then
           * setThemePath must beused to configure individual locations.
           * @param sThemeName the name of the theme to be loaded
           * @param sThemeBaseUrl the (optional) base location of the theme
          */
  def applyTheme(sThemeName: java.lang.String): scala.Unit = js.native
  /**
           * Applies the theme with the given name (by loading the respective style sheets, which does not
           * disrupt the application).By default, the theme files are expected to be located at path relative to
           * the respective control library ([libraryLocation]/themes/[themeName]).Different locations can be
           * configured by using the method setThemePath() or by using the second parameter "sThemeBaseUrl" of
           * applyTheme().Usage of this second parameter is a shorthand for setThemePath and internally calls
           * setThemePath, so the theme location is then known.sThemeBaseUrl is a single URL to specify the
           * default location of all theme files. This URL is the base folder below which the control library
           * foldersare located. E.g. if the CSS files are not located relative to the root location of UI5, but
           * instead they are at locations like  
           * http://my.server/myapp/resources/sap/ui/core/themes/my_theme/library.cssthen the URL that needs to
           * be given is:   http://my.server/myapp/resourcesAll theme resources are then loaded from below this
           * folder - except if for a certain library a different location has been registered.If the theme
           * resources are not all either below this base location or  with their respective libraries, then
           * setThemePath must beused to configure individual locations.
           * @param sThemeName the name of the theme to be loaded
           * @param sThemeBaseUrl the (optional) base location of the theme
          */
  def applyTheme(sThemeName: java.lang.String, sThemeBaseUrl: java.lang.String): scala.Unit = js.native
  /**
           * Registers a listener for control events.
           * @param fnFunction callback to be called for each control event
           * @param oListener optional context object to call the callback on.
          */
  def attachControlEvent(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Registers a listener for control events.
           * @param fnFunction callback to be called for each control event
           * @param oListener optional context object to call the callback on.
          */
  def attachControlEvent(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'formatError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachFormatError(fnFunction: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'formatError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachFormatError(fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Attaches a given function to the <code>initEvent</code> event of the core.The given callback
           * function will either be called once the Core has been initializedor, if it has been initialized
           * already, it will be called immediately.
           * @since 1.13.2
           * @param fnFunction the callback function to be called on event firing.
          */
  def attachInit(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Attaches a given function to the <code>initEvent</code> event of the core.This event will only be
           * fired once; you can check if it has been fired alreadyby calling {@link #isInitialized}.
           * @param fnFunction the function to be called on event firing.
          */
  def attachInitEvent(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Registers a listener to the central interval timer.
           * @since 1.16.0
           * @param fnFunction callback to be called periodically
           * @param oListener optional context object to call the callback on.
          */
  def attachIntervalTimer(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Registers a listener to the central interval timer.
           * @since 1.16.0
           * @param fnFunction callback to be called periodically
           * @param oListener optional context object to call the callback on.
          */
  def attachIntervalTimer(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Register a listener for the <code>localizationChanged</code> event.
           * @param fnFunction callback to be called
           * @param oListener context object to cal lthe function on.
          */
  def attachLocalizationChanged(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'parseError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachParseError(oData: js.Any, fnFunction: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'parseError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachParseError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'validationError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachValidationError(oData: js.Any, fnFunction: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'validationError' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachValidationError(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'validationSuccess' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachValidationSuccess(oData: js.Any, fnFunction: js.Any): Core = js.native
  /**
           * Attach event-handler <code>fnFunction</code> to the 'validationSuccess' event of
           * <code>sap.ui.core.Core</code>.<br/>Please note that this event is a bubbling event and may already
           * be canceled before reaching the core.<br/>
           * @param oData The object, that should be passed along with the event-object when firing the event
           * @param fnFunction The function to call, when the event occurs. This function will be called on the  
           *         oListener-instance (if present) or in a 'static way'.
           * @param oListener Object on which to call the given function. If empty, this Model is used.
           * @returns <code>this</code> to allow method chaining
          */
  def attachValidationSuccess(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Returns a list of all controls with a field group ID.See {@link
           * sap.ui.core.Control#checkFieldGroupIds Control.prototype.checkFieldGroupIds} for a description of
           * the<code>vFieldGroupIds</code> parameter.
           * @param vFieldGroupIds ID of the field group or an array of field group IDs to match
           * @returns The list of controls with matching field group IDs
          */
  def byFieldGroupId(vFieldGroupIds: java.lang.String): js.Array[Control] = js.native
  /**
           * Returns a list of all controls with a field group ID.See {@link
           * sap.ui.core.Control#checkFieldGroupIds Control.prototype.checkFieldGroupIds} for a description of
           * the<code>vFieldGroupIds</code> parameter.
           * @param vFieldGroupIds ID of the field group or an array of field group IDs to match
           * @returns The list of controls with matching field group IDs
          */
  def byFieldGroupId(vFieldGroupIds: js.Array[java.lang.String]): js.Array[Control] = js.native
  /**
           * Returns the registered element for the given id, if any.
           * @param sId undefined
           * @returns the element for the given id
          */
  def byId(sId: java.lang.String): Element = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: java.lang.String): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: java.lang.String, sUrl: java.lang.String): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: java.lang.String, sUrl: java.lang.String, sId: java.lang.String): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: java.lang.String, sUrl: java.lang.String, sId: java.lang.String, mSettings: js.Any): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: js.Any): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: js.Any, sUrl: java.lang.String): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: js.Any, sUrl: java.lang.String, sId: java.lang.String): scala.Unit = js.native
  /**
           * Creates a component with the provided id and settings.When the optional parameter <code>sUrl</code>
           * is given, then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sName, sUrl);</pre>
           * @param vComponent name of the component to import or object containing all needed parameters
           * @param sUrl the URL to load the component from
           * @param sId the ID for the component instance
           * @param mSettings the settings object for the component
          */
  def createComponent(vComponent: js.Any, sUrl: java.lang.String, sId: java.lang.String, mSettings: js.Any): scala.Unit = js.native
  /**
           * Returns a new instance of the RenderManager interface.
           * @returns the new instance of the RenderManager interface.
          */
  def createRenderManager(): RenderManager = js.native
  /**
           * Creates a new sap.ui.core.UIArea.
           * @param oDomRef a DOM Element or ID string of the UIArea
           * @returns a new UIArea
          */
  def createUIArea(oDomRef: java.lang.String): UIArea = js.native
  /**
           * Creates a new sap.ui.core.UIArea.
           * @param oDomRef a DOM Element or ID string of the UIArea
           * @returns a new UIArea
          */
  def createUIArea(oDomRef: Element): UIArea = js.native
  /**
           * Unregisters a listener for control events.A listener will only be unregistered if the same
           * function/context combinationis given as in the attachControlEvent call.
           * @param fnFunction function to unregister
           * @param oListener context object given during registration
          */
  def detachControlEvent(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Unregisters a listener for control events.A listener will only be unregistered if the same
           * function/context combinationis given as in the attachControlEvent call.
           * @param fnFunction function to unregister
           * @param oListener context object given during registration
          */
  def detachControlEvent(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Detach event-handler <code>fnFunction</code> from the 'formatError' event of
           * <code>sap.ui.core.Core</code>.<br/>The passed function and listener object must match the ones
           * previously used for event registration.
           * @param fnFunction The callback function to unregister
           * @param oListener Object on which the given function had to be called.
           * @returns <code>this</code> to allow method chaining
          */
  def detachFormatError(fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Unregisters a listener for the central interval timer.A listener will only be unregistered if the
           * same function/context combinationis given as in the attachIntervalTimer call.
           * @since 1.16.0
           * @param fnFunction function to unregister
           * @param oListener context object given during registration
          */
  def detachIntervalTimer(fnFunction: js.Any): scala.Unit = js.native
  /**
           * Unregisters a listener for the central interval timer.A listener will only be unregistered if the
           * same function/context combinationis given as in the attachIntervalTimer call.
           * @since 1.16.0
           * @param fnFunction function to unregister
           * @param oListener context object given during registration
          */
  def detachIntervalTimer(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Unregister a listener from the <code>localizationChanged</code> event.The listener will only be
           * unregistered if the same function/context combinationis given as in the call to
           * <code>attachLocalizationListener</code>.
           * @param fnFunction callback to be deregistered
           * @param oListener context object given in a previous call to attachLocalizationChanged.
          */
  def detachLocalizationChanged(fnFunction: js.Any, oListener: js.Any): scala.Unit = js.native
  /**
           * Detach event-handler <code>fnFunction</code> from the 'parseError' event of
           * <code>sap.ui.core.Core</code>.<br/>The passed function and listener object must match the ones
           * previously used for event registration.
           * @param fnFunction The callback function to unregister.
           * @param oListener Object on which the given function had to be called.
           * @returns <code>this</code> to allow method chaining
          */
  def detachParseError(fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Detach event-handler <code>fnFunction</code> from the 'validationError' event of
           * <code>sap.ui.core.Core</code>.<br/>The passed function and listener object must match the ones
           * previously used for event registration.
           * @param fnFunction The callback function to unregister
           * @param oListener Object on which the given function had to be called.
           * @returns <code>this</code> to allow method chaining
          */
  def detachValidationError(fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Detach event-handler <code>fnFunction</code> from the 'validationSuccess' event of
           * <code>sap.ui.core.Core</code>.<br/>The passed function and listener object must match the ones
           * previously used for event registration.
           * @param fnFunction The function to call, when the event occurs.
           * @param oListener Object on which the given function had to be called.
           * @returns <code>this</code> to allow method chaining
          */
  def detachValidationSuccess(fnFunction: js.Any, oListener: js.Any): Core = js.native
  /**
           * Fire event formatError to attached listeners.Expects following event parameters:<ul><li>'element' of
           * type <code>sap.ui.core.Element</code> </li><li>'property' of type <code>string</code>
           * </li><li>'type' of type <code>string</code> </li><li>'newValue' of type <code>object</code>
           * </li><li>'oldValue' of type <code>object</code> </li><li>'exception' of type <code>object</code>
           * </li></ul>
           * @param mArguments the arguments to pass along with the event.
           * @returns <code>this</code> to allow method chaining
          */
  def fireFormatError(mArguments: js.Any): Core = js.native
  /**
           * Fire event parseError to attached listeners.Expects following event parameters:<ul><li>'element' of
           * type <code>sap.ui.core.Element</code> </li><li>'property' of type <code>string</code>
           * </li><li>'type' of type <code>string</code> </li><li>'newValue' of type <code>object</code>
           * </li><li>'oldValue' of type <code>object</code> </li><li>'exception' of type <code>object</code>
           * </li></ul>
           * @param mArguments the arguments to pass along with the event.
           * @returns <code>this</code> to allow method chaining
          */
  def fireParseError(mArguments: js.Any): Core = js.native
  /**
           * Fire event validationError to attached listeners.Expects following event
           * parameters:<ul><li>'element' of type <code>sap.ui.core.Element</code> </li><li>'property' of type
           * <code>string</code> </li><li>'type' of type <code>string</code> </li><li>'newValue' of type
           * <code>object</code> </li><li>'oldValue' of type <code>object</code> </li><li>'exception' of type
           * <code>object</code> </li></ul>
           * @param mArguments the arguments to pass along with the event.
           * @returns <code>this</code> to allow method chaining
          */
  def fireValidationError(mArguments: js.Any): Core = js.native
  /**
           * Fire event validationSuccess to attached listeners.Expects following event
           * parameters:<ul><li>'element' of type <code>sap.ui.core.Element</code> </li><li>'property' of type
           * <code>string</code> </li><li>'type' of type <code>string</code> </li><li>'newValue' of type
           * <code>object</code> </li><li>'oldValue' of type <code>object</code> </li></ul>
           * @param mArguments the arguments to pass along with the event.
           * @returns <code>this</code> to allow method chaining
          */
  def fireValidationSuccess(mArguments: js.Any): Core = js.native
  /**
           * Returns the instance of the application (if exists).
           * @returns instance of the current application
          */
  def getApplication(): js.Any = js.native
  /**
           * Returns the registered component for the given id, if any.
           * @param sId undefined
           * @returns the component for the given id
          */
  def getComponent(sId: java.lang.String): Component = js.native
  /**
           * Returns the Configuration of the Core.
           * @returns the Configuration of the current Core.
          */
  def getConfiguration(): Configuration = js.native
  /**
           * Returns the registered element for the given ID, if any.
           * @param sId undefined
           * @returns the element for the given id
          */
  def getControl(sId: java.lang.String): Element = js.native
  /**
           * Returns the Id of the control/element currently in focus.
           * @returns the Id of the control/element currently in focus.
          */
  def getCurrentFocusedControlId(): java.lang.String = js.native
  /**
           * Returns the registered element for the given ID, if any.
           * @param sId undefined
           * @returns the element for the given id
          */
  def getElementById(sId: java.lang.String): Element = js.native
  /**
           * Returns the event bus.
           * @since 1.8.0
           * @returns the event bus
          */
  def getEventBus(): EventBus = js.native
  /**
           * Retrieves a resource bundle for the given library and locale.If only one argument is given, it is
           * assumed to be the libraryName. The localethen falls back to the current {@link
           * sap.ui.core.Configuration.prototype.getLanguage session locale}.If no argument is given, the library
           * also falls back to a default: "sap.ui.core".
           * @param sLibraryName name of the library to retrieve the bundle for
           * @param sLocale locale to retrieve the resource bundle for
           * @returns the best matching resource bundle for the given parameters or undefined
          */
  def getLibraryResourceBundle(sLibraryName: java.lang.String): js.Any = js.native
  /**
           * Retrieves a resource bundle for the given library and locale.If only one argument is given, it is
           * assumed to be the libraryName. The localethen falls back to the current {@link
           * sap.ui.core.Configuration.prototype.getLanguage session locale}.If no argument is given, the library
           * also falls back to a default: "sap.ui.core".
           * @param sLibraryName name of the library to retrieve the bundle for
           * @param sLocale locale to retrieve the resource bundle for
           * @returns the best matching resource bundle for the given parameters or undefined
          */
  def getLibraryResourceBundle(sLibraryName: java.lang.String, sLocale: java.lang.String): js.Any = js.native
  /**
           * Returns a map of library info objects for all currently loaded libraries,keyed by their names.The
           * structure of the library info objects matches the structure of the info objectthat the {@link
           * #initLibrary} method expects. Only property names documented with<code>initLibrary</code> should be
           * accessed, any additional properties might change ordisappear in future. When a property does not
           * exists, its default value (as documentedwith <code>initLibrary</code>) should be
           * assumed.<b>Note:</b> The returned info objects must not be modified. They might be a livingcopy of
           * the internal data (for efficiency reasons) and the framework is not preparedto handle modifications
           * to these objects.
           * @returns Map of library info objects keyed by the library names.
          */
  def getLoadedLibraries(): js.Any = js.native
  /**
           * Returns the active <code>MessageManager</code> instance.
           * @since 1.33.0
          */
  def getMessageManager(): openui5Lib.sapNs.uiNs.coreNs.messageNs.MessageManager = js.native
  /**
           * Get the model with the given model name.The name can be omitted to reference the default model or it
           * must be a non-empty string.Note: to be compatible with future versions of this API, applications
           * must not use the value <code>null</code>,the empty string <code>""</code> or the string literals
           * <code>"null"</code> or <code>"undefined"</code> as model name.
           * @param sName name of the model to be retrieved
           * @returns oModel
          */
  def getModel(sName: java.lang.String): openui5Lib.sapNs.uiNs.modelNs.Model = js.native
  /**
           * Get the model with the given model name.The name can be omitted to reference the default model or it
           * must be a non-empty string.Note: to be compatible with future versions of this API, applications
           * must not use the value <code>null</code>,the empty string <code>""</code> or the string literals
           * <code>"null"</code> or <code>"undefined"</code> as model name.
           * @param sName name of the model to be retrieved
           * @returns oModel
          */
  def getModel(sName: js.Any): openui5Lib.sapNs.uiNs.modelNs.Model = js.native
  /**
          */
  def getRenderManager(): scala.Unit = js.native
  /**
           * Returns the instance of the root component (if exists).
           * @returns instance of the current root component
          */
  def getRootComponent(): Component = js.native
  /**
           * Returns the static, hidden area DOM element belonging to this core instance.It can be used e.g. for
           * hiding elements like Popups, Shadow, Blocklayer etc.If it is not yet available, a DIV is created and
           * appended to the body.
           * @returns the static, hidden area DOM element belonging to this core instance.
          */
  def getStaticAreaRef(): Element = js.native
  /**
           * Returns the registered template for the given id, if any.
           * @param sId undefined
           * @returns the template for the given id
          */
  def getTemplate(sId: java.lang.String): Component = js.native
  /**
           * Returns a UIArea if the given ID/Element belongs to one.
           * @param o a DOM Element or ID string of the UIArea
           * @returns a UIArea with a given id or dom ref.
          */
  def getUIArea(o: java.lang.String): UIArea = js.native
  /**
           * Returns a UIArea if the given ID/Element belongs to one.
           * @param o a DOM Element or ID string of the UIArea
           * @returns a UIArea with a given id or dom ref.
          */
  def getUIArea(o: Element): UIArea = js.native
  /**
           * Returns <code>true</code> if there are any pending rendering tasks or whensuch rendering tasks are
           * currently being executed.
           * @returns true if there are pending (or executing) rendering tasks.
          */
  def getUIDirty(): scala.Boolean = js.native
  /**
           * Check if a Model is set to the core
           * @returns true or false
          */
  def hasModel(): scala.Boolean = js.native
  /**
           * Includes a library theme into the current page (if a variant is specified itwill include the variant
           * library theme)
           * @param sLibName the name of the UI library
           * @param sVariant the variant to include (optional)
           * @param sQuery to be used only by the Core
          */
  def includeLibraryTheme(sLibName: java.lang.String): scala.Unit = js.native
  /**
           * Includes a library theme into the current page (if a variant is specified itwill include the variant
           * library theme)
           * @param sLibName the name of the UI library
           * @param sVariant the variant to include (optional)
           * @param sQuery to be used only by the Core
          */
  def includeLibraryTheme(sLibName: java.lang.String, sVariant: java.lang.String): scala.Unit = js.native
  /**
           * Includes a library theme into the current page (if a variant is specified itwill include the variant
           * library theme)
           * @param sLibName the name of the UI library
           * @param sVariant the variant to include (optional)
           * @param sQuery to be used only by the Core
          */
  def includeLibraryTheme(sLibName: java.lang.String, sVariant: java.lang.String, sQuery: java.lang.String): scala.Unit = js.native
  /**
           * Provides the framework with information about a library.This method is intended to be called exactly
           * once while the main module of a library(its <code>library.js</code> module) is executing, typically
           * at its begin. The singleparameter <code>oLibInfo</code> is an info object that describes the content
           * of the library.When the <code>oLibInfo</code> has been processed, a normalized version of it will be
           * keptand will be returned as library information in later calls to {@link
           * #getLoadedLibraries}.Finally, <code>initLibrary</code> fires (the currently private) {@link
           * #event:LibraryChanged}event with operation 'add' for the newly loaded library.<h3>Side
           * Effects</h3>While analyzing the <code>oLibInfo</code>, the framework takes some additional
           * actions:<ul><li>If the info object contains a list of <code>interfaces</code>, they will be
           * registeredwith the {@link sap.ui.base.DataType} class to make them available as aggregation typesin
           * managed objects.</li><li>If the object contains a list of <code>controls</code> or
           * <code>elements</code>,{@link sap.ui.lazyRequire lazy stubs} will be created for their constructor as
           * well as fortheir static <code>extend</code> and <code>getMetadata</code> methods.<br><b>Note:</b>
           * Future versions might abandon the concept of lazy stubs as it requires synchronousXMLHttpRequests
           * which have been deprecated (see {@link http://xhr.spec.whatwg.org}). To be on thesafe side,
           * productive applications should always require any modules that they directly depend on.</li><li>With
           * the <code>noLibraryCSS</code> property, the library can be marked as 'theming-free'.Otherwise, the
           * framework will add a &lt;link&gt; tag to the page's head, pointing to the library'stheme-specific
           * stylesheet. The creation of such a &lt;link&gt; tag can be suppressed with the{@link
           * sap.ui.core.Configuration global configuration option} <code>preloadLibCss</code>.It can contain a
           * list of library names for which no stylesheet should be included.This is e.g. useful when an
           * application merges the CSS for multiple libraries and alreadyloaded the resulting
           * stylesheet.</li><li>If a list of library <code>dependencies</code> is specified in the info object,
           * thoselibraries will be loaded synchronously by <code>initLibrary</code>.<br><b>Note:</b>
           * Dependencies between libraries don't have to be modeled as AMD dependencies.Only when enums or types
           * from an additional library are used in the coding of the<code>library.js</code> module, the library
           * should be additionally listed in the AMD dependencies.</li></ul>Last but not least, higher layer
           * frameworks might want to include their own metadata for libraries.The property
           * <code>extensions</code> might contain such additional metadata. Its structure is not definedby the
           * framework, but it is strongly suggested that each extension only occupies a single propertyin the
           * <code>extensions</code> object and that the name of that property contains some namespaceinformation
           * (e.g. library name that introduces the feature) to avoid conflicts with other extensions.The
           * framework won't touch the content of <code>extensions</code> but will make it availablein the
           * library info objects returned by {@link #getLoadedLibraries}.<h3>Relationship to Descriptor for
           * Libraries (manifest.json)</h3>The information contained in <code>oLibInfo</code> is partially
           * redundant to the content of the descriptorfor the same library (its <code>manifest.json</code>
           * file). Future versions of UI5 might ignore the informationprovided in <code>oLibInfo</code> and
           * might evaluate the descriptor file instead. Library developers thereforeshould keep the information
           * in both files in sync.When the <code>manifest.json</code> is generated from the
           * <code>.library</code> file (which is the defaultfor UI5 libraries built with Maven), then the
           * content of the <code>.library</code> and <code>library.js</code>files must be kept in sync.
           * @param oLibInfo Info object for the library
          */
  def initLibrary(oLibInfo: js.Any): scala.Unit = js.native
  /**
           * Returns true if the Core has already been initialized. This means that instancesof RenderManager
           * etc. do already exist and the init event has already been fired(and will not be fired again).
           * @returns whether the Core has already been initialized
          */
  def isInitialized(): scala.Boolean = js.native
  /**
           * Returns the locked state of the <code>sap.ui.core.Core</code>
           * @returns locked state
          */
  def isLocked(): scala.Boolean = js.native
  /**
           * Check if the script is running on mobile
           * @returns true or false
          */
  def isMobile(): scala.Boolean = js.native
  /**
           * Used to find out whether a certain DOM element is the static area
           * @param oDomRef undefined
           * @returns whether the given DomRef is the StaticAreaRef
          */
  def isStaticAreaRef(oDomRef: js.Any): scala.Boolean = js.native
  /**
           * Returns true, if the styles of the current theme are already applied, false otherwise.This function
           * must not be used before the init event of the Core.If the styles are not yet applied an theme
           * changed event will follow when the styles will be applied.
           * @returns whether the styles of the current theme are already applied
          */
  def isThemeApplied(): scala.Boolean = js.native
  /**
           * Loads a set of libraries, preferably asynchronously.The module loading is still synchronous, so if a
           * library loads additional modules besidesits library.js file, those modules might be loaded
           * synchronously by the library.jsThe async loading is only supported by the means of the
           * library-preload.json files, so if alibrary doesn't provide a preload or when the preload is
           * deactivated (configuration, debug mode)then this API falls back to synchronous loading. However, the
           * contract (Promise) remains validand a Promise will be returned if async is specified - even when the
           * real loadingis done synchronously.
           * @param aLibraries set of libraries that should be loaded
           * @param mOptions configuration options
           * @returns returns a Promise in async mode, otherwise <code>undefined</code>
          */
  def loadLibraries(aLibraries: js.Array[java.lang.String]): jqueryLib.JQueryPromise[_] | js.Any = js.native
  /**
           * Loads a set of libraries, preferably asynchronously.The module loading is still synchronous, so if a
           * library loads additional modules besidesits library.js file, those modules might be loaded
           * synchronously by the library.jsThe async loading is only supported by the means of the
           * library-preload.json files, so if alibrary doesn't provide a preload or when the preload is
           * deactivated (configuration, debug mode)then this API falls back to synchronous loading. However, the
           * contract (Promise) remains validand a Promise will be returned if async is specified - even when the
           * real loadingis done synchronously.
           * @param aLibraries set of libraries that should be loaded
           * @param mOptions configuration options
           * @returns returns a Promise in async mode, otherwise <code>undefined</code>
          */
  def loadLibraries(aLibraries: js.Array[java.lang.String], mOptions: js.Any): jqueryLib.JQueryPromise[_] | js.Any = js.native
  /**
           * Synchronously loads the given library and makes it available to the application.Loads the *.library
           * module, which contains all preload modules (enums, types, content of a shared.jsif it exists). The
           * library module will call initLibrary with additional metadata for the library.As a result, consuming
           * applications can instantiate any control or element from that librarywithout having to write import
           * statements for the controls or for the enums.When the optional parameter <code>sUrl</code> is given,
           * then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sLibrary, sUrl);</pre>When the given
           * library has been loaded already, no further action will be taken.Especially, a given Url will not be
           * honored!Note: this method does not participate in the supported preload of libraries.
           * @param sLibrary name of the library to import
           * @param sUrl URL to load the library from
          */
  def loadLibrary(sLibrary: java.lang.String): scala.Unit = js.native
  /**
           * Synchronously loads the given library and makes it available to the application.Loads the *.library
           * module, which contains all preload modules (enums, types, content of a shared.jsif it exists). The
           * library module will call initLibrary with additional metadata for the library.As a result, consuming
           * applications can instantiate any control or element from that librarywithout having to write import
           * statements for the controls or for the enums.When the optional parameter <code>sUrl</code> is given,
           * then all request for resources of thelibrary will be redirected to the given Url. This is
           * convenience for a call to<pre>  jQuery.sap.registerModulePath(sLibrary, sUrl);</pre>When the given
           * library has been loaded already, no further action will be taken.Especially, a given Url will not be
           * honored!Note: this method does not participate in the supported preload of libraries.
           * @param sLibrary name of the library to import
           * @param sUrl URL to load the library from
          */
  def loadLibrary(sLibrary: java.lang.String, sUrl: java.lang.String): scala.Unit = js.native
  /**
           * Locks the Core. No browser events are dispatched to the controls.Lock should be called before and
           * after the dom is modified for rendering, roundtrips...Exceptions might be the case for asynchronous
           * UI behavior
          */
  def lock(): scala.Unit = js.native
  /**
           * Registers a Plugin to the <code>sap.ui.core.Core</code>, which lifecyclewill be managed (start and
           * stop).<br/>Plugin object need to implement two methods:<ul>  <li><code>startPlugin(oCore)</code>:
           * will be invoked, when the Plugin      should start (as parameter the reference to the Core will be
           * provided</li>  <li><code>stopPlugin()</code>: will be invoked, when the Plugin should stop</li></ul>
           * @param oPlugin reference to a Plugin object
          */
  def registerPlugin(oPlugin: js.Any): scala.Unit = js.native
  /**
           * Sets or unsets a model for the given model name.The <code>sName</code> must either be
           * <code>undefined</code> (or omitted) or a non-empty string.When the name is omitted, the default
           * model is set/unset.When <code>oModel</code> is <code>null</code> or <code>undefined</code>, a
           * previously set modelwith that name is removed from the Core.Any change (new model, removed model) is
           * propagated to all existing UIAreas and their descendantsas long as a descendant doesn't have its own
           * model set for the given name.Note: to be compatible with future versions of this API, applications
           * must not use the value <code>null</code>,the empty string <code>""</code> or the string literals
           * <code>"null"</code> or <code>"undefined"</code> as model name.
           * @param oModel the model to be set or <code>null</code> or <code>undefined</code>
           * @param sName the name of the model or <code>undefined</code>
           * @returns <code>this</code> to allow method chaining
          */
  def setModel(oModel: openui5Lib.sapNs.uiNs.modelNs.Model): Core = js.native
  /**
           * Sets or unsets a model for the given model name.The <code>sName</code> must either be
           * <code>undefined</code> (or omitted) or a non-empty string.When the name is omitted, the default
           * model is set/unset.When <code>oModel</code> is <code>null</code> or <code>undefined</code>, a
           * previously set modelwith that name is removed from the Core.Any change (new model, removed model) is
           * propagated to all existing UIAreas and their descendantsas long as a descendant doesn't have its own
           * model set for the given name.Note: to be compatible with future versions of this API, applications
           * must not use the value <code>null</code>,the empty string <code>""</code> or the string literals
           * <code>"null"</code> or <code>"undefined"</code> as model name.
           * @param oModel the model to be set or <code>null</code> or <code>undefined</code>
           * @param sName the name of the model or <code>undefined</code>
           * @returns <code>this</code> to allow method chaining
          */
  def setModel(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sName: java.lang.String): Core = js.native
  /**
           * Implicitly creates a new <code>UIArea</code> (or reuses an exiting one) for the given DOM reference
           * andadds the given control reference to the UIAreas content (existing content will be removed).
           * @param oDomRef a DOM Element or Id (string) of the UIArea
           * @param oControl the Control that should be the added to the <code>UIArea</code>.
          */
  def setRoot(oDomRef: java.lang.String, oControl: openui5Lib.sapNs.uiNs.baseNs.Interface): scala.Unit = js.native
  /**
           * Implicitly creates a new <code>UIArea</code> (or reuses an exiting one) for the given DOM reference
           * andadds the given control reference to the UIAreas content (existing content will be removed).
           * @param oDomRef a DOM Element or Id (string) of the UIArea
           * @param oControl the Control that should be the added to the <code>UIArea</code>.
          */
  def setRoot(oDomRef: java.lang.String, oControl: Control): scala.Unit = js.native
  /**
           * Implicitly creates a new <code>UIArea</code> (or reuses an exiting one) for the given DOM reference
           * andadds the given control reference to the UIAreas content (existing content will be removed).
           * @param oDomRef a DOM Element or Id (string) of the UIArea
           * @param oControl the Control that should be the added to the <code>UIArea</code>.
          */
  def setRoot(oDomRef: Element, oControl: openui5Lib.sapNs.uiNs.baseNs.Interface): scala.Unit = js.native
  /**
           * Implicitly creates a new <code>UIArea</code> (or reuses an exiting one) for the given DOM reference
           * andadds the given control reference to the UIAreas content (existing content will be removed).
           * @param oDomRef a DOM Element or Id (string) of the UIArea
           * @param oControl the Control that should be the added to the <code>UIArea</code>.
          */
  def setRoot(oDomRef: Element, oControl: Control): scala.Unit = js.native
  /**
           * Defines the root directory from below which UI5 should load the theme with the given name.Optionally
           * allows restricting the setting to parts of a theme covering specific control
           * libraries.Example:<code>  core.setThemeRoot("my_theme", "http://mythemeserver.com/allThemes"); 
           * core.applyTheme("my_theme");</code>will cause the following file to be
           * loaded:<code>http://mythemeserver.com/allThemes/sap/ui/core/themes/my_theme/library.css</code>(and
           * the respective files for all used control libraries, like
           * <code>http://mythemeserver.com/allThemes/sap/ui/commons/themes/my_theme/library.css</code>if the
           * sap.ui.commons library is used)If parts of the theme are at different locations (e.g. because you
           * provide a standard theme like "sap_goldreflection" for a custom control library andthis self-made
           * part of the standard theme is at a different location than the UI5 resources), you can also specify
           * for which control libraries the settingshould be used, by giving an array with the names of the
           * respective control libraries as second parameter:<code>core.setThemeRoot("sap_goldreflection",
           * ["my.own.library"], "http://mythemeserver.com/allThemes");</code>This will cause the Gold Reflection
           * theme to be loaded normally from the UI5 location, but the part for styling the "my.own.library"
           * controls will be loaded
           * ode>http://mythemeserver.com/allThemes/my/own/library/themes/sap_goldreflection/library.css</code>If
           * the custom theme should be loaded initially (via bootstrap attribute), the "themeRoots" property of
           * the window["sap-ui-config"] object must be used insteadof Core.setThemeRoot(...) in order to
           * configure the theme location early enough.
           * @since 1.10
           * @param sThemeName the name of the theme for which to configure the location
           * @param aLibraryNames the optional library names to which the configuration should be restricted
           * @param sThemeBaseUrl the base URL below which the CSS file(s) will be loaded from
           * @returns the Core, to allow method chaining
          */
  def setThemeRoot(
    sThemeName: java.lang.String,
    aLibraryNames: js.Array[java.lang.String],
    sThemeBaseUrl: java.lang.String
  ): Core = js.native
  /**
           * Unlocks the Core.Browser events are dispatched to the controls again after this method is called.
          */
  def unlock(): scala.Unit = js.native
  /**
           * Unregisters a Plugin out of the <code>sap.ui.core.Core</code>
           * @param oPlugin reference to a Plugin object
          */
  def unregisterPlugin(oPlugin: js.Any): scala.Unit = js.native
}

