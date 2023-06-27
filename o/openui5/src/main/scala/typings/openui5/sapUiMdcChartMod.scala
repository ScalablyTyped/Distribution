package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.SelectionDetailsActionLevel
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TitleLevel
import typings.openui5.sapUiMdcControlMod.ControlSettings
import typings.openui5.sapUiMdcEnumsChartP13nModeMod.ChartP13nMode
import typings.openui5.sapUiMdcEnumsChartToolbarActionTypeMod.ChartToolbarActionType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcChartMod {
  
  @JSImport("sap/ui/mdc/Chart", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Chart.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Chart {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ChartSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ChartSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ChartSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/Chart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.Chart with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Chart]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Chart],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.Chart.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Chart
    extends typings.openui5.sapUiMdcControlMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
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
    oItem: typings.openui5.sapUiMdcChartItemMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionDetailsActionPressed selectionDetailsActionPressed }
      * event of this `sap.ui.mdc.Chart`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Chart` itself.
      *
      * This event is fired when a `SelectionDetailsAction` is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionDetailsActionPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit]
    ): this.type = js.native
    def attachSelectionDetailsActionPressed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Chart` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionDetailsActionPressed selectionDetailsActionPressed }
      * event of this `sap.ui.mdc.Chart`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.Chart` itself.
      *
      * This event is fired when a `SelectionDetailsAction` is pressed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionDetailsActionPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit]
    ): this.type = js.native
    def attachSelectionDetailsActionPressed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.Chart` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @since 1.107
      *
      * Destroys the noData in the aggregation {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNoData(): this.type = js.native
    
    /**
      * Destroys the selectionDetailsActions in the aggregation {@link #getSelectionDetailsActions selectionDetailsActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySelectionDetailsActions(): this.type = js.native
    
    /**
      * Destroys the variant in the aggregation {@link #getVariant variant}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyVariant(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:selectionDetailsActionPressed selectionDetailsActionPressed }
      * event of this `sap.ui.mdc.Chart`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionDetailsActionPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit]
    ): this.type = js.native
    def detachSelectionDetailsActionPressed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ChartSelectionDetailsActionPressedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionDetailsActionPressed selectionDetailsActionPressed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionDetailsActionPressed(): this.type = js.native
    def fireSelectionDetailsActionPressed(
      /**
      * Parameters to pass along with the event
      */
    mParameters: Chart$SelectionDetailsActionPressedEventParameters
    ): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * This aggregation describes actions that are added to the chart toolbar.
      *  For more information, see {@link sap.ui.mdc.actiontoolbar.ActionToolbarAction}.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getAutoBindOnInit autoBindOnInit}.
      *
      * If set to `true`, the chart is automatically bound after initialization.
      *  If set to `false`, the chart is bound after the first call to `rebind`.
      *
      * Default value is `true`.
      *
      * @returns Value of property `autoBindOnInit`
      */
    def getAutoBindOnInit(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getChartType chartType}.
      *
      * Specifies the type of chart to be created by the `Chart` control.
      *
      * Default value is `"column"`.
      *
      * @returns Value of property `chartType`
      */
    def getChartType(): String = js.native
    
    /**
      * Retrieves the chart type layout configuration. **Note:** This is only used inside personalization.
      *
      * @returns Layout configuration
      */
    def getChartTypeLayoutConfig(): js.Object = js.native
    
    /**
      * Getter for `Conditions` set in the personalization settings.
      *
      * @returns Filters set in the chart
      */
    def getConditions(): js.Object = js.native
    
    /**
      * @since 1.88
      *
      * ID of the element which is the current target of the association {@link #getFilter filter}, or `null`.
      */
    def getFilter(): ID = js.native
    
    /**
      * @since 1.99
      *
      * Gets current value of property {@link #getFilterConditions filterConditions}.
      *
      * Defines the filter conditions.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
      *
      * Default value is `{}`.
      *
      * @returns Value of property `filterConditions`
      */
    def getFilterConditions(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getHeader header}.
      *
      * Specifies header text that is shown in the chart.
      *
      * @returns Value of property `header`
      */
    def getHeader(): String = js.native
    
    /**
      * @since 1.104
      *
      * Gets current value of property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header.
      *  For more information, see {@link sap.m.Title#setLevel}.
      *
      * Default value is `Auto`.
      *
      * @returns Value of property `headerLevel`
      */
    def getHeaderLevel(): TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) = js.native
    
    /**
      * @since 1.111
      *
      * Gets current value of property {@link #getHeaderVisible headerVisible}.
      *
      * Determines whether the header text is shown in the chart. Regardless of its value, the given header text
      * is used to label the chart correctly for accessibility purposes.
      *
      * Default value is `true`.
      *
      * @returns Value of property `headerVisible`
      */
    def getHeaderVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the chart.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getIgnoreToolbarActions ignoreToolbarActions}.
      *
      * Specifies which actions must not be available in the chart's toolbar.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `ignoreToolbarActions`
      */
    def getIgnoreToolbarActions(): js.Array[
        ChartToolbarActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartToolbarActionType * / any */ String)
      ] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * This property describes the measures and dimensions visible in the chart. Changes in the personalization
      * are also reflected here.
      */
    def getItems(): js.Array[typings.openui5.sapUiMdcChartItemMod.default] = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getLegendVisible legendVisible}.
      *
      * Enables the legend of the chart. **Note:** The setter calls `setLegendVisible` of the delegate class.
      *
      * Default value is `true`.
      *
      * @returns Value of property `legendVisible`
      */
    def getLegendVisible(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMinHeight minHeight}.
      *
      * Defines the minimum height.
      *
      * Default value is `"400px"`.
      *
      * @returns Value of property `minHeight`
      */
    def getMinHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width.
      *
      * Default value is `"240px"`.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * @since 1.107
      *
      * Gets content of aggregation {@link #getNoData noData}.
      *
      * Defines the custom visualization if there is no data available.
      *  This control will be displayed on top of the chart when no data is visible inside the chart.
      *  **Note:** If both a `noDataText` property and a `noData` aggregation are provided, the `noData` aggregation
      * takes priority.
      *  If the `noData` aggregation is undefined or set to null, the `noDataText` property is used instead.
      */
    def getNoData(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Defines the no data text shown in the chart.
      *
      * Default value is `"No data"`.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getP13nMode p13nMode}.
      *
      * Specifies the personalization options available for the chart.
      *  **Note:** The order of the provided options does not influence the arrangement of the icons on the UI.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `p13nMode`
      */
    def getP13nMode(): js.Array[
        ChartP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartP13nMode * / any */ String)
      ] = js.native
    
    /**
      * @since 1.99
      *
      * Gets current value of property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the chart metadata.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      *
      * **Note**: For more information about the supported inner elements, see {@link sap.ui.mdc.chart.PropertyInfo PropertyInfo}.
      *
      * Default value is `[]`.
      *
      * @returns Value of property `propertyInfo`
      */
    def getPropertyInfo(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getSelectionDetailsActions selectionDetailsActions}.
      *
      * Feeds details actions for data point selection in the mdc chart.
      *  For more information, see {@link sap.ui.mdc.chart.SelectionDetailsActions SelectionDetailsActions}.
      */
    def getSelectionDetailsActions(): typings.openui5.sapUiMdcChartSelectionDetailsActionsMod.default = js.native
    
    /**
      * Retrieves the selection handler of the inner chart.
      *
      * @returns Selection handler of the inner chart
      */
    def getSelectionHandler(): js.Object = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getShowChartTooltip showChartTooltip}.
      *
      * Controls the visibility of the chart tooltip. If set to `true`, a call of the `delegate.setChartTooltipVisibility`
      * will be triggered and can be used to make the `Chart` tooltip visible.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showChartTooltip`
      */
    def getShowChartTooltip(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSelectionDetails showSelectionDetails}.
      *
      * Enables the Details button in the chart toolbar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showSelectionDetails`
      */
    def getShowSelectionDetails(): Boolean = js.native
    
    /**
      * @since 1.88
      *
      * Gets current value of property {@link #getSortConditions sortConditions}.
      *
      * Defines the sort conditions.
      *
      *
      * **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
      *
      * @returns Value of property `sortConditions`
      */
    def getSortConditions(): js.Object = js.native
    
    /**
      * Gets content of aggregation {@link #getVariant variant}.
      *
      * Reference to a {@link sap.ui.fl.variants.VariantManagement} control for the chart.
      */
    def getVariant(): typings.openui5.sapUiFlVariantsVariantManagementMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the chart.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.chart.Item` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiMdcChartItemMod.default
    ): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
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
    oItem: typings.openui5.sapUiMdcChartItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiMdcChartItemMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiMdcChartItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiMdcChartItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiMdcChartItemMod.default
    ): typings.openui5.sapUiMdcChartItemMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAutoBindOnInit autoBindOnInit}.
      *
      * If set to `true`, the chart is automatically bound after initialization.
      *  If set to `false`, the chart is bound after the first call to `rebind`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoBindOnInit(): this.type = js.native
    def setAutoBindOnInit(/**
      * New value for property `autoBindOnInit`
      */
    bAutoBindOnInit: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Defines the module path of the metadata delegate.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(): this.type = js.native
    
    def setFilter(
      /**
      * ID of an element which becomes the new target of this filter association; alternatively, an element instance
      * may be given
      */
    oFilter: /* was: sap.ui.mdc.IFilter */ Any
    ): this.type = js.native
    /**
      * @since 1.88
      *
      * Sets the associated {@link #getFilter filter}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilter(
      /**
      * ID of an element which becomes the new target of this filter association; alternatively, an element instance
      * may be given
      */
    oFilter: ID
    ): this.type = js.native
    
    /**
      * @since 1.99
      *
      * Sets a new value for property {@link #getFilterConditions filterConditions}.
      *
      * Defines the filter conditions.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
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
      * Sets a new value for property {@link #getHeader header}.
      *
      * Specifies header text that is shown in the chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeader(): this.type = js.native
    def setHeader(/**
      * New value for property `header`
      */
    sHeader: String): this.type = js.native
    
    /**
      * @since 1.104
      *
      * Sets a new value for property {@link #getHeaderLevel headerLevel}.
      *
      * Semantic level of the header.
      *  For more information, see {@link sap.m.Title#setLevel}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Auto`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderLevel(): this.type = js.native
    def setHeaderLevel(
      /**
      * New value for property `headerLevel`
      */
    sHeaderLevel: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String
    ): this.type = js.native
    def setHeaderLevel(/**
      * New value for property `headerLevel`
      */
    sHeaderLevel: TitleLevel): this.type = js.native
    
    /**
      * @since 1.111
      *
      * Sets a new value for property {@link #getHeaderVisible headerVisible}.
      *
      * Determines whether the header text is shown in the chart. Regardless of its value, the given header text
      * is used to label the chart correctly for accessibility purposes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderVisible(): this.type = js.native
    def setHeaderVisible(/**
      * New value for property `headerVisible`
      */
    bHeaderVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getIgnoreToolbarActions ignoreToolbarActions}.
      *
      * Specifies which actions must not be available in the chart's toolbar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIgnoreToolbarActions(): this.type = js.native
    def setIgnoreToolbarActions(
      /**
      * New value for property `ignoreToolbarActions`
      */
    sIgnoreToolbarActions: js.Array[
          ChartToolbarActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartToolbarActionType * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getLegendVisible legendVisible}.
      *
      * Enables the legend of the chart. **Note:** The setter calls `setLegendVisible` of the delegate class.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLegendVisible(): this.type = js.native
    def setLegendVisible(/**
      * New value for property `legendVisible`
      */
    bLegendVisible: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinHeight minHeight}.
      *
      * Defines the minimum height.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"400px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinHeight(): this.type = js.native
    def setMinHeight(/**
      * New value for property `minHeight`
      */
    sMinHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Defines the minimum width.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"240px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    sMinWidth: CSSSize): this.type = js.native
    
    /**
      * @since 1.107
      *
      * Sets the aggregated {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoData(/**
      * The noData to set
      */
    oNoData: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getP13nMode p13nMode}.
      *
      * Specifies the personalization options available for the chart.
      *  **Note:** The order of the provided options does not influence the arrangement of the icons on the UI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `[]`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setP13nMode(): this.type = js.native
    def setP13nMode(
      /**
      * New value for property `p13nMode`
      */
    sP13nMode: js.Array[
          ChartP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartP13nMode * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * @since 1.99
      *
      * Sets a new value for property {@link #getPropertyInfo propertyInfo}.
      *
      * Specifies the chart metadata.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      *
      * **Note**: For more information about the supported inner elements, see {@link sap.ui.mdc.chart.PropertyInfo PropertyInfo}.
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
      * Sets the aggregated {@link #getSelectionDetailsActions selectionDetailsActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectionDetailsActions(
      /**
      * The selectionDetailsActions to set
      */
    oSelectionDetailsActions: typings.openui5.sapUiMdcChartSelectionDetailsActionsMod.default
    ): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getShowChartTooltip showChartTooltip}.
      *
      * Controls the visibility of the chart tooltip. If set to `true`, a call of the `delegate.setChartTooltipVisibility`
      * will be triggered and can be used to make the `Chart` tooltip visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowChartTooltip(): this.type = js.native
    def setShowChartTooltip(/**
      * New value for property `showChartTooltip`
      */
    bShowChartTooltip: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSelectionDetails showSelectionDetails}.
      *
      * Enables the Details button in the chart toolbar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSelectionDetails(): this.type = js.native
    def setShowSelectionDetails(/**
      * New value for property `showSelectionDetails`
      */
    bShowSelectionDetails: Boolean): this.type = js.native
    
    /**
      * @since 1.88
      *
      * Sets a new value for property {@link #getSortConditions sortConditions}.
      *
      * Defines the sort conditions.
      *
      *
      * **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSortConditions(/**
      * New value for property `sortConditions`
      */
    oSortConditions: js.Object): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getVariant variant}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVariant(
      /**
      * The variant to set
      */
    oVariant: typings.openui5.sapUiFlVariantsVariantManagementMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the chart.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait Chart$SelectionDetailsActionPressedEventParameters extends StObject {
    
    /**
      * The action that has to be processed once the action has been pressed
      */
    var action: js.UndefOr[typings.openui5.sapUiCoreItemMod.default] = js.undefined
    
    /**
      * If the action is pressed on one of the {@link sap.m.SelectionDetailsItem items}, the parameter contains
      * the {@link sap.ui.model.Context context} of the pressed {@link sap.m.SelectionDetailsItem item}. If a
      * custom action or action group of the `SelectionDetails` popover is pressed, this parameter contains all
      * {@link sap.ui.model.Context contexts} of the {@link sap.m.SelectionDetailsItem items}.
      */
    var itemContexts: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
    
    /**
      * The action level of action buttons. The available levels are Item, List and Group
      */
    var level: js.UndefOr[
        SelectionDetailsActionLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionDetailsActionLevel * / any */ String)
      ] = js.undefined
  }
  object Chart$SelectionDetailsActionPressedEventParameters {
    
    inline def apply(): Chart$SelectionDetailsActionPressedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Chart$SelectionDetailsActionPressedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chart$SelectionDetailsActionPressedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAction(value: typings.openui5.sapUiCoreItemMod.default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setItemContexts(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "itemContexts", value.asInstanceOf[js.Any])
      
      inline def setItemContextsUndefined: Self = StObject.set(x, "itemContexts", js.undefined)
      
      inline def setLevel(
        value: SelectionDetailsActionLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SelectionDetailsActionLevel * / any */ String)
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  type ChartSelectionDetailsActionPressedEvent = typings.openui5.sapUiBaseEventMod.default[Chart$SelectionDetailsActionPressedEventParameters]
  
  type ChartSelectionDetailsActionPressedEventParameters = Chart$SelectionDetailsActionPressedEventParameters
  
  trait ChartSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This aggregation describes actions that are added to the chart toolbar.
      *  For more information, see {@link sap.ui.mdc.actiontoolbar.ActionToolbarAction}.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If set to `true`, the chart is automatically bound after initialization.
      *  If set to `false`, the chart is bound after the first call to `rebind`.
      */
    var autoBindOnInit: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the type of chart to be created by the `Chart` control.
      */
    var chartType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.88
      *
      * Control or object that enables the chart to do filtering, such as {@link sap.ui.mdc.FilterBar}. Also
      * see {@link sap.ui.mdc.IFilter}.
      */
    var filter: js.UndefOr[(/* was: sap.ui.mdc.IFilter */ Any) | String] = js.undefined
    
    /**
      * @since 1.99
      *
      * Defines the filter conditions.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
      */
    var filterConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies header text that is shown in the chart.
      */
    var header: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.104
      *
      * Semantic level of the header.
      *  For more information, see {@link sap.m.Title#setLevel}.
      */
    var headerLevel: js.UndefOr[
        TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @since 1.111
      *
      * Determines whether the header text is shown in the chart. Regardless of its value, the given header text
      * is used to label the chart correctly for accessibility purposes.
      */
    var headerVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the height of the chart.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Specifies which actions must not be available in the chart's toolbar.
      */
    var ignoreToolbarActions: js.UndefOr[
        (js.Array[
          ChartToolbarActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartToolbarActionType * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This property describes the measures and dimensions visible in the chart. Changes in the personalization
      * are also reflected here.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcChartItemMod.default] | typings.openui5.sapUiMdcChartItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Enables the legend of the chart. **Note:** The setter calls `setLegendVisible` of the delegate class.
      */
    var legendVisible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the minimum height.
      */
    var minHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the minimum width.
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.107
      *
      * Defines the custom visualization if there is no data available.
      *  This control will be displayed on top of the chart when no data is visible inside the chart.
      *  **Note:** If both a `noDataText` property and a `noData` aggregation are provided, the `noData` aggregation
      * takes priority.
      *  If the `noData` aggregation is undefined or set to null, the `noDataText` property is used instead.
      */
    var noData: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * @since 1.88
      *
      * Defines the no data text shown in the chart.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.88
      *
      * Specifies the personalization options available for the chart.
      *  **Note:** The order of the provided options does not influence the arrangement of the icons on the UI.
      */
    var p13nMode: js.UndefOr[
        (js.Array[
          ChartP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartP13nMode * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.99
      *
      * Specifies the chart metadata.
      *  **Note:** This property must not be bound.
      *  **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it otherwise.
      *
      *
      * **Note**: For more information about the supported inner elements, see {@link sap.ui.mdc.chart.PropertyInfo PropertyInfo}.
      */
    var propertyInfo: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired when a `SelectionDetailsAction` is pressed.
      */
    var selectionDetailsActionPressed: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Chart$SelectionDetailsActionPressedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Feeds details actions for data point selection in the mdc chart.
      *  For more information, see {@link sap.ui.mdc.chart.SelectionDetailsActions SelectionDetailsActions}.
      */
    var selectionDetailsActions: js.UndefOr[typings.openui5.sapUiMdcChartSelectionDetailsActionsMod.default] = js.undefined
    
    /**
      * @since 1.88
      *
      * Controls the visibility of the chart tooltip. If set to `true`, a call of the `delegate.setChartTooltipVisibility`
      * will be triggered and can be used to make the `Chart` tooltip visible.
      */
    var showChartTooltip: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables the Details button in the chart toolbar.
      */
    var showSelectionDetails: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @since 1.88
      *
      * Defines the sort conditions.
      *
      *
      * **Note:** This property is exclusively used for handling SAPUI5 flexibility changes. Do not use it for
      * anything else.
      */
    var sortConditions: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Reference to a {@link sap.ui.fl.variants.VariantManagement} control for the chart.
      */
    var variant: js.UndefOr[typings.openui5.sapUiFlVariantsVariantManagementMod.default] = js.undefined
    
    /**
      * Defines the width of the chart.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ChartSettings {
    
    inline def apply(): ChartSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setAutoBindOnInit(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoBindOnInit", value.asInstanceOf[js.Any])
      
      inline def setAutoBindOnInitUndefined: Self = StObject.set(x, "autoBindOnInit", js.undefined)
      
      inline def setChartType(value: String | PropertyBindingInfo): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
      
      inline def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
      
      inline def setFilter(value: (/* was: sap.ui.mdc.IFilter */ Any) | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterConditions", value.asInstanceOf[js.Any])
      
      inline def setFilterConditionsUndefined: Self = StObject.set(x, "filterConditions", js.undefined)
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHeader(value: String | PropertyBindingInfo): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevel(
        value: TitleLevel | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TitleLevel * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerLevel", value.asInstanceOf[js.Any])
      
      inline def setHeaderLevelUndefined: Self = StObject.set(x, "headerLevel", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "headerVisible", value.asInstanceOf[js.Any])
      
      inline def setHeaderVisibleUndefined: Self = StObject.set(x, "headerVisible", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIgnoreToolbarActions(
        value: (js.Array[
              ChartToolbarActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartToolbarActionType * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "ignoreToolbarActions", value.asInstanceOf[js.Any])
      
      inline def setIgnoreToolbarActionsUndefined: Self = StObject.set(x, "ignoreToolbarActions", js.undefined)
      
      inline def setIgnoreToolbarActionsVarargs(
        value: (ChartToolbarActionType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartToolbarActionType * / any */ String))*
      ): Self = StObject.set(x, "ignoreToolbarActions", js.Array(value*))
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiMdcChartItemMod.default] | typings.openui5.sapUiMdcChartItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiMdcChartItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLegendVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "legendVisible", value.asInstanceOf[js.Any])
      
      inline def setLegendVisibleUndefined: Self = StObject.set(x, "legendVisible", js.undefined)
      
      inline def setMinHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setNoData(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setP13nMode(
        value: (js.Array[
              ChartP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartP13nMode * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "p13nMode", value.asInstanceOf[js.Any])
      
      inline def setP13nModeUndefined: Self = StObject.set(x, "p13nMode", js.undefined)
      
      inline def setP13nModeVarargs(
        value: (ChartP13nMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ChartP13nMode * / any */ String))*
      ): Self = StObject.set(x, "p13nMode", js.Array(value*))
      
      inline def setPropertyInfo(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "propertyInfo", value.asInstanceOf[js.Any])
      
      inline def setPropertyInfoUndefined: Self = StObject.set(x, "propertyInfo", js.undefined)
      
      inline def setSelectionDetailsActionPressed(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[Chart$SelectionDetailsActionPressedEventParameters] => Unit
      ): Self = StObject.set(x, "selectionDetailsActionPressed", js.Any.fromFunction1(value))
      
      inline def setSelectionDetailsActionPressedUndefined: Self = StObject.set(x, "selectionDetailsActionPressed", js.undefined)
      
      inline def setSelectionDetailsActions(value: typings.openui5.sapUiMdcChartSelectionDetailsActionsMod.default): Self = StObject.set(x, "selectionDetailsActions", value.asInstanceOf[js.Any])
      
      inline def setSelectionDetailsActionsUndefined: Self = StObject.set(x, "selectionDetailsActions", js.undefined)
      
      inline def setShowChartTooltip(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showChartTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowChartTooltipUndefined: Self = StObject.set(x, "showChartTooltip", js.undefined)
      
      inline def setShowSelectionDetails(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelectionDetails", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionDetailsUndefined: Self = StObject.set(x, "showSelectionDetails", js.undefined)
      
      inline def setSortConditions(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sortConditions", value.asInstanceOf[js.Any])
      
      inline def setSortConditionsUndefined: Self = StObject.set(x, "sortConditions", js.undefined)
      
      inline def setVariant(value: typings.openui5.sapUiFlVariantsVariantManagementMod.default): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PropertyInfo extends StObject {
    
    /**
      * Defines whether the property is aggregatable and is selectable as a measure in the chart
      */
    var aggregatable: Boolean
    
    /**
      * The aggregation method used if the property is aggregatable
      */
    var aggregationMethod: String
    
    /**
      * Defines constraints for the data type of the property
      */
    var constraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Implementation-specific object containing information about the criticality
      */
    var criticality: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Implementation-specific object containing information about the data point
      */
    var datapoint: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the type of the property
      */
    var datatype: String
    
    /**
      * Defines formatting options for the data type of the property
      */
    var formatOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Defines whether the property is groupable and is selectable as a dimension in the chart
      */
    var groupable: Boolean
    
    /**
      * The label of the identifier
      */
    var label: String
    
    /**
      * Defines if the filter supports multiple values `-1` or single values `1`
      */
    var maxConditions: int
    
    /**
      * The identifier of the property
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The path to the property in the back end
      */
    var propertyPath: String
    
    /**
      * Defines if the filter is mandatory
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the role that the property visualizes inside the chart
      */
    var role: String
    
    /**
      * The text property used for the dimension
      */
    var textProperty: js.UndefOr[String] = js.undefined
    
    /**
      * The tooltip of the identifier
      */
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object PropertyInfo {
    
    inline def apply(
      aggregatable: Boolean,
      aggregationMethod: String,
      datatype: String,
      groupable: Boolean,
      label: String,
      maxConditions: int,
      propertyPath: String,
      role: String
    ): PropertyInfo = {
      val __obj = js.Dynamic.literal(aggregatable = aggregatable.asInstanceOf[js.Any], aggregationMethod = aggregationMethod.asInstanceOf[js.Any], datatype = datatype.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxConditions = maxConditions.asInstanceOf[js.Any], propertyPath = propertyPath.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      inline def setAggregatable(value: Boolean): Self = StObject.set(x, "aggregatable", value.asInstanceOf[js.Any])
      
      inline def setAggregationMethod(value: String): Self = StObject.set(x, "aggregationMethod", value.asInstanceOf[js.Any])
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setCriticality(value: js.Object): Self = StObject.set(x, "criticality", value.asInstanceOf[js.Any])
      
      inline def setCriticalityUndefined: Self = StObject.set(x, "criticality", js.undefined)
      
      inline def setDatapoint(value: js.Object): Self = StObject.set(x, "datapoint", value.asInstanceOf[js.Any])
      
      inline def setDatapointUndefined: Self = StObject.set(x, "datapoint", js.undefined)
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMaxConditions(value: int): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPropertyPath(value: String): Self = StObject.set(x, "propertyPath", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTextProperty(value: String): Self = StObject.set(x, "textProperty", value.asInstanceOf[js.Any])
      
      inline def setTextPropertyUndefined: Self = StObject.set(x, "textProperty", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
}
