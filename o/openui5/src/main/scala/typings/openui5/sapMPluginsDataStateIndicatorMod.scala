package typings.openui5

import typings.openui5.anon.DataState
import typings.openui5.anon.Filter
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMPluginsDataStateIndicatorMod {
  
  @JSImport("sap/m/plugins/DataStateIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DataStateIndicator plugin.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DataStateIndicator {
    def this(/**
      * Initial settings for the `DataStateIndicator`
      */
    mSettings: DataStateIndicatorSettings) = this()
    def this(/**
      * ID for the new `DataStateIndicator`, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new `DataStateIndicator`, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the `DataStateIndicator`
      */
    mSettings: DataStateIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new `DataStateIndicator`, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the `DataStateIndicator`
      */
    mSettings: DataStateIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/plugins/DataStateIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.plugins.DataStateIndicator with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DataStateIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DataStateIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.plugins.DataStateIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DataStateIndicator
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @SINCE 1.89
      *
      * Attaches event handler `fnFunction` to the {@link #event:applyFilter applyFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user filters data state messages and if the `enableFiltering` property is
      * set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachApplyFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachApplyFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.89
      *
      * Attaches event handler `fnFunction` to the {@link #event:applyFilter applyFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user filters data state messages and if the `enableFiltering` property is
      * set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachApplyFilter(
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
    def attachApplyFilter(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.89
      *
      * Attaches event handler `fnFunction` to the {@link #event:clearFilter clearFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user clears the data state message filter and if the `enableFiltering` property
      * is set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClearFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClearFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.89
      *
      * Attaches event handler `fnFunction` to the {@link #event:clearFilter clearFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user clears the data state message filter and if the `enableFiltering` property
      * is set to `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClearFilter(
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
    def attachClearFilter(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.103
      *
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user presses the `Close` button of the `MessageStrip` control which is managed
      * by this plugin.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.103
      *
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the user presses the `Close` button of the `MessageStrip` control which is managed
      * by this plugin.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
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
    def attachClose(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataStateChange dataStateChange} event of this
      * `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the {@link sap.ui.model.DataState data state} of the plugin parent is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDataStateChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:dataStateChange dataStateChange} event of this
      * `sap.m.plugins.DataStateIndicator`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.plugins.DataStateIndicator` itself.
      *
      * This event is fired when the {@link sap.ui.model.DataState data state} of the plugin parent is changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDataStateChange(
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
    def attachDataStateChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.plugins.DataStateIndicator` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.89
      *
      * Detaches event handler `fnFunction` from the {@link #event:applyFilter applyFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachApplyFilter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachApplyFilter(
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
      * @SINCE 1.89
      *
      * Detaches event handler `fnFunction` from the {@link #event:clearFilter clearFilter} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClearFilter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClearFilter(
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
      * @SINCE 1.103
      *
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.m.plugins.DataStateIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:dataStateChange dataStateChange} event of
      * this `sap.m.plugins.DataStateIndicator`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDataStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDataStateChange(
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
      * @SINCE 1.89
      *
      * Fires event {@link #event:applyFilter applyFilter} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireApplyFilter(): Boolean = js.native
    def fireApplyFilter(/**
      * Parameters to pass along with the event
      */
    mParameters: Filter): Boolean = js.native
    
    /**
      * @SINCE 1.89
      *
      * Fires event {@link #event:clearFilter clearFilter} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireClearFilter(): Boolean = js.native
    def fireClearFilter(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): Boolean = js.native
    
    /**
      * @SINCE 1.103
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:dataStateChange dataStateChange} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireDataStateChange(): Boolean = js.native
    def fireDataStateChange(/**
      * Parameters to pass along with the event
      */
    mParameters: DataState): Boolean = js.native
    
    /**
      * @SINCE 1.89
      *
      * Gets current value of property {@link #getEnableFiltering enableFiltering}.
      *
      * Enables filtering for data state messages if this property is set to `true`. A link is provided to the
      * user that allows them to filter. After the binding-related messages have been filtered by the user, all
      * the existing filters are only taken into account once the message filter has been cleared again.
      *
      * **Note:** This feature must be enabled for OData models only.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableFiltering`
      */
    def getEnableFiltering(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFilter filter}.
      *
      * Defines a predicate to test each message of the data state.
      *
      * This callback gets called using the {@link sap.ui.core.message.Message message} and {@link sap.ui.core.Control
      * related control} parameters. Return `true` to keep the message, `false` otherwise.
      *
      * @returns Value of property `filter`
      */
    def getFilter(): js.Function = js.native
    
    /**
      * @SINCE 1.89
      *
      * Return whether message filtering is active or not.
      *
      * @returns Whether message filtering is active or not
      */
    def isFiltering(): Boolean = js.native
    
    /**
      * Refreshes the messages displayed for the current data state. The current data state is evaluated again,
      * and the filters are applied.
      */
    def refresh(): Unit = js.native
    
    /**
      * @SINCE 1.89
      *
      * Sets a new value for property {@link #getEnableFiltering enableFiltering}.
      *
      * Enables filtering for data state messages if this property is set to `true`. A link is provided to the
      * user that allows them to filter. After the binding-related messages have been filtered by the user, all
      * the existing filters are only taken into account once the message filter has been cleared again.
      *
      * **Note:** This feature must be enabled for OData models only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableFiltering(): this.type = js.native
    def setEnableFiltering(/**
      * New value for property `enableFiltering`
      */
    bEnableFiltering: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilter filter}.
      *
      * Defines a predicate to test each message of the data state.
      *
      * This callback gets called using the {@link sap.ui.core.message.Message message} and {@link sap.ui.core.Control
      * related control} parameters. Return `true` to keep the message, `false` otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilter(/**
      * New value for property `filter`
      */
    fnFilter: js.Function): this.type = js.native
    
    /**
      * Shows a message.
      */
    def showMessage(): Unit = js.native
    def showMessage(/**
      * The message text, if empty, the message is hidden
      */
    sText: String): Unit = js.native
    def showMessage(
      /**
      * The message text, if empty, the message is hidden
      */
    sText: String,
      /**
      * The message type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): Unit = js.native
    def showMessage(
      /**
      * The message text, if empty, the message is hidden
      */
    sText: String,
      /**
      * The message type
      */
    sType: ValueState
    ): Unit = js.native
    def showMessage(
      /**
      * The message text, if empty, the message is hidden
      */
    sText: Unit,
      /**
      * The message type
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): Unit = js.native
    def showMessage(
      /**
      * The message text, if empty, the message is hidden
      */
    sText: Unit,
      /**
      * The message type
      */
    sType: ValueState
    ): Unit = js.native
  }
  
  trait DataStateIndicatorSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @SINCE 1.89
      *
      * This event is fired when the user filters data state messages and if the `enableFiltering` property is
      * set to `true`.
      */
    var applyFilter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.89
      *
      * This event is fired when the user clears the data state message filter and if the `enableFiltering` property
      * is set to `true`.
      */
    var clearFilter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.103
      *
      * This event is fired when the user presses the `Close` button of the `MessageStrip` control which is managed
      * by this plugin.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is fired when the {@link sap.ui.model.DataState data state} of the plugin parent is changed.
      */
    var dataStateChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.89
      *
      * Enables filtering for data state messages if this property is set to `true`. A link is provided to the
      * user that allows them to filter. After the binding-related messages have been filtered by the user, all
      * the existing filters are only taken into account once the message filter has been cleared again.
      *
      * **Note:** This feature must be enabled for OData models only.
      */
    var enableFiltering: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines a predicate to test each message of the data state.
      *
      * This callback gets called using the {@link sap.ui.core.message.Message message} and {@link sap.ui.core.Control
      * related control} parameters. Return `true` to keep the message, `false` otherwise.
      */
    var filter: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DataStateIndicatorSettings {
    
    inline def apply(): DataStateIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataStateIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataStateIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setApplyFilter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "applyFilter", js.Any.fromFunction1(value))
      
      inline def setApplyFilterUndefined: Self = StObject.set(x, "applyFilter", js.undefined)
      
      inline def setClearFilter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction1(value))
      
      inline def setClearFilterUndefined: Self = StObject.set(x, "clearFilter", js.undefined)
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setDataStateChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "dataStateChange", js.Any.fromFunction1(value))
      
      inline def setDataStateChangeUndefined: Self = StObject.set(x, "dataStateChange", js.undefined)
      
      inline def setEnableFiltering(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableFiltering", value.asInstanceOf[js.Any])
      
      inline def setEnableFilteringUndefined: Self = StObject.set(x, "enableFiltering", js.undefined)
      
      inline def setFilter(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    }
  }
}
