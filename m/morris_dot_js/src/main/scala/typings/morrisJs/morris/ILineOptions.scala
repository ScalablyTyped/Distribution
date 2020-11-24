package typings.morrisJs.morris

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILineOptions extends IGridChartOptions {
  
  /** Define how null and undefined values are handled (see documentation). */
  var continuousLine: js.UndefOr[Boolean] = js.native
  
  /** A function that accepts millisecond timestamps and formats them for display as chart labels. */
  var dateFormat: js.UndefOr[js.Function1[/* timestamp */ Double, String]] = js.native
  
  /** Array of color values to use for the event line colors. If you list fewer colors here than you have lines in events, then the values will be cycled. */
  var eventLineColors: js.UndefOr[js.Array[String]] = js.native
  
  /** Width, in pixels, of the event lines. */
  var eventStrokeWidth: js.UndefOr[Double] = js.native
  
  /** A list of x-values to draw as vertical 'event' lines on the chart. */
  var events: js.UndefOr[js.Array[String]] = js.native
  
  /** Change the opacity of the area fill colour. Accepts values between 0.0 (for completely transparent) and 1.0 (for completely opaque). */
  var fillOpacity: js.UndefOr[Double] = js.native
  
  /** Array of color values to use for the goal line colors. If you list fewer colors here than you have lines in goals, then the values will be cycled. */
  var goalLineColors: js.UndefOr[js.Array[String]] = js.native
  
  /** Width, in pixels, of the goal lines. */
  var goalStrokeWidth: js.UndefOr[Double] = js.native
  
  /** A list of y-values to draw as horizontal 'goal' lines on the chart. */
  var goals: js.UndefOr[js.Array[Double]] = js.native
  
  /** Provide a function on this option to generate custom hover legends. */
  var hoverCallback: js.UndefOr[
    js.Function4[
      /* index */ Double, 
      /* options */ this.type, 
      /* content */ String, 
      /* row */ js.Any, 
      String
    ]
  ] = js.native
  
  /** Array containing colors for the series lines/points. */
  var lineColors: js.UndefOr[js.Array[String]] = js.native
  
  /** Width of the series lines, in pixels. */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /** Set to false to skip time/date parsing for X values, instead treating them as an equally-spaced series. */
  var parseTime: js.UndefOr[Boolean] = js.native
  
  /** Colors for the series points. By default uses the same values as lineColors */
  var pointFillColors: js.UndefOr[js.Array[String]] = js.native
  
  /** Diameter of the series points, in pixels. */
  var pointSize: js.UndefOr[Double] = js.native
  
  /** Colors for the outlines of the series points. (#ffffff by default). */
  var pointStrokeColors: js.UndefOr[js.Array[String]] = js.native
  
  /** Set to a string value (eg: '%') to add a label suffix all y-labels. */
  var postUnits: js.UndefOr[String] = js.native
  
  /** Set to a string value (eg: '$') to add a label prefix all y-labels. */
  var preUnits: js.UndefOr[String] = js.native
  
  /** Set to false to disable line smoothing. */
  var smooth: js.UndefOr[Boolean] = js.native
  
  /** The angle in degrees from horizontal to draw x-axis labels. */
  var xLabelAngle: js.UndefOr[Double] = js.native
  
  /** A function that accepts Date objects and formats them for display as x-axis labels. Overrides the default formatter chosen by the automatic labeller or the xLabels option. */
  var xLabelFormat: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
  
  /** Sets the x axis labelling interval. By default the interval will be automatically computed. */
  var xLabels: js.UndefOr[Interval] = js.native
  
  /** A function that accepts y-values and formats them for display as y-axis labels. */
  var yLabelFormat: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.native
  
  /** Max. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the max y-value is at least [num]. */
  var ymax: js.UndefOr[Double | String] = js.native
  
  /** Min. bound for Y-values. Alternatively, set this to 'auto' to compute automatically, or 'auto [num]' to automatically compute and ensure that the min y-value is at most [num]. */
  var ymin: js.UndefOr[Double | String] = js.native
}
object ILineOptions {
  
