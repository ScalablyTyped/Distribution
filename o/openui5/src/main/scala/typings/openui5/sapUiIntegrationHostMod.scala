package typings.openui5

import typings.openui5.anon.ActionConfig
import typings.openui5.anon.Card
import typings.openui5.anon.Data
import typings.openui5.anon.`2`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiIntegrationLibraryMod.CardMenuAction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationHostMod {
  
  @JSImport("sap/ui/integration/Host", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Host`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Host {
    def this(/**
      * Initial settings for the new host.
      */
    mSettings: HostSettings) = this()
    def this(/**
      * ID for the new host, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new host, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new host.
      */
    mSettings: HostSettings
    ) = this()
    def this(
      /**
      * ID for the new host, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new host.
      */
    mSettings: HostSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/integration/Host", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.integration.Host with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Host]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Host],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.integration.Host.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Host
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when an action is triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when an action is triggered.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAction(
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
    def attachAction(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardConfigurationChange cardConfigurationChange}
      * event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when some card configuration settings are changed as a result of user interaction. For example
      * - filter value is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCardConfigurationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCardConfigurationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardConfigurationChange cardConfigurationChange}
      * event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when some card configuration settings are changed as a result of user interaction. For example
      * - filter value is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCardConfigurationChange(
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
    def attachCardConfigurationChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardStateChanged cardStateChanged} event of
      * this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when the state of a card is changed. For example - the card is ready, new page is selected inside
      * the card, a filter is changed or data is refreshed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCardStateChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCardStateChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardStateChanged cardStateChanged} event of
      * this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when the state of a card is changed. For example - the card is ready, new page is selected inside
      * the card, a filter is changed or data is refreshed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCardStateChanged(
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
    def attachCardStateChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.91)
      *
      * Attaches event handler `fnFunction` to the {@link #event:message message} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when a message from channels like navigator.serviceWorker is received.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachMessage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.91)
      *
      * Attaches event handler `fnFunction` to the {@link #event:message message} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when a message from channels like navigator.serviceWorker is received.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMessage(
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
    def attachMessage(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.97)
      *
      * This functions is called when a CSRF token has expired.
      */
    def csrfTokenExpired(/**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: js.Object): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.97)
      *
      * This functions is called when a CSRF token is fetched.
      */
    def csrfTokenFetched(
      /**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: js.Object,
      /**
      * A promise which resolves the CSRF token to its value.
      */
    pCSRFTokenValuePromise: js.Promise[Any]
    ): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Detaches event handler `fnFunction` from the {@link #event:action action} event of this `sap.ui.integration.Host`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAction(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAction(
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
      * @EXPERIMENTAL (since 1.96)
      *
      * Detaches event handler `fnFunction` from the {@link #event:cardConfigurationChange cardConfigurationChange}
      * event of this `sap.ui.integration.Host`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCardConfigurationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCardConfigurationChange(
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
      * @EXPERIMENTAL (since 1.107)
      *
      * Detaches event handler `fnFunction` from the {@link #event:cardStateChanged cardStateChanged} event of
      * this `sap.ui.integration.Host`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCardStateChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCardStateChanged(
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
      * @EXPERIMENTAL (since 1.91)
      *
      * Detaches event handler `fnFunction` from the {@link #event:message message} event of this `sap.ui.integration.Host`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMessage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachMessage(
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
      * @EXPERIMENTAL (since 1.75)
      *
      * Fires event {@link #event:action action} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireAction(): Boolean = js.native
    def fireAction(/**
      * Parameters to pass along with the event
      */
    mParameters: ActionConfig): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Fires event {@link #event:cardConfigurationChange cardConfigurationChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCardConfigurationChange(): this.type = js.native
    def fireCardConfigurationChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Card): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Fires event {@link #event:cardStateChanged cardStateChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCardStateChanged(): this.type = js.native
    def fireCardStateChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: `2`): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.91)
      *
      * Fires event {@link #event:message message} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMessage(): this.type = js.native
    def fireMessage(/**
      * Parameters to pass along with the event
      */
    mParameters: Data): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Gets current value of property {@link #getActions actions}.
      *
      * The actions configuration.
      *
      * @returns Value of property `actions`
      */
    def getActions(): js.Array[CardMenuAction] = js.native
    
    /**
      * @SINCE 1.83
      *
      * Resolves the value for a given path in the context of the host Contexts can be used to configure Cards
      * with information available in the host environment.
      *
      * Example Context Structure: { "sap.workzone": { "currentUser: { "id": { "label": "Id of the Work Zone
      * user", "placeholder": "Work Zone user id", "description": "The value will change based on the logged
      * on user" } } } ... }
      *
      * Example path to the current user id of the context sPath = "sap.workzone/currentUser/id" parameter: {
      * userId: { value: "{context>sap.workzone/currentUser/id}" resolves to UserId } }
      *
      * @returns A promise which resolves with the value of this context.
      */
    def getContextValue(/**
      * The path to a context
      */
    sPath: String): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.83
      *
      * Returns the context object for the Card Editor design-time environment Contexts can be used to configure
      * Cards with information available in the host environment. Each entry in the list should contain design-time
      * information. A label, placeholder, and description should be provided.
      *
      * Example Context Structure: { "sap.workzone": { "currentUser: { "id": { "label": "Id of the Work Zone
      * user", "placeholder": "Work Zone user id", "description": "The value will change based on the logged
      * on user" } } } ... }
      *
      * The context information and texts should be translated as they appear in the design-time UI of the Card
      * Editor.
      *
      * @returns A promise which contains the context structure.
      */
    def getContexts(): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.97)
      *
      * Resolves the CSRF token and returns a Promise with its value.
      *
      * @returns A promise which resolves the CSRF token to its value.
      */
    def getCsrfToken(/**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: js.Object): js.Promise[Any] = js.native
    
    /**
      * Resolves the destination and returns its URL.
      *
      * @returns A promise which resolves with the URL of the destination.
      */
    def getDestination(
      /**
      * The name of the destination.
      */
    sDestinationName: String,
      /**
      * The card that depends on the destination. Most often the name which is used in the SAP Cloud Platform.
      */
    oCard: typings.openui5.sapUiIntegrationWidgetsCardMod.default
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.83
      *
      * Returns the list of destinations for the Card Editor design-time environment List entries are objects
      * that contain at least the name. { "name": "DestinationName" }
      *
      * @returns A promise which resolves with the list of destinations.
      */
    def getDestinations(): js.Promise[Any] = js.native
    
    /**
      * Gets current value of property {@link #getResolveDestination resolveDestination}.
      *
      * A function that resolves the given destination name to a URL.
      *
      * The Card calls this function when it needs to send a request to a destination. Function returns the URL
      * to which the request is sent.
      *
      * If a card depends on a destination, but this callback is not implemented, an error will be logged.
      *
      * The callback receives `destinationName` as parameter and returns a string with the URL. Or alternatively
      * the callback may return a `Promise` with the URL as an argument.
      *
      * @returns Value of property `resolveDestination`
      */
    def getResolveDestination(): js.Function = js.native
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Sets a new value for property {@link #getActions actions}.
      *
      * The actions configuration.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActions(/**
      * New value for property `actions`
      */
    sActions: js.Array[CardMenuAction]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResolveDestination resolveDestination}.
      *
      * A function that resolves the given destination name to a URL.
      *
      * The Card calls this function when it needs to send a request to a destination. Function returns the URL
      * to which the request is sent.
      *
      * If a card depends on a destination, but this callback is not implemented, an error will be logged.
      *
      * The callback receives `destinationName` as parameter and returns a string with the URL. Or alternatively
      * the callback may return a `Promise` with the URL as an argument.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResolveDestination(/**
      * New value for property `resolveDestination`
      */
    fnResolveDestination: js.Function): this.type = js.native
  }
  
  trait HostSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * Fired when an action is triggered.
      */
    var action: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.75)
      *
      * The actions configuration.
      */
    var actions: js.UndefOr[
        js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Fired when some card configuration settings are changed as a result of user interaction. For example
      * - filter value is changed.
      */
    var cardConfigurationChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Fired when the state of a card is changed. For example - the card is ready, new page is selected inside
      * the card, a filter is changed or data is refreshed.
      */
    var cardStateChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.91)
      *
      * Fired when a message from channels like navigator.serviceWorker is received.
      */
    var message: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * A function that resolves the given destination name to a URL.
      *
      * The Card calls this function when it needs to send a request to a destination. Function returns the URL
      * to which the request is sent.
      *
      * If a card depends on a destination, but this callback is not implemented, an error will be logged.
      *
      * The callback receives `destinationName` as parameter and returns a string with the URL. Or alternatively
      * the callback may return a `Promise` with the URL as an argument.
      */
    var resolveDestination: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HostSettings {
    
    inline def apply(): HostSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostSettings]
    }
    
    extension [Self <: HostSettings](x: Self) {
      
      inline def setAction(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActions(
        value: js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: CardMenuAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCardConfigurationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cardConfigurationChange", js.Any.fromFunction1(value))
      
      inline def setCardConfigurationChangeUndefined: Self = StObject.set(x, "cardConfigurationChange", js.undefined)
      
      inline def setCardStateChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cardStateChanged", js.Any.fromFunction1(value))
      
      inline def setCardStateChangedUndefined: Self = StObject.set(x, "cardStateChanged", js.undefined)
      
      inline def setMessage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setResolveDestination(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resolveDestination", value.asInstanceOf[js.Any])
      
      inline def setResolveDestinationUndefined: Self = StObject.set(x, "resolveDestination", js.undefined)
    }
  }
}
