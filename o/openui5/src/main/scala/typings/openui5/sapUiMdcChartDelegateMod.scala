package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.AddItem
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiMdcChartMod.PropertyInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcChartDelegateMod extends Shortcut {
  
  @JSImport("sap/ui/mdc/ChartDelegate", JSImport.Default)
  @js.native
  val default: ChartDelegate = js.native
  
  /**
    * @since 1.88
    *
    * Base Delegate for {@link sap.ui.mdc.Chart Chart}. Extend this object in your project to use all functionalities
    * of the {@link sap.ui.mdc.Chart Chart}.
    *  This class provides method calls, that are called by the `Chart` for specific operations and overwrite
    * the internal behavior.
    */
  @js.native
  trait ChartDelegate extends StObject {
    
    /**
      * Creates a new chart item for a given property name and updates the inner chart.
      *  **Note:** This does **not** add the chart item to the `Items` aggregation of the chart. Called and used
      * by `p13n`.
      *
      * @returns `Promise` that resolves with new chart `Item` as parameter
      */
    def addItem(
      /**
      * Reference to the MDC chart to add the property to
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * The name of the property added
      */
    sPropertyName: String,
      /**
      * The property bag containing useful information about the change
      */
    mPropertyBag: js.Object
    ): js.Promise[typings.openui5.sapUiMdcChartItemMod.default] = js.native
    def addItem(
      /**
      * Reference to the MDC chart to add the property to
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * The name of the property added
      */
    sPropertyName: String,
      /**
      * The property bag containing useful information about the change
      */
    mPropertyBag: js.Object,
      /**
      * New role for given item
      */
    sRole: String
    ): js.Promise[typings.openui5.sapUiMdcChartItemMod.default] = js.native
    
    /**
      * This method is called to update the no data structure.
      */
    def changedNoDataStruct(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): Unit = js.native
    
    /**
      * Creates the initial content for the chart before the metadata is retrieved.
      *  This can be used by chart libraries that can already show some information without the actual data (for
      * example, axis labels, legend, ...).
      */
    def createInitialChartContent(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): Unit = js.native
    
    /**
      * Binds the inner chart to the back-end data and creates the inner chart content.
      */
    def createInnerChartContent(
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Callback function when data is loaded
      */
    fnCallbackDataLoaded: js.Function
    ): Unit = js.native
    
    /**
      * Returns the relevant property info based on the metadata used with the chart instance.
      *
      * @returns Array of the property infos that is used within the chart
      */
    def fetchProperties(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Promise[js.Array[PropertyInfo]] = js.native
    
    /**
      * Gets the available chart types for the current state of the inner chart.
      *
      * @returns Array containing the currently available chart types
      */
    def getAvailableChartTypes(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Array[ChartTypeObject] = js.native
    
    /**
      * Returns the binding info for given chart.
      *
      * @returns BindingInfo object
      */
    def getBindingInfo(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): AggregationBindingInfo = js.native
    
    /**
      * Returns the current chart type.
      *
      * @returns Information about the current chart type
      */
    def getChartTypeInfo(/**
      * Reference to the MDC chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Array[ChartTypeObject] = js.native
    
    /**
      * This function is used by `P13n` to determine which chart type supports which layout options. There might
      * be chart types that do not support certain layout options (for example, "Axis3").
      *
      * @returns chart type layout config
      */
    def getChartTypeLayoutConfig(): js.Array[ChartTypeLayoutConfig] = js.native
    
    /**
      * Returns the current drilling stack of the inner chart.
      *  The returned objects need at least a `label` and a `name` property.
      *  Also, a `dimension` array containing the dimension drill stack at the current level is required.
      *
      * @returns Array containing the drill stack
      */
    def getDrillStack(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Array[Any] = js.native
    
    /**
      * Determines which MDC items are drillable and returns them. This function is used by the breadcrumb navigation.
      *
      * @returns Array of MDC items that are drillable
      */
    def getDrillableItems(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Array[typings.openui5.sapUiMdcChartItemMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the filter delegate of the chart that provides basic filter functionality, such as adding filter
      * fields. **Note:** The functionality provided in this delegate acts as a subset of a `FilterBarDelegate`
      * to enable the chart for inbuilt filtering.
      *
      * @returns Object for the chart filter personalization
      */
    def getFilterDelegate(): AddItem = js.native
    
    /**
      * Returns the instance of the inner chart.
      *
      * @returns Instance of the inner chart
      */
    def getInnerChart(/**
      * Reference to the MDC chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Returns the information whether the inner chart is currently bound.
      *
      * @returns `true` if inner chart is bound; `false` if not
      */
    def getInnerChartBound(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): Boolean = js.native
    
    /**
      * Returns the event handler for `SelectionDetails` as an object.
      *
      * @returns Event handler for SelectionDetails
      */
    def getInnerChartSelectionHandler(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): SelectionDetails = js.native
    
    /**
      * This function returns an ID that should be used in the internal chart for the Measure/Dimension.
      *  For standard cases, this is just the ID of the property.
      *  If it is necessary to use another ID internally inside the chart (for example, for duplicate property
      * IDs) this method can be overwritten.
      *  In this case, `getPropertyFromNameAndKind` needs to be overwritten as well.
      *
      * @returns Internal ID for the sap.chart.Chart
      */
    def getInternalChartNameFromPropertyNameAndKind(
      /**
      * ID of the property
      */
    sName: String,
      /**
      * Type of the property (Measure/Dimension)
      */
    sKind: String,
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default
    ): String = js.native
    
    /**
      * Maps an ID of an internal chart dimension/measure and type of a property to its corresponding property
      * entry.
      *
      * @returns PropertyInfo object
      */
    def getPropertyFromNameAndKind(
      /**
      * ID of internal chart measure/dimension
      */
    sName: String,
      /**
      * Kind of the property
      */
    sKind: String,
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default
    ): PropertyInfo = js.native
    
    /**
      * Returns all sorted dimensions of an inner chart. This is used to determine possible drill-down dimensions
      * in the drill-down popover of the chart.
      *
      * @returns `Promise` containing an array of dimensions that is sorted
      */
    def getSortedDimensions(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Promise[js.Array[typings.openui5.sapUiMdcChartItemMod.default]] = js.native
    
    /**
      * Gets the current zooming information for the inner chart.
      *
      * @returns Current `ZoomState` of the inner chart
      */
    def getZoomState(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): ZoomState = js.native
    
    /**
      * Loads the required libraries and creates the inner chart.
      *
      * @returns Resolved once the inner chart has been initialized
      */
    def initializeInnerChart(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): js.Promise[Any] = js.native
    
    /**
      * Inserts a chart item (measure / dimension for `sap.chart.Chart`) into the inner chart.
      *  This function is called by the chart for a change of the `Items` aggregation.
      *  **Note:** Do not call this yourself, as it would not be synced with the chart, but insert the item into
      * the chart instead.
      */
    def insertItemToInnerChart(
      /**
      * Chart into which the item is insert
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Chart item that is inserted into the inner chart
      */
    oChartItem: typings.openui5.sapUiMdcChartItemMod.default,
      /**
      * The index into which the chart item is inserted
      */
    iIndex: int
    ): Unit = js.native
    
    /**
      * Checks the binding of the chart and rebinds it if required.
      */
    def rebind(
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * BindingInfo of the chart
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
    
    /**
      * Removes an existing chart item for a given property name and updates the inner chart. Called and used
      * by `p13n`.
      *
      * @returns `Promise` containing information whether the item was deleted
      */
    def removeItem(
      /**
      * Reference to the MDC chart from which property is removed
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * The `item` that is removed from the chart
      */
    oItem: typings.openui5.sapUiMdcChartItemMod.default,
      /**
      * The property bag containing useful information about the change
      */
    mPropertyBag: js.Object
    ): js.Promise[Boolean] = js.native
    
    /**
      * Removes a chart item (measure / dimension for `sap.chart.Chart`) from the inner chart.
      *  This function is called by the chart for a change of the `Items` aggregation.
      *  **Note:** Do not call this yourself, as it would not be synced with the chart, but remove the item from
      * the chart instead.
      */
    def removeItemFromInnerChart(
      /**
      * Chart from which the item is removed
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Chart item that is removed from the inner chart
      */
    oChartItem: typings.openui5.sapUiMdcChartItemMod.default
    ): Unit = js.native
    
    /**
      * Sets tooltips to visible/invisible for the inner chart. **Note:** This function is called by the chart
      * only. You must not call it directly but use {@link sap.ui.mdc.Chart#setShowChartTooltip setShowChartTooltip }
      * instead.
      */
    def setChartTooltipVisibility(
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * `true` for visible, `false` for invisible
      */
    bVisible: Boolean
    ): Unit = js.native
    
    /**
      * Sets the chart type of the inner chart. This function is called by the chart when the `chartType` property
      * is updated. **Note:** This function is called by the chart only. You must not call it directly but use
      * {@link sap.ui.mdc.Chart#setChartType setChartType} instead.
      */
    def setChartType(/**
      * New chart type
      */
    sChartType: String): Unit = js.native
    
    /**
      * Sets the visibility of the legend. **Note:** This function is called by the chart only. You must not
      * call it directly but use {@link sap.ui.mdc.Chart#setLegendVisible LegendVisible} instead.
      */
    def setLegendVisible(
      /**
      * Chart for which the legend visibility is set
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Shows legend, if set to `true`
      */
    bVisible: Boolean
    ): Unit = js.native
    
    /**
      * Sets a "No Data" text for the inner chart.
      */
    def setNoDataText(
      /**
      * Reference to chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Text to show when there is no data displayed in the chart
      */
    sText: String
    ): Unit = js.native
    
    /**
      * Adds/Removes the busy overlay shown above the inner chart.
      */
    def showOverlay(
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Shows overlay if set to `true`
      */
    bShow: Boolean
    ): Unit = js.native
    
    /**
      * Updates the binding info with the relevant filters.
      */
    def updateBindingInfo(
      /**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default,
      /**
      * Binding info of the chart
      */
    oBindingInfo: AggregationBindingInfo
    ): Unit = js.native
    
    /**
      * Notifies the inner chart to zoom in.
      */
    def zoomIn(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): Unit = js.native
    
    /**
      * Notifies the inner chart to zoom out.
      */
    def zoomOut(/**
      * Reference to the chart
      */
    oChart: typings.openui5.sapUiMdcChartMod.default): Unit = js.native
  }
  
  trait ChartTypeLayoutConfig extends StObject {
    
    /**
      * Layout configuration of chart type
      */
    var allowedLayoutOptions: js.Array[String]
    
    /**
      * identifier for the chart type
      */
    var key: String
  }
  object ChartTypeLayoutConfig {
    
    inline def apply(allowedLayoutOptions: js.Array[String], key: String): ChartTypeLayoutConfig = {
      val __obj = js.Dynamic.literal(allowedLayoutOptions = allowedLayoutOptions.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartTypeLayoutConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartTypeLayoutConfig] (val x: Self) extends AnyVal {
      
      inline def setAllowedLayoutOptions(value: js.Array[String]): Self = StObject.set(x, "allowedLayoutOptions", value.asInstanceOf[js.Any])
      
      inline def setAllowedLayoutOptionsVarargs(value: String*): Self = StObject.set(x, "allowedLayoutOptions", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChartTypeObject extends StObject {
    
    /**
      * URI for the icon for the current chart type
      */
    var icon: URI
    
    /**
      * Unique key of the chart type
      */
    var key: String
    
    /**
      * Whether the chart type is the one currently used
      */
    var selected: Boolean
    
    /**
      * Name of the current chart type
      */
    var text: String
  }
  object ChartTypeObject {
    
    inline def apply(icon: URI, key: String, selected: Boolean, text: String): ChartTypeObject = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartTypeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartTypeObject] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: URI): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectionDetails extends StObject {
    
    /**
      * ID of the selection event
      */
    var eventId: String
    
    /**
      * Reference to inner chart
      */
    var listener: typings.openui5.sapUiCoreControlMod.default
  }
  object SelectionDetails {
    
    inline def apply(eventId: String, listener: typings.openui5.sapUiCoreControlMod.default): SelectionDetails = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionDetails] (val x: Self) extends AnyVal {
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setListener(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZoomState extends StObject {
    
    /**
      * Current zoom level of the chart in percent (between 0 and 1)
      */
    var currentZoomLevel: Double
    
    /**
      * Zooming is enabled if set to `true`
      */
    var enabled: Boolean
  }
  object ZoomState {
    
    inline def apply(currentZoomLevel: Double, enabled: Boolean): ZoomState = {
      val __obj = js.Dynamic.literal(currentZoomLevel = currentZoomLevel.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZoomState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomState] (val x: Self) extends AnyVal {
      
      inline def setCurrentZoomLevel(value: Double): Self = StObject.set(x, "currentZoomLevel", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ChartDelegate
  
  /* This means you don't have to write `default`, but can instead just say `sapUiMdcChartDelegateMod.foo` */
  override def _to: ChartDelegate = default
}
