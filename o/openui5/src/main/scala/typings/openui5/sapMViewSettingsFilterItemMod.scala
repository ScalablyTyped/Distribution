package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMViewSettingsItemMod.ViewSettingsItemSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMViewSettingsFilterItemMod {
  
  @JSImport("sap/m/ViewSettingsFilterItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ViewSettingsFilterItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ViewSettingsFilterItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsFilterItemSettings) = this()
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
    mSettings: ViewSettingsFilterItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsFilterItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ViewSettingsFilterItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ViewSettingsFilterItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ViewSettingsItem.extend}.
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
    oClassInfo: ClassInfo[T, ViewSettingsFilterItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ViewSettingsFilterItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ViewSettingsFilterItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ViewSettingsFilterItem
    extends typings.openui5.sapMViewSettingsItemMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterDetailItemsAggregationChange filterDetailItemsAggregationChange }
      * event of this `sap.m.ViewSettingsFilterItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsFilterItem` itself.
      *
      * Let the outside world know that the filter detail aggregation was changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterDetailItemsAggregationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachFilterDetailItemsAggregationChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsFilterItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filterDetailItemsAggregationChange filterDetailItemsAggregationChange }
      * event of this `sap.m.ViewSettingsFilterItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsFilterItem` itself.
      *
      * Let the outside world know that the filter detail aggregation was changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilterDetailItemsAggregationChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachFilterDetailItemsAggregationChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsFilterItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
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
      * Detaches event handler `fnFunction` from the {@link #event:filterDetailItemsAggregationChange filterDetailItemsAggregationChange }
      * event of this `sap.m.ViewSettingsFilterItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilterDetailItemsAggregationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachFilterDetailItemsAggregationChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:filterDetailItemsAggregationChange filterDetailItemsAggregationChange} to attached
      * listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilterDetailItemsAggregationChange(): this.type = js.native
    def fireFilterDetailItemsAggregationChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Items with key and value that are logically grouped under this filter item. They are used to display
      * filter details in the ViewSettingsDialog.
      */
    def getItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * If set to (true), multi selection will be allowed for the items aggregation.
      *
      * Default value is `true`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.ViewSettingsItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMViewSettingsItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapMViewSettingsItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMViewSettingsItemMod.default
    ): typings.openui5.sapMViewSettingsItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getMultiSelect multiSelect}.
      *
      * If set to (true), multi selection will be allowed for the items aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelect(): this.type = js.native
    def setMultiSelect(/**
      * New value for property `multiSelect`
      */
    bMultiSelect: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait ViewSettingsFilterItem$FilterDetailItemsAggregationChangeEventParameters extends StObject
  
  type ViewSettingsFilterItemFilterDetailItemsAggregationChangeEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsFilterItem$FilterDetailItemsAggregationChangeEventParameters]
  
  type ViewSettingsFilterItemFilterDetailItemsAggregationChangeEventParameters = ViewSettingsFilterItem$FilterDetailItemsAggregationChangeEventParameters
  
  trait ViewSettingsFilterItemSettings
    extends StObject
       with ViewSettingsItemSettings {
    
    /**
      * Let the outside world know that the filter detail aggregation was changed.
      */
    var filterDetailItemsAggregationChange: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Items with key and value that are logically grouped under this filter item. They are used to display
      * filter details in the ViewSettingsDialog.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to (true), multi selection will be allowed for the items aggregation.
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ViewSettingsFilterItemSettings {
    
    inline def apply(): ViewSettingsFilterItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsFilterItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsFilterItemSettings] (val x: Self) extends AnyVal {
      
      inline def setFilterDetailItemsAggregationChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "filterDetailItemsAggregationChange", js.Any.fromFunction1(value))
      
      inline def setFilterDetailItemsAggregationChangeUndefined: Self = StObject.set(x, "filterDetailItemsAggregationChange", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMViewSettingsItemMod.default] | typings.openui5.sapMViewSettingsItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMViewSettingsItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
    }
  }
}