  @scala.inline
  def apply(
    data: js.Array[_],
    element: js.Any,
    labels: js.Array[String],
    xkey: String,
    ykeys: js.Array[String]
  ): ILineOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], xkey = xkey.asInstanceOf[js.Any], ykeys = ykeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineOptions]
  }
  
  @scala.inline
  implicit class ILineOptionsOps[Self <: ILineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuousLine(value: Boolean): Self = this.set("continuousLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousLine: Self = this.set("continuousLine", js.undefined)
    
    @scala.inline
    def setDateFormat(value: /* timestamp */ Double => String): Self = this.set("dateFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setEventLineColorsVarargs(value: String*): Self = this.set("eventLineColors", js.Array(value :_*))
    
    @scala.inline
    def setEventLineColors(value: js.Array[String]): Self = this.set("eventLineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLineColors: Self = this.set("eventLineColors", js.undefined)
    
    @scala.inline
    def setEventStrokeWidth(value: Double): Self = this.set("eventStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStrokeWidth: Self = this.set("eventStrokeWidth", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setGoalLineColorsVarargs(value: String*): Self = this.set("goalLineColors", js.Array(value :_*))
    
    @scala.inline
    def setGoalLineColors(value: js.Array[String]): Self = this.set("goalLineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalLineColors: Self = this.set("goalLineColors", js.undefined)
    
    @scala.inline
    def setGoalStrokeWidth(value: Double): Self = this.set("goalStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoalStrokeWidth: Self = this.set("goalStrokeWidth", js.undefined)
    
    @scala.inline
    def setGoalsVarargs(value: Double*): Self = this.set("goals", js.Array(value :_*))
    
    @scala.inline
    def setGoals(value: js.Array[Double]): Self = this.set("goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoals: Self = this.set("goals", js.undefined)
    
    @scala.inline
    def setHoverCallback(value: (/* index */ Double, ILineOptions, /* content */ String, /* row */ js.Any) => String): Self = this.set("hoverCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteHoverCallback: Self = this.set("hoverCallback", js.undefined)
    
    @scala.inline
    def setLineColorsVarargs(value: String*): Self = this.set("lineColors", js.Array(value :_*))
    
    @scala.inline
    def setLineColors(value: js.Array[String]): Self = this.set("lineColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineColors: Self = this.set("lineColors", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setParseTime(value: Boolean): Self = this.set("parseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseTime: Self = this.set("parseTime", js.undefined)
    
    @scala.inline
    def setPointFillColorsVarargs(value: String*): Self = this.set("pointFillColors", js.Array(value :_*))
    
    @scala.inline
    def setPointFillColors(value: js.Array[String]): Self = this.set("pointFillColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointFillColors: Self = this.set("pointFillColors", js.undefined)
    
    @scala.inline
    def setPointSize(value: Double): Self = this.set("pointSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointSize: Self = this.set("pointSize", js.undefined)
    
    @scala.inline
    def setPointStrokeColorsVarargs(value: String*): Self = this.set("pointStrokeColors", js.Array(value :_*))
    
    @scala.inline
    def setPointStrokeColors(value: js.Array[String]): Self = this.set("pointStrokeColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointStrokeColors: Self = this.set("pointStrokeColors", js.undefined)
    
    @scala.inline
    def setPostUnits(value: String): Self = this.set("postUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostUnits: Self = this.set("postUnits", js.undefined)
    
    @scala.inline
    def setPreUnits(value: String): Self = this.set("preUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreUnits: Self = this.set("preUnits", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setXLabelAngle(value: Double): Self = this.set("xLabelAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXLabelAngle: Self = this.set("xLabelAngle", js.undefined)
    
    @scala.inline
    def setXLabelFormat(value: /* date */ Date => String): Self = this.set("xLabelFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteXLabelFormat: Self = this.set("xLabelFormat", js.undefined)
    
    @scala.inline
    def setXLabels(value: Interval): Self = this.set("xLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXLabels: Self = this.set("xLabels", js.undefined)
    
    @scala.inline
    def setYLabelFormat(value: /* val */ js.Any => String): Self = this.set("yLabelFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteYLabelFormat: Self = this.set("yLabelFormat", js.undefined)
    
    @scala.inline
    def setYmax(value: Double | String): Self = this.set("ymax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmax: Self = this.set("ymax", js.undefined)
    
    @scala.inline
    def setYmin(value: Double | String): Self = this.set("ymin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYmin: Self = this.set("ymin", js.undefined)
  }
}
