package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.FacetFilterType
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMFacetFilterMod {
  
  @JSImport("sap/m/FacetFilter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FacetFilter`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link topic:c6c38217a4a64001a22ad76cdfa97fae Facet Filter}
    */
  open class default () extends FacetFilter {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FacetFilterSettings) = this()
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
    mSettings: FacetFilterSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FacetFilterSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/FacetFilter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.FacetFilter with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, FacetFilter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FacetFilter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.FacetFilter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FacetFilter
    extends typings.openui5.sapUiCoreControlMod.default
       with IShrinkable {
    
    /**
      * Adds some list to the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addList(
      /**
      * The list to add; if empty, nothing is inserted
      */
    oList: typings.openui5.sapMFacetFilterListMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.FacetFilter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilter` itself.
      *
      * Fired when the user confirms filter selection.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.FacetFilter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilter` itself.
      *
      * Fired when the user confirms filter selection.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
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
    def attachConfirm(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.FacetFilter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilter` itself.
      *
      * Fired when the Reset button is pressed to inform that all FacetFilterLists need to be reset.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `search` and `reset` event handler
      * functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachReset(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:reset reset} event of this `sap.m.FacetFilter`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.FacetFilter` itself.
      *
      * Fired when the Reset button is pressed to inform that all FacetFilterLists need to be reset.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `search` and `reset` event handler
      * functions.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachReset(
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
    def attachReset(
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
      * Context object to call the event handler with. Defaults to this `sap.m.FacetFilter` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the lists in the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLists(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.FacetFilter`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachConfirm(
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
      * Detaches event handler `fnFunction` from the {@link #event:reset reset} event of this `sap.m.FacetFilter`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachReset(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachReset(
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
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:reset reset} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireReset(): this.type = js.native
    def fireReset(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getLists lists}.
      *
      * Collection of FacetFilterList controls.
      */
    def getLists(): js.Array[typings.openui5.sapMFacetFilterListMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getLiveSearch liveSearch}.
      *
      * Enables/disables live search in the search field of all `sap.m.FacetFilterList` instances.
      *
      * Default value is `true`.
      *
      * @returns Value of property `liveSearch`
      */
    def getLiveSearch(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowPersonalization showPersonalization}.
      *
      * If set to `true` and the FacetFilter type is `Simple`, then the Add Facet icon will be displayed and
      * each facet button will also have a Facet Remove icon displayed beside it, allowing the user to deactivate
      * the facet.
      *
      * **Note:** Always set this property to `true` when your facet lists are not active, so that the user is
      * able to select them and interact with them.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showPersonalization`
      */
    def getShowPersonalization(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowPopoverOKButton showPopoverOKButton}.
      *
      * If set to `true`, an OK button is displayed for every FacetFilterList popover. This button allows the
      * user to close the popover from within the popover instead of having to click outside of it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showPopoverOKButton`
      */
    def getShowPopoverOKButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowReset showReset}.
      *
      * Shows/hides the FacetFilter Reset button.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showReset`
      */
    def getShowReset(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSummaryBar showSummaryBar}.
      *
      * Shows the summary bar instead of the FacetFilter buttons bar when set to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSummaryBar`
      */
    def getShowSummaryBar(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the default appearance of the FacetFilter on the device. Possible values are `Simple` (default)
      * and `Light`.
      *
      * Default value is `Simple`.
      *
      * @returns Value of property `type`
      */
    def getType(): FacetFilterType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterType * / any */ String) = js.native
    
    /**
      * Checks for the provided `sap.m.FacetFilterList` in the aggregation {@link #getLists lists}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfList(
      /**
      * The list whose index is looked for
      */
    oList: typings.openui5.sapMFacetFilterListMod.default
    ): int = js.native
    
    /**
      * Inserts a list into the aggregation {@link #getLists lists}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertList(
      /**
      * The list to insert; if empty, nothing is inserted
      */
    oList: typings.openui5.sapMFacetFilterListMod.default,
      /**
      * The `0`-based index the list should be inserted at; for a negative value of `iIndex`, the list is inserted
      * at position 0; for a value greater than the current size of the aggregation, the list is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the FacetFilter dialog.
      *
      * @returns this pointer for chaining
      */
    def openFilterDialog(): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getLists lists}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllLists(): js.Array[typings.openui5.sapMFacetFilterListMod.default] = js.native
    
    def removeList(/**
      * The list to remove or its index or id
      */
    vList: String): typings.openui5.sapMFacetFilterListMod.default | Null = js.native
    /**
      * Removes a list from the aggregation {@link #getLists lists}.
      *
      * @returns The removed list or `null`
      */
    def removeList(/**
      * The list to remove or its index or id
      */
    vList: int): typings.openui5.sapMFacetFilterListMod.default | Null = js.native
    def removeList(
      /**
      * The list to remove or its index or id
      */
    vList: typings.openui5.sapMFacetFilterListMod.default
    ): typings.openui5.sapMFacetFilterListMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getLiveSearch liveSearch}.
      *
      * Enables/disables live search in the search field of all `sap.m.FacetFilterList` instances.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLiveSearch(): this.type = js.native
    def setLiveSearch(/**
      * New value for property `liveSearch`
      */
    bLiveSearch: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPersonalization showPersonalization}.
      *
      * If set to `true` and the FacetFilter type is `Simple`, then the Add Facet icon will be displayed and
      * each facet button will also have a Facet Remove icon displayed beside it, allowing the user to deactivate
      * the facet.
      *
      * **Note:** Always set this property to `true` when your facet lists are not active, so that the user is
      * able to select them and interact with them.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPersonalization(): this.type = js.native
    def setShowPersonalization(/**
      * New value for property `showPersonalization`
      */
    bShowPersonalization: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowPopoverOKButton showPopoverOKButton}.
      *
      * If set to `true`, an OK button is displayed for every FacetFilterList popover. This button allows the
      * user to close the popover from within the popover instead of having to click outside of it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowPopoverOKButton(): this.type = js.native
    def setShowPopoverOKButton(/**
      * New value for property `showPopoverOKButton`
      */
    bShowPopoverOKButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowReset showReset}.
      *
      * Shows/hides the FacetFilter Reset button.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowReset(): this.type = js.native
    def setShowReset(/**
      * New value for property `showReset`
      */
    bShowReset: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSummaryBar showSummaryBar}.
      *
      * Shows the summary bar instead of the FacetFilter buttons bar when set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSummaryBar(): this.type = js.native
    def setShowSummaryBar(/**
      * New value for property `showSummaryBar`
      */
    bShowSummaryBar: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the default appearance of the FacetFilter on the device. Possible values are `Simple` (default)
      * and `Light`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Simple`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: FacetFilterType): this.type = js.native
  }
  
  trait FacetFilterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the user confirms filter selection.
      */
    var confirm: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Collection of FacetFilterList controls.
      */
    var lists: js.UndefOr[
        js.Array[typings.openui5.sapMFacetFilterListMod.default] | typings.openui5.sapMFacetFilterListMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables/disables live search in the search field of all `sap.m.FacetFilterList` instances.
      */
    var liveSearch: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the Reset button is pressed to inform that all FacetFilterLists need to be reset.
      *
      * The default filtering behavior of the sap.m.FacetFilterList can be prevented by calling `sap.ui.base.Event.prototype.preventDefault`
      * function in the `search` event handler function. If the default filtering behavior is prevented then
      * filtering behavior has to be defined at application level inside the `search` and `reset` event handler
      * functions.
      */
    var reset: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * If set to `true` and the FacetFilter type is `Simple`, then the Add Facet icon will be displayed and
      * each facet button will also have a Facet Remove icon displayed beside it, allowing the user to deactivate
      * the facet.
      *
      * **Note:** Always set this property to `true` when your facet lists are not active, so that the user is
      * able to select them and interact with them.
      */
    var showPersonalization: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to `true`, an OK button is displayed for every FacetFilterList popover. This button allows the
      * user to close the popover from within the popover instead of having to click outside of it.
      */
    var showPopoverOKButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows/hides the FacetFilter Reset button.
      */
    var showReset: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Shows the summary bar instead of the FacetFilter buttons bar when set to `true`.
      */
    var showSummaryBar: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the default appearance of the FacetFilter on the device. Possible values are `Simple` (default)
      * and `Light`.
      */
    var `type`: js.UndefOr[
        FacetFilterType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object FacetFilterSettings {
    
    inline def apply(): FacetFilterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FacetFilterSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FacetFilterSettings] (val x: Self) extends AnyVal {
      
      inline def setConfirm(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setLists(
        value: js.Array[typings.openui5.sapMFacetFilterListMod.default] | typings.openui5.sapMFacetFilterListMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
      
      inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
      
      inline def setListsVarargs(value: typings.openui5.sapMFacetFilterListMod.default*): Self = StObject.set(x, "lists", js.Array(value*))
      
      inline def setLiveSearch(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "liveSearch", value.asInstanceOf[js.Any])
      
      inline def setLiveSearchUndefined: Self = StObject.set(x, "liveSearch", js.undefined)
      
      inline def setReset(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setShowPersonalization(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPersonalization", value.asInstanceOf[js.Any])
      
      inline def setShowPersonalizationUndefined: Self = StObject.set(x, "showPersonalization", js.undefined)
      
      inline def setShowPopoverOKButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showPopoverOKButton", value.asInstanceOf[js.Any])
      
      inline def setShowPopoverOKButtonUndefined: Self = StObject.set(x, "showPopoverOKButton", js.undefined)
      
      inline def setShowReset(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showReset", value.asInstanceOf[js.Any])
      
      inline def setShowResetUndefined: Self = StObject.set(x, "showReset", js.undefined)
      
      inline def setShowSummaryBar(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSummaryBar", value.asInstanceOf[js.Any])
      
      inline def setShowSummaryBarUndefined: Self = StObject.set(x, "showSummaryBar", js.undefined)
      
      inline def setType(
        value: FacetFilterType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FacetFilterType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
