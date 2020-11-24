package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDataTitleFont
import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialTickFormatStop
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`category ascending`
import typings.plotlyJs.plotlyJsStrings.`category descending`
import typings.plotlyJs.plotlyJsStrings.`hovered data`
import typings.plotlyJs.plotlyJsStrings.`max ascending`
import typings.plotlyJs.plotlyJsStrings.`max descending`
import typings.plotlyJs.plotlyJsStrings.`mean ascending`
import typings.plotlyJs.plotlyJsStrings.`mean descending`
import typings.plotlyJs.plotlyJsStrings.`median ascending`
import typings.plotlyJs.plotlyJsStrings.`median descending`
import typings.plotlyJs.plotlyJsStrings.`min ascending`
import typings.plotlyJs.plotlyJsStrings.`min descending`
import typings.plotlyJs.plotlyJsStrings.`sum ascending`
import typings.plotlyJs.plotlyJsStrings.`sum descending`
import typings.plotlyJs.plotlyJsStrings.`total ascending`
import typings.plotlyJs.plotlyJsStrings.`total descending`
import typings.plotlyJs.plotlyJsStrings.across
import typings.plotlyJs.plotlyJsStrings.acrossPlussignmarker
import typings.plotlyJs.plotlyJsStrings.all
import typings.plotlyJs.plotlyJsStrings.allticks
import typings.plotlyJs.plotlyJsStrings.array
import typings.plotlyJs.plotlyJsStrings.auto
import typings.plotlyJs.plotlyJsStrings.cursor
import typings.plotlyJs.plotlyJsStrings.data
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.marker
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.nonnegative
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.ticks
import typings.plotlyJs.plotlyJsStrings.toaxis
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacross
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacrossPlussignmarker
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignmarker
import typings.plotlyJs.plotlyJsStrings.tozero
import typings.plotlyJs.plotlyJsStrings.trace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Axis extends js.Object {
  
  var autorange: `true` | `false` | reversed = js.native
  
  var calendar: Calendar = js.native
  
  var categoryarray: js.Array[_] = js.native
  
  /**
    * Specifies the ordering logic for the case of categorical variables.
    * By default, plotly uses *trace*, which specifies the order that is present in the data supplied.
    * Set `categoryorder` to *category ascending* or *category descending* if order should be determined by
    * the alphanumerical order of the category names.
    * Set `categoryorder` to *array* to derive the ordering from the attribute `categoryarray`. If a category
    * is not found in the `categoryarray` array, the sorting behavior for that attribute will be identical to
    * the *trace* mode. The unspecified categories will follow the categories in `categoryarray`.
    * Set `categoryorder` to *total ascending* or *total descending* if order should be determined by the
    * numerical order of the values.
    * Similarly, the order can be determined by the min, max, sum, mean or median of all the values.
    */
  var categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`) = js.native
  
  /**
    * Sets default for all colors associated with this axis
    * all at once: line, font, tick, and grid colors.
    * Grid color is lightened by blending this with the plot background
    * Individual pieces can override this.
    */
  var color: Color = js.native
  
  /**
    * Sets the color of the dividers
    * Only has an effect on *multicategory* axes.
    */
  var dividercolor: Color = js.native
  
  /**
    * Sets the width (in px) of the dividers
    * Only has an effect on *multicategory* axes.
    */
  var dividerwidth: Double = js.native
  
  var dtick: DTickValue = js.native
  
  /**
    * Determines a formatting rule for the tick exponents.
    * For example, consider the number 1,000,000,000.
    * If `none`, it appears as *1,000,000,000*.
    * If `e`, *1e+9*.
    * If `E`, *1E+9*.
    * If `power`, *1x10^9* (with 9 in a super script).
    * If `SI`, *1G*.
    * If `B`, *1B*.
    */
  var exponentformat: none | e_ | E | power | SI | B = js.native
  
  /**
    * Determines whether or not this axis is zoom-able.
    * If true, then zoom is disabled.
    */
  var fixedrange: Boolean = js.native
  
  /**
    * Sets the color of the grid lines.
    */
  var gridcolor: Color = js.native
  
  /**
    * Sets the width (in px) of the grid lines.
    */
  var gridwidth: Double = js.native
  
  /**
    * Sets the hover text formatting rule using d3 formatting mini-languages
    * which are very similar to those in Python.
    * For numbers, see: https://github.com/d3/d3-3.x-api-reference/blob/master/Formatting.md#d3_format
    * And for dates see: https://github.com/d3/d3-3.x-api-reference/blob/master/Time-Formatting.md#format
    * We add one item to d3's date formatter: `%{n}f` for fractional seconds with n digits.
    * For example, `"2016-10-13 09:15:23.456"` with tickformat `"%H~%M~%S.%2f"` would display "09~15~23.46"
    */
  var hoverformat: String = js.native
  
  /**
    * Sets the axis line color
    */
  var linecolor: Color = js.native
  
  /**
    * Sets the width (in px) of the axis line.
    */
  var linewidth: Double = js.native
  
  var mirror: `true` | ticks | `false` | all | allticks = js.native
  
  var nticks: Double = js.native
  
  var range: js.Array[_] = js.native
  
  /**
    * 'If *normal*, the range is computed in relation to the extrema
    * of the input data.
    * If *tozero*`, the range extends to 0,
    * regardless of the input data
    * If *nonnegative*, the range is non-negative,
    * regardless of the input data.
    * Applies only to linear axes.
    */
  var rangemode: normal | tozero | nonnegative = js.native
  
  /**
    * 'If `true`, even 4-digit integers are separated
    */
  var separatethousands: Boolean = js.native
  
  /**
    * Determines whether or not a dividers are drawn
    * between the category levels of this axis.
    * Only has an effect on *multicategory* axes.
    */
  var showdividers: Boolean = js.native
  
  /**
    * If `all`, all exponents are shown besides their significands.
    * If `first`, only the exponent of the first tick is shown.
    * If `last`, only the exponent of the last tick is shown.
    * If `none`, no exponents appear.
    */
  var showexponent: all | first | last | none = js.native
  
  /**
    * Determines whether or not grid lines are drawn.
    * If `true`, the grid lines are drawn at every tick mark.
    */
  var showgrid: Boolean = js.native
  
  /**
    * Lines and Grids
    */
  /**
    * Determines whether or not a line bounding this axis is drawn.
    */
  var showline: Boolean = js.native
  
  var showspikes: Boolean = js.native
  
  var showticklabels: Boolean = js.native
  
  /**
    * If `all`, all tick labels are displayed with a prefix.
    * If `first`, only the first tick is displayed with a prefix.
    * If `last`, only the last tick is displayed with a suffix.
    * If `none`, tick prefixes are hidden.
    */
  var showtickprefix: all | first | last | none = js.native
  
  /**
    * Same as `showtickprefix` but for tick suffixes.
    */
  var showticksuffix: all | first | last | none = js.native
  
  var spikecolor: Color = js.native
  
  var spikedash: String = js.native
  
  /**
    * Determines the drawing mode for the spike line.
    * If `toaxis`, the line is drawn from the data point to the axis the
    * series is plotted on.
    * If `across`, the line is drawn across the entire plot area, and
    * supercedes *toaxis*.
    * If `marker`, then a marker dot is drawn on the axis the series is
    * plotted on
    */
  var spikemode: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker = js.native
  
  /**
    * Determines whether spikelines are stuck to the cursor or to the closest datapoints.
    */
  var spikesnap: data | cursor | (`hovered data`) = js.native
  
  var spikethickness: Double = js.native
  
  var tick0: Double | String = js.native
  
  var tickangle: Double = js.native
  
  var tickcolor: Color = js.native
  
  var tickfont: PartialFont = js.native
  
  /**
    * Sets the tick label formatting rule using d3 formatting mini-languages
    * which are very similar to those in Python.
    * For numbers, see: https://github.com/d3/d3-3.x-api-reference/blob/master/Formatting.md#d3_format
    * And for dates see: https://github.com/d3/d3-3.x-api-reference/blob/master/Time-Formatting.md#format
    * We add one item to d3's date formatter: `%{n}f` for fractional seconds with n digits.
    * For example, `"2016-10-13 09:15:23.456"` with tickformat `"%H~%M~%S.%2f"` would display `"09~15~23.46"`
    */
  var tickformat: String = js.native
  
  /**
    * Array of `Partial<TickFormatStop>` objects.
    */
  var tickformatstops: js.Array[PartialTickFormatStop] = js.native
  
  var ticklen: Double = js.native
  
  /**
    * Ticks
    */
  var tickmode: auto | linear | array = js.native
  
  var tickprefix: String = js.native
  
  var ticks: outside | inside | _empty = js.native
  
  /**
    * Sets a tick label suffix.
    */
  var ticksuffix: String = js.native
  
  var ticktext: js.Array[String] = js.native
  
  var tickvals: js.Array[_] = js.native
  
  var tickwidth: Double = js.native
  
  var title: String | PartialDataTitleFont = js.native
  
  /**
    * Former `titlefont` is now the sub-attribute `font` of `title`.
    * To customize title font properties, please use `title.font` now.
    */
  var titlefont: PartialFont = js.native
  
  var `type`: AxisType = js.native
  
  /**
    * A single toggle to hide the axis while preserving interaction like dragging.
    * Default is true when a cheater plot is present on the axis, otherwise
    * false
    */
  var visible: Boolean = js.native
  
  /**
    * Determines whether or not a line is drawn at along the 0 value
    * of this axis.
    * If `true`, the zero line is drawn on top of the grid lines.
    */
  var zeroline: Boolean = js.native
  
  /**
    * Sets the line color of the zero line.
    */
  var zerolinecolor: Color = js.native
  
  /**
    * Sets the width (in px) of the zero line.
    */
  var zerolinewidth: Double = js.native
}
object Axis {
  
