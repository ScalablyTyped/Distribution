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
    x0: Datum,
    x1: Datum,
    xref: x | paper,
    y0: Datum,
    y1: Datum,
    yref: paper | y
  ): Shape = {
    val __obj = js.Dynamic.literal(fillcolor = fillcolor, layer = layer.asInstanceOf[js.Any], line = line, opacity = opacity, path = path, visible = visible, x0 = x0.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], xref = xref.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], yref = yref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

