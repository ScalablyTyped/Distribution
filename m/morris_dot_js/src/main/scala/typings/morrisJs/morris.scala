package typings.morrisJs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morris {
  
  /* Rewritten from type alias, can be one of: 
    - typings.morrisJs.morrisJsStrings.auto
    - typings.morrisJs.morrisJsStrings.always
  */
  trait AutoAlways extends StObject
  object AutoAlways {
    
    @scala.inline
    def always: typings.morrisJs.morrisJsStrings.always = "always".asInstanceOf[typings.morrisJs.morrisJsStrings.always]
    
    @scala.inline
    def auto: typings.morrisJs.morrisJsStrings.auto = "auto".asInstanceOf[typings.morrisJs.morrisJsStrings.auto]
  }
  
  @js.native
  trait DonutChart extends StObject {
    
    def setData(data: js.Array[IDonutData]): Unit = js.native
    def setData(data: js.Array[IDonutData], redraw: Boolean): Unit = js.native
  }
  
  @js.native
  trait GridChart extends StObject {
    
    def setData(data: js.Array[js.Any]): Unit = js.native
    def setData(data: js.Array[js.Any], redraw: Boolean): Unit = js.native
  }
  
  trait IAreaOptions
    extends StObject
       with ILineOptions {
    
    /**  Set to true to overlay the areas on top of each other instead of stacking them.  */
    var behaveLikeLine: js.UndefOr[Boolean] = js.undefined
  }
  object IAreaOptions {
    
    @scala.inline
    def apply(
      data: js.Array[js.Any],
      element: js.Any,
      labels: js.Array[String],
      xkey: String,
      ykeys: js.Array[String]
    ): IAreaOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAreaOptions]
    }
    
    @scala.inline
    implicit class IAreaOptionsMutableBuilder[Self <: IAreaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBehaveLikeLine(value: Boolean): Self = StObject.set(x, "behaveLikeLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaveLikeLineUndefined: Self = StObject.set(x, "behaveLikeLine", js.undefined)
    }
  }
  
  trait IBarOptions
    extends StObject
       with IGridChartOptions {
    
    /** Array containing colors for the series bars. */
    var barColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Provide a function on this option to generate custom hover legends. */
    var hoverCallback: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* options */ this.type, 
          /* content */ String, 
          /* row */ js.Any, 
          String
        ]
      ] = js.undefined
    
    /** Set to true to draw bars stacked vertically. */
    var stacked: js.UndefOr[Boolean] = js.undefined
  }
  object IBarOptions {
    
    @scala.inline
    def apply(
      data: js.Array[js.Any],
      element: js.Any,
      labels: js.Array[String],
      xkey: String,
      ykeys: js.Array[String]
    ): IBarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBarOptions]
    }
    
    @scala.inline
    implicit class IBarOptionsMutableBuilder[Self <: IBarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarColors(value: js.Array[String]): Self = StObject.set(x, "barColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBarColorsUndefined: Self = StObject.set(x, "barColors", js.undefined)
      
      @scala.inline
      def setBarColorsVarargs(value: String*): Self = StObject.set(x, "barColors", js.Array(value :_*))
      
      @scala.inline
      def setHoverCallback(value: (/* index */ Double, IBarOptions, /* content */ String, /* row */ js.Any) => String): Self = StObject.set(x, "hoverCallback", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHoverCallbackUndefined: Self = StObject.set(x, "hoverCallback", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
  
  trait IChartOptions extends StObject {
    
    /** The ID of (or a reference to) the element into which to insert the graph. */
    var element: js.Any
    
    /** Set to true to enable automatic resizing when the containing element resizes. (default: false). */
    var resize: js.UndefOr[Boolean] = js.undefined
  }
  object IChartOptions {
    
    @scala.inline
    def apply(element: js.Any): IChartOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChartOptions]
    }
    
    @scala.inline
    implicit class IChartOptionsMutableBuilder[Self <: IChartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    }
  }
  
  trait IDonutData extends StObject {
    
    /** Label of the segment of the donut chart.*/
    var label: String
    
    /** Size of the segment of the donut chart.*/
    var value: Double
  }
  object IDonutData {
    
    @scala.inline
    def apply(label: String, value: Double): IDonutData = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDonutData]
    }
    
    @scala.inline
    implicit class IDonutDataMutableBuilder[Self <: IDonutData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDonutOptions
    extends StObject
       with IChartOptions {
    
    /** An array of strings containing HTML-style hex colors for each of the donut segments. */
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The data to plot. */
    var data: js.Array[IDonutData]
    
    /** A function that will translate a y-value into a label for the centre of the donut. */
    var formatter: js.UndefOr[js.Function2[/* y */ Double, /* data */ IDonutData, String]] = js.undefined
  }
  object IDonutOptions {
    
    @scala.inline
    def apply(data: js.Array[IDonutData], element: js.Any): IDonutOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDonutOptions]
    }
    
    @scala.inline
    implicit class IDonutOptionsMutableBuilder[Self <: IDonutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[IDonutData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: IDonutData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: (/* y */ Double, /* data */ IDonutData) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    }
  }
  
  trait IGridChartOptions
    extends StObject
       with IChartOptions {
    
    /** Set to false to disable drawing the x and y axes. */
    var axes: js.UndefOr[Boolean] = js.undefined
    
    /** The data to plot. This is an array of objects, containing x and y attributes as described by the xkey and ykeys options. */
    var data: js.Array[js.Any]
    
    /**  Set to false to disable drawing the horizontal grid lines. */
    var grid: js.UndefOr[Boolean] = js.undefined
    
    /** Set the line color of the grid. (default: #aaa) */
    var gridLineColor: js.UndefOr[String] = js.undefined
    
    /** Set the stroke of the grid. (default: 0.5)*/
    var gridStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /**  Set the color of the axis labels (default: #888). */
    var gridTextColor: js.UndefOr[String] = js.undefined
    
    /** Set the font family of the axis labels (default: sans-serif). */
    var gridTextFamily: js.UndefOr[String] = js.undefined
    
    /** Set the point size of the axis labels (default: 12). */
    var gridTextSize: js.UndefOr[Double] = js.undefined
    
    /** Set the font weight of the axis labels (default: normal). */
    var gridTextWeight: js.UndefOr[String] = js.undefined
    
    /**  Set the visibility of the hover legend (see documentation). */
    var hideHover: js.UndefOr[Boolean | AutoAlways] = js.undefined
    
    /** A list of strings containing labels for the data series to be plotted (corresponding to the values in the ykeys option). */
    var labels: js.Array[String]
    
    /** A string containing the name of the attribute that contains X labels. */
    var xkey: String
    
    /** A list of strings containing names of attributes that contain Y values (one for each series of data to be plotted). */
    var ykeys: js.Array[String]
  }
  object IGridChartOptions {
    
    @scala.inline
    def apply(
      data: js.Array[js.Any],
      element: js.Any,
      labels: js.Array[String],
      xkey: String,
      ykeys: js.Array[String]
    ): IGridChartOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGridChartOptions]
    }
    
    @scala.inline
    implicit class IGridChartOptionsMutableBuilder[Self <: IGridChartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxes(value: Boolean): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setGrid(value: Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridLineColor(value: String): Self = StObject.set(x, "gridLineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridLineColorUndefined: Self = StObject.set(x, "gridLineColor", js.undefined)
      
      @scala.inline
      def setGridStrokeWidth(value: Double): Self = StObject.set(x, "gridStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridStrokeWidthUndefined: Self = StObject.set(x, "gridStrokeWidth", js.undefined)
      
      @scala.inline
      def setGridTextColor(value: String): Self = StObject.set(x, "gridTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTextColorUndefined: Self = StObject.set(x, "gridTextColor", js.undefined)
      
      @scala.inline
      def setGridTextFamily(value: String): Self = StObject.set(x, "gridTextFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTextFamilyUndefined: Self = StObject.set(x, "gridTextFamily", js.undefined)
      
      @scala.inline
      def setGridTextSize(value: Double): Self = StObject.set(x, "gridTextSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTextSizeUndefined: Self = StObject.set(x, "gridTextSize", js.undefined)
      
      @scala.inline
      def setGridTextWeight(value: String): Self = StObject.set(x, "gridTextWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridTextWeightUndefined: Self = StObject.set(x, "gridTextWeight", js.undefined)
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHideHover(value: Boolean | AutoAlways): Self = StObject.set(x, "hideHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHoverUndefined: Self = StObject.set(x, "hideHover", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setXkey(value: String): Self = StObject.set(x, "xkey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYkeys(value: js.Array[String]): Self = StObject.set(x, "ykeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYkeysVarargs(value: String*): Self = StObject.set(x, "ykeys", js.Array(value :_*))
    }
  }
  
  trait ILineOptions
    extends StObject
       with IGridChartOptions {
    
    /** Define how null and undefined values are handled (see documentation). */
    var continuousLine: js.UndefOr[Boolean] = js.undefined
    
    /** A function that accepts millisecond timestamps and formats them for display as chart labels. */
    var dateFormat: js.UndefOr[js.Function1[/* timestamp */ Double, String]] = js.undefined
    
    /** Array of color values to use for the event line colors. If you list fewer colors here than you have lines in events, then the values will be cycled. */
    var eventLineColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Width, in pixels, of the event lines. */
    var eventStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** A list of x-values to draw as vertical 'event' lines on the chart. */
    var events: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Change the opacity of the area fill colour. Accepts values between 0.0 (for completely transparent) and 1.0 (for completely opaque). */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /** Array of color values to use for the goal line colors. If you list fewer colors here than you have lines in goals, then the values will be cycled. */
    var goalLineColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Width, in pixels, of the goal lines. */
    var goalStrokeWidth: js.UndefOr[Double] = js.undefined
    
    /** A list of y-values to draw as horizontal 'goal' lines on the chart. */
    var goals: js.UndefOr[js.Array[Double]] = js.undefined
    
    /** Provide a function on this option to generate custom hover legends. */
    var hoverCallback: js.UndefOr[
        js.Function4[
          /* index */ Double, 
          /* options */ this.type, 
          /* content */ String, 
          /* row */ js.Any, 
          String
        ]
      ] = js.undefined
    
    /** Array containing colors for the series lines/points. */
    var lineColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Width of the series lines, in pixels. */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /** Set to false to skip time/date parsing for X values, instead treating them as an equally-spaced series. */
    var parseTime: js.UndefOr[Boolean] = js.undefined
    
    /** Colors for the series points. By default uses the same values as lineColors */
    var pointFillColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Diameter of the series points, in pixels. */
    var pointSize: js.UndefOr[Double] = js.undefined
    
    /** Colors for the outlines of the series points. (#ffffff by default). */
    var pointStrokeColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Set to a string value (eg: '%') to add a label suffix all y-labels. */
    var postUnits: js.UndefOr[String] = js.undefined
    
    /** Set to a string value (eg: '$') to add a label prefix all y-labels. */
    var preUnits: js.UndefOr[String] = js.undefined
    
    /** Set to false to disable line smoothing. */
    var smooth: js.UndefOr[Boolean] = js.undefined
    
    /** The angle in degrees from horizontal to draw x-axis labels. */
    var xLabelAngle: js.UndefOr[Double] = js.undefined
    
    /** A function that accepts Date objects and formats them for display as x-axis labels. Overrides the default formatter chosen by the automatic labeller or the xLabels option. */
    var xLabelFormat: js.UndefOr[js.Function1[/* date */ Date, String]] = js.undefined
    
    /** Sets the x axis labelling interval. By default the interval will be automatically computed. */
    var xLabels: js.UndefOr[Interval] = js.undefined
    
    /** A function that accepts y-values and formats them for display as y-axis labels. */
    var yLabelFormat: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.undefined
    
    /** Max. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the max y-value is at least [num]. */
    var ymax: js.UndefOr[Double | String] = js.undefined
    
    /** Min. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the min y-value is at most [num]. */
    var ymin: js.UndefOr[Double | String] = js.undefined
  }
  object ILineOptions {
    
    @scala.inline
    def apply(
      data: js.Array[js.Any],
      element: js.Any,
      labels: js.Array[String],
      xkey: String,
      ykeys: js.Array[String]
    ): ILineOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILineOptions]
    }
    
    @scala.inline
    implicit class ILineOptionsMutableBuilder[Self <: ILineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuousLine(value: Boolean): Self = StObject.set(x, "continuousLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousLineUndefined: Self = StObject.set(x, "continuousLine", js.undefined)
      
      @scala.inline
      def setDateFormat(value: /* timestamp */ Double => String): Self = StObject.set(x, "dateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setEventLineColors(value: js.Array[String]): Self = StObject.set(x, "eventLineColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventLineColorsUndefined: Self = StObject.set(x, "eventLineColors", js.undefined)
      
      @scala.inline
      def setEventLineColorsVarargs(value: String*): Self = StObject.set(x, "eventLineColors", js.Array(value :_*))
      
      @scala.inline
      def setEventStrokeWidth(value: Double): Self = StObject.set(x, "eventStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventStrokeWidthUndefined: Self = StObject.set(x, "eventStrokeWidth", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setGoalLineColors(value: js.Array[String]): Self = StObject.set(x, "goalLineColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoalLineColorsUndefined: Self = StObject.set(x, "goalLineColors", js.undefined)
      
      @scala.inline
      def setGoalLineColorsVarargs(value: String*): Self = StObject.set(x, "goalLineColors", js.Array(value :_*))
      
      @scala.inline
      def setGoalStrokeWidth(value: Double): Self = StObject.set(x, "goalStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoalStrokeWidthUndefined: Self = StObject.set(x, "goalStrokeWidth", js.undefined)
      
      @scala.inline
      def setGoals(value: js.Array[Double]): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
      
      @scala.inline
      def setGoalsVarargs(value: Double*): Self = StObject.set(x, "goals", js.Array(value :_*))
      
      @scala.inline
      def setHoverCallback(value: (/* index */ Double, ILineOptions, /* content */ String, /* row */ js.Any) => String): Self = StObject.set(x, "hoverCallback", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHoverCallbackUndefined: Self = StObject.set(x, "hoverCallback", js.undefined)
      
      @scala.inline
      def setLineColors(value: js.Array[String]): Self = StObject.set(x, "lineColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorsUndefined: Self = StObject.set(x, "lineColors", js.undefined)
      
      @scala.inline
      def setLineColorsVarargs(value: String*): Self = StObject.set(x, "lineColors", js.Array(value :_*))
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setParseTime(value: Boolean): Self = StObject.set(x, "parseTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseTimeUndefined: Self = StObject.set(x, "parseTime", js.undefined)
      
      @scala.inline
      def setPointFillColors(value: js.Array[String]): Self = StObject.set(x, "pointFillColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointFillColorsUndefined: Self = StObject.set(x, "pointFillColors", js.undefined)
      
      @scala.inline
      def setPointFillColorsVarargs(value: String*): Self = StObject.set(x, "pointFillColors", js.Array(value :_*))
      
      @scala.inline
      def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      @scala.inline
      def setPointStrokeColors(value: js.Array[String]): Self = StObject.set(x, "pointStrokeColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointStrokeColorsUndefined: Self = StObject.set(x, "pointStrokeColors", js.undefined)
      
      @scala.inline
      def setPointStrokeColorsVarargs(value: String*): Self = StObject.set(x, "pointStrokeColors", js.Array(value :_*))
      
      @scala.inline
      def setPostUnits(value: String): Self = StObject.set(x, "postUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostUnitsUndefined: Self = StObject.set(x, "postUnits", js.undefined)
      
      @scala.inline
      def setPreUnits(value: String): Self = StObject.set(x, "preUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreUnitsUndefined: Self = StObject.set(x, "preUnits", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      @scala.inline
      def setXLabelAngle(value: Double): Self = StObject.set(x, "xLabelAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLabelAngleUndefined: Self = StObject.set(x, "xLabelAngle", js.undefined)
      
      @scala.inline
      def setXLabelFormat(value: /* date */ Date => String): Self = StObject.set(x, "xLabelFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setXLabelFormatUndefined: Self = StObject.set(x, "xLabelFormat", js.undefined)
      
      @scala.inline
      def setXLabels(value: Interval): Self = StObject.set(x, "xLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXLabelsUndefined: Self = StObject.set(x, "xLabels", js.undefined)
      
      @scala.inline
      def setYLabelFormat(value: /* val */ js.Any => String): Self = StObject.set(x, "yLabelFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setYLabelFormatUndefined: Self = StObject.set(x, "yLabelFormat", js.undefined)
      
      @scala.inline
      def setYmax(value: Double | String): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmaxUndefined: Self = StObject.set(x, "ymax", js.undefined)
      
      @scala.inline
      def setYmin(value: Double | String): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYminUndefined: Self = StObject.set(x, "ymin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.morrisJs.morrisJsStrings.decade
    - typings.morrisJs.morrisJsStrings.year
    - typings.morrisJs.morrisJsStrings.month
    - typings.morrisJs.morrisJsStrings.week
    - typings.morrisJs.morrisJsStrings.day
    - typings.morrisJs.morrisJsStrings.hour
    - typings.morrisJs.morrisJsStrings.`30min`
    - typings.morrisJs.morrisJsStrings.`15min`
    - typings.morrisJs.morrisJsStrings.`10min`
    - typings.morrisJs.morrisJsStrings.`5min`
    - typings.morrisJs.morrisJsStrings.minute
    - typings.morrisJs.morrisJsStrings.`30sec`
    - typings.morrisJs.morrisJsStrings.`15sec`
    - typings.morrisJs.morrisJsStrings.`10sec`
    - typings.morrisJs.morrisJsStrings.`5sec`
    - typings.morrisJs.morrisJsStrings.second
  */
  trait Interval extends StObject
  object Interval {
    
    @scala.inline
    def `10min`: typings.morrisJs.morrisJsStrings.`10min` = "10min".asInstanceOf[typings.morrisJs.morrisJsStrings.`10min`]
    
    @scala.inline
    def `10sec`: typings.morrisJs.morrisJsStrings.`10sec` = "10sec".asInstanceOf[typings.morrisJs.morrisJsStrings.`10sec`]
    
    @scala.inline
    def `15min`: typings.morrisJs.morrisJsStrings.`15min` = "15min".asInstanceOf[typings.morrisJs.morrisJsStrings.`15min`]
    
    @scala.inline
    def `15sec`: typings.morrisJs.morrisJsStrings.`15sec` = "15sec".asInstanceOf[typings.morrisJs.morrisJsStrings.`15sec`]
    
    @scala.inline
    def `30min`: typings.morrisJs.morrisJsStrings.`30min` = "30min".asInstanceOf[typings.morrisJs.morrisJsStrings.`30min`]
    
    @scala.inline
    def `30sec`: typings.morrisJs.morrisJsStrings.`30sec` = "30sec".asInstanceOf[typings.morrisJs.morrisJsStrings.`30sec`]
    
    @scala.inline
    def `5min`: typings.morrisJs.morrisJsStrings.`5min` = "5min".asInstanceOf[typings.morrisJs.morrisJsStrings.`5min`]
    
    @scala.inline
    def `5sec`: typings.morrisJs.morrisJsStrings.`5sec` = "5sec".asInstanceOf[typings.morrisJs.morrisJsStrings.`5sec`]
    
    @scala.inline
    def day: typings.morrisJs.morrisJsStrings.day = "day".asInstanceOf[typings.morrisJs.morrisJsStrings.day]
    
    @scala.inline
    def decade: typings.morrisJs.morrisJsStrings.decade = "decade".asInstanceOf[typings.morrisJs.morrisJsStrings.decade]
    
    @scala.inline
    def hour: typings.morrisJs.morrisJsStrings.hour = "hour".asInstanceOf[typings.morrisJs.morrisJsStrings.hour]
    
    @scala.inline
    def minute: typings.morrisJs.morrisJsStrings.minute = "minute".asInstanceOf[typings.morrisJs.morrisJsStrings.minute]
    
    @scala.inline
    def month: typings.morrisJs.morrisJsStrings.month = "month".asInstanceOf[typings.morrisJs.morrisJsStrings.month]
    
    @scala.inline
    def second: typings.morrisJs.morrisJsStrings.second = "second".asInstanceOf[typings.morrisJs.morrisJsStrings.second]
    
    @scala.inline
    def week: typings.morrisJs.morrisJsStrings.week = "week".asInstanceOf[typings.morrisJs.morrisJsStrings.week]
    
    @scala.inline
    def year: typings.morrisJs.morrisJsStrings.year = "year".asInstanceOf[typings.morrisJs.morrisJsStrings.year]
  }
  
  trait MorrisStatic extends StObject {
    
    /** Create an area chart. */
    def Area(options: IAreaOptions): GridChart
    
    /** Create a bar chart. */
    def Bar(options: IBarOptions): GridChart
    
    /** Create a Donut chart. */
    def Donut(options: IDonutOptions): DonutChart
    
    /** Create a line chart. */
    def Line(options: ILineOptions): GridChart
  }
  object MorrisStatic {
    
    @scala.inline
    def apply(
      Area: IAreaOptions => GridChart,
      Bar: IBarOptions => GridChart,
      Donut: IDonutOptions => DonutChart,
      Line: ILineOptions => GridChart
    ): MorrisStatic = {
      val __obj = js.Dynamic.literal(Area = js.Any.fromFunction1(Area), Bar = js.Any.fromFunction1(Bar), Donut = js.Any.fromFunction1(Donut), Line = js.Any.fromFunction1(Line))
      __obj.asInstanceOf[MorrisStatic]
    }
    
    @scala.inline
    implicit class MorrisStaticMutableBuilder[Self <: MorrisStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArea(value: IAreaOptions => GridChart): Self = StObject.set(x, "Area", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBar(value: IBarOptions => GridChart): Self = StObject.set(x, "Bar", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDonut(value: IDonutOptions => DonutChart): Self = StObject.set(x, "Donut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLine(value: ILineOptions => GridChart): Self = StObject.set(x, "Line", js.Any.fromFunction1(value))
    }
  }
}
