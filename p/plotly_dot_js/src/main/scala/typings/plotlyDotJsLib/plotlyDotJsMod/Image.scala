package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var layer: plotlyDotJsLib.plotlyDotJsLibStrings.above | plotlyDotJsLib.plotlyDotJsLibStrings.below
  var opacity: scala.Double
  var sizex: scala.Double
  var sizey: scala.Double
  var sizing: plotlyDotJsLib.plotlyDotJsLibStrings.fill | plotlyDotJsLib.plotlyDotJsLibStrings.contain | plotlyDotJsLib.plotlyDotJsLibStrings.stretch
  var source: java.lang.String
  var visible: scala.Boolean
  var x: scala.Double | java.lang.String
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var xref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.x
  var y: scala.Double | java.lang.String
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  var yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
}

object Image {
  @scala.inline
  def apply(
    layer: plotlyDotJsLib.plotlyDotJsLibStrings.above | plotlyDotJsLib.plotlyDotJsLibStrings.below,
    opacity: scala.Double,
    sizex: scala.Double,
    sizey: scala.Double,
    sizing: plotlyDotJsLib.plotlyDotJsLibStrings.fill | plotlyDotJsLib.plotlyDotJsLibStrings.contain | plotlyDotJsLib.plotlyDotJsLibStrings.stretch,
    source: java.lang.String,
    visible: scala.Boolean,
    x: scala.Double | java.lang.String,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    xref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.x,
    y: scala.Double | java.lang.String,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom,
    yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
  ): Image = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("sizex")(sizex)
    __obj.updateDynamic("sizey")(sizey)
    __obj.updateDynamic("sizing")(sizing.asInstanceOf[js.Any])
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

