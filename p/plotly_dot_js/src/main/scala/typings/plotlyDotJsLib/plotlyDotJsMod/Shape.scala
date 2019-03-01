package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var fillcolor: java.lang.String
  var layer: plotlyDotJsLib.plotlyDotJsLibStrings.below | plotlyDotJsLib.plotlyDotJsLibStrings.above
  var line: stdLib.Partial[ShapeLine]
  var opacity: scala.Double
  var path: java.lang.String
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.rect | plotlyDotJsLib.plotlyDotJsLibStrings.circle | plotlyDotJsLib.plotlyDotJsLibStrings.line | plotlyDotJsLib.plotlyDotJsLibStrings.path
  var visible: scala.Boolean
  var x0: Datum
  var x1: Datum
  // x-reference is assigned to the x-values
  var xref: plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.paper
  var y0: Datum
  var y1: Datum
  // y-reference is assigned to the plot paper [0,1]
  var yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
}

object Shape {
  @scala.inline
  def apply(
    fillcolor: java.lang.String,
    layer: plotlyDotJsLib.plotlyDotJsLibStrings.below | plotlyDotJsLib.plotlyDotJsLibStrings.above,
    line: stdLib.Partial[ShapeLine],
    opacity: scala.Double,
    path: java.lang.String,
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.rect | plotlyDotJsLib.plotlyDotJsLibStrings.circle | plotlyDotJsLib.plotlyDotJsLibStrings.line | plotlyDotJsLib.plotlyDotJsLibStrings.path,
    visible: scala.Boolean,
    x0: Datum,
    x1: Datum,
    xref: plotlyDotJsLib.plotlyDotJsLibStrings.x | plotlyDotJsLib.plotlyDotJsLibStrings.paper,
    y0: Datum,
    y1: Datum,
    yref: plotlyDotJsLib.plotlyDotJsLibStrings.paper | plotlyDotJsLib.plotlyDotJsLibStrings.y
  ): Shape = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("fillcolor")(fillcolor)
    __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    __obj.updateDynamic("xref")(xref.asInstanceOf[js.Any])
    __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.updateDynamic("yref")(yref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

