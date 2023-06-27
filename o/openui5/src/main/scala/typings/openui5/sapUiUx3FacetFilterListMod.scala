package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3FacetFilterListMod {
  
  @JSImport("sap/ui/ux3/FacetFilterList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FacetFilterList.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FacetFilterList {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FacetFilterListSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: FacetFilterListSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FacetFilterListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/FacetFilterList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.FacetFilterList with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, FacetFilterList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FacetFilterList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.FacetFilterList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FacetFilterList
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiCoreListItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.ux3.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FacetFilterList` itself.
      *
      * On Select event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.ux3.FacetFilterList`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.FacetFilterList` itself.
      *
      * On Select event.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.FacetFilterList` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.ux3.FacetFilterList`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FacetFilterListSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FacetFilterList$SelectEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.9.0
      *
      * Gets current value of property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Specifies whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displaySecondaryValues`
      */
    def getDisplaySecondaryValues(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The filter values that are presented as a list.
      */
    def getItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * Specifies whether multiple or single selection is used.
      *
      * Default value is `true`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSelectedKeys selectedKeys}.
      *
      * Array of type string containing the selected keys.
      *
      * @returns Value of property `selectedKeys`
      */
    def getSelectedKeys(): js.Array[String] = js.native
    
    /**
      * Gets current value of property {@link #getShowCounter showCounter}.
      *
      * Specifies whether the counter for all entries is shown.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCounter`
      */
    def getShowCounter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * The title of this list.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Checks for the provided `sap.ui.core.ListItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiCoreListItemMod.default
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
    oItem: typings.openui5.sapUiCoreListItemMod.default,
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
    def removeAllItems(): js.Array[typings.openui5.sapUiCoreListItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiCoreListItemMod.default
    ): typings.openui5.sapUiCoreListItemMod.default | Null = js.native
    
    /**
      * @since 1.9.0
      *
      * Sets a new value for property {@link #getDisplaySecondaryValues displaySecondaryValues}.
      *
      * Specifies whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplaySecondaryValues(): this.type = js.native
    def setDisplaySecondaryValues(/**
      * New value for property `displaySecondaryValues`
      */
    bDisplaySecondaryValues: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMultiSelect multiSelect}.
      *
      * Specifies whether multiple or single selection is used.
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
      * Sets a new value for property {@link #getSelectedKeys selectedKeys}.
      *
      * Array of type string containing the selected keys.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedKeys(): this.type = js.native
    def setSelectedKeys(/**
      * New value for property `selectedKeys`
      */
    sSelectedKeys: js.Array[String]): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCounter showCounter}.
      *
      * Specifies whether the counter for all entries is shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCounter(): this.type = js.native
    def setShowCounter(/**
      * New value for property `showCounter`
      */
    bShowCounter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * The title of this list.
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
  }
  
  trait FacetFilterList$SelectEventParameters extends StObject {
    
    /**
      * If it is true, then Item All is selected. That means all items in the list are selected - no filter is
      * set.
      */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Id of the FacetFilterList taht fires the event.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Array of selected Indices.
      */
    var selectedIndices: js.UndefOr[js.Array[int]] = js.undefined
    
    /**
      * Array of selected Items.
      */
    var selectedItems: js.UndefOr[js.Array[typings.openui5.sapUiCoreListItemMod.default]] = js.undefined
  }
  object FacetFilterList$SelectEventParameters {
    
    inline def apply(): FacetFilterList$SelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFilterList$SelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FacetFilterList$SelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setSelectedIndices(value: js.Array[int]): Self = StObject.set(x, "selectedIndices", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndicesUndefined: Self = StObject.set(x, "selectedIndices", js.undefined)
      
      inline def setSelectedIndicesVarargs(value: int*): Self = StObject.set(x, "selectedIndices", js.Array(value*))
      
      inline def setSelectedItems(value: js.Array[typings.openui5.sapUiCoreListItemMod.default]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: typings.openui5.sapUiCoreListItemMod.default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
  
  type FacetFilterListSelectEvent = typings.openui5.sapUiBaseEventMod.default[FacetFilterList$SelectEventParameters]
  
  type FacetFilterListSelectEventParameters = FacetFilterList$SelectEventParameters
  
  trait FacetFilterListSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.9.0
      *
      * Specifies whether the text values from the additionalText property (see sap.ui.core.ListItems) shall
      * be displayed.
      */
    var displaySecondaryValues: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The filter values that are presented as a list.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether multiple or single selection is used.
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * On Select event.
      */
    var select: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FacetFilterList$SelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Array of type string containing the selected keys.
      */
    var selectedKeys: js.UndefOr[
        js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the counter for all entries is shown.
      */
    var showCounter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The title of this list.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FacetFilterListSettings {
    
    inline def apply(): FacetFilterListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFilterListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FacetFilterListSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplaySecondaryValues(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displaySecondaryValues", value.asInstanceOf[js.Any])
      
      inline def setDisplaySecondaryValuesUndefined: Self = StObject.set(x, "displaySecondaryValues", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiCoreListItemMod.default] | typings.openui5.sapUiCoreListItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiCoreListItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FacetFilterList$SelectEventParameters] => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedKeys(
        value: js.Array[String] | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
      
      inline def setShowCounter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCounter", value.asInstanceOf[js.Any])
      
      inline def setShowCounterUndefined: Self = StObject.set(x, "showCounter", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
