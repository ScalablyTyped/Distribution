package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAxis extends Axis {
  var anchor: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName
  var automargin: scala.Boolean
  var constrain: plotlyDotJsLib.plotlyDotJsLibStrings.range | plotlyDotJsLib.plotlyDotJsLibStrings.domain
  var constraintoward: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var domain: js.Array[scala.Double]
  var fixedrange: scala.Boolean
  var layer: (plotlyDotJsLib.plotlyDotJsLibStrings.`above traces`) | (plotlyDotJsLib.plotlyDotJsLibStrings.`below traces`)
  var overlaying: plotlyDotJsLib.plotlyDotJsLibStrings.free | AxisName
  var position: scala.Double
  var rangeselector: stdLib.Partial[RangeSelector]
  var rangeslider: stdLib.Partial[RangeSlider]
  var scaleanchor: AxisName
  var scaleratio: scala.Double
  var side: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.bottom | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var spikedash: java.lang.String
  var spikemode: java.lang.String
}

