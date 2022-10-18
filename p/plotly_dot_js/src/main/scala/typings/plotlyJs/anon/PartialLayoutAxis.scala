package typings.plotlyJs.anon

import typings.plotlyJs.mod.AxisName
import typings.plotlyJs.mod.AxisType
import typings.plotlyJs.mod.Calendar
import typings.plotlyJs.mod.DTickValue
import typings.plotlyJs.mod.DataTitle
import typings.plotlyJs.mod.Font
import typings.plotlyJs.mod.RangeSelector
import typings.plotlyJs.mod.RangeSlider
import typings.plotlyJs.mod.TickFormatStop
import typings.plotlyJs.plotlyJsBooleans.`false`
import typings.plotlyJs.plotlyJsBooleans.`true`
import typings.plotlyJs.plotlyJsStrings.B
import typings.plotlyJs.plotlyJsStrings.E
import typings.plotlyJs.plotlyJsStrings.SI
import typings.plotlyJs.plotlyJsStrings._empty
import typings.plotlyJs.plotlyJsStrings.`above traces`
import typings.plotlyJs.plotlyJsStrings.`below traces`
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
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.center
import typings.plotlyJs.plotlyJsStrings.clockwise
import typings.plotlyJs.plotlyJsStrings.counterclockwise
import typings.plotlyJs.plotlyJsStrings.cursor
import typings.plotlyJs.plotlyJsStrings.data
import typings.plotlyJs.plotlyJsStrings.domain
import typings.plotlyJs.plotlyJsStrings.e_
import typings.plotlyJs.plotlyJsStrings.first
import typings.plotlyJs.plotlyJsStrings.free
import typings.plotlyJs.plotlyJsStrings.inside
import typings.plotlyJs.plotlyJsStrings.last
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.linear
import typings.plotlyJs.plotlyJsStrings.marker
import typings.plotlyJs.plotlyJsStrings.middle
import typings.plotlyJs.plotlyJsStrings.none
import typings.plotlyJs.plotlyJsStrings.nonnegative
import typings.plotlyJs.plotlyJsStrings.normal
import typings.plotlyJs.plotlyJsStrings.outside
import typings.plotlyJs.plotlyJsStrings.power
import typings.plotlyJs.plotlyJsStrings.range
import typings.plotlyJs.plotlyJsStrings.reversed
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.ticks
import typings.plotlyJs.plotlyJsStrings.toaxis
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacross
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignacrossPlussignmarker
import typings.plotlyJs.plotlyJsStrings.toaxisPlussignmarker
import typings.plotlyJs.plotlyJsStrings.top
import typings.plotlyJs.plotlyJsStrings.tozero
import typings.plotlyJs.plotlyJsStrings.trace
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.LayoutAxis> */
trait PartialLayoutAxis extends StObject {
  
  var anchor: js.UndefOr[free | AxisName] = js.undefined
  
  var angle: js.UndefOr[Any] = js.undefined
  
  var automargin: js.UndefOr[Boolean] = js.undefined
  
  var autorange: js.UndefOr[`true` | `false` | reversed] = js.undefined
  
  var autotick: js.UndefOr[Boolean] = js.undefined
  
  var calendar: js.UndefOr[Calendar] = js.undefined
  
  var categoryarray: js.UndefOr[js.Array[Any]] = js.undefined
  
  var categoryorder: js.UndefOr[
    trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
  ] = js.undefined
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var constrain: js.UndefOr[range | domain] = js.undefined
  
  var constraintoward: js.UndefOr[left | center | right | top | middle | bottom] = js.undefined
  
  var direction: js.UndefOr[counterclockwise | clockwise] = js.undefined
  
  var dividercolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var dividerwidth: js.UndefOr[Double] = js.undefined
  
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  
  var dtick: js.UndefOr[DTickValue] = js.undefined
  
  var exponentformat: js.UndefOr[none | e_ | E | power | SI | B] = js.undefined
  
  var fixedrange: js.UndefOr[Boolean] = js.undefined
  
  var gridcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var griddash: js.UndefOr[typings.plotlyJs.mod.Dash] = js.undefined
  
  var gridwidth: js.UndefOr[Double] = js.undefined
  
  var hoverformat: js.UndefOr[String] = js.undefined
  
  var layer: js.UndefOr[(`above traces`) | (`below traces`)] = js.undefined
  
  var linecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var linewidth: js.UndefOr[Double] = js.undefined
  
  var mirror: js.UndefOr[`true` | ticks | `false` | all | allticks] = js.undefined
  
