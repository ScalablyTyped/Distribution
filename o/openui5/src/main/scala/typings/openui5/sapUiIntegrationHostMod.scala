package typings.openui5

import typings.openui5.anon.Data
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiIntegrationLibraryMod.CardActionType
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
      * @experimental (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when an action is triggered.
      *
      * When an action is triggered in the card it can be handled on several places by "action" event handlers.
      * In consecutive order those places are: `Extension`, `Card`, `Host`. Each of them can prevent the next
      * one to handle the action by calling `oEvent.preventDefault()`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit]
    ): this.type = js.native
    def attachAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @experimental (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Host`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Host` itself.
      *
      * Fired when an action is triggered.
      *
      * When an action is triggered in the card it can be handled on several places by "action" event handlers.
      * In consecutive order those places are: `Extension`, `Card`, `Host`. Each of them can prevent the next
      * one to handle the action by calling `oEvent.preventDefault()`.
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
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardConfigurationChange cardConfigurationChange }
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
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit]
    ): this.type = js.native
    def attachCardConfigurationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @experimental (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:cardConfigurationChange cardConfigurationChange }
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
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.107)
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
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit]
    ): this.type = js.native
    def attachCardStateChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @experimental (since 1.107)
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
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.91)
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
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit]
    ): this.type = js.native
    def attachMessage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @experimental (since 1.91)
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
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Host` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.97)
      *
      * This function is called when a CSRF token has expired.
      */
    def csrfTokenExpired(/**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: Data): Unit = js.native
    
    /**
      * @experimental (since 1.97)
      *
      * This function is called when a CSRF token is fetched.
      */
    def csrfTokenFetched(
      /**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: Data,
      /**
      * A promise which resolves the CSRF token to its value.
      */
    pCSRFTokenValuePromise: js.Promise[String]
    ): Unit = js.native
    
    /**
      * @experimental (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
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
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit]
    ): this.type = js.native
    def detachAction(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostActionEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.96)
      *
      * Detaches event handler `fnFunction` from the {@link #event:cardConfigurationChange cardConfigurationChange }
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
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit]
    ): this.type = js.native
    def detachCardConfigurationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostCardConfigurationChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.107)
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
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit]
    ): this.type = js.native
    def detachCardStateChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostCardStateChangedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.91)
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
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit]
    ): this.type = js.native
    def detachMessage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ HostMessageEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @experimental (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      * Protected:  Do not call from applications (only from related classes in the framework)
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
    mParameters: Host$ActionEventParameters): Boolean = js.native
    
    /**
      * @experimental (since 1.96)
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:cardConfigurationChange cardConfigurationChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCardConfigurationChange(): this.type = js.native
    def fireCardConfigurationChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Host$CardConfigurationChangeEventParameters
    ): this.type = js.native
    
    /**
      * @experimental (since 1.107)
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:cardStateChanged cardStateChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCardStateChanged(): this.type = js.native
    def fireCardStateChanged(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Host$CardStateChangedEventParameters
    ): this.type = js.native
    
    /**
      * @experimental (since 1.91)
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:message message} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMessage(): this.type = js.native
    def fireMessage(/**
      * Parameters to pass along with the event
      */
    mParameters: Host$MessageEventParameters): this.type = js.native
    
    /**
      * @experimental (since 1.75) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Gets current value of property {@link #getActions actions}.
      *
      * The actions configuration.
      *
      * @returns Value of property `actions`
      */
    def getActions(): js.Array[CardMenuAction] = js.native
    
    /**
      * @since 1.83
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
    sPath: String): js.Promise[Null] = js.native
    
    /**
      * @since 1.83
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
    def getContexts(): js.Promise[js.Object] = js.native
    
    /**
      * @experimental (since 1.97)
      *
      * Resolves the CSRF token and returns a Promise with its value.
      *
      * @returns A promise which resolves the CSRF token to its value.
      */
    def getCsrfToken(/**
      * The CSRF token configuration.
      */
    mCSRFTokenConfig: Data): js.Promise[String] = js.native
    
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
      * The card that depends on the destination.
      */
    oCard: typings.openui5.sapUiIntegrationWidgetsCardMod.default
    ): js.Promise[String] = js.native
    
    /**
      * @since 1.83
      *
      * Returns the list of destinations for the Card Editor design-time environment List entries are objects
      * that contain at least the name. { "name": "DestinationName" }
      *
      * @returns A promise which resolves with the list of destinations.
      */
    def getDestinations(): js.Promise[js.Array[js.Object]] = js.native
    
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
    def getResolveDestination(): js.UndefOr[
        js.Function2[
          /* p1 */ String, 
          /* p2 */ typings.openui5.sapUiIntegrationWidgetsCardMod.default, 
          String | js.Promise[String]
        ]
      ] = js.native
    
    /**
      * @experimental (since 1.75) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
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
      * Sets a new value for property {@link #setResolveDestination resolveDestination}.
      *
      * A function that resolves the given destination name to a URL. The Card calls this function when it needs
      * to send a request to a destination. Function returns the URL to which the request is sent. If a card
      * depends on a destination, but this callback is not implemented, an error will be logged. The callback
      * receives `destinationName` as parameter and returns a string with the URL. Or alternatively the callback
      * may return a `Promise` with the URL as an argument.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResolveDestination(): this.type = js.native
    def setResolveDestination(
      /**
      * New value for property `resolveDestination`
      */
    fnResolveDestination: js.Function2[
          /* p1 */ String, 
          /* p2 */ typings.openui5.sapUiIntegrationWidgetsCardMod.default, 
          String | js.Promise[String]
        ]
    ): this.type = js.native
  }
  
  trait Host$ActionEventParameters extends StObject {
    
    /**
      * The action configuration.
      */
    var actionConfig: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The action source.
      */
    var actionSource: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The card the action is fired from.
      */
    var card: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The parameters related to the triggered action.
      */
    var parameters: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The type of the action.
      */
    var `type`: js.UndefOr[
        CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
      ] = js.undefined
  }
  object Host$ActionEventParameters {
    
    inline def apply(): Host$ActionEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host$ActionEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host$ActionEventParameters] (val x: Self) extends AnyVal {
      
      inline def setActionConfig(value: js.Object): Self = StObject.set(x, "actionConfig", value.asInstanceOf[js.Any])
      
      inline def setActionConfigUndefined: Self = StObject.set(x, "actionConfig", js.undefined)
      
      inline def setActionSource(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "actionSource", value.asInstanceOf[js.Any])
      
      inline def setActionSourceUndefined: Self = StObject.set(x, "actionSource", js.undefined)
      
      inline def setCard(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setType(
        value: CardActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardActionType * / any */ String)
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Host$CardConfigurationChangeEventParameters extends StObject {
    
    /**
      * The card the changes are fired from.
      */
    var card: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Changed configuration settings.
      *
      * Example:
      * ```javascript
      *
      *  {
      *     "/sap.card/configuration/filters/shipper/value": "key3",
      *     "/sap.card/configuration/filters/item/value": "key2"
      *  }
      * ```
      */
    var changes: js.UndefOr[js.Object] = js.undefined
  }
  object Host$CardConfigurationChangeEventParameters {
    
    inline def apply(): Host$CardConfigurationChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host$CardConfigurationChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host$CardConfigurationChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCard(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
      
      inline def setChanges(value: js.Object): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
    }
  }
  
  trait Host$CardStateChangedEventParameters extends StObject {
    
    /**
      * The card the changes are fired from.
      */
    var card: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object Host$CardStateChangedEventParameters {
    
    inline def apply(): Host$CardStateChangedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host$CardStateChangedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host$CardStateChangedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setCard(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    }
  }
  
  trait Host$MessageEventParameters extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
  }
  object Host$MessageEventParameters {
    
    inline def apply(): Host$MessageEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Host$MessageEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Host$MessageEventParameters] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    }
  }
  
  type HostActionEvent = typings.openui5.sapUiBaseEventMod.default[Host$ActionEventParameters]
  
  type HostActionEventParameters = Host$ActionEventParameters
  
  type HostCardConfigurationChangeEvent = typings.openui5.sapUiBaseEventMod.default[Host$CardConfigurationChangeEventParameters]
  
  type HostCardConfigurationChangeEventParameters = Host$CardConfigurationChangeEventParameters
  
  type HostCardStateChangedEvent = typings.openui5.sapUiBaseEventMod.default[Host$CardStateChangedEventParameters]
  
  type HostCardStateChangedEventParameters = Host$CardStateChangedEventParameters
  
  type HostMessageEvent = typings.openui5.sapUiBaseEventMod.default[Host$MessageEventParameters]
  
  type HostMessageEventParameters = Host$MessageEventParameters
  
  trait HostSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @experimental (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Fired when an action is triggered.
      *
      * When an action is triggered in the card it can be handled on several places by "action" event handlers.
      * In consecutive order those places are: `Extension`, `Card`, `Host`. Each of them can prevent the next
      * one to handle the action by calling `oEvent.preventDefault()`.
      */
    var action: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$ActionEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @experimental (since 1.75) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * The actions configuration.
      */
    var actions: js.UndefOr[
        js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @experimental (since 1.96)
      *
      * Fired when some card configuration settings are changed as a result of user interaction. For example
      * - filter value is changed.
      */
    var cardConfigurationChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$CardConfigurationChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @experimental (since 1.107)
      *
      * Fired when the state of a card is changed. For example - the card is ready, new page is selected inside
      * the card, a filter is changed or data is refreshed.
      */
    var cardStateChanged: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$CardStateChangedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @experimental (since 1.91)
      *
      * Fired when a message from channels like navigator.serviceWorker is received.
      */
    var message: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$MessageEventParameters], 
          Unit
        ]
      ] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HostSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$ActionEventParameters] => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActions(
        value: js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: CardMenuAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setCardConfigurationChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$CardConfigurationChangeEventParameters] => Unit
      ): Self = StObject.set(x, "cardConfigurationChange", js.Any.fromFunction1(value))
      
      inline def setCardConfigurationChangeUndefined: Self = StObject.set(x, "cardConfigurationChange", js.undefined)
      
      inline def setCardStateChanged(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$CardStateChangedEventParameters] => Unit
      ): Self = StObject.set(x, "cardStateChanged", js.Any.fromFunction1(value))
      
      inline def setCardStateChangedUndefined: Self = StObject.set(x, "cardStateChanged", js.undefined)
      
      inline def setMessage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Host$MessageEventParameters] => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setResolveDestination(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resolveDestination", value.asInstanceOf[js.Any])
      
      inline def setResolveDestinationUndefined: Self = StObject.set(x, "resolveDestination", js.undefined)
    }
  }
}
