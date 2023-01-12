package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.p13n.IContent
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nPanelMod {
  
  @JSImport("sap/m/P13nPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new P13nPanel.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends P13nPanel {
    def this(/**
      * initial settings for the new control
      */
    mSettings: P13nPanelSettings) = this()
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
    mSettings: P13nPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: P13nPanelSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_p13n_IContent: Boolean = js.native
    
    /**
      * @EXPERIMENTAL
      *
      * Returns the title, which should be displayed in the P13nPopup to describe related content.
      *
      * @returns The title for the corresponding content to be displayed in the `sap.m.p13n.Popup`.
      */
    /* CompleteClass */
    override def getTitle(): String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/P13nPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.P13nPanel with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, P13nPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, P13nPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.P13nPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait P13nPanel
    extends typings.openui5.sapUiCoreControlMod.default
       with IContent {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMP13nItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeNavigationTo beforeNavigationTo} event
      * of this `sap.m.P13nPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nPanel` itself.
      *
      * Due to performance the data of the panel can be requested in lazy mode e.g. when the panel is displayed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeNavigationTo(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeNavigationTo(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.P13nPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.28.0
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeNavigationTo beforeNavigationTo} event
      * of this `sap.m.P13nPanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.P13nPanel` itself.
      *
      * Due to performance the data of the panel can be requested in lazy mode e.g. when the panel is displayed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeNavigationTo(
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
    def attachBeforeNavigationTo(
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
      * Context object to call the event handler with. Defaults to this `sap.m.P13nPanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * This method defines the point in time before the panel becomes active.
      */
    def beforeNavigationTo(): Unit = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeNavigationTo beforeNavigationTo} event
      * of this `sap.m.P13nPanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeNavigationTo(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeNavigationTo(
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
      * @SINCE 1.28.0
      *
      * Fires event {@link #event:beforeNavigationTo beforeNavigationTo} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeNavigationTo(): this.type = js.native
    def fireBeforeNavigationTo(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getChangeNotifier changeNotifier}.
      *
      * Callback which notifies a change on this panel.
      *
      * @returns Value of property `changeNotifier`
      */
    def getChangeNotifier(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines personalization items (e.g. columns in the `P13nColumnsPanel`).
      */
    def getItems(): js.Array[typings.openui5.sapMP13nItemMod.default] = js.native
    
    /**
      * @SINCE 1.26.7
      * @deprecated (since 1.50) - replaced by the event of the respective inherited control, for example {@link
      * sap.m.P13nColumnsPanel#event:changeColumnsItems} of `P13nColumnsPanel` control.
      *
      * This method can be overwritten by subclass in order to return a payload for Ok action
      *
      * @returns Object which describes the state after Ok has been pressed
      */
    def getOkPayload(): js.Object = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * This method can be overwritten by subclass in order to return a payload for Reset action
      */
    def getResetPayload(): Unit = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Gets current value of property {@link #getTitleLarge titleLarge}.
      *
      * Large title text appears e.g. in dialog header in case that only one panel is shown.
      *
      * @returns Value of property `titleLarge`
      */
    def getTitleLarge(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Panel type for generic use. Due to extensibility reason the type of `type` property should be `string`.
      * So it is feasible to add a custom panel without expanding the type.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Gets current value of property {@link #getValidationExecutor validationExecutor}.
      *
      * Callback method which is called in order to validate end user entry.
      *
      * @returns Value of property `validationExecutor`
      */
    def getValidationExecutor(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getValidationListener validationListener}.
      *
      * Callback method which is called in order to register for validation result.
      *
      * @returns Value of property `validationListener`
      */
    def getValidationListener(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Enables the vertical Scrolling on the `P13nDialog` when the panel is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `verticalScrolling`
      */
    def getVerticalScrolling(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.P13nItem` in the aggregation {@link #getItems items}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMP13nItemMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMP13nItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * This method can be overwritten by subclass in order to cleanup after navigation, e.g. to remove invalid
      * content on the panel.
      */
    def onAfterNavigationFrom(): Unit = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * This method can be overwritten by subclass in order to prevent navigation to another panel. This could
      * be the case if some content on the panel is considered 'invalid'.
      *
      * @returns true if it is allowed to navigate away from this panel, false if it is not allowed
      */
    def onBeforeNavigationFrom(): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMP13nItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMP13nItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMP13nItemMod.default | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMP13nItemMod.default): typings.openui5.sapMP13nItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getChangeNotifier changeNotifier}.
      *
      * Callback which notifies a change on this panel.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setChangeNotifier(): this.type = js.native
    def setChangeNotifier(/**
      * New value for property `changeNotifier`
      */
    oChangeNotifier: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text appears in the panel.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.30.0
      *
      * Sets a new value for property {@link #getTitleLarge titleLarge}.
      *
      * Large title text appears e.g. in dialog header in case that only one panel is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitleLarge(): this.type = js.native
    def setTitleLarge(/**
      * New value for property `titleLarge`
      */
    sTitleLarge: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Panel type for generic use. Due to extensibility reason the type of `type` property should be `string`.
      * So it is feasible to add a custom panel without expanding the type.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidationExecutor validationExecutor}.
      *
      * Callback method which is called in order to validate end user entry.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidationExecutor(): this.type = js.native
    def setValidationExecutor(/**
      * New value for property `validationExecutor`
      */
    oValidationExecutor: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValidationListener validationListener}.
      *
      * Callback method which is called in order to register for validation result.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValidationListener(): this.type = js.native
    def setValidationListener(/**
      * New value for property `validationListener`
      */
    oValidationListener: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVerticalScrolling verticalScrolling}.
      *
      * Enables the vertical Scrolling on the `P13nDialog` when the panel is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVerticalScrolling(): this.type = js.native
    def setVerticalScrolling(/**
      * New value for property `verticalScrolling`
      */
    bVerticalScrolling: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait P13nPanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.28.0
      *
      * Due to performance the data of the panel can be requested in lazy mode e.g. when the panel is displayed
      */
    var beforeNavigationTo: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Callback which notifies a change on this panel.
      */
    var changeNotifier: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines personalization items (e.g. columns in the `P13nColumnsPanel`).
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMP13nItemMod.default] | typings.openui5.sapMP13nItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Title text appears in the panel.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.30.0
      *
      * Large title text appears e.g. in dialog header in case that only one panel is shown.
      */
    var titleLarge: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Panel type for generic use. Due to extensibility reason the type of `type` property should be `string`.
      * So it is feasible to add a custom panel without expanding the type.
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Callback method which is called in order to validate end user entry.
      */
    var validationExecutor: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Callback method which is called in order to register for validation result.
      */
    var validationListener: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables the vertical Scrolling on the `P13nDialog` when the panel is shown.
      */
    var verticalScrolling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object P13nPanelSettings {
    
    inline def apply(): P13nPanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[P13nPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P13nPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setBeforeNavigationTo(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeNavigationTo", js.Any.fromFunction1(value))
      
      inline def setBeforeNavigationToUndefined: Self = StObject.set(x, "beforeNavigationTo", js.undefined)
      
      inline def setChangeNotifier(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "changeNotifier", value.asInstanceOf[js.Any])
      
      inline def setChangeNotifierUndefined: Self = StObject.set(x, "changeNotifier", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMP13nItemMod.default] | typings.openui5.sapMP13nItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMP13nItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleLarge(value: String | PropertyBindingInfo): Self = StObject.set(x, "titleLarge", value.asInstanceOf[js.Any])
      
      inline def setTitleLargeUndefined: Self = StObject.set(x, "titleLarge", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidationExecutor(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validationExecutor", value.asInstanceOf[js.Any])
      
      inline def setValidationExecutorUndefined: Self = StObject.set(x, "validationExecutor", js.undefined)
      
      inline def setValidationListener(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "validationListener", value.asInstanceOf[js.Any])
      
      inline def setValidationListenerUndefined: Self = StObject.set(x, "validationListener", js.undefined)
      
      inline def setVerticalScrolling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "verticalScrolling", value.asInstanceOf[js.Any])
      
      inline def setVerticalScrollingUndefined: Self = StObject.set(x, "verticalScrolling", js.undefined)
    }
  }
}