  var nticks: js.UndefOr[Double] = js.undefined
  
  var overlaying: js.UndefOr[free | AxisName] = js.undefined
  
  var position: js.UndefOr[Double] = js.undefined
  
  var range: js.UndefOr[js.Array[Any]] = js.undefined
  
  var rangemode: js.UndefOr[normal | tozero | nonnegative] = js.undefined
  
  var rangeselector: js.UndefOr[Partial[RangeSelector]] = js.undefined
  
  var rangeslider: js.UndefOr[Partial[RangeSlider]] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var scaleanchor: js.UndefOr[AxisName] = js.undefined
  
  var scaleratio: js.UndefOr[Double] = js.undefined
  
  var separatethousands: js.UndefOr[Boolean] = js.undefined
  
  var showdividers: js.UndefOr[Boolean] = js.undefined
  
  var showexponent: js.UndefOr[all | first | last | none] = js.undefined
  
  var showgrid: js.UndefOr[Boolean] = js.undefined
  
  var showline: js.UndefOr[Boolean] = js.undefined
  
  var showspikes: js.UndefOr[Boolean] = js.undefined
  
  var showticklabels: js.UndefOr[Boolean] = js.undefined
  
  var showtickprefix: js.UndefOr[all | first | last | none] = js.undefined
  
  var showticksuffix: js.UndefOr[all | first | last | none] = js.undefined
  
  var side: js.UndefOr[top | bottom | left | right | clockwise | counterclockwise] = js.undefined
  
  var spikecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var spikedash: js.UndefOr[String] = js.undefined
  
  var spikemode: js.UndefOr[
    toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
  ] = js.undefined
  
  var spikesnap: js.UndefOr[data | cursor | (`hovered data`)] = js.undefined
  
  var spikethickness: js.UndefOr[Double] = js.undefined
  
  var tick0: js.UndefOr[Double | String] = js.undefined
  
  var tickangle: js.UndefOr[auto | Double] = js.undefined
  
  var tickcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var tickfont: js.UndefOr[Partial[Font]] = js.undefined
  
  var tickformat: js.UndefOr[String] = js.undefined
  
  var tickformatstops: js.UndefOr[js.Array[Partial[TickFormatStop]]] = js.undefined
  
  var ticklen: js.UndefOr[Double] = js.undefined
  
  var tickmode: js.UndefOr[auto | linear | array] = js.undefined
  
  var tickprefix: js.UndefOr[String] = js.undefined
  
  var ticks: js.UndefOr[outside | inside | _empty] = js.undefined
  
  var ticksuffix: js.UndefOr[String] = js.undefined
  
  var ticktext: js.UndefOr[js.Array[String]] = js.undefined
  
  var tickvals: js.UndefOr[js.Array[Any]] = js.undefined
  
  var tickwidth: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String | Partial[DataTitle]] = js.undefined
  
  var titlefont: js.UndefOr[Partial[Font]] = js.undefined
  
  var `type`: js.UndefOr[AxisType] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zeroline: js.UndefOr[Boolean] = js.undefined
  
  var zerolinecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var zerolinewidth: js.UndefOr[Double] = js.undefined
}
object PartialLayoutAxis {
  
