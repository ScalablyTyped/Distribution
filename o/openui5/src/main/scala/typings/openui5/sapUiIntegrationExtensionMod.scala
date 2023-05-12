package typings.openui5

import typings.openui5.anon.ActionConfig
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiIntegrationLibraryMod.CardMenuAction
import typings.openui5.sapUiIntegrationWidgetsCardMod.CardFacade
import typings.std.Record
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationExtensionMod {
  
  @JSImport("sap/ui/integration/Extension", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Extension`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Extension {
    def this(/**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings) = this()
    def this(/**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: String,
      /**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings
    ) = this()
    def this(
      /**
      * ID for the new extension, generated automatically if no ID is given.
      */
    sId: Unit,
      /**
      * Initial settings for the new extension.
      */
    mSettings: ExtensionSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/integration/Extension", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.integration.Extension with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, Extension]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Extension],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.integration.Extension.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait Extension
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Extension`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Extension` itself.
      *
      * Fired when an action is triggered in the card.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAction(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Extension` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.Extension`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.Extension` itself.
      *
      * Fired when an action is triggered in the card.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.Extension` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Detaches event handler `fnFunction` from the {@link #event:action action} event of this `sap.ui.integration.Extension`.
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
      * @EXPERIMENTAL (since 1.113) - The API might change.
      *
      * Starts the process of fetching a resource from the network, returning a promise that is fulfilled once
      * the response is available. Use this method to override the default behavior when fetching network resources.
      * Mimics the browser native Fetch API.
      *
      * @returns A `Promise` that resolves to a `Response` object.
      */
    def fetch(
      /**
      * This defines the resource that you wish to fetch.
      */
    sResource: String,
      /**
      * An object containing any custom settings that you want to apply to the request.
      */
    mOptions: js.Object,
      /**
      * The map of request settings defined in the card manifest. Use this only for reading, they can not be
      * modified.
      */
    mRequestSettings: js.Object
    ): js.Promise[Response] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @deprecated (since 1.85) - This property is replaced by the `actions` aggregation of the card;
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this property is in a beta state - incompatible API changes
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
      * Returns an interface to the card, which uses this extension.
      *
      * @returns An interface to the card.
      */
    def getCard(): CardFacade = js.native
    
    /**
      * Gets current value of property {@link #getFormatters formatters}.
      *
      * The formatters that can be used in the manifest.
      *
      * @returns Value of property `formatters`
      */
    def getFormatters(): js.UndefOr[Record[String, js.Function0[Unit]]] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.108)
      *
      * Override this method to lazy load dependencies for the extension.
      *
      * @returns Returns a promise. The card will wait for this promise to be resolved before continuing with
      * the initialization.
      */
    def loadDependencies(): js.Promise[Any] = js.native
    
    /**
      * Called after the card is initialized.
      */
    def onCardReady(): Unit = js.native
    
    /**
      * Sets current value of property {@link #setFormatters formatters}.
      *
      * The formatters that can be used in the manifest. When called with a value of `null` or `undefined`, the
      * default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFormatters(): this.type = js.native
    def setFormatters(/**
      * New value of property `formatters`
      */
    aFormatters: Record[String, js.Function]): this.type = js.native
  }
  
  trait ExtensionSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Fired when an action is triggered in the card.
      *
      * When an action is triggered in the card it can be handled on several places by "action" event handlers.
      * In consecutive order those places are: `Extension`, `Card`, `Host`. Each of them can prevent the next
      * one to handle the action by calling `oEvent.preventDefault()`.
      */
    var action: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.85) - This property is replaced by the `actions` aggregation of the card;
      * @EXPERIMENTAL (since 1.75) - Disclaimer: this property is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * The actions configuration.
      */
    var actions: js.UndefOr[
        js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.79)
      *
      * The formatters that can be used in the manifest.
      */
    var formatters: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ExtensionSettings {
    
    inline def apply(): ExtensionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtensionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtensionSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setActions(
        value: js.Array[CardMenuAction] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: CardMenuAction*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setFormatters(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
    }
  }
}
