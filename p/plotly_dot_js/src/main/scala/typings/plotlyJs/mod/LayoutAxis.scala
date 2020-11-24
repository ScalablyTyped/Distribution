package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialDataTitleFont
import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.anon.PartialRangeSelectorActivecolor
import typings.plotlyJs.anon.PartialRangeSlider
import typings.plotlyJs.anon.PartialTickFormatStop
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutAxis extends Axis {
  
  var anchor: free | AxisName = js.native
  
  var angle: js.Any = js.native
  
  var automargin: Boolean = js.native
  
  var autotick: Boolean = js.native
  
  var constrain: range | domain = js.native
  
  var constraintoward: left | center | right | top | middle | bottom = js.native
  
  var domain: js.Array[Double] = js.native
  
  var layer: (`above traces`) | (`below traces`) = js.native
  
  var overlaying: free | AxisName = js.native
  
  var position: Double = js.native
  
  var rangeselector: PartialRangeSelectorActivecolor = js.native
  
  var rangeslider: PartialRangeSlider = js.native
  
  var scaleanchor: AxisName = js.native
  
  var scaleratio: Double = js.native
  
  var side: top | bottom | left | right | clockwise | counterclockwise = js.native
}
object LayoutAxis {
  
  @scala.inline
  def apply(
    anchor: free | AxisName,
    angle: js.Any,
    automargin: Boolean,
    autorange: `true` | `false` | reversed,
    autotick: Boolean,
    calendar: Calendar,
    categoryarray: js.Array[_],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
    color: Color,
    constrain: range | domain,
    constraintoward: left | center | right | top | middle | bottom,
    dividercolor: Color,
    dividerwidth: Double,
    domain: js.Array[Double],
    dtick: DTickValue,
    exponentformat: none | e_ | E | power | SI | B,
    fixedrange: Boolean,
    gridcolor: Color,
    gridwidth: Double,
    hoverformat: String,
    layer: (`above traces`) | (`below traces`),
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    overlaying: free | AxisName,
    position: Double,
    range: js.Array[_],
    rangemode: normal | tozero | nonnegative,
    rangeselector: PartialRangeSelectorActivecolor,
    rangeslider: PartialRangeSlider,
    scaleanchor: AxisName,
    scaleratio: Double,
    separatethousands: Boolean,
    showdividers: Boolean,
    showexponent: all | first | last | none,
    showgrid: Boolean,
    showline: Boolean,
    showspikes: Boolean,
    showticklabels: Boolean,
    showtickprefix: all | first | last | none,
    showticksuffix: all | first | last | none,
    side: top | bottom | left | right | clockwise | counterclockwise,
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
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], automargin = automargin.asInstanceOf[js.Any], autorange = autorange.asInstanceOf[js.Any], autotick = autotick.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], dividercolor = dividercolor.asInstanceOf[js.Any], dividerwidth = dividerwidth.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], overlaying = overlaying.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector.asInstanceOf[js.Any], rangeslider = rangeslider.asInstanceOf[js.Any], scaleanchor = scaleanchor.asInstanceOf[js.Any], scaleratio = scaleratio.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showdividers = showdividers.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash.asInstanceOf[js.Any], spikemode = spikemode.asInstanceOf[js.Any], spikesnap = spikesnap.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], tickformatstops = tickformatstops.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAxis]
  }
  
  @scala.inline
  implicit class LayoutAxisOps[Self <: LayoutAxis] (val x: Self) extends AnyVal {
    
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
    def setAnchor(value: free | AxisName): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: js.Any): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomargin(value: Boolean): Self = this.set("automargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutotick(value: Boolean): Self = this.set("autotick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstrain(value: range | domain): Self = this.set("constrain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintoward(value: left | center | right | top | middle | bottom): Self = this.set("constraintoward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainVarargs(value: Double*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: js.Array[Double]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: (`above traces`) | (`below traces`)): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaying(value: free | AxisName): Self = this.set("overlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeselector(value: PartialRangeSelectorActivecolor): Self = this.set("rangeselector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeslider(value: PartialRangeSlider): Self = this.set("rangeslider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleanchor(value: AxisName): Self = this.set("scaleanchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleratio(value: Double): Self = this.set("scaleratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = this.set("side", value.asInstanceOf[js.Any])
  }
}
