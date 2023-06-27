package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiMdcControlMod.ControlSettings
import typings.openui5.sapUiMdcEnumsFilterBarValidationStatusMod.FilterBarValidationStatus
import typings.openui5.sapUiMdcLibraryMod.State
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcFilterbarFilterBarBaseMod {
  
  @JSImport("sap/ui/mdc/filterbar/FilterBarBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new FilterBarBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FilterBarBase {
    def this(/**
      * initial settings for the new control
      */
    mSettings: FilterBarBaseSettings) = this()
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
    mSettings: FilterBarBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: FilterBarBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/filterbar/FilterBarBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.filterbar.FilterBarBase with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.Control.extend}.
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
    oClassInfo: ClassInfo[T, FilterBarBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterBarBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.filterbar.FilterBarBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FilterBarBase
    extends typings.openui5.sapUiMdcControlMod.default {
    
    /**
      * Adds some filterItem to the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilterItem(
      /**
      * The filterItem to add; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapUiMdcFilterFieldMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filtersChanged filtersChanged} event of this
      * `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.filterbar.FilterBarBase` itself.
      *
      * This event is fired after either a filter value or the visibility of a filter item has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFiltersChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit]
    ): this.type = js.native
    def attachFiltersChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.filterbar.FilterBarBase`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filtersChanged filtersChanged} event of this
      * `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.filterbar.FilterBarBase` itself.
      *
      * This event is fired after either a filter value or the visibility of a filter item has been changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFiltersChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit]
    ): this.type = js.native
    def attachFiltersChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.filterbar.FilterBarBase`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.filterbar.FilterBarBase` itself.
      *
      * This event is fired when the Go button is pressed or after a condition change, when `liveMode` is active.
      * **Note**: This event should never be executed programmatically. It is triggered internally by the filter
      * bar after a `triggerSearch` has been executed
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachSearch(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.filterbar.FilterBarBase`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:search search} event of this `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.filterbar.FilterBarBase` itself.
      *
      * This event is fired when the Go button is pressed or after a condition change, when `liveMode` is active.
      * **Note**: This event should never be executed programmatically. It is triggered internally by the filter
      * bar after a `triggerSearch` has been executed
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.filterbar.FilterBarBase`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Checks the validation status of the filter fields. **Note:**
      *  This method returns the current inner state of the filter bar.
      *
      * @returns Returns the validation status
      */
    def checkFilters(): FilterBarValidationStatus = js.native
    
    /**
      * Destroys the basicSearchField in the aggregation {@link #getBasicSearchField basicSearchField}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBasicSearchField(): this.type = js.native
    
    /**
      * Destroys all the filterItems in the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:filtersChanged filtersChanged} event of this
      * `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFiltersChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit]
    ): this.type = js.native
    def detachFiltersChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ FilterBarBaseFiltersChangedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:search search} event of this `sap.ui.mdc.filterbar.FilterBarBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSearch(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachSearch(
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
      * Fires event {@link #event:filtersChanged filtersChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFiltersChanged(): this.type = js.native
    def fireFiltersChanged(
      /**
      * Parameters to pass along with the event
      */
    mParameters: FilterBarBase$FiltersChangedEventParameters
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
    mParameters: js.Object): this.type = js.native
    
    /**
      * Returns the labels of all filters with a value assignment.
      *
      * Note: filters annotated with hiddenFilters will not be considered
      *
      * @returns array of labels of filters with value assignment
      */
    def getAssignedFilterNames(): js.Array[Any] = js.native
    
    /**
      * Returns a summary string that contains information about the filters currently assigned. The method returns
      * the text summary for the expanded and collapsed states of the filter bar.
      *
      *  **Example for collapsed filter bar**:
      *  3 filters active: Company Code, Fiscal Year, Customer
      *
      * **Example for expanded filter bar**:
      *  3 filters active (1 hidden)
      *
      * @returns A map containing the text information
      */
    def getAssignedFiltersText(): Record[String, Any] = js.native
    
    /**
      * Gets content of aggregation {@link #getBasicSearchField basicSearchField}.
      *
      * Contains the optional basic search field. **Note:** This field has to be bound against the `$search`
      * property.
      */
    def getBasicSearchField(): typings.openui5.sapUiMdcFilterFieldMod.default = js.native
    
    /**
      * Returns the external conditions of the inner condition model. **Note:** This API returns only attributes
      * related to the {@link sap.ui.mdc.FilterBar#p13nMode} property configuration.
      *
      * @returns Object containing the current status of the `FilterBarBase`
      */
    def getCurrentState(): State = js.native
    
    /**
      * @since 1.66.0
      *
      * Gets current value of property {@link #getFilterConditions filterConditions}.
      *
      * Specifies the filter conditions.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility. Do not use it otherwise.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `filterConditions`
      */
    def getFilterConditions(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getFilterItems filterItems}.
      *
      * Contains all the displayed {@link sap.ui.mdc.FilterField filter fields} of the `FilterBarBase` control.
      */
    def getFilterItems(): js.Array[typings.openui5.sapUiMdcFilterFieldMod.default] = js.native
    
    /**
      * @since 1.74
      *
      * Gets current value of property {@link #getLiveMode liveMode}.
      *
      * Triggers a search automatically after a filter value has been changed.
      *  **Note:** The `liveMode` property only operates in non-mobile scenarios.
      *  Additionally, if the `liveMode` property is active, the following applies:
      *  The error message box is not displayed, and the `showMessages` property is ignored.
      *
      * Default value is `false`.
      *
      * @returns Value of property `liveMode`
      */
    def getLiveMode(): Boolean = js.native
    
    /**
      * @since 1.97
      *
      * Gets current value of property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the filter metadata.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility/ Fiori Elements. Do not use it otherwise.
      *  **Node**: Please check {@link sap.ui.mdc.filterbar.PropertyInfo} for more information about the supported
      * inner elements.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `propertyInfo`
      */
    def getPropertyInfo(): js.Object = js.native
    
    /**
      * Returns the value of the basic search condition.
      *
      * @returns Value of search condition or empty
      */
    def getSearch(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowGoButton showGoButton}.
      *
      * Determines whether the Go button is visible in the filter bar.
      *  **Note**: If the `liveMode` property is set to `true`, it is ignored.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showGoButton`
      */
    def getShowGoButton(): Boolean = js.native
    
    /**
      * @since 1.74
      *
      * Gets current value of property {@link #getShowMessages showMessages}.
      *
      * Displays possible errors during the search in a message box.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showMessages`
      */
    def getShowMessages(): Boolean = js.native
    
    /**
      * @since 1.79.0
      *
      * Gets current value of property {@link #getSuspendSelection suspendSelection}.
      *
      * If set to `true`, all search requests are ignored. Once it has been set to `false`, a search is triggered
      * immediately if one or more search requests have been triggered in the meantime but were ignored based
      * on the setting.
      *
      * Default value is `false`.
      *
      * @returns Value of property `suspendSelection`
      */
    def getSuspendSelection(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getVariantBackreference variantBackreference},
      * or `null`.
      */
    def getVariantBackreference(): ID = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.FilterField` in the aggregation {@link #getFilterItems filterItems}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilterItem(
      /**
      * The filterItem whose index is looked for
      */
    oFilterItem: typings.openui5.sapUiMdcFilterFieldMod.default
    ): int = js.native
    
    /**
      * Returns the state of initialization. This method does not trigger the retrieval of the metadata.
      *
      * @returns Resolves after the initial filters have been applied
      */
    def initialized(): js.Promise[Any] = js.native
    
    /**
      * Returns the state of initialization. This method triggers the retrieval of the metadata.
      *
      * @returns Resolves after the initial filters have been applied and the metadata has been obtained
      */
    def initializedWithMetadata(): js.Promise[Any] = js.native
    
    /**
      * Inserts a filterItem into the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilterItem(
      /**
      * The filterItem to insert; if empty, nothing is inserted
      */
    oFilterItem: typings.openui5.sapUiMdcFilterFieldMod.default,
      /**
      * The `0`-based index the filterItem should be inserted at; for a negative value of `iIndex`, the filterItem
      * is inserted at position 0; for a value greater than the current size of the aggregation, the filterItem
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilterItems filterItems}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilterItems(): js.Array[typings.openui5.sapUiMdcFilterFieldMod.default] = js.native
    
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: String): typings.openui5.sapUiMdcFilterFieldMod.default | Null = js.native
    /**
      * Removes a filterItem from the aggregation {@link #getFilterItems filterItems}.
      *
      * @returns The removed filterItem or `null`
      */
    def removeFilterItem(/**
      * The filterItem to remove or its index or id
      */
    vFilterItem: int): typings.openui5.sapUiMdcFilterFieldMod.default | Null = js.native
    def removeFilterItem(
      /**
      * The filterItem to remove or its index or id
      */
    vFilterItem: typings.openui5.sapUiMdcFilterFieldMod.default
    ): typings.openui5.sapUiMdcFilterFieldMod.default | Null = js.native
    
    /**
      * Sets the aggregated {@link #getBasicSearchField basicSearchField}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBasicSearchField(
      /**
      * The basicSearchField to set
      */
    oBasicSearchField: typings.openui5.sapUiMdcFilterFieldMod.default
    ): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Defines the path to the metadata retrieval class for the `FilterBarBase` control. It basically identifies
      * the {@link sap.ui.mdc.FilterBarDelegate FilterBarDelegate} file that provides the required APIs to create
      * the filter bar content.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  **Note:** This property must not be bound.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    /**
      * @since 1.66.0
      *
      * Sets a new value for property {@link #getFilterConditions filterConditions}.
      *
      * Specifies the filter conditions.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility. Do not use it otherwise.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `{}`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterConditions(): this.type = js.native
    def setFilterConditions(/**
      * New value for property `filterConditions`
      */
    oFilterConditions: js.Object): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Sets a new value for property {@link #getLiveMode liveMode}.
      *
      * Triggers a search automatically after a filter value has been changed.
      *  **Note:** The `liveMode` property only operates in non-mobile scenarios.
      *  Additionally, if the `liveMode` property is active, the following applies:
      *  The error message box is not displayed, and the `showMessages` property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLiveMode(): this.type = js.native
    def setLiveMode(/**
      * New value for property `liveMode`
      */
    bLiveMode: Boolean): this.type = js.native
    
    /**
      * @since 1.97
      *
      * Sets a new value for property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the filter metadata.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility/ Fiori Elements. Do not use it otherwise.
      *  **Node**: Please check {@link sap.ui.mdc.filterbar.PropertyInfo} for more information about the supported
      * inner elements.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyInfo(): this.type = js.native
    def setPropertyInfo(/**
      * New value for property `propertyInfo`
      */
    oPropertyInfo: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowGoButton showGoButton}.
      *
      * Determines whether the Go button is visible in the filter bar.
      *  **Note**: If the `liveMode` property is set to `true`, it is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowGoButton(): this.type = js.native
    def setShowGoButton(/**
      * New value for property `showGoButton`
      */
    bShowGoButton: Boolean): this.type = js.native
    
    /**
      * @since 1.74
      *
      * Sets a new value for property {@link #getShowMessages showMessages}.
      *
      * Displays possible errors during the search in a message box.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowMessages(): this.type = js.native
    def setShowMessages(/**
      * New value for property `showMessages`
      */
    bShowMessages: Boolean): this.type = js.native
    
    /**
      * @since 1.79.0
      *
      * Sets a new value for property {@link #getSuspendSelection suspendSelection}.
      *
      * If set to `true`, all search requests are ignored. Once it has been set to `false`, a search is triggered
      * immediately if one or more search requests have been triggered in the meantime but were ignored based
      * on the setting.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSuspendSelection(): this.type = js.native
    def setSuspendSelection(/**
      * New value for property `suspendSelection`
      */
    bSuspendSelection: Boolean): this.type = js.native
    
    /**
      * Sets the associated {@link #getVariantBackreference variantBackreference}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVariantBackreference(
      /**
      * ID of an element which becomes the new target of this variantBackreference association; alternatively,
      * an element instance may be given
      */
    oVariantBackreference: ID
    ): this.type = js.native
    def setVariantBackreference(
      /**
      * ID of an element which becomes the new target of this variantBackreference association; alternatively,
      * an element instance may be given
      */
    oVariantBackreference: typings.openui5.sapUiFlVariantsVariantManagementMod.default
    ): this.type = js.native
    
    /**
      * Triggers the search.
      *
      * @returns Returns a Promise which resolves after the validation of erroneous fields has been propagated.
      */
    def triggerSearch(): js.Promise[Any] = js.native
    
    /**
      * Returns a `Promise` for the asynchronous validation of filters.
      *
      * @returns Returns a `Promise` that resolves after the validation of erroneous fields has been propagated.
      */
    def validate(
      /**
      * Determines if the `search` event is triggered after successful validation
      */
    bSuppressSearch: Boolean
    ): js.Promise[Any] = js.native
  }
  
  trait FilterBarBase$FiltersChangedEventParameters extends StObject {
    
    /**
      * Indicates if the event is based on condition changes
      */
    var conditionsBased: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Display text for a collapsed header
      */
    var filtersText: js.UndefOr[String] = js.undefined
    
    /**
      * Display text for an expanded header
      */
    var filtersTextExpanded: js.UndefOr[String] = js.undefined
  }
  object FilterBarBase$FiltersChangedEventParameters {
    
    inline def apply(): FilterBarBase$FiltersChangedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterBarBase$FiltersChangedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterBarBase$FiltersChangedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setConditionsBased(value: Boolean): Self = StObject.set(x, "conditionsBased", value.asInstanceOf[js.Any])
      
      inline def setConditionsBasedUndefined: Self = StObject.set(x, "conditionsBased", js.undefined)
      
      inline def setFiltersText(value: String): Self = StObject.set(x, "filtersText", value.asInstanceOf[js.Any])
      
      inline def setFiltersTextExpanded(value: String): Self = StObject.set(x, "filtersTextExpanded", value.asInstanceOf[js.Any])
      
      inline def setFiltersTextExpandedUndefined: Self = StObject.set(x, "filtersTextExpanded", js.undefined)
      
      inline def setFiltersTextUndefined: Self = StObject.set(x, "filtersText", js.undefined)
    }
  }
  
  trait FilterBarBase$SearchEventParameters extends StObject
  
  type FilterBarBaseFiltersChangedEvent = typings.openui5.sapUiBaseEventMod.default[FilterBarBase$FiltersChangedEventParameters]
  
  type FilterBarBaseFiltersChangedEventParameters = FilterBarBase$FiltersChangedEventParameters
  
  type FilterBarBaseSearchEvent = typings.openui5.sapUiBaseEventMod.default[FilterBarBase$SearchEventParameters]
  
  type FilterBarBaseSearchEventParameters = FilterBarBase$SearchEventParameters
  
  trait FilterBarBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Contains the optional basic search field. **Note:** This field has to be bound against the `$search`
      * property.
      */
    var basicSearchField: js.UndefOr[typings.openui5.sapUiMdcFilterFieldMod.default] = js.undefined
    
    /**
      * @since 1.66.0
      *
      * Specifies the filter conditions.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility. Do not use it otherwise.
      */
    var filterConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains all the displayed {@link sap.ui.mdc.FilterField filter fields} of the `FilterBarBase` control.
      */
    var filterItems: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcFilterFieldMod.default] | typings.openui5.sapUiMdcFilterFieldMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired after either a filter value or the visibility of a filter item has been changed.
      */
    var filtersChanged: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FilterBarBase$FiltersChangedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.74
      *
      * Triggers a search automatically after a filter value has been changed.
      *  **Note:** The `liveMode` property only operates in non-mobile scenarios.
      *  Additionally, if the `liveMode` property is active, the following applies:
      *  The error message box is not displayed, and the `showMessages` property is ignored.
      */
    var liveMode: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.97
      *
      * Specifies the filter metadata.
      *  **Note**: This property must not be bound.
      *  **Note**: This property is used exclusively for SAPUI5 flexibility/ Fiori Elements. Do not use it otherwise.
      *  **Node**: Please check {@link sap.ui.mdc.filterbar.PropertyInfo} for more information about the supported
      * inner elements.
      */
    var propertyInfo: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when the Go button is pressed or after a condition change, when `liveMode` is active.
      * **Note**: This event should never be executed programmatically. It is triggered internally by the filter
      * bar after a `triggerSearch` has been executed
      */
    var search: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Determines whether the Go button is visible in the filter bar.
      *  **Note**: If the `liveMode` property is set to `true`, it is ignored.
      */
    var showGoButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.74
      *
      * Displays possible errors during the search in a message box.
      */
    var showMessages: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.79.0
      *
      * If set to `true`, all search requests are ignored. Once it has been set to `false`, a search is triggered
      * immediately if one or more search requests have been triggered in the meantime but were ignored based
      * on the setting.
      */
    var suspendSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * {@link sap.ui.fl.variants.VariantManagement VariantManagement} control for the filter bar. **Note**:
      * This association is only required to get information from {@link https://ui5.sap.com/#/topic/a8e55aa2f8bc4127923b20685a6d1621 SAPUI5 Flexibility }
      * whenever a variant was applied, with 'apply automatically' set to `true`. **Note**: This association
      * must only be assigned once.
      */
    var variantBackreference: js.UndefOr[typings.openui5.sapUiFlVariantsVariantManagementMod.default | String] = js.undefined
  }
  object FilterBarBaseSettings {
    
    inline def apply(): FilterBarBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterBarBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterBarBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setBasicSearchField(value: typings.openui5.sapUiMdcFilterFieldMod.default): Self = StObject.set(x, "basicSearchField", value.asInstanceOf[js.Any])
      
      inline def setBasicSearchFieldUndefined: Self = StObject.set(x, "basicSearchField", js.undefined)
      
      inline def setFilterConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterConditions", value.asInstanceOf[js.Any])
      
      inline def setFilterConditionsUndefined: Self = StObject.set(x, "filterConditions", js.undefined)
      
      inline def setFilterItems(
        value: js.Array[typings.openui5.sapUiMdcFilterFieldMod.default] | typings.openui5.sapUiMdcFilterFieldMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filterItems", value.asInstanceOf[js.Any])
      
      inline def setFilterItemsUndefined: Self = StObject.set(x, "filterItems", js.undefined)
      
      inline def setFilterItemsVarargs(value: typings.openui5.sapUiMdcFilterFieldMod.default*): Self = StObject.set(x, "filterItems", js.Array(value*))
      
      inline def setFiltersChanged(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[FilterBarBase$FiltersChangedEventParameters] => Unit
      ): Self = StObject.set(x, "filtersChanged", js.Any.fromFunction1(value))
      
      inline def setFiltersChangedUndefined: Self = StObject.set(x, "filtersChanged", js.undefined)
      
      inline def setLiveMode(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "liveMode", value.asInstanceOf[js.Any])
      
      inline def setLiveModeUndefined: Self = StObject.set(x, "liveMode", js.undefined)
      
      inline def setPropertyInfo(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "propertyInfo", value.asInstanceOf[js.Any])
      
      inline def setPropertyInfoUndefined: Self = StObject.set(x, "propertyInfo", js.undefined)
      
      inline def setSearch(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setShowGoButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showGoButton", value.asInstanceOf[js.Any])
      
      inline def setShowGoButtonUndefined: Self = StObject.set(x, "showGoButton", js.undefined)
      
      inline def setShowMessages(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMessages", value.asInstanceOf[js.Any])
      
      inline def setShowMessagesUndefined: Self = StObject.set(x, "showMessages", js.undefined)
      
      inline def setSuspendSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "suspendSelection", value.asInstanceOf[js.Any])
      
      inline def setSuspendSelectionUndefined: Self = StObject.set(x, "suspendSelection", js.undefined)
      
      inline def setVariantBackreference(value: typings.openui5.sapUiFlVariantsVariantManagementMod.default | String): Self = StObject.set(x, "variantBackreference", value.asInstanceOf[js.Any])
      
      inline def setVariantBackreferenceUndefined: Self = StObject.set(x, "variantBackreference", js.undefined)
    }
  }
}
