package typings.openui5

import typings.openui5.anon.ExistingItems
import typings.openui5.anon.NewItem
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMP13nPanelMod.P13nPanelSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nColumnsPanelMod {
  
  @JSImport("sap/m/P13nColumnsPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nColumnsPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nColumnsPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nColumnsPanelSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: P13nColumnsPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nColumnsPanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nColumnsPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nColumnsPanel with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.P13nPanel.extend}.
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
    oClassInfo: ClassInfo[T, P13nColumnsPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nColumnsPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nColumnsPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nColumnsPanel
    extends typings.openui5.sapMP13nPanelMod.default {
    
    /**
      * @SINCE 1.26.0
      *
      * Adds some columnsItem to the aggregation {@link #getColumnsItems columnsItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addColumnsItem(
      /**
      * The columnsItem to add; if empty, nothing is inserted
      */
    oColumnsItem: typings.openui5.sapMP13nColumnsItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      * @deprecated (since 1.50) - replaced by extended event {@link sap.m.P13nColumnsPanel#event:changeColumnsItems}
      *
      * Attaches event handler `fnFunction` to the {@link #event:addColumnsItem addColumnsItem} event of this
      * `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised when a `columnsItem` is added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddColumnsItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAddColumnsItem(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.26.0
      * @deprecated (since 1.50) - replaced by extended event {@link sap.m.P13nColumnsPanel#event:changeColumnsItems}
      *
      * Attaches event handler `fnFunction` to the {@link #event:addColumnsItem addColumnsItem} event of this
      * `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised when a `columnsItem` is added.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAddColumnsItem(
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
    def attachAddColumnsItem(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.26.7
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeColumnsItems changeColumnsItems} event
      * of this `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised if `columnsItems` is changed or new one needs to be created in the model.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeColumnsItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChangeColumnsItems(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.26.7
      *
      * Attaches event handler `fnFunction` to the {@link #event:changeColumnsItems changeColumnsItems} event
      * of this `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised if `columnsItems` is changed or new one needs to be created in the model.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChangeColumnsItems(
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
    def attachChangeColumnsItems(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - the event `setData` is obsolete.
      *
      * Attaches event handler `fnFunction` to the {@link #event:setData setData} event of this `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised if `setData` is called in model. The event serves the purpose of minimizing such calls since
      * they can take up a lot of performance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSetData(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSetData(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - the event `setData` is obsolete.
      *
      * Attaches event handler `fnFunction` to the {@link #event:setData setData} event of this `sap.m.P13nColumnsPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nColumnsPanel` itself.
      *
      * Event raised if `setData` is called in model. The event serves the purpose of minimizing such calls since
      * they can take up a lot of performance.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSetData(
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
    def attachSetData(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nColumnsPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Binds aggregation {@link #getColumnsItems columnsItems} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindColumnsItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Destroys all the columnsItems in the aggregation {@link #getColumnsItems columnsItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyColumnsItems(): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      * @deprecated (since 1.50) - replaced by extended event {@link sap.m.P13nColumnsPanel#event:changeColumnsItems}
      *
      * Detaches event handler `fnFunction` from the {@link #event:addColumnsItem addColumnsItem} event of this
      * `sap.m.P13nColumnsPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAddColumnsItem(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAddColumnsItem(
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
      * @SINCE 1.26.7
      *
      * Detaches event handler `fnFunction` from the {@link #event:changeColumnsItems changeColumnsItems} event
      * of this `sap.m.P13nColumnsPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChangeColumnsItems(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChangeColumnsItems(
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
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - the event `setData` is obsolete.
      *
      * Detaches event handler `fnFunction` from the {@link #event:setData setData} event of this `sap.m.P13nColumnsPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSetData(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSetData(
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
      * @SINCE 1.26.0
      * @deprecated (since 1.50) - replaced by extended event {@link sap.m.P13nColumnsPanel#event:changeColumnsItems}
      *
      * Fires event {@link #event:addColumnsItem addColumnsItem} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAddColumnsItem(): this.type = js.native
    def fireAddColumnsItem(/**
      * Parameters to pass along with the event
      */
    mParameters: NewItem): this.type = js.native
    
    /**
      * @SINCE 1.26.7
      *
      * Fires event {@link #event:changeColumnsItems changeColumnsItems} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChangeColumnsItems(): this.type = js.native
    def fireChangeColumnsItems(/**
      * Parameters to pass along with the event
      */
    mParameters: ExistingItems): this.type = js.native
    
    /**
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - the event `setData` is obsolete.
      *
      * Fires event {@link #event:setData setData} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSetData(): this.type = js.native
    def fireSetData(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Gets content of aggregation {@link #getColumnsItems columnsItems}.
      *
      * List of columns that has been changed.
      */
    def getColumnsItems(): js.Array[typings.openui5.sapMP13nColumnsItemMod.default] = js.native
    
    /**
      * @SINCE 1.26.7
      *
      * Gets current value of property {@link #getVisibleItemsThreshold visibleItemsThreshold}.
      *
      * Specifies a threshold of visible items. If the end user makes a lot of columns visible, this might cause
      * performance to slow down. When this happens, the user can receive a corresponding warning triggered by
      * the `visibleItemsThreshold` property. The property needs to be activated and set to the required value
      * by the consuming application to ensure that the warning message is shown when the threshold has been
      * exceeded. In the following example the message will be shown if more than 100 visible columns are selected:
      *
      *
      * ```javascript
      *
      * customData>
      * core:CustomData key="p13nDialogSettings"
      * value='\{"columns":\{"visible": true, "payload": \{"visibleItemsThreshold": 3\}\}\}' />
      * /customData>
      * ```
      *
      *
      * Default value is `-1`.
      *
      * @returns Value of property `visibleItemsThreshold`
      */
    def getVisibleItemsThreshold(): int = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Checks for the provided `sap.m.P13nColumnsItem` in the aggregation {@link #getColumnsItems columnsItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfColumnsItem(
      /**
      * The columnsItem whose index is looked for
      */
    oColumnsItem: typings.openui5.sapMP13nColumnsItemMod.default
    ): int = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Inserts a columnsItem into the aggregation {@link #getColumnsItems columnsItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertColumnsItem(
      /**
      * The columnsItem to insert; if empty, nothing is inserted
      */
    oColumnsItem: typings.openui5.sapMP13nColumnsItemMod.default,
      /**
      * The `0`-based index the columnsItem should be inserted at; for a negative value of `iIndex`, the columnsItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the columnsItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * This method does a re-initialization of the panel
      */
    def reInitialize(): Unit = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Removes all the controls from the aggregation {@link #getColumnsItems columnsItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllColumnsItems(): js.Array[typings.openui5.sapMP13nColumnsItemMod.default] = js.native
    
    def removeColumnsItem(/**
      * The columnsItem to remove or its index or id
      */
    vColumnsItem: String): typings.openui5.sapMP13nColumnsItemMod.default | Null = js.native
    /**
      * @SINCE 1.26.0
      *
      * Removes a columnsItem from the aggregation {@link #getColumnsItems columnsItems}.
      *
      * @returns The removed columnsItem or `null`
      */
    def removeColumnsItem(/**
      * The columnsItem to remove or its index or id
      */
    vColumnsItem: int): typings.openui5.sapMP13nColumnsItemMod.default | Null = js.native
    def removeColumnsItem(
      /**
      * The columnsItem to remove or its index or id
      */
    vColumnsItem: typings.openui5.sapMP13nColumnsItemMod.default
    ): typings.openui5.sapMP13nColumnsItemMod.default | Null = js.native
    
    /**
      * @SINCE 1.26.7
      *
      * Sets a new value for property {@link #getVisibleItemsThreshold visibleItemsThreshold}.
      *
      * Specifies a threshold of visible items. If the end user makes a lot of columns visible, this might cause
      * performance to slow down. When this happens, the user can receive a corresponding warning triggered by
      * the `visibleItemsThreshold` property. The property needs to be activated and set to the required value
      * by the consuming application to ensure that the warning message is shown when the threshold has been
      * exceeded. In the following example the message will be shown if more than 100 visible columns are selected:
      *
      *
      * ```javascript
      *
      * customData>
      * core:CustomData key="p13nDialogSettings"
      * value='\{"columns":\{"visible": true, "payload": \{"visibleItemsThreshold": 3\}\}\}' />
      * /customData>
      * ```
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `-1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleItemsThreshold(): this.type = js.native
    def setVisibleItemsThreshold(/**
      * New value for property `visibleItemsThreshold`
      */
    iVisibleItemsThreshold: int): this.type = js.native
    
    /**
      * @SINCE 1.26.0
      *
      * Unbinds aggregation {@link #getColumnsItems columnsItems} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindColumnsItems(): this.type = js.native
  }
  
  trait P13nColumnsPanelSettings
    extends StObject
       with P13nPanelSettings {
    
    /**
      * @SINCE 1.26.0
      * @deprecated (since 1.50) - replaced by extended event {@link sap.m.P13nColumnsPanel#event:changeColumnsItems}
      *
      * Event raised when a `columnsItem` is added.
      */
    var addColumnsItem: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.26.7
      *
      * Event raised if `columnsItems` is changed or new one needs to be created in the model.
      */
    var changeColumnsItems: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.26.0
      *
      * List of columns that has been changed.
      */
    var columnsItems: js.UndefOr[
        js.Array[typings.openui5.sapMP13nColumnsItemMod.default] | typings.openui5.sapMP13nColumnsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - the event `setData` is obsolete.
      *
      * Event raised if `setData` is called in model. The event serves the purpose of minimizing such calls since
      * they can take up a lot of performance.
      */
    var setData: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.26.7
      *
      * Specifies a threshold of visible items. If the end user makes a lot of columns visible, this might cause
      * performance to slow down. When this happens, the user can receive a corresponding warning triggered by
      * the `visibleItemsThreshold` property. The property needs to be activated and set to the required value
      * by the consuming application to ensure that the warning message is shown when the threshold has been
      * exceeded. In the following example the message will be shown if more than 100 visible columns are selected:
      *
      *
      * ```javascript
      *
      * customData>
      * core:CustomData key="p13nDialogSettings"
      * value='\{"columns":\{"visible": true, "payload": \{"visibleItemsThreshold": 3\}\}\}' />
      * /customData>
      * ```
      */
    var visibleItemsThreshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object P13nColumnsPanelSettings {
    
    inline def apply(): P13nColumnsPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nColumnsPanelSettings]
    }
    
    extension [Self <: P13nColumnsPanelSettings](x: Self) {
      
      inline def setAddColumnsItem(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "addColumnsItem", js.Any.fromFunction1(value))
      
      inline def setAddColumnsItemUndefined: Self = StObject.set(x, "addColumnsItem", js.undefined)
      
      inline def setChangeColumnsItems(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "changeColumnsItems", js.Any.fromFunction1(value))
      
      inline def setChangeColumnsItemsUndefined: Self = StObject.set(x, "changeColumnsItems", js.undefined)
      
      inline def setColumnsItems(
        value: js.Array[typings.openui5.sapMP13nColumnsItemMod.default] | typings.openui5.sapMP13nColumnsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "columnsItems", value.asInstanceOf[js.Any])
      
      inline def setColumnsItemsUndefined: Self = StObject.set(x, "columnsItems", js.undefined)
      
      inline def setColumnsItemsVarargs(value: typings.openui5.sapMP13nColumnsItemMod.default*): Self = StObject.set(x, "columnsItems", js.Array(value*))
      
      inline def setSetData(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
      
      inline def setSetDataUndefined: Self = StObject.set(x, "setData", js.undefined)
      
      inline def setVisibleItemsThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleItemsThreshold", value.asInstanceOf[js.Any])
      
      inline def setVisibleItemsThresholdUndefined: Self = StObject.set(x, "visibleItemsThreshold", js.undefined)
    }
  }
}
