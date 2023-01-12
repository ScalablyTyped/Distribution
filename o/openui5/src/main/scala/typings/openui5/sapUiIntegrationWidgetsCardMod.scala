package typings.openui5

import typings.openui5.anon.ActionSource
import typings.openui5.anon.Changes
import typings.openui5.anon.Headers
import typings.openui5.anon.Parameters
import typings.openui5.sap.ClassInfo
import typings.openui5.sapFCardBaseMod.CardBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.MessageType
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiIntegrationLibraryMod.CardArea
import typings.openui5.sapUiIntegrationLibraryMod.CardDataMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiIntegrationWidgetsCardMod {
  
  @JSImport("sap/ui/integration/widgets/Card", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Card`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:5b46b03f024542ba802d99d67bc1a3f4 Cards}
    */
  open class default () extends Card {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CardSettings) = this()
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
    mSettings: CardSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CardSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/integration/widgets/Card", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.integration.widgets.Card with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.f.CardBase.extend}.
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
    oClassInfo: ClassInfo[T, Card]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Card],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.integration.widgets.Card.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Card
    extends typings.openui5.sapFCardBaseMod.default {
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Adds some actionDefinition to the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionDefinition(
      /**
      * The actionDefinition to add; if empty, nothing is inserted
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when an action is triggered on the card.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Attaches event handler `fnFunction` to the {@link #event:action action} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when an action is triggered on the card.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:configurationChange configurationChange} event
      * of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when some configuration settings are changed as a result of user interaction. For example - filter
      * value is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfigurationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachConfigurationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Attaches event handler `fnFunction` to the {@link #event:configurationChange configurationChange} event
      * of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when some configuration settings are changed as a result of user interaction. For example - filter
      * value is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfigurationChange(
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
    def attachConfigurationChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:manifestApplied manifestApplied} event of this
      * `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when card utilities (like `DataProviderFactory`) and the card elements (like header) are created
      * and initialized.
      *
      * Note: The card's content may not be available yet because it may depend on other resources to load.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManifestApplied(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachManifestApplied(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:manifestApplied manifestApplied} event of this
      * `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when card utilities (like `DataProviderFactory`) and the card elements (like header) are created
      * and initialized.
      *
      * Note: The card's content may not be available yet because it may depend on other resources to load.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManifestApplied(
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
    def attachManifestApplied(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.72)
      *
      * Attaches event handler `fnFunction` to the {@link #event:manifestReady manifestReady} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when the manifest is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManifestReady(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachManifestReady(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.72)
      *
      * Attaches event handler `fnFunction` to the {@link #event:manifestReady manifestReady} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when the manifest is loaded.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachManifestReady(
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
    def attachManifestReady(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Attaches event handler `fnFunction` to the {@link #event:stateChanged stateChanged} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when the state of the card is changed. For example - the card is ready, new page is selected, a
      * filter is changed or data is refreshed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachStateChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Attaches event handler `fnFunction` to the {@link #event:stateChanged stateChanged} event of this `sap.ui.integration.widgets.Card`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.integration.widgets.Card` itself.
      *
      * Fired when the state of the card is changed. For example - the card is ready, new page is selected, a
      * filter is changed or data is refreshed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachStateChanged(
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
    def attachStateChanged(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.integration.widgets.Card` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Destroys all the actionDefinitions in the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActionDefinitions(): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Detaches event handler `fnFunction` from the {@link #event:action action} event of this `sap.ui.integration.widgets.Card`.
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
      * Detaches event handler `fnFunction` from the {@link #event:configurationChange configurationChange} event
      * of this `sap.ui.integration.widgets.Card`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfigurationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachConfigurationChange(
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
      * Detaches event handler `fnFunction` from the {@link #event:manifestApplied manifestApplied} event of
      * this `sap.ui.integration.widgets.Card`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachManifestApplied(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachManifestApplied(
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
      * @EXPERIMENTAL (since 1.72)
      *
      * Detaches event handler `fnFunction` from the {@link #event:manifestReady manifestReady} event of this
      * `sap.ui.integration.widgets.Card`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachManifestReady(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachManifestReady(
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
      * Detaches event handler `fnFunction` from the {@link #event:stateChanged stateChanged} event of this `sap.ui.integration.widgets.Card`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachStateChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachStateChanged(
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
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
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
    mParameters: ActionSource): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Fires event {@link #event:configurationChange configurationChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfigurationChange(): this.type = js.native
    def fireConfigurationChange(/**
      * Parameters to pass along with the event
      */
    mParameters: Changes): this.type = js.native
    
    /**
      * Fires event {@link #event:manifestApplied manifestApplied} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireManifestApplied(): this.type = js.native
    def fireManifestApplied(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.72)
      *
      * Fires event {@link #event:manifestReady manifestReady} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireManifestReady(): this.type = js.native
    def fireManifestReady(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Fires event {@link #event:stateChanged stateChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireStateChanged(): this.type = js.native
    def fireStateChanged(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Gets content of aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * Actions definitions from which actions in the header menu of the card are created. **Note**: This aggregation
      * is destroyed when the property `manifest` changes.
      */
    def getActionDefinitions(): js.Array[typings.openui5.sapUiIntegrationActionDefinitionMod.default] = js.native
    
    /**
      * @SINCE 1.70
      * @EXPERIMENTAL (since 1.70)
      *
      * Gets current value of property {@link #getBaseUrl baseUrl}.
      *
      * Defines the base URL of the Card Manifest. It should be used when manifest property is an object instead
      * of a URL.
      *
      * @returns Value of property `baseUrl`
      */
    def getBaseUrl(): URI = js.native
    
    /**
      * @EXPERIMENTAL (since 1.77)
      *
      * Gets values of manifest parameters combined with the parameters from `parameters` property.
      *
      * **Notes**
      *
      * - Use this method when the manifest is ready. Check `manifestReady` event.
      *
      * - Use when developing a Component card.
      *
      * @returns Object containing parameters in format `{parameterKey: parameterValue}`.
      */
    def getCombinedParameters(): Record[String, Any] = js.native
    
    /**
      * @SINCE 1.65
      * @EXPERIMENTAL (since 1.65)
      *
      * Gets current value of property {@link #getDataMode dataMode}.
      *
      * Defines the state of the `Card`. When set to `Inactive`, the `Card` doesn't make requests.
      *
      * Default value is `Active`.
      *
      * @returns Value of property `dataMode`
      */
    def getDataMode(): CardDataMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardDataMode * / any */ String) = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getHost host}, or `null`.
      */
    def getHost(): ID = js.native
    
    /**
      * @EXPERIMENTAL (since 1.77)
      *
      * Gets the instance of the `host` association.
      *
      * @returns The host object associated with this card.
      */
    def getHostInstance(): typings.openui5.sapUiIntegrationHostMod.default = js.native
    
    /**
      * Overwrites getter for card manifest.
      *
      * @returns Cloned of the parameters.
      */
    def getManifest(): String | js.Object = js.native
    
    /**
      * @SINCE 1.76
      * @EXPERIMENTAL (since 1.76) - This API might be removed when a permanent solution for flexibility changes
      * is implemented.
      *
      * Gets current value of property {@link #getManifestChanges manifestChanges}.
      *
      * Defines a list of configuration settings, which will be merged into the original manifest.
      *
      * This can be a list of flexibility changes generated during designtime.
      *
      * Each item in the array represents a separate level of changes. For example, the first item might be created
      * by an administrator, the second by a page administrator and the third by the end user.
      *
      * The order of the items is the order in which the changes will be merged on top of each other. So the
      * last item will overwrite the previous items where the paths match.
      *
      * Example:
      * ```javascript
      *
      * [
      * 	{
      * 		// Administrator
      * 		"/sap.card/header/title": "My Configured Title in Default Language",
      * 		"/sap.card/content/maxItems": 10,
      * 		"texts": {
      * 			"en-US": {
      * 				"/sap.card/header/title": "My Configured Title in US-English"
      * 			}
      * 		}
      * 	},
      * 	{
      * 		// Page administrator
      * 		"/sap.card/content/maxItems": 5
      * 	},
      * 	{
      * 		// End user
      *      "/sap.card/header/title": "Title by End User",
      * 		"/sap.card/content/maxItems": 8
      * 	}
      * ]
      * ```
      *
      *
      * @returns Value of property `manifestChanges`
      */
    def getManifestChanges(): js.Array[js.Object] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.77)
      *
      * Returns a value from the Manifest based on the specified path.
      *
      * **Note** Use this method when the manifest is ready. Check `manifestReady` event.
      *
      * @returns The value at the specified path.
      */
    def getManifestEntry(/**
      * The path to return a value for.
      */
    sPath: String): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getReferenceId referenceId}.
      *
      * Optional property which can be used by the host to reference the card. It will be forwarded to any children
      * cards. Does not affect the card behavior.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `referenceId`
      */
    def getReferenceId(): String = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - The API might change.
      *
      * Gets translated text from the i18n properties files configured for this card.
      *
      * For more details see {@link module:sap/base/i18n/ResourceBundle#getText}.
      *
      * @returns The value belonging to the key, if found; otherwise the key itself or `undefined` depending
      * on `bIgnoreKeyFallback`.
      */
    def getTranslatedText(/**
      * Key to retrieve the text for
      */
    sKey: String): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[String]
    ): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[String],
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: Unit,
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): String = js.native
    
    /**
      * Hides the loading placeholders on the whole card, or a particular section of the card.
      */
    def hideLoadingPlaceholders(): Unit = js.native
    def hideLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to hide loading placeholders on all areas of the card.
      */
    eCardArea: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardArea * / any */ String
    ): Unit = js.native
    def hideLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to hide loading placeholders on all areas of the card.
      */
    eCardArea: CardArea
    ): Unit = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Checks for the provided `sap.ui.integration.ActionDefinition` in the aggregation {@link #getActionDefinitions
      * actionDefinitions}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfActionDefinition(
      /**
      * The actionDefinition whose index is looked for
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Inserts a actionDefinition into the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertActionDefinition(
      /**
      * The actionDefinition to insert; if empty, nothing is inserted
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default,
      /**
      * The `0`-based index the actionDefinition should be inserted at; for a negative value of `iIndex`, the
      * actionDefinition is inserted at position 0; for a value greater than the current size of the aggregation,
      * the actionDefinition is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - The API might change.
      *
      *
      * @returns If the card is ready or not.
      */
    def isReady(): Boolean = js.native
    
    /**
      * @EXPERIMENTAL (since 1.73)
      *
      * Loads the module designtime/Card.designtime or the module given in "sap.card": { "designtime": "designtime/Own.designtime"
      * } This file should contain the designtime configuration for the card.
      *
      * Returns a promise that resolves with an object { designtime: the designtime modules response manifest:
      * the complete manifest json } The promise is rejected if the module cannot be loaded with an object: {
      * error: "Card.designtime not found" }
      *
      * @returns Promise resolves after the designtime configuration is loaded.
      */
    def loadDesigntime(): js.Promise[Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - The API might change.
      *
      * Refreshes the card by re-applying the manifest settings and triggering all data requests.
      */
    def refresh(): Unit = js.native
    
    /**
      * @SINCE 1.95
      *
      * Refreshes the card data by triggering all data requests.
      */
    def refreshData(): Unit = js.native
    
    def removeActionDefinition(/**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: String): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Removes a actionDefinition from the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns The removed actionDefinition or `null`
      */
    def removeActionDefinition(/**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: int): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    def removeActionDefinition(
      /**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Removes all the controls from the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActionDefinitions(): js.Array[typings.openui5.sapUiIntegrationActionDefinitionMod.default] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.79)
      *
      * Performs an HTTP request using the given configuration.
      *
      * @returns Resolves when the request is successful, rejects otherwise.
      */
    def request(/**
      * The configuration of the request.
      */
    oConfiguration: Headers): js.Promise[Any] = js.native
    
    /**
      * Resolves the destination and returns its URL.
      *
      * @returns A promise which resolves with the URL of the destination.
      */
    def resolveDestination(/**
      * The destination's key used in the configuration.
      */
    sKey: String): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.70
      * @EXPERIMENTAL (since 1.70)
      *
      * Sets a new value for property {@link #getBaseUrl baseUrl}.
      *
      * Defines the base URL of the Card Manifest. It should be used when manifest property is an object instead
      * of a URL.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBaseUrl(): this.type = js.native
    def setBaseUrl(/**
      * New value for property `baseUrl`
      */
    sBaseUrl: URI): this.type = js.native
    
    def setDataMode(
      /**
      * The mode to set to the Card.
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardDataMode * / any */ String
    ): this.type = js.native
    /**
      * @SINCE 1.65
      * @EXPERIMENTAL (since 1.65) - API might change.
      *
      * Sets a new value for the `dataMode` property.
      *
      * @returns Pointer to the control instance to allow method chaining.
      */
    def setDataMode(/**
      * The mode to set to the Card.
      */
    sMode: CardDataMode): this.type = js.native
    
    def setHost(
      /**
      * ID of an element which becomes the new target of this host association; alternatively, an element instance
      * may be given
      */
    oHost: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getHost host}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHost(
      /**
      * ID of an element which becomes the new target of this host association; alternatively, an element instance
      * may be given
      */
    oHost: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getManifest manifest}.
      *
      * The URL of the manifest or an object.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setManifest(): this.type = js.native
    def setManifest(/**
      * New value for property `manifest`
      */
    oManifest: Any): this.type = js.native
    
    /**
      * @SINCE 1.76
      * @EXPERIMENTAL (since 1.76) - This API might be removed when a permanent solution for flexibility changes
      * is implemented.
      *
      * Sets a new value for property {@link #getManifestChanges manifestChanges}.
      *
      * Defines a list of configuration settings, which will be merged into the original manifest.
      *
      * This can be a list of flexibility changes generated during designtime.
      *
      * Each item in the array represents a separate level of changes. For example, the first item might be created
      * by an administrator, the second by a page administrator and the third by the end user.
      *
      * The order of the items is the order in which the changes will be merged on top of each other. So the
      * last item will overwrite the previous items where the paths match.
      *
      * Example:
      * ```javascript
      *
      * [
      * 	{
      * 		// Administrator
      * 		"/sap.card/header/title": "My Configured Title in Default Language",
      * 		"/sap.card/content/maxItems": 10,
      * 		"texts": {
      * 			"en-US": {
      * 				"/sap.card/header/title": "My Configured Title in US-English"
      * 			}
      * 		}
      * 	},
      * 	{
      * 		// Page administrator
      * 		"/sap.card/content/maxItems": 5
      * 	},
      * 	{
      * 		// End user
      *      "/sap.card/header/title": "Title by End User",
      * 		"/sap.card/content/maxItems": 8
      * 	}
      * ]
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setManifestChanges(/**
      * New value for property `manifestChanges`
      */
    sManifestChanges: js.Array[js.Object]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getReferenceId referenceId}.
      *
      * Optional property which can be used by the host to reference the card. It will be forwarded to any children
      * cards. Does not affect the card behavior.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setReferenceId(): this.type = js.native
    def setReferenceId(/**
      * New value for property `referenceId`
      */
    sReferenceId: String): this.type = js.native
    
    /**
      * Displays the loading placeholders on the whole card, or a particular area of the card. **Note:** Only
      * areas that contain binding will receive a loading placeholder.
      */
    def showLoadingPlaceholders(): Unit = js.native
    def showLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to show loading placeholders on all areas of the card.
      */
    eCardArea: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardArea * / any */ String
    ): Unit = js.native
    def showLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to show loading placeholders on all areas of the card.
      */
    eCardArea: CardArea
    ): Unit = js.native
    
    def showMessage(
      /**
      * The message.
      */
    sMessage: String,
      /**
      * Type of the message.
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): Unit = js.native
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Displays a message strip above the content with the given text. There can be only 1 message displayed.
      * If there is a previous message, it is removed. Can be used only after the `manifestApplied` event is
      * fired.
      */
    def showMessage(/**
      * The message.
      */
    sMessage: String, /**
      * Type of the message.
      */
    sType: MessageType): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.84)
      *
      * Triggers an action inside the card.
      *
      * Use this method if you need to trigger an action programmatically from inside an `Extension` or from
      * a Component card.
      *
      * For other use cases use the manifest to define the actions. See {@link https://ui5.sap.com/test-resources/sap/ui/integration/demokit/cardExplorer/webapp/index.html#/learn/features/cardActions}
      *
      * Example:
      * ```javascript
      *
      * oCard.triggerAction({
      *     type: "Navigation",
      *     parameters: {
      *         url: "...",
      *         target: "_blank"
      *     }
      * });
      * ```
      */
    def triggerAction(/**
      * The settings of the action.
      */
    oAction: Parameters): Unit = js.native
    
    /**
      * @EXPERIMENTAL
      *
      * Causes all of the controls within the Card that support validation to validate their data.
      *
      * @returns if all of the controls validated successfully; otherwise, false
      */
    def validateControls(): Boolean = js.native
  }
  
  @js.native
  trait CardFacade extends StObject {
    
    var __implements__sap_ui_integration_widgets_CardFacade: Boolean = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Adds some actionDefinition to the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionDefinition(
      /**
      * The actionDefinition to add; if empty, nothing is inserted
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.70
      * @EXPERIMENTAL (since 1.70)
      *
      * Gets current value of property {@link #getBaseUrl baseUrl}.
      *
      * Defines the base URL of the Card Manifest. It should be used when manifest property is an object instead
      * of a URL.
      *
      * @returns Value of property `baseUrl`
      */
    def getBaseUrl(): URI = js.native
    
    /**
      * @EXPERIMENTAL (since 1.77)
      *
      * Gets values of manifest parameters combined with the parameters from `parameters` property.
      *
      * **Notes**
      *
      * - Use this method when the manifest is ready. Check `manifestReady` event.
      *
      * - Use when developing a Component card.
      *
      * @returns Object containing parameters in format `{parameterKey: parameterValue}`.
      */
    def getCombinedParameters(): Record[String, Any] = js.native
    
    /**
      * @EXPERIMENTAL (since 1.77)
      *
      * Returns a value from the Manifest based on the specified path.
      *
      * **Note** Use this method when the manifest is ready. Check `manifestReady` event.
      *
      * @returns The value at the specified path.
      */
    def getManifestEntry(/**
      * The path to return a value for.
      */
    sPath: String): js.Object = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - This property might be changed in future.
      *
      * Gets current value of property {@link #getParameters parameters}.
      *
      * Overrides the default values of the parameters, which are defined in the manifest. The value is an object
      * containing parameters in format `{parameterKey: parameterValue}`.
      *
      * @returns Value of property `parameters`
      */
    def getParameters(): js.Object = js.native
    
    /**
      * @EXPERIMENTAL (since 1.83) - The API might change.
      *
      * Gets translated text from the i18n properties files configured for this card.
      *
      * For more details see {@link module:sap/base/i18n/ResourceBundle#getText}.
      *
      * @returns The value belonging to the key, if found; otherwise the key itself or `undefined` depending
      * on `bIgnoreKeyFallback`.
      */
    def getTranslatedText(/**
      * Key to retrieve the text for
      */
    sKey: String): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[String]
    ): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: js.Array[String],
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): String = js.native
    def getTranslatedText(
      /**
      * Key to retrieve the text for
      */
    sKey: String,
      /**
      * List of parameter values which should replace the placeholders "{n}" (n is the index) in
      * the found locale-specific string value. Note that the replacement is done whenever `aArgs` is given,
      * no matter whether the text contains placeholders or not and no matter whether `aArgs` contains a value
      * for n or not.
      */
    aArgs: Unit,
      /**
      * If set, `undefined` is returned instead of the key string, when the key is not found in any bundle or
      * fallback bundle.
      */
    bIgnoreKeyFallback: Boolean
    ): String = js.native
    
    /**
      * Hides the loading placeholders on the whole card, or a particular section of the card.
      */
    def hideLoadingPlaceholders(): Unit = js.native
    def hideLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to hide loading placeholders on all areas of the card.
      */
    eCardArea: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardArea * / any */ String
    ): Unit = js.native
    def hideLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to hide loading placeholders on all areas of the card.
      */
    eCardArea: CardArea
    ): Unit = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Checks for the provided `sap.ui.integration.ActionDefinition` in the aggregation {@link #getActionDefinitions
      * actionDefinitions}. and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfActionDefinition(
      /**
      * The actionDefinition whose index is looked for
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Inserts a actionDefinition into the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertActionDefinition(
      /**
      * The actionDefinition to insert; if empty, nothing is inserted
      */
    oActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default,
      /**
      * The `0`-based index the actionDefinition should be inserted at; for a negative value of `iIndex`, the
      * actionDefinition is inserted at position 0; for a value greater than the current size of the aggregation,
      * the actionDefinition is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.65) - The API might change.
      *
      * Refreshes the card by re-applying the manifest settings and triggering all data requests.
      */
    def refresh(): Unit = js.native
    
    /**
      * @SINCE 1.95
      *
      * Refreshes the card data by triggering all data requests.
      */
    def refreshData(): Unit = js.native
    
    def removeActionDefinition(/**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: String): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Removes a actionDefinition from the aggregation {@link #getActionDefinitions actionDefinitions}.
      *
      * @returns The removed actionDefinition or `null`
      */
    def removeActionDefinition(/**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: int): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    def removeActionDefinition(
      /**
      * The actionDefinition to remove or its index or id
      */
    vActionDefinition: typings.openui5.sapUiIntegrationActionDefinitionMod.default
    ): typings.openui5.sapUiIntegrationActionDefinitionMod.default | Null = js.native
    
    /**
      * @EXPERIMENTAL (since 1.79)
      *
      * Performs an HTTP request using the given configuration.
      *
      * @returns Resolves when the request is successful, rejects otherwise.
      */
    def request(/**
      * The configuration of the request.
      */
    oConfiguration: Headers): js.Promise[Any] = js.native
    
    /**
      * Resolves the destination and returns its URL.
      *
      * @returns A promise which resolves with the URL of the destination.
      */
    def resolveDestination(/**
      * The destination's key used in the configuration.
      */
    sKey: String): js.Promise[Any] = js.native
    
    /**
      * Displays the loading placeholders on the whole card, or a particular area of the card. **Note:** Only
      * areas that contain binding will receive a loading placeholder.
      */
    def showLoadingPlaceholders(): Unit = js.native
    def showLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to show loading placeholders on all areas of the card.
      */
    eCardArea: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardArea * / any */ String
    ): Unit = js.native
    def showLoadingPlaceholders(
      /**
      * Area of the card to show the loading placeholders on. Possible options are 'Header', 'Content', 'Filters'.
      * Leave empty to show loading placeholders on all areas of the card.
      */
    eCardArea: CardArea
    ): Unit = js.native
    
    def showMessage(
      /**
      * The message.
      */
    sMessage: String,
      /**
      * Type of the message.
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String
    ): Unit = js.native
    /**
      * @EXPERIMENTAL (since 1.81)
      *
      * Displays a message strip above the content with the given text. There can be only 1 message displayed.
      * If there is a previous message, it is removed. Can be used only after the `manifestApplied` event is
      * fired.
      */
    def showMessage(/**
      * The message.
      */
    sMessage: String, /**
      * Type of the message.
      */
    sType: MessageType): Unit = js.native
    
    /**
      * @EXPERIMENTAL (since 1.84)
      *
      * Triggers an action inside the card.
      *
      * Use this method if you need to trigger an action programmatically from inside an `Extension` or from
      * a Component card.
      *
      * For other use cases use the manifest to define the actions. See {@link https://ui5.sap.com/test-resources/sap/ui/integration/demokit/cardExplorer/webapp/index.html#/learn/features/cardActions}
      *
      * Example:
      * ```javascript
      *
      * oCard.triggerAction({
      *     type: "Navigation",
      *     parameters: {
      *         url: "...",
      *         target: "_blank"
      *     }
      * });
      * ```
      */
    def triggerAction(/**
      * The settings of the action.
      */
    oAction: Parameters): Unit = js.native
    
    /**
      * @EXPERIMENTAL
      *
      * Causes all of the controls within the Card that support validation to validate their data.
      *
      * @returns if all of the controls validated successfully; otherwise, false
      */
    def validateControls(): Boolean = js.native
  }
  
  trait CardSettings
    extends StObject
       with CardBaseSettings {
    
    /**
      * @EXPERIMENTAL (since 1.64) - Disclaimer: this event is in a beta state - incompatible API changes may
      * be done before its official public release. Use at your own discretion.
      *
      * Fired when an action is triggered on the card.
      */
    var action: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.85
      * @EXPERIMENTAL (since 1.85) - Disclaimer: this aggregation is in a beta state - incompatible API changes
      * may be done before its official public release. Use at your own discretion.
      *
      * Actions definitions from which actions in the header menu of the card are created. **Note**: This aggregation
      * is destroyed when the property `manifest` changes.
      */
    var actionDefinitions: js.UndefOr[
        js.Array[typings.openui5.sapUiIntegrationActionDefinitionMod.default] | typings.openui5.sapUiIntegrationActionDefinitionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.70
      * @EXPERIMENTAL (since 1.70)
      *
      * Defines the base URL of the Card Manifest. It should be used when manifest property is an object instead
      * of a URL.
      */
    var baseUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.96)
      *
      * Fired when some configuration settings are changed as a result of user interaction. For example - filter
      * value is changed.
      */
    var configurationChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.65
      * @EXPERIMENTAL (since 1.65)
      *
      * Defines the state of the `Card`. When set to `Inactive`, the `Card` doesn't make requests.
      */
    var dataMode: js.UndefOr[
        CardDataMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardDataMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The host.
      */
    var host: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * The URL of the manifest or an object.
      */
    var manifest: js.UndefOr[Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when card utilities (like `DataProviderFactory`) and the card elements (like header) are created
      * and initialized.
      *
      * Note: The card's content may not be available yet because it may depend on other resources to load.
      */
    var manifestApplied: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.76
      * @EXPERIMENTAL (since 1.76) - This API might be removed when a permanent solution for flexibility changes
      * is implemented.
      *
      * Defines a list of configuration settings, which will be merged into the original manifest.
      *
      * This can be a list of flexibility changes generated during designtime.
      *
      * Each item in the array represents a separate level of changes. For example, the first item might be created
      * by an administrator, the second by a page administrator and the third by the end user.
      *
      * The order of the items is the order in which the changes will be merged on top of each other. So the
      * last item will overwrite the previous items where the paths match.
      *
      * Example:
      * ```javascript
      *
      * [
      * 	{
      * 		// Administrator
      * 		"/sap.card/header/title": "My Configured Title in Default Language",
      * 		"/sap.card/content/maxItems": 10,
      * 		"texts": {
      * 			"en-US": {
      * 				"/sap.card/header/title": "My Configured Title in US-English"
      * 			}
      * 		}
      * 	},
      * 	{
      * 		// Page administrator
      * 		"/sap.card/content/maxItems": 5
      * 	},
      * 	{
      * 		// End user
      *      "/sap.card/header/title": "Title by End User",
      * 		"/sap.card/content/maxItems": 8
      * 	}
      * ]
      * ```
      */
    var manifestChanges: js.UndefOr[
        js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.72)
      *
      * Fired when the manifest is loaded.
      */
    var manifestReady: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.65) - This property might be changed in future.
      *
      * Overrides the default values of the parameters, which are defined in the manifest. The value is an object
      * containing parameters in format `{parameterKey: parameterValue}`.
      */
    var parameters: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Optional property which can be used by the host to reference the card. It will be forwarded to any children
      * cards. Does not affect the card behavior.
      */
    var referenceId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @EXPERIMENTAL (since 1.107)
      *
      * Fired when the state of the card is changed. For example - the card is ready, new page is selected, a
      * filter is changed or data is refreshed.
      */
    var stateChanged: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object CardSettings {
    
    inline def apply(): CardSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionDefinitions(
        value: js.Array[typings.openui5.sapUiIntegrationActionDefinitionMod.default] | typings.openui5.sapUiIntegrationActionDefinitionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actionDefinitions", value.asInstanceOf[js.Any])
      
      inline def setActionDefinitionsUndefined: Self = StObject.set(x, "actionDefinitions", js.undefined)
      
      inline def setActionDefinitionsVarargs(value: typings.openui5.sapUiIntegrationActionDefinitionMod.default*): Self = StObject.set(x, "actionDefinitions", js.Array(value*))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBaseUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setConfigurationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "configurationChange", js.Any.fromFunction1(value))
      
      inline def setConfigurationChangeUndefined: Self = StObject.set(x, "configurationChange", js.undefined)
      
      inline def setDataMode(
        value: CardDataMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CardDataMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "dataMode", value.asInstanceOf[js.Any])
      
      inline def setDataModeUndefined: Self = StObject.set(x, "dataMode", js.undefined)
      
      inline def setHost(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setManifest(value: Any | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      inline def setManifestApplied(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "manifestApplied", js.Any.fromFunction1(value))
      
      inline def setManifestAppliedUndefined: Self = StObject.set(x, "manifestApplied", js.undefined)
      
      inline def setManifestChanges(
        value: js.Array[js.Object] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "manifestChanges", value.asInstanceOf[js.Any])
      
      inline def setManifestChangesUndefined: Self = StObject.set(x, "manifestChanges", js.undefined)
      
      inline def setManifestChangesVarargs(value: js.Object*): Self = StObject.set(x, "manifestChanges", js.Array(value*))
      
      inline def setManifestReady(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "manifestReady", js.Any.fromFunction1(value))
      
      inline def setManifestReadyUndefined: Self = StObject.set(x, "manifestReady", js.undefined)
      
      inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      inline def setParameters(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      inline def setReferenceId(value: String | PropertyBindingInfo): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
      
      inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
      
      inline def setStateChanged(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1(value))
      
      inline def setStateChangedUndefined: Self = StObject.set(x, "stateChanged", js.undefined)
    }
  }
}