  inline def apply(): PartialLayoutAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLayoutAxis]
  }
  
  extension [Self <: PartialLayoutAxis](x: Self) {
    
    inline def setAnchor(value: free | AxisName): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAngle(value: Any): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAutomargin(value: Boolean): Self = StObject.set(x, "automargin", value.asInstanceOf[js.Any])
    
    inline def setAutomarginUndefined: Self = StObject.set(x, "automargin", js.undefined)
    
    inline def setAutorange(value: `true` | `false` | reversed): Self = StObject.set(x, "autorange", value.asInstanceOf[js.Any])
    
    inline def setAutorangeUndefined: Self = StObject.set(x, "autorange", js.undefined)
    
    inline def setAutotick(value: Boolean): Self = StObject.set(x, "autotick", value.asInstanceOf[js.Any])
    
    inline def setAutotickUndefined: Self = StObject.set(x, "autotick", js.undefined)
    
    inline def setCalendar(value: Calendar): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCategoryarray(value: js.Array[Any]): Self = StObject.set(x, "categoryarray", value.asInstanceOf[js.Any])
    
    inline def setCategoryarrayUndefined: Self = StObject.set(x, "categoryarray", js.undefined)
    
    inline def setCategoryarrayVarargs(value: Any*): Self = StObject.set(x, "categoryarray", js.Array(value*))
    
    inline def setCategoryorder(
      value: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`)
    ): Self = StObject.set(x, "categoryorder", value.asInstanceOf[js.Any])
    
    inline def setCategoryorderUndefined: Self = StObject.set(x, "categoryorder", js.undefined)
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setConstrain(value: range | domain): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstrainUndefined: Self = StObject.set(x, "constrain", js.undefined)
    
    inline def setConstraintoward(value: left | center | right | top | middle | bottom): Self = StObject.set(x, "constraintoward", value.asInstanceOf[js.Any])
    
    inline def setConstraintowardUndefined: Self = StObject.set(x, "constraintoward", js.undefined)
    
    inline def setDirection(value: counterclockwise | clockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDividercolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "dividercolor", value.asInstanceOf[js.Any])
    
    inline def setDividercolorUndefined: Self = StObject.set(x, "dividercolor", js.undefined)
    
    inline def setDividercolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "dividercolor", js.Array(value*))
    
    inline def setDividerwidth(value: Double): Self = StObject.set(x, "dividerwidth", value.asInstanceOf[js.Any])
    
    inline def setDividerwidthUndefined: Self = StObject.set(x, "dividerwidth", js.undefined)
    
    inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setDtick(value: DTickValue): Self = StObject.set(x, "dtick", value.asInstanceOf[js.Any])
    
    inline def setDtickUndefined: Self = StObject.set(x, "dtick", js.undefined)
    
    inline def setExponentformat(value: none | e_ | E | power | SI | B): Self = StObject.set(x, "exponentformat", value.asInstanceOf[js.Any])
    
    inline def setExponentformatUndefined: Self = StObject.set(x, "exponentformat", js.undefined)
    
    inline def setFixedrange(value: Boolean): Self = StObject.set(x, "fixedrange", value.asInstanceOf[js.Any])
    
    inline def setFixedrangeUndefined: Self = StObject.set(x, "fixedrange", js.undefined)
    
    inline def setGridcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "gridcolor", value.asInstanceOf[js.Any])
    
    inline def setGridcolorUndefined: Self = StObject.set(x, "gridcolor", js.undefined)
    
    inline def setGridcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "gridcolor", js.Array(value*))
    
    inline def setGriddash(value: typings.plotlyJs.mod.Dash): Self = StObject.set(x, "griddash", value.asInstanceOf[js.Any])
    
    inline def setGriddashUndefined: Self = StObject.set(x, "griddash", js.undefined)
    
    inline def setGridwidth(value: Double): Self = StObject.set(x, "gridwidth", value.asInstanceOf[js.Any])
    
    inline def setGridwidthUndefined: Self = StObject.set(x, "gridwidth", js.undefined)
    
    inline def setHoverformat(value: String): Self = StObject.set(x, "hoverformat", value.asInstanceOf[js.Any])
    
    inline def setHoverformatUndefined: Self = StObject.set(x, "hoverformat", js.undefined)
    
    inline def setLayer(value: (`above traces`) | (`below traces`)): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setLinecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "linecolor", value.asInstanceOf[js.Any])
    
    inline def setLinecolorUndefined: Self = StObject.set(x, "linecolor", js.undefined)
    
    inline def setLinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "linecolor", js.Array(value*))
    
    inline def setLinewidth(value: Double): Self = StObject.set(x, "linewidth", value.asInstanceOf[js.Any])
    
    inline def setLinewidthUndefined: Self = StObject.set(x, "linewidth", js.undefined)
    
    inline def setMirror(value: `true` | ticks | `false` | all | allticks): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setNticks(value: Double): Self = StObject.set(x, "nticks", value.asInstanceOf[js.Any])
    
    inline def setNticksUndefined: Self = StObject.set(x, "nticks", js.undefined)
    
    inline def setOverlaying(value: free | AxisName): Self = StObject.set(x, "overlaying", value.asInstanceOf[js.Any])
    
    inline def setOverlayingUndefined: Self = StObject.set(x, "overlaying", js.undefined)
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRange(value: js.Array[Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRangeVarargs(value: Any*): Self = StObject.set(x, "range", js.Array(value*))
    
    inline def setRangemode(value: normal | tozero | nonnegative): Self = StObject.set(x, "rangemode", value.asInstanceOf[js.Any])
    
    inline def setRangemodeUndefined: Self = StObject.set(x, "rangemode", js.undefined)
    
    inline def setRangeselector(value: Partial[RangeSelector]): Self = StObject.set(x, "rangeselector", value.asInstanceOf[js.Any])
    
    inline def setRangeselectorUndefined: Self = StObject.set(x, "rangeselector", js.undefined)
    
    inline def setRangeslider(value: Partial[RangeSlider]): Self = StObject.set(x, "rangeslider", value.asInstanceOf[js.Any])
    
    inline def setRangesliderUndefined: Self = StObject.set(x, "rangeslider", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScaleanchor(value: AxisName): Self = StObject.set(x, "scaleanchor", value.asInstanceOf[js.Any])
    
    inline def setScaleanchorUndefined: Self = StObject.set(x, "scaleanchor", js.undefined)
    
    inline def setScaleratio(value: Double): Self = StObject.set(x, "scaleratio", value.asInstanceOf[js.Any])
    
    inline def setScaleratioUndefined: Self = StObject.set(x, "scaleratio", js.undefined)
    
    inline def setSeparatethousands(value: Boolean): Self = StObject.set(x, "separatethousands", value.asInstanceOf[js.Any])
    
    inline def setSeparatethousandsUndefined: Self = StObject.set(x, "separatethousands", js.undefined)
    
    inline def setShowdividers(value: Boolean): Self = StObject.set(x, "showdividers", value.asInstanceOf[js.Any])
    
    inline def setShowdividersUndefined: Self = StObject.set(x, "showdividers", js.undefined)
    
    inline def setShowexponent(value: all | first | last | none): Self = StObject.set(x, "showexponent", value.asInstanceOf[js.Any])
    
    inline def setShowexponentUndefined: Self = StObject.set(x, "showexponent", js.undefined)
    
    inline def setShowgrid(value: Boolean): Self = StObject.set(x, "showgrid", value.asInstanceOf[js.Any])
    
    inline def setShowgridUndefined: Self = StObject.set(x, "showgrid", js.undefined)
    
    inline def setShowline(value: Boolean): Self = StObject.set(x, "showline", value.asInstanceOf[js.Any])
    
    inline def setShowlineUndefined: Self = StObject.set(x, "showline", js.undefined)
    
    inline def setShowspikes(value: Boolean): Self = StObject.set(x, "showspikes", value.asInstanceOf[js.Any])
    
    inline def setShowspikesUndefined: Self = StObject.set(x, "showspikes", js.undefined)
    
    inline def setShowticklabels(value: Boolean): Self = StObject.set(x, "showticklabels", value.asInstanceOf[js.Any])
    
    inline def setShowticklabelsUndefined: Self = StObject.set(x, "showticklabels", js.undefined)
    
    inline def setShowtickprefix(value: all | first | last | none): Self = StObject.set(x, "showtickprefix", value.asInstanceOf[js.Any])
    
    inline def setShowtickprefixUndefined: Self = StObject.set(x, "showtickprefix", js.undefined)
    
    inline def setShowticksuffix(value: all | first | last | none): Self = StObject.set(x, "showticksuffix", value.asInstanceOf[js.Any])
    
    inline def setShowticksuffixUndefined: Self = StObject.set(x, "showticksuffix", js.undefined)
    
    inline def setSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSpikecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "spikecolor", value.asInstanceOf[js.Any])
    
    inline def setSpikecolorUndefined: Self = StObject.set(x, "spikecolor", js.undefined)
    
    inline def setSpikecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "spikecolor", js.Array(value*))
    
    inline def setSpikedash(value: String): Self = StObject.set(x, "spikedash", value.asInstanceOf[js.Any])
    
    inline def setSpikedashUndefined: Self = StObject.set(x, "spikedash", js.undefined)
    
    inline def setSpikemode(
      value: toaxis | across | marker | toaxisPlussignacross | toaxisPlussignacrossPlussignmarker | acrossPlussignmarker | toaxisPlussignmarker
    ): Self = StObject.set(x, "spikemode", value.asInstanceOf[js.Any])
    
    inline def setSpikemodeUndefined: Self = StObject.set(x, "spikemode", js.undefined)
    
    inline def setSpikesnap(value: data | cursor | (`hovered data`)): Self = StObject.set(x, "spikesnap", value.asInstanceOf[js.Any])
    
    inline def setSpikesnapUndefined: Self = StObject.set(x, "spikesnap", js.undefined)
    
    inline def setSpikethickness(value: Double): Self = StObject.set(x, "spikethickness", value.asInstanceOf[js.Any])
    
    inline def setSpikethicknessUndefined: Self = StObject.set(x, "spikethickness", js.undefined)
    
    inline def setTick0(value: Double | String): Self = StObject.set(x, "tick0", value.asInstanceOf[js.Any])
    
    inline def setTick0Undefined: Self = StObject.set(x, "tick0", js.undefined)
    
    inline def setTickangle(value: auto | Double): Self = StObject.set(x, "tickangle", value.asInstanceOf[js.Any])
    
    inline def setTickangleUndefined: Self = StObject.set(x, "tickangle", js.undefined)
    
    inline def setTickcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "tickcolor", value.asInstanceOf[js.Any])
    
    inline def setTickcolorUndefined: Self = StObject.set(x, "tickcolor", js.undefined)
    
    inline def setTickcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "tickcolor", js.Array(value*))
    
    inline def setTickfont(value: Partial[Font]): Self = StObject.set(x, "tickfont", value.asInstanceOf[js.Any])
    
    inline def setTickfontUndefined: Self = StObject.set(x, "tickfont", js.undefined)
    
    inline def setTickformat(value: String): Self = StObject.set(x, "tickformat", value.asInstanceOf[js.Any])
    
    inline def setTickformatUndefined: Self = StObject.set(x, "tickformat", js.undefined)
    
    inline def setTickformatstops(value: js.Array[Partial[TickFormatStop]]): Self = StObject.set(x, "tickformatstops", value.asInstanceOf[js.Any])
    
    inline def setTickformatstopsUndefined: Self = StObject.set(x, "tickformatstops", js.undefined)
    
    inline def setTickformatstopsVarargs(value: Partial[TickFormatStop]*): Self = StObject.set(x, "tickformatstops", js.Array(value*))
    
    inline def setTicklen(value: Double): Self = StObject.set(x, "ticklen", value.asInstanceOf[js.Any])
    
    inline def setTicklenUndefined: Self = StObject.set(x, "ticklen", js.undefined)
    
    inline def setTickmode(value: auto | linear | array): Self = StObject.set(x, "tickmode", value.asInstanceOf[js.Any])
    
    inline def setTickmodeUndefined: Self = StObject.set(x, "tickmode", js.undefined)
    
    inline def setTickprefix(value: String): Self = StObject.set(x, "tickprefix", value.asInstanceOf[js.Any])
    
    inline def setTickprefixUndefined: Self = StObject.set(x, "tickprefix", js.undefined)
    
    inline def setTicks(value: outside | inside | _empty): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksuffix(value: String): Self = StObject.set(x, "ticksuffix", value.asInstanceOf[js.Any])
    
    inline def setTicksuffixUndefined: Self = StObject.set(x, "ticksuffix", js.undefined)
    
    inline def setTicktext(value: js.Array[String]): Self = StObject.set(x, "ticktext", value.asInstanceOf[js.Any])
    
    inline def setTicktextUndefined: Self = StObject.set(x, "ticktext", js.undefined)
    
    inline def setTicktextVarargs(value: String*): Self = StObject.set(x, "ticktext", js.Array(value*))
    
    inline def setTickvals(value: js.Array[Any]): Self = StObject.set(x, "tickvals", value.asInstanceOf[js.Any])
    
    inline def setTickvalsUndefined: Self = StObject.set(x, "tickvals", js.undefined)
    
    inline def setTickvalsVarargs(value: Any*): Self = StObject.set(x, "tickvals", js.Array(value*))
    
    inline def setTickwidth(value: Double): Self = StObject.set(x, "tickwidth", value.asInstanceOf[js.Any])
    
    inline def setTickwidthUndefined: Self = StObject.set(x, "tickwidth", js.undefined)
    
    inline def setTitle(value: String | Partial[DataTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitlefont(value: Partial[Font]): Self = StObject.set(x, "titlefont", value.asInstanceOf[js.Any])
    
    inline def setTitlefontUndefined: Self = StObject.set(x, "titlefont", js.undefined)
    
    inline def setType(value: AxisType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZeroline(value: Boolean): Self = StObject.set(x, "zeroline", value.asInstanceOf[js.Any])
    
    inline def setZerolineUndefined: Self = StObject.set(x, "zeroline", js.undefined)
    
    inline def setZerolinecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "zerolinecolor", value.asInstanceOf[js.Any])
    
    inline def setZerolinecolorUndefined: Self = StObject.set(x, "zerolinecolor", js.undefined)
    
    inline def setZerolinecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "zerolinecolor", js.Array(value*))
    
    inline def setZerolinewidth(value: Double): Self = StObject.set(x, "zerolinewidth", value.asInstanceOf[js.Any])
    
    inline def setZerolinewidthUndefined: Self = StObject.set(x, "zerolinewidth", js.undefined)
  }
}
