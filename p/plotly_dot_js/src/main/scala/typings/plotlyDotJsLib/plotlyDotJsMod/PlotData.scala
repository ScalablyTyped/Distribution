package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotData extends js.Object {
  var autobinx: scala.Boolean
  var boxmean: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.sd
  var colorscale: java.lang.String | (js.Array[js.Tuple2[scala.Double, java.lang.String]])
  var connectgaps: scala.Boolean
  var error_x: ErrorBar
  var error_y: ErrorBar
  var fill: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.tozeroy | plotlyDotJsLib.plotlyDotJsLibStrings.tozerox | plotlyDotJsLib.plotlyDotJsLibStrings.tonexty | plotlyDotJsLib.plotlyDotJsLibStrings.tonextx | plotlyDotJsLib.plotlyDotJsLibStrings.toself | plotlyDotJsLib.plotlyDotJsLibStrings.tonext
  var fillcolor: java.lang.String
  var hole: scala.Double
  var hoverinfo: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.name | plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.skip | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.`x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+name`
  var hoverlabel: stdLib.Partial[Label]
  var hoveron: plotlyDotJsLib.plotlyDotJsLibStrings.points | plotlyDotJsLib.plotlyDotJsLibStrings.fills
  var labels: js.Array[Datum]
  var legendgroup: java.lang.String
  var line: stdLib.Partial[ScatterLine]
  var `line.color`: Color
  var `line.dash`: Dash
  var `line.shape`: plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.spline | plotlyDotJsLib.plotlyDotJsLibStrings.hv | plotlyDotJsLib.plotlyDotJsLibStrings.vh | plotlyDotJsLib.plotlyDotJsLibStrings.hvh | plotlyDotJsLib.plotlyDotJsLibStrings.vhv
  var `line.simplify`: scala.Boolean
  var `line.smoothing`: scala.Double
  var `line.width`: scala.Double
  var marker: stdLib.Partial[PlotMarker]
   // Drawing.symbolList
  var `marker.color`: Color
  var `marker.line`: stdLib.Partial[ScatterMarkerLine]
  var `marker.maxdisplayed`: scala.Double
  var `marker.opacity`: scala.Double | js.Array[scala.Double]
  var `marker.showscale`: scala.Boolean
  var `marker.size`: scala.Double | js.Array[scala.Double]
  var `marker.sizemax`: scala.Double
  var `marker.sizemin`: scala.Double
  var `marker.sizemode`: plotlyDotJsLib.plotlyDotJsLibStrings.diameter | plotlyDotJsLib.plotlyDotJsLibStrings.area
  var `marker.sizeref`: scala.Double
  var `marker.symbol`: java.lang.String | js.Array[java.lang.String]
   // TODO
  var mode: plotlyDotJsLib.plotlyDotJsLibStrings.lines | plotlyDotJsLib.plotlyDotJsLibStrings.markers | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.`lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var name: java.lang.String
  var orientation: plotlyDotJsLib.plotlyDotJsLibStrings.v | plotlyDotJsLib.plotlyDotJsLibStrings.h
  var r: js.Array[Datum]
  var rotation: scala.Double
  var stackgroup: java.lang.String
  var text: java.lang.String | js.Array[java.lang.String]
  var textinfo: plotlyDotJsLib.plotlyDotJsLibStrings.label | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.`text+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.value | plotlyDotJsLib.plotlyDotJsLibStrings.`value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.percent | plotlyDotJsLib.plotlyDotJsLibStrings.none
  var textposition: (plotlyDotJsLib.plotlyDotJsLibStrings.`top left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`top center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`top right`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle right`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom right`) | plotlyDotJsLib.plotlyDotJsLibStrings.inside
  var theta: js.Array[Datum]
  var transforms: js.Array[DataTransform]
  var transpose: scala.Boolean
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.bar | plotlyDotJsLib.plotlyDotJsLibStrings.box | plotlyDotJsLib.plotlyDotJsLibStrings.candlestick | plotlyDotJsLib.plotlyDotJsLibStrings.choropleth | plotlyDotJsLib.plotlyDotJsLibStrings.contour | plotlyDotJsLib.plotlyDotJsLibStrings.heatmap | plotlyDotJsLib.plotlyDotJsLibStrings.histogram | plotlyDotJsLib.plotlyDotJsLibStrings.mesh3d | plotlyDotJsLib.plotlyDotJsLibStrings.ohlc | plotlyDotJsLib.plotlyDotJsLibStrings.parcoords | plotlyDotJsLib.plotlyDotJsLibStrings.pie | plotlyDotJsLib.plotlyDotJsLibStrings.pointcloud | plotlyDotJsLib.plotlyDotJsLibStrings.scatter | plotlyDotJsLib.plotlyDotJsLibStrings.scatter3d | plotlyDotJsLib.plotlyDotJsLibStrings.scattergeo | plotlyDotJsLib.plotlyDotJsLibStrings.scattergl | plotlyDotJsLib.plotlyDotJsLibStrings.scatterpolar | plotlyDotJsLib.plotlyDotJsLibStrings.scatterternary | plotlyDotJsLib.plotlyDotJsLibStrings.surface
  var values: js.Array[Datum]
  var visible: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.legendonly
  var width: scala.Double | js.Array[scala.Double]
  var x: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray
  var xaxis: java.lang.String
  var xbins: plotlyDotJsLib.Anon_End
  var xgap: scala.Double
  var xy: stdLib.Float32Array
  var y: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray
  var yaxis: java.lang.String
  var ygap: scala.Double
  var z: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray
  var zsmooth: plotlyDotJsLib.plotlyDotJsLibStrings.fast | plotlyDotJsLib.plotlyDotJsLibStrings.best | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
}

object PlotData {
  @scala.inline
  def apply(
    autobinx: scala.Boolean,
    boxmean: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.sd,
    colorscale: java.lang.String | (js.Array[js.Tuple2[scala.Double, java.lang.String]]),
    connectgaps: scala.Boolean,
    error_x: ErrorBar,
    error_y: ErrorBar,
    fill: plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.tozeroy | plotlyDotJsLib.plotlyDotJsLibStrings.tozerox | plotlyDotJsLib.plotlyDotJsLibStrings.tonexty | plotlyDotJsLib.plotlyDotJsLibStrings.tonextx | plotlyDotJsLib.plotlyDotJsLibStrings.toself | plotlyDotJsLib.plotlyDotJsLibStrings.tonext,
    fillcolor: java.lang.String,
    hole: scala.Double,
    hoverinfo: plotlyDotJsLib.plotlyDotJsLibStrings.all | plotlyDotJsLib.plotlyDotJsLibStrings.name | plotlyDotJsLib.plotlyDotJsLibStrings.none | plotlyDotJsLib.plotlyDotJsLibStrings.skip | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.`x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`x+y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`y+x+z+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+y+x+name` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`z+x+y+name`,
    hoverlabel: stdLib.Partial[Label],
    hoveron: plotlyDotJsLib.plotlyDotJsLibStrings.points | plotlyDotJsLib.plotlyDotJsLibStrings.fills,
    labels: js.Array[Datum],
    legendgroup: java.lang.String,
    line: stdLib.Partial[ScatterLine],
    `line.color`: Color,
    `line.dash`: Dash,
    `line.shape`: plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.spline | plotlyDotJsLib.plotlyDotJsLibStrings.hv | plotlyDotJsLib.plotlyDotJsLibStrings.vh | plotlyDotJsLib.plotlyDotJsLibStrings.hvh | plotlyDotJsLib.plotlyDotJsLibStrings.vhv,
    `line.simplify`: scala.Boolean,
    `line.smoothing`: scala.Double,
    `line.width`: scala.Double,
    marker: stdLib.Partial[PlotMarker],
    `marker.color`: Color,
    `marker.line`: stdLib.Partial[ScatterMarkerLine],
    `marker.maxdisplayed`: scala.Double,
    `marker.opacity`: scala.Double | js.Array[scala.Double],
    `marker.showscale`: scala.Boolean,
    `marker.size`: scala.Double | js.Array[scala.Double],
    `marker.sizemax`: scala.Double,
    `marker.sizemin`: scala.Double,
    `marker.sizemode`: plotlyDotJsLib.plotlyDotJsLibStrings.diameter | plotlyDotJsLib.plotlyDotJsLibStrings.area,
    `marker.sizeref`: scala.Double,
    `marker.symbol`: java.lang.String | js.Array[java.lang.String],
    mode: plotlyDotJsLib.plotlyDotJsLibStrings.lines | plotlyDotJsLib.plotlyDotJsLibStrings.markers | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.`lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+lines+markers` | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    name: java.lang.String,
    orientation: plotlyDotJsLib.plotlyDotJsLibStrings.v | plotlyDotJsLib.plotlyDotJsLibStrings.h,
    r: js.Array[Datum],
    rotation: scala.Double,
    stackgroup: java.lang.String,
    text: java.lang.String | js.Array[java.lang.String],
    textinfo: plotlyDotJsLib.plotlyDotJsLibStrings.label | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+text+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`label+value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.text | plotlyDotJsLib.plotlyDotJsLibStrings.`text+value` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.`text+value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.value | plotlyDotJsLib.plotlyDotJsLibStrings.`value+percent` | plotlyDotJsLib.plotlyDotJsLibStrings.percent | plotlyDotJsLib.plotlyDotJsLibStrings.none,
    textposition: (plotlyDotJsLib.plotlyDotJsLibStrings.`top left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`top center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`top right`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`middle right`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom left`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom center`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`bottom right`) | plotlyDotJsLib.plotlyDotJsLibStrings.inside,
    theta: js.Array[Datum],
    transforms: js.Array[DataTransform],
    transpose: scala.Boolean,
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.bar | plotlyDotJsLib.plotlyDotJsLibStrings.box | plotlyDotJsLib.plotlyDotJsLibStrings.candlestick | plotlyDotJsLib.plotlyDotJsLibStrings.choropleth | plotlyDotJsLib.plotlyDotJsLibStrings.contour | plotlyDotJsLib.plotlyDotJsLibStrings.heatmap | plotlyDotJsLib.plotlyDotJsLibStrings.histogram | plotlyDotJsLib.plotlyDotJsLibStrings.mesh3d | plotlyDotJsLib.plotlyDotJsLibStrings.ohlc | plotlyDotJsLib.plotlyDotJsLibStrings.parcoords | plotlyDotJsLib.plotlyDotJsLibStrings.pie | plotlyDotJsLib.plotlyDotJsLibStrings.pointcloud | plotlyDotJsLib.plotlyDotJsLibStrings.scatter | plotlyDotJsLib.plotlyDotJsLibStrings.scatter3d | plotlyDotJsLib.plotlyDotJsLibStrings.scattergeo | plotlyDotJsLib.plotlyDotJsLibStrings.scattergl | plotlyDotJsLib.plotlyDotJsLibStrings.scatterpolar | plotlyDotJsLib.plotlyDotJsLibStrings.scatterternary | plotlyDotJsLib.plotlyDotJsLibStrings.surface,
    values: js.Array[Datum],
    visible: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibStrings.legendonly,
    width: scala.Double | js.Array[scala.Double],
    x: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray,
    xaxis: java.lang.String,
    xbins: plotlyDotJsLib.Anon_End,
    xgap: scala.Double,
    xy: stdLib.Float32Array,
    y: js.Array[Datum] | js.Array[js.Array[Datum]] | TypedArray,
    yaxis: java.lang.String,
    ygap: scala.Double,
    z: js.Array[Datum] | js.Array[js.Array[Datum]] | js.Array[js.Array[js.Array[Datum]]] | TypedArray,
    zsmooth: plotlyDotJsLib.plotlyDotJsLibStrings.fast | plotlyDotJsLib.plotlyDotJsLibStrings.best | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  ): PlotData = {
    val __obj = js.Dynamic.literal(autobinx = autobinx, boxmean = boxmean.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], connectgaps = connectgaps, error_x = error_x, error_y = error_y, fill = fill.asInstanceOf[js.Any], fillcolor = fillcolor, hole = hole, hoverinfo = hoverinfo.asInstanceOf[js.Any], hoverlabel = hoverlabel, hoveron = hoveron.asInstanceOf[js.Any], labels = labels, legendgroup = legendgroup, line = line, marker = marker, mode = mode.asInstanceOf[js.Any], name = name, orientation = orientation.asInstanceOf[js.Any], r = r, rotation = rotation, stackgroup = stackgroup, text = text.asInstanceOf[js.Any], textinfo = textinfo.asInstanceOf[js.Any], textposition = textposition.asInstanceOf[js.Any], theta = theta, transforms = transforms, transpose = transpose, values = values, visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xaxis = xaxis, xbins = xbins, xgap = xgap, xy = xy, y = y.asInstanceOf[js.Any], yaxis = yaxis, ygap = ygap, z = z.asInstanceOf[js.Any], zsmooth = zsmooth.asInstanceOf[js.Any])
    __obj.updateDynamic("line.color")(`line.color`.asInstanceOf[js.Any])
    __obj.updateDynamic("line.dash")(`line.dash`)
    __obj.updateDynamic("line.shape")(`line.shape`.asInstanceOf[js.Any])
    __obj.updateDynamic("line.simplify")(`line.simplify`)
    __obj.updateDynamic("line.smoothing")(`line.smoothing`)
    __obj.updateDynamic("line.width")(`line.width`)
    __obj.updateDynamic("marker.color")(`marker.color`.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.line")(`marker.line`)
    __obj.updateDynamic("marker.maxdisplayed")(`marker.maxdisplayed`)
    __obj.updateDynamic("marker.opacity")(`marker.opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.showscale")(`marker.showscale`)
    __obj.updateDynamic("marker.size")(`marker.size`.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizemax")(`marker.sizemax`)
    __obj.updateDynamic("marker.sizemin")(`marker.sizemin`)
    __obj.updateDynamic("marker.sizemode")(`marker.sizemode`.asInstanceOf[js.Any])
    __obj.updateDynamic("marker.sizeref")(`marker.sizeref`)
    __obj.updateDynamic("marker.symbol")(`marker.symbol`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotData]
  }
}

