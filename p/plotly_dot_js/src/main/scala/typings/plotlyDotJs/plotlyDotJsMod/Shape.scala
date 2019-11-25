package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.above
import typings.plotlyDotJs.plotlyDotJsStrings.below
import typings.plotlyDotJs.plotlyDotJsStrings.circle
import typings.plotlyDotJs.plotlyDotJsStrings.line
import typings.plotlyDotJs.plotlyDotJsStrings.paper
import typings.plotlyDotJs.plotlyDotJsStrings.path
import typings.plotlyDotJs.plotlyDotJsStrings.rect
import typings.plotlyDotJs.plotlyDotJsStrings.x
import typings.plotlyDotJs.plotlyDotJsStrings.y
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var fillcolor: String
  var layer: below | above
  var line: Partial[ShapeLine]
  var opacity: Double
  var path: String
  var `type`: rect | circle | line | path
  var visible: Boolean
  var x0: Datum
  var x1: Datum
  // x-reference is assigned to the x-values
  var xref: x | paper
  var y0: Datum
  var y1: Datum
  // y-reference is assigned to the plot paper [0,1]
  var yref: paper | y
}

object Shape {
  @scala.inline
  def apply(
    fillcolor: String,
    layer: below | above,
    line: Partial[ShapeLine],
    opacity: Double,
    path: String,
    `type`: rect | circle | line | path,
    visible: Boolean,
    xref: x | paper,
    yref: paper | y,
    x0: Datum = null,
    x1: Datum = null,
    y0: Datum = null,
    y1: Datum = null
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (x0 != null) __obj.updateDynamic("x0")(x0.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (y0 != null) __obj.updateDynamic("y0")(y0.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

