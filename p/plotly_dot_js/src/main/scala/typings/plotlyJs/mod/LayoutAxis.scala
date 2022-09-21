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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAxis
  extends StObject
     with Axis {
  
  var anchor: free | AxisName
  
  var angle: Any
  
  var automargin: Boolean
  
  var autotick: Boolean
  
  var constrain: range | domain
  
  var constraintoward: left | center | right | top | middle | bottom
  
  var direction: counterclockwise | clockwise
  
  var domain: js.Array[Double]
  
  var griddash: Dash
  
  var layer: (`above traces`) | (`below traces`)
  
  var overlaying: free | AxisName
  
  var position: Double
  
  var rangeselector: PartialRangeSelectorActivecolor
  
  var rangeslider: PartialRangeSlider
  
  var rotation: Double
  
  var scaleanchor: AxisName
  
  var scaleratio: Double
  
  var side: top | bottom | left | right | clockwise | counterclockwise
}
object LayoutAxis {
  
  inline def apply(
    anchor: free | AxisName,
    angle: Any,
    automargin: Boolean,
    autorange: `true` | `false` | reversed,
    autotick: Boolean,
    calendar: Calendar,
    categoryarray: js.Array[Any],
    categoryorder: trace | (`category ascending`) | (`category descending`) | array | (`total ascending`) | (`total descending`) | (`min ascending`) | (`min descending`) | (`max ascending`) | (`max descending`) | (`sum ascending`) | (`sum descending`) | (`mean ascending`) | (`mean descending`) | (`median ascending`) | (`median descending`),
    color: Color,
    constrain: range | domain,
    constraintoward: left | center | right | top | middle | bottom,
    direction: counterclockwise | clockwise,
    dividercolor: Color,
    dividerwidth: Double,
    domain: js.Array[Double],
    dtick: DTickValue,
    exponentformat: none | e_ | E | power | SI | B,
    fixedrange: Boolean,
    gridcolor: Color,
    griddash: Dash,
    gridwidth: Double,
    hoverformat: String,
    layer: (`above traces`) | (`below traces`),
    linecolor: Color,
    linewidth: Double,
    mirror: `true` | ticks | `false` | all | allticks,
    nticks: Double,
    overlaying: free | AxisName,
    position: Double,
    range: js.Array[Any],
    rangemode: normal | tozero | nonnegative,
    rangeselector: PartialRangeSelectorActivecolor,
    rangeslider: PartialRangeSlider,
    rotation: Double,
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
    tickangle: auto | Double,
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
    tickvals: js.Array[Any],
    tickwidth: Double,
    title: String | PartialDataTitleFont,
    titlefont: PartialFont,
    `type`: AxisType,
    visible: Boolean,
    zeroline: Boolean,
    zerolinecolor: Color,
    zerolinewidth: Double
  ): LayoutAxis = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], automargin = automargin.asInstanceOf[js.Any], autorange = autorange.asInstanceOf[js.Any], autotick = autotick.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], categoryarray = categoryarray.asInstanceOf[js.Any], categoryorder = categoryorder.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], constrain = constrain.asInstanceOf[js.Any], constraintoward = constraintoward.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dividercolor = dividercolor.asInstanceOf[js.Any], dividerwidth = dividerwidth.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], dtick = dtick.asInstanceOf[js.Any], exponentformat = exponentformat.asInstanceOf[js.Any], fixedrange = fixedrange.asInstanceOf[js.Any], gridcolor = gridcolor.asInstanceOf[js.Any], griddash = griddash.asInstanceOf[js.Any], gridwidth = gridwidth.asInstanceOf[js.Any], hoverformat = hoverformat.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], linecolor = linecolor.asInstanceOf[js.Any], linewidth = linewidth.asInstanceOf[js.Any], mirror = mirror.asInstanceOf[js.Any], nticks = nticks.asInstanceOf[js.Any], overlaying = overlaying.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rangemode = rangemode.asInstanceOf[js.Any], rangeselector = rangeselector.asInstanceOf[js.Any], rangeslider = rangeslider.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scaleanchor = scaleanchor.asInstanceOf[js.Any], scaleratio = scaleratio.asInstanceOf[js.Any], separatethousands = separatethousands.asInstanceOf[js.Any], showdividers = showdividers.asInstanceOf[js.Any], showexponent = showexponent.asInstanceOf[js.Any], showgrid = showgrid.asInstanceOf[js.Any], showline = showline.asInstanceOf[js.Any], showspikes = showspikes.asInstanceOf[js.Any], showticklabels = showticklabels.asInstanceOf[js.Any], showtickprefix = showtickprefix.asInstanceOf[js.Any], showticksuffix = showticksuffix.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], spikecolor = spikecolor.asInstanceOf[js.Any], spikedash = spikedash.asInstanceOf[js.Any], spikemode = spikemode.asInstanceOf[js.Any], spikesnap = spikesnap.asInstanceOf[js.Any], spikethickness = spikethickness.asInstanceOf[js.Any], tick0 = tick0.asInstanceOf[js.Any], tickangle = tickangle.asInstanceOf[js.Any], tickcolor = tickcolor.asInstanceOf[js.Any], tickfont = tickfont.asInstanceOf[js.Any], tickformat = tickformat.asInstanceOf[js.Any], tickformatstops = tickformatstops.asInstanceOf[js.Any], ticklen = ticklen.asInstanceOf[js.Any], tickmode = tickmode.asInstanceOf[js.Any], tickprefix = tickprefix.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], ticksuffix = ticksuffix.asInstanceOf[js.Any], ticktext = ticktext.asInstanceOf[js.Any], tickvals = tickvals.asInstanceOf[js.Any], tickwidth = tickwidth.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titlefont = titlefont.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], zeroline = zeroline.asInstanceOf[js.Any], zerolinecolor = zerolinecolor.asInstanceOf[js.Any], zerolinewidth = zerolinewidth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutAxis]
  }
  
  extension [Self <: LayoutAxis](x: Self) {
    
    inline def setAnchor(value: free | AxisName): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: Any): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAutomargin(value: Boolean): Self = StObject.set(x, "automargin", value.asInstanceOf[js.Any])
    
    inline def setAutotick(value: Boolean): Self = StObject.set(x, "autotick", value.asInstanceOf[js.Any])
    
    inline def setConstrain(value: range | domain): Self = StObject.set(x, "constrain", value.asInstanceOf[js.Any])
    
    inline def setConstraintoward(value: left | center | right | top | middle | bottom): Self = StObject.set(x, "constraintoward", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: counterclockwise | clockwise): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: js.Array[Double]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainVarargs(value: Double*): Self = StObject.set(x, "domain", js.Array(value*))
    
    inline def setGriddash(value: Dash): Self = StObject.set(x, "griddash", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: (`above traces`) | (`below traces`)): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setOverlaying(value: free | AxisName): Self = StObject.set(x, "overlaying", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRangeselector(value: PartialRangeSelectorActivecolor): Self = StObject.set(x, "rangeselector", value.asInstanceOf[js.Any])
    
    inline def setRangeslider(value: PartialRangeSlider): Self = StObject.set(x, "rangeslider", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleanchor(value: AxisName): Self = StObject.set(x, "scaleanchor", value.asInstanceOf[js.Any])
    
    inline def setScaleratio(value: Double): Self = StObject.set(x, "scaleratio", value.asInstanceOf[js.Any])
    
    inline def setSide(value: top | bottom | left | right | clockwise | counterclockwise): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
  }
}
