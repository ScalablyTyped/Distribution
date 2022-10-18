package typings.openui5

import typings.openui5.anon.CurrentPage
import typings.openui5.anon.FilterId
import typings.openui5.anon.NumberOfRows
import typings.openui5.anon.SorterId
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.RowRepeaterDesign
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsRowRepeaterMod {
  
  @JSImport("sap/ui/commons/RowRepeater", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RowRepeater.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RowRepeater {
    def this(/**
      * initial settings for the new control
      */
    mSettings: RowRepeaterSettings) = this()
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
    mSettings: RowRepeaterSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: RowRepeaterSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/RowRepeater", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.RowRepeater with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, RowRepeater]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RowRepeater],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.RowRepeater.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RowRepeater
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some filter to the aggregation {@link #getFilters filters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addFilter(
      /**
      * The filter to add; if empty, nothing is inserted
      */
    oFilter: typings.openui5.sapUiCommonsRowRepeaterFilterMod.default
    ): this.type = js.native
    
    /**
      * Adds some row to the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addRow(
      /**
      * The row to add; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some sorter to the aggregation {@link #getSorters sorters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addSorter(
      /**
      * The sorter to add; if empty, nothing is inserted
      */
    oSorter: typings.openui5.sapUiCommonsRowRepeaterSorterMod.default
    ): this.type = js.native
    
    /**
      * Applies a filter.
      */
    def applyFilter(/**
      * The ID if the filter.
      */
    sId: String): Unit = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filter filter} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when a filter is set.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachFilter(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:filter filter} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when a filter is set.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachFilter(
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
    def attachFilter(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:page page} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when paging was executed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPage(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:page page} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when paging was executed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPage(
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
    def attachPage(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when the number of rows was changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachResize(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:resize resize} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when the number of rows was changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachResize(
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
    def attachResize(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sort sort} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when a sorting is applied.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSort(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSort(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:sort sort} event of this `sap.ui.commons.RowRepeater`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.RowRepeater` itself.
      *
      * This event is triggered when a sorting is applied.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSort(
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
    def attachSort(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.RowRepeater` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getRows rows} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindRows(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the filters in the aggregation {@link #getFilters filters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilters(): this.type = js.native
    
    /**
      * Destroys the noData in the aggregation {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNoData(): this.type = js.native
    
    /**
      * Destroys all the rows in the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRows(): this.type = js.native
    
    /**
      * Destroys all the sorters in the aggregation {@link #getSorters sorters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySorters(): this.type = js.native
    
    /**
      * Destroys the title in the aggregation {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTitle(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:filter filter} event of this `sap.ui.commons.RowRepeater`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachFilter(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachFilter(
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
      * Detaches event handler `fnFunction` from the {@link #event:page page} event of this `sap.ui.commons.RowRepeater`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPage(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPage(
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
      * Detaches event handler `fnFunction` from the {@link #event:resize resize} event of this `sap.ui.commons.RowRepeater`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachResize(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachResize(
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
      * Detaches event handler `fnFunction` from the {@link #event:sort sort} event of this `sap.ui.commons.RowRepeater`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSort(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSort(
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
      * Fires event {@link #event:filter filter} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFilter(): this.type = js.native
    def fireFilter(/**
      * Parameters to pass along with the event
      */
    mParameters: FilterId): this.type = js.native
    
    /**
      * Fires event {@link #event:page page} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePage(): this.type = js.native
    def firePage(/**
      * Parameters to pass along with the event
      */
    mParameters: CurrentPage): this.type = js.native
    
    /**
      * Fires event {@link #event:resize resize} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireResize(): this.type = js.native
    def fireResize(/**
      * Parameters to pass along with the event
      */
    mParameters: NumberOfRows): this.type = js.native
    
    /**
      * Fires event {@link #event:sort sort} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSort(): this.type = js.native
    def fireSort(/**
      * Parameters to pass along with the event
      */
    mParameters: SorterId): this.type = js.native
    
    /**
      * Switch to first page.
      */
    def firstPage(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getCurrentPage currentPage}.
      *
      * The index of the page currently displayed. The index starts at 1.
      *
      * Default value is `1`.
      *
      * @returns Value of property `currentPage`
      */
    def getCurrentPage(): int = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * The visual design of the control.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): RowRepeaterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RowRepeaterDesign * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getFilters filters}.
      *
      * Filters to be provided in toolbar.
      */
    def getFilters(): js.Array[typings.openui5.sapUiCommonsRowRepeaterFilterMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getFixedRowHeight fixedRowHeight}.
      *
      * Row height adapts to rendered content. If a fixed height is specified the cells have a maximum height
      * and the overflow will be hidden.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `fixedRowHeight`
      */
    def getFixedRowHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getNoData noData}.
      *
      * This control is shown, in case there is no data available to be displayed in the RowRepeater.
      */
    def getNoData(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getNumberOfRows numberOfRows}.
      *
      * Number of rows displayed.
      *
      * Default value is `5`.
      *
      * @returns Value of property `numberOfRows`
      */
    def getNumberOfRows(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getRows rows}.
      *
      * Rows to be repeated.
      */
    def getRows(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowMoreSteps showMoreSteps}.
      *
      * Step size used to increase the numberOfRows value. This feature is only active if value is greater than
      * 0. This will deactivate the paging feature.
      *
      * Default value is `0`.
      *
      * @returns Value of property `showMoreSteps`
      */
    def getShowMoreSteps(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getSorters sorters}.
      *
      * Sorters to be provided in secondary toolbar.
      */
    def getSorters(): js.Array[typings.openui5.sapUiCommonsRowRepeaterSorterMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getThreshold threshold}.
      *
      * Threshold to fetch the next chunk of data. The minimal threshold can be the numberOfRows of the RR.
      *
      * @returns Value of property `threshold`
      */
    def getThreshold(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getTitle title}.
      *
      * Title to be displayed in top left corner. Either text or icon.
      */
    def getTitle(): typings.openui5.sapUiCoreTitleMod.default = js.native
    
    /**
      * Switch to specified page.
      */
    def gotoPage(/**
      * The index of the page to go to.
      */
    iPageNumber: int): Unit = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.RowRepeaterFilter` in the aggregation {@link #getFilters filters}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfFilter(
      /**
      * The filter whose index is looked for
      */
    oFilter: typings.openui5.sapUiCommonsRowRepeaterFilterMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getRows rows}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfRow(/**
      * The row whose index is looked for
      */
    oRow: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.RowRepeaterSorter` in the aggregation {@link #getSorters sorters}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfSorter(
      /**
      * The sorter whose index is looked for
      */
    oSorter: typings.openui5.sapUiCommonsRowRepeaterSorterMod.default
    ): int = js.native
    
    /**
      * Inserts a filter into the aggregation {@link #getFilters filters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertFilter(
      /**
      * The filter to insert; if empty, nothing is inserted
      */
    oFilter: typings.openui5.sapUiCommonsRowRepeaterFilterMod.default,
      /**
      * The `0`-based index the filter should be inserted at; for a negative value of `iIndex`, the filter is
      * inserted at position 0; for a value greater than the current size of the aggregation, the filter is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a row into the aggregation {@link #getRows rows}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertRow(
      /**
      * The row to insert; if empty, nothing is inserted
      */
    oRow: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the row should be inserted at; for a negative value of `iIndex`, the row is inserted
      * at position 0; for a value greater than the current size of the aggregation, the row is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a sorter into the aggregation {@link #getSorters sorters}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertSorter(
      /**
      * The sorter to insert; if empty, nothing is inserted
      */
    oSorter: typings.openui5.sapUiCommonsRowRepeaterSorterMod.default,
      /**
      * The `0`-based index the sorter should be inserted at; for a negative value of `iIndex`, the sorter is
      * inserted at position 0; for a value greater than the current size of the aggregation, the sorter is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Switch to last page.
      */
    def lastPage(): Unit = js.native
    
    /**
      * Switch to next page.
      */
    def nextPage(): Unit = js.native
    
    /**
      * Switch to previous page.
      */
    def previousPage(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getFilters filters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllFilters(): js.Array[typings.openui5.sapUiCommonsRowRepeaterFilterMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getRows rows}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllRows(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getSorters sorters}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllSorters(): js.Array[typings.openui5.sapUiCommonsRowRepeaterSorterMod.default] = js.native
    
    def removeFilter(/**
      * The filter to remove or its index or id
      */
    vFilter: String): typings.openui5.sapUiCommonsRowRepeaterFilterMod.default | Null = js.native
    /**
      * Removes a filter from the aggregation {@link #getFilters filters}.
      *
      * @returns The removed filter or `null`
      */
    def removeFilter(/**
      * The filter to remove or its index or id
      */
    vFilter: int): typings.openui5.sapUiCommonsRowRepeaterFilterMod.default | Null = js.native
    def removeFilter(
      /**
      * The filter to remove or its index or id
      */
    vFilter: typings.openui5.sapUiCommonsRowRepeaterFilterMod.default
    ): typings.openui5.sapUiCommonsRowRepeaterFilterMod.default | Null = js.native
    
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a row from the aggregation {@link #getRows rows}.
      *
      * @returns The removed row or `null`
      */
    def removeRow(/**
      * The row to remove or its index or id
      */
    vRow: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeRow(
      /**
      * The row to remove or its index or id
      */
    vRow: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeSorter(/**
      * The sorter to remove or its index or id
      */
    vSorter: String): typings.openui5.sapUiCommonsRowRepeaterSorterMod.default | Null = js.native
    /**
      * Removes a sorter from the aggregation {@link #getSorters sorters}.
      *
      * @returns The removed sorter or `null`
      */
    def removeSorter(/**
      * The sorter to remove or its index or id
      */
    vSorter: int): typings.openui5.sapUiCommonsRowRepeaterSorterMod.default | Null = js.native
    def removeSorter(
      /**
      * The sorter to remove or its index or id
      */
    vSorter: typings.openui5.sapUiCommonsRowRepeaterSorterMod.default
    ): typings.openui5.sapUiCommonsRowRepeaterSorterMod.default | Null = js.native
    
    /**
      * Resizes the row repeater by changing the number of displayed rows. This method will only resize the RowRepeater
      * if the property showMoreSteps is set.
      */
    def resize(/**
      * The new value of number of rows displayed.
      */
    iNumberOfRows: int): Unit = js.native
    
    /**
      * Setter for property `currentPage`.
      *
      * @returns `this` to allow method chaining
      */
    def setCurrentPage(/**
      * new value for property `currentPage`
      */
    iCurrentPage: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * The visual design of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RowRepeaterDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: RowRepeaterDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFixedRowHeight fixedRowHeight}.
      *
      * Row height adapts to rendered content. If a fixed height is specified the cells have a maximum height
      * and the overflow will be hidden.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFixedRowHeight(): this.type = js.native
    def setFixedRowHeight(/**
      * New value for property `fixedRowHeight`
      */
    sFixedRowHeight: CSSSize): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoData(/**
      * The noData to set
      */
    oNoData: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Setter for property `numberOfRows`.
      *
      * Default value is `5`
      *
      * @returns `this` to allow method chaining
      */
    def setNumberOfRows(/**
      * new value for property `numberOfRows`
      */
    iNumberOfRows: int): this.type = js.native
    
    /**
      * Override the default behavior of `setShowMoreSteps` to update the paging mode flag. Any change to the
      * paging mode flag will result in the current page being set to the first page.
      *
      * @returns `this` to allow method chaining
      */
    def setShowMoreSteps(/**
      * new value for property `showMoreSteps`
      */
    iShowMoreSteps: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getThreshold threshold}.
      *
      * Threshold to fetch the next chunk of data. The minimal threshold can be the numberOfRows of the RR.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThreshold(): this.type = js.native
    def setThreshold(/**
      * New value for property `threshold`
      */
    iThreshold: int): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTitle title}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * The title to set
      */
    oTitle: typings.openui5.sapUiCoreTitleMod.default): this.type = js.native
    
    /**
      * The `triggerShowMore` function increments the number of rows by the value of `showMoreSteps`.
      *
      * This method will only trigger a showMore if the property showMoreSteps is set.
      *
      * @returns `this` to allow method chaining
      */
    def triggerShowMore(): this.type = js.native
    
    /**
      * Sort the data.
      */
    def triggerSort(/**
      * The ID of the sorter.
      */
    sId: String): Unit = js.native
    
    /**
      * Unbinds aggregation {@link #getRows rows} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindRows(): this.type = js.native
  }
  
  trait RowRepeaterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The index of the page currently displayed. The index starts at 1.
      */
    var currentPage: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The visual design of the control.
      */
    var design: js.UndefOr[
        RowRepeaterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RowRepeaterDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * This event is triggered when a filter is set.
      */
    var filter: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Filters to be provided in toolbar.
      */
    var filters: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsRowRepeaterFilterMod.default] | typings.openui5.sapUiCommonsRowRepeaterFilterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Row height adapts to rendered content. If a fixed height is specified the cells have a maximum height
      * and the overflow will be hidden.
      */
    var fixedRowHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This control is shown, in case there is no data available to be displayed in the RowRepeater.
      */
    var noData: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Number of rows displayed.
      */
    var numberOfRows: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is triggered when paging was executed.
      */
    var page: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * This event is triggered when the number of rows was changed.
      */
    var resize: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Rows to be repeated.
      */
    var rows: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Step size used to increase the numberOfRows value. This feature is only active if value is greater than
      * 0. This will deactivate the paging feature.
      */
    var showMoreSteps: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * This event is triggered when a sorting is applied.
      */
    var sort: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sorters to be provided in secondary toolbar.
      */
    var sorters: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsRowRepeaterSorterMod.default] | typings.openui5.sapUiCommonsRowRepeaterSorterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Threshold to fetch the next chunk of data. The minimal threshold can be the numberOfRows of the RR.
      */
    var threshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Title to be displayed in top left corner. Either text or icon.
      */
    var title: js.UndefOr[typings.openui5.sapUiCoreTitleMod.default] = js.undefined
  }
  object RowRepeaterSettings {
    
    inline def apply(): RowRepeaterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowRepeaterSettings]
    }
    
    extension [Self <: RowRepeaterSettings](x: Self) {
      
      inline def setCurrentPage(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
      
      inline def setDesign(
        value: RowRepeaterDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RowRepeaterDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setFilter(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilters(
        value: js.Array[typings.openui5.sapUiCommonsRowRepeaterFilterMod.default] | typings.openui5.sapUiCommonsRowRepeaterFilterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.openui5.sapUiCommonsRowRepeaterFilterMod.default*): Self = StObject.set(x, "filters", js.Array(value*))
      
      inline def setFixedRowHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "fixedRowHeight", value.asInstanceOf[js.Any])
      
      inline def setFixedRowHeightUndefined: Self = StObject.set(x, "fixedRowHeight", js.undefined)
      
      inline def setNoData(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setNumberOfRows(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "numberOfRows", value.asInstanceOf[js.Any])
      
      inline def setNumberOfRowsUndefined: Self = StObject.set(x, "numberOfRows", js.undefined)
      
      inline def setPage(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "page", js.Any.fromFunction1(value))
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setResize(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setRows(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setShowMoreSteps(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showMoreSteps", value.asInstanceOf[js.Any])
      
      inline def setShowMoreStepsUndefined: Self = StObject.set(x, "showMoreSteps", js.undefined)
      
      inline def setSort(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSorters(
        value: js.Array[typings.openui5.sapUiCommonsRowRepeaterSorterMod.default] | typings.openui5.sapUiCommonsRowRepeaterSorterMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
      
      inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
      
      inline def setSortersVarargs(value: typings.openui5.sapUiCommonsRowRepeaterSorterMod.default*): Self = StObject.set(x, "sorters", js.Array(value*))
      
      inline def setThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTitle(value: typings.openui5.sapUiCoreTitleMod.default): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