  @scala.inline
  def apply(
    autorange: `true` | `false` | reversed,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
    color: Color,
    dividercolor: Color,
    dividerwidth: Double,
    dtick: DTickValue,
    exponentformat: none | e_ | E | power | SI | B,
    fixedrange: Boolean,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    separatethousands: Boolean,
    showdividers: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    spikecolor: Color,
    spikedash: String,
    spikemode: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker,
    spikesnap: data | cursor | (`hovered data`),
    spikethickness: Double,
    tick0: Double | String,
    tickangle: Double,
    tickcolor: Color,
    tickfont: PartialFont,
    tickformat: String,
    tickformatstops: js.Array[PartialTickFormatStop],
    ticklen: Double,
    tickmode: auto | linear | array,
    tickprefix: String,
    ticks: outside | inside | _empty,
    ticksuffix: String,
    ticktext: js.Array[String],
    tickvals: js.Array[_],
    tickwidth: Double,
    title: String | PartialDataTitleFont,
    titlefont: PartialFont,
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): Axis = {
    val __obj = js.Dynamic.literal(autorange = autorange.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dividercolor = dividercolor.asInstanceOf[js.Any], dividerwidth = dividerwidth.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showdividers = showdividers.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash.asInstanceOf[js.Any], spikemode = spikemode.asInstanceOf[js.Any], spikesnap = spikesnap.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], tickformatstops = tickformatstops.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  @scala.inline
  implicit class AxisOps[Self <: Axis] (val x: Self) extends AnyVal {
    
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
    def setAutorange(value: `true` | `false` | reversed): Self = this.set("autorange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryarrayVarargs(value: js.Any*): Self = this.set("categoryarray", js.Array(value :_*))
    
    @scala.inline
    def setCategoryarray(value: js.Array[_]): Self = this.set("categoryarray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = this.set("categoryorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("dividercolor", js.Array(value :_*))
    
    @scala.inline
    def setDividercolor(value: Color): Self = this.set("dividercolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerwidth(value: Double): Self = this.set("dividerwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtick(value: DTickValue): Self = this.set("dtick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentformat(value: none | e_ | E | power | SI | B): Self = this.set("exponentformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedrange(value: Boolean): Self = this.set("fixedrange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("gridcolor", js.Array(value :_*))
    
    @scala.inline
    def setGridcolor(value: Color): Self = this.set("gridcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridwidth(value: Double): Self = this.set("gridwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverformat(value: String): Self = this.set("hoverformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("linecolor", js.Array(value :_*))
    
    @scala.inline
    def setLinecolor(value: Color): Self = this.set("linecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinewidth(value: Double): Self = this.set("linewidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirror(value: `true` | ticks | `false` | all | allticks): Self = this.set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNticks(value: Double): Self = this.set("nticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeVarargs(value: js.Any*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[_]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangemode(value: normal | tozero | nonnegative): Self = this.set("rangemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatethousands(value: Boolean): Self = this.set("separatethousands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowdividers(value: Boolean): Self = this.set("showdividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowexponent(value: all | first | last | none): Self = this.set("showexponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowgrid(value: Boolean): Self = this.set("showgrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowline(value: Boolean): Self = this.set("showline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowspikes(value: Boolean): Self = this.set("showspikes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticklabels(value: Boolean): Self = this.set("showticklabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowtickprefix(value: all | first | last | none): Self = this.set("showtickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowticksuffix(value: all | first | last | none): Self = this.set("showticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("spikecolor", js.Array(value :_*))
    
    @scala.inline
    def setSpikecolor(value: Color): Self = this.set("spikecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikedash(value: String): Self = this.set("spikedash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikemode(
      value: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
    ): Self = this.set("spikemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikesnap(value: data | cursor | (`hovered data`)): Self = this.set("spikesnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpikethickness(value: Double): Self = this.set("spikethickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTick0(value: Double | String): Self = this.set("tick0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickangle(value: Double): Self = this.set("tickangle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("tickcolor", js.Array(value :_*))
    
    @scala.inline
    def setTickcolor(value: Color): Self = this.set("tickcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickfont(value: PartialFont): Self = this.set("tickfont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformat(value: String): Self = this.set("tickformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickformatstopsVarargs(value: PartialTickFormatStop*): Self = this.set("tickformatstops", js.Array(value :_*))
    
    @scala.inline
    def setTickformatstops(value: js.Array[PartialTickFormatStop]): Self = this.set("tickformatstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicklen(value: Double): Self = this.set("ticklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickmode(value: auto | linear | array): Self = this.set("tickmode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickprefix(value: String): Self = this.set("tickprefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicks(value: outside | inside | _empty): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksuffix(value: String): Self = this.set("ticksuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicktextVarargs(value: String*): Self = this.set("ticktext", js.Array(value :_*))
    
    @scala.inline
    def setTicktext(value: js.Array[String]): Self = this.set("ticktext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickvalsVarargs(value: js.Any*): Self = this.set("tickvals", js.Array(value :_*))
    
    @scala.inline
    def setTickvals(value: js.Array[_]): Self = this.set("tickvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickwidth(value: Double): Self = this.set("tickwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String | PartialDataTitleFont): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitlefont(value: PartialFont): Self = this.set("titlefont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AxisType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeroline(value: Boolean): Self = this.set("zeroline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerolinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("zerolinecolor", js.Array(value :_*))
    
    @scala.inline
    def setZerolinecolor(value: Color): Self = this.set("zerolinecolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZerolinewidth(value: Double): Self = this.set("zerolinewidth", value.asInstanceOf[js.Any])
  }
}
