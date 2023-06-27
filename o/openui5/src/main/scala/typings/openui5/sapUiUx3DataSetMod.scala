package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiUx3LibraryMod.DataSetView
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3DataSetMod {
  
  @JSImport("sap/ui/ux3/DataSet", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DataSet.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DataSet {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DataSetSettings) = this()
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
    mSettings: DataSetSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DataSetSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/DataSet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.DataSet with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, DataSet]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DataSet],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.DataSet.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DataSet
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Rerendering of the FilterArea
      */
    def _rerenderFilter(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Rerendering of the Toolbar
      */
    def _rerenderToolbar(): Unit = js.native
    
    /**
      * Adds some filter to the aggregation {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilter(
      /**
      * The filter to add; if empty, nothing is inserted
      */
    oFilter: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUx3DataSetItemMod.default
    ): this.type = js.native
    
    /**
      * add a toolbarItem to the toolbar
      */
    def addToolbarItem(/**
      * ToolbarItem
      */
    oOToolbarItem: ToolbarItem): Unit = js.native
    
    /**
      * Adds some view to the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addView(/**
      * The view to add; if empty, nothing is inserted
      */
    oView: DataSetView): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.DataSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.DataSet` itself.
      *
      * Event which is fired when the user triggers a search
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.DataSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.ux3.DataSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.DataSet` itself.
      *
      * Event which is fired when the user triggers a search
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.DataSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.DataSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.DataSet` itself.
      *
      * selection Changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit]
    ): this.type = js.native
    def attachSelectionChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.DataSet` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.DataSet`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.DataSet` itself.
      *
      * selection Changed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit]
    ): this.type = js.native
    def attachSelectionChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.DataSet` itself
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
      * clears dataset from all previous selections
      */
    def clearSelection(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a view switch button
      *
      * @returns viewSwitch instance
      */
    def createViewSwitch(/**
      * View
      */
    oView: /* was: sap.m.Element */ Any, /**
      * Index of view
      */
    iIndex: int): Any = js.native
    
    /**
      * Destroys all the filter in the aggregation {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilter(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys all the views in the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyViews(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.ux3.DataSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit]
    ): this.type = js.native
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSearchEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionChanged selectionChanged} event of
      * this `sap.ui.ux3.DataSet`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit]
    ): this.type = js.native
    def detachSelectionChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ DataSetSelectionChangedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:search search} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSearch(): this.type = js.native
    def fireSearch(/**
      * Parameters to pass along with the event
      */
    mParameters: DataSet$SearchEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionChanged selectionChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChanged(): this.type = js.native
    def fireSelectionChanged(
      /**
      * Parameters to pass along with the event
      */
    mParameters: DataSet$SelectionChangedEventParameters
    ): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getFilter filter}.
      *
      * Filter control (e.g. a FacetFilter) for the DataSet
      */
    def getFilter(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Aggregation of DataSetItems
      */
    def getItems(): js.Array[typings.openui5.sapUiUx3DataSetItemMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the LeadSelection index
      *
      * @returns selected index
      */
    def getLeadSelection(): int = js.native
    
    /**
      * Gets current value of property {@link #getMultiSelect multiSelect}.
      *
      * Selection mode of the DataSet
      *
      * Default value is `false`.
      *
      * @returns Value of property `multiSelect`
      */
    def getMultiSelect(): Boolean = js.native
    
    /**
      * use this function to retrieve the lead selected index
      */
    def getSelectedIndex(): Unit = js.native
    
    /**
      * use this function to retrieve all selected indices if multiple select is enabled
      */
    def getSelectedIndices(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns id of selected Item from given index
      *
      * @returns id of selected item
      */
    def getSelectedItemId(/**
      * index of selection
      */
    iIndex: int): String = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedView selectedView},
      * or `null`.
      */
    def getSelectedView(): ID = js.native
    
    /**
      * Gets current value of property {@link #getShowFilter showFilter}.
      *
      * show filter
      *
      * Default value is `true`.
      *
      * @returns Value of property `showFilter`
      */
    def getShowFilter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSearchField showSearchField}.
      *
      * Show/hide SearchField in Toolbar
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSearchField`
      */
    def getShowSearchField(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowToolbar showToolbar}.
      *
      * show Toolbar
      *
      * Default value is `true`.
      *
      * @returns Value of property `showToolbar`
      */
    def getShowToolbar(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getViews views}.
      *
      * views
      */
    def getViews(): js.Array[DataSetView] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getFilter filter}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilter(
      /**
      * The filter whose index is looked for
      */
    oFilter: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.DataSetItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiUx3DataSetItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.DataSetView` in the aggregation {@link #getViews views}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfView(/**
      * The view whose index is looked for
      */
    oView: DataSetView): int = js.native
    
    /**
      * Inserts a filter into the aggregation {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilter(
      /**
      * The filter to insert; if empty, nothing is inserted
      */
    oFilter: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the filter should be inserted at; for a negative value of `iIndex`, the filter is
      * inserted at position 0; for a value greater than the current size of the aggregation, the filter is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUx3DataSetItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a view into the aggregation {@link #getViews views}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertView(
      /**
      * The view to insert; if empty, nothing is inserted
      */
    oView: DataSetView,
      /**
      * The `0`-based index the view should be inserted at; for a negative value of `iIndex`, the view is inserted
      * at position 0; for a value greater than the current size of the aggregation, the view is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns true if iIndex is selected
      *
      * @returns index selected true/false
      */
    def isSelectedIndex(/**
      * index of selection
      */
    iIndex: int): Boolean = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilter filter}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilter(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiUx3DataSetItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getViews views}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllViews(): js.Array[DataSetView] = js.native
    
    def removeFilter(/**
      * The filter to remove or its index or id
      */
    vFilter: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a filter from the aggregation {@link #getFilter filter}.
      *
      * @returns The removed filter or `null`
      */
    def removeFilter(/**
      * The filter to remove or its index or id
      */
    vFilter: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeFilter(
      /**
      * The filter to remove or its index or id
      */
    vFilter: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiUx3DataSetItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiUx3DataSetItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiUx3DataSetItemMod.default
    ): typings.openui5.sapUiUx3DataSetItemMod.default | Null = js.native
    
    /**
      * remove a toolbarItem to the toolbar
      */
    def removeToolbarItem(oOToolbarItem: ToolbarItem): Unit = js.native
    
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: String): DataSetView | Null = js.native
    /**
      * Removes a view from the aggregation {@link #getViews views}.
      *
      * @returns The removed view or `null`
      */
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: int): DataSetView | Null = js.native
    def removeView(/**
      * The view to remove or its index or id
      */
    vView: DataSetView): DataSetView | Null = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Set the LeadSelection index
      */
    def setLeadSelection(/**
      * set LeadSelection index
      */
    iIIndex: int): Unit = js.native
    
    /**
      * setter for multi selection mode
      */
    def setMultiSelect(/**
      * true for multi mode, false for single mode
      */
    bMode: Boolean): Unit = js.native
    
    /**
      * Sets the associated {@link #getSelectedView selectedView}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: ID
    ): this.type = js.native
    def setSelectedView(
      /**
      * ID of an element which becomes the new target of this selectedView association; alternatively, an element
      * instance may be given
      */
    oSelectedView: DataSetView
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowFilter showFilter}.
      *
      * show filter
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowFilter(): this.type = js.native
    def setShowFilter(/**
      * New value for property `showFilter`
      */
    bShowFilter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSearchField showSearchField}.
      *
      * Show/hide SearchField in Toolbar
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSearchField(): this.type = js.native
    def setShowSearchField(/**
      * New value for property `showSearchField`
      */
    bShowSearchField: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowToolbar showToolbar}.
      *
      * show Toolbar
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowToolbar(): this.type = js.native
    def setShowToolbar(/**
      * New value for property `showToolbar`
      */
    bShowToolbar: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait DataSet$SearchEventParameters extends StObject {
    
    /**
      * The search query
      */
    var query: js.UndefOr[String] = js.undefined
  }
  object DataSet$SearchEventParameters {
    
    inline def apply(): DataSet$SearchEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSet$SearchEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSet$SearchEventParameters] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait DataSet$SelectionChangedEventParameters extends StObject {
    
    /**
      * New lead selected index
      */
    var newLeadSelectedIndex: js.UndefOr[int] = js.undefined
    
    /**
      * Old lead selected index
      */
    var oldLeadSelectedIndex: js.UndefOr[int] = js.undefined
  }
  object DataSet$SelectionChangedEventParameters {
    
    inline def apply(): DataSet$SelectionChangedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSet$SelectionChangedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSet$SelectionChangedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setNewLeadSelectedIndex(value: int): Self = StObject.set(x, "newLeadSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setNewLeadSelectedIndexUndefined: Self = StObject.set(x, "newLeadSelectedIndex", js.undefined)
      
      inline def setOldLeadSelectedIndex(value: int): Self = StObject.set(x, "oldLeadSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setOldLeadSelectedIndexUndefined: Self = StObject.set(x, "oldLeadSelectedIndex", js.undefined)
    }
  }
  
  type DataSetSearchEvent = typings.openui5.sapUiBaseEventMod.default[DataSet$SearchEventParameters]
  
  type DataSetSearchEventParameters = DataSet$SearchEventParameters
  
  type DataSetSelectionChangedEvent = typings.openui5.sapUiBaseEventMod.default[DataSet$SelectionChangedEventParameters]
  
  type DataSetSelectionChangedEventParameters = DataSet$SelectionChangedEventParameters
  
  trait DataSetSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Filter control (e.g. a FacetFilter) for the DataSet
      */
    var filter: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Aggregation of DataSetItems
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3DataSetItemMod.default] | typings.openui5.sapUiUx3DataSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Selection mode of the DataSet
      */
    var multiSelect: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event which is fired when the user triggers a search
      */
    var search: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DataSet$SearchEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Selected view of the Dataset
      */
    var selectedView: js.UndefOr[DataSetView | String] = js.undefined
    
    /**
      * selection Changed
      */
    var selectionChanged: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DataSet$SelectionChangedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * show filter
      */
    var showFilter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Show/hide SearchField in Toolbar
      */
    var showSearchField: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * show Toolbar
      */
    var showToolbar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * views
      */
    var views: js.UndefOr[
        js.Array[DataSetView] | DataSetView | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DataSetSettings {
    
    inline def apply(): DataSetSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSetSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetSettings] (val x: Self) extends AnyVal {
      
      inline def setFilter(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilterVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "filter", js.Array(value*))
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiUx3DataSetItemMod.default] | typings.openui5.sapUiUx3DataSetItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiUx3DataSetItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMultiSelect(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "multiSelect", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectUndefined: Self = StObject.set(x, "multiSelect", js.undefined)
      
      inline def setSearch(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DataSet$SearchEventParameters] => Unit
      ): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSelectedView(value: DataSetView | String): Self = StObject.set(x, "selectedView", value.asInstanceOf[js.Any])
      
      inline def setSelectedViewUndefined: Self = StObject.set(x, "selectedView", js.undefined)
      
      inline def setSelectionChanged(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[DataSet$SelectionChangedEventParameters] => Unit
      ): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
      
      inline def setSelectionChangedUndefined: Self = StObject.set(x, "selectionChanged", js.undefined)
      
      inline def setShowFilter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showFilter", value.asInstanceOf[js.Any])
      
      inline def setShowFilterUndefined: Self = StObject.set(x, "showFilter", js.undefined)
      
      inline def setShowSearchField(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSearchField", value.asInstanceOf[js.Any])
      
      inline def setShowSearchFieldUndefined: Self = StObject.set(x, "showSearchField", js.undefined)
      
      inline def setShowToolbar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showToolbar", value.asInstanceOf[js.Any])
      
      inline def setShowToolbarUndefined: Self = StObject.set(x, "showToolbar", js.undefined)
      
      inline def setViews(
        value: js.Array[DataSetView] | DataSetView | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      
      inline def setViewsVarargs(value: DataSetView*): Self = StObject.set(x, "views", js.Array(value*))
    }
  }
}
