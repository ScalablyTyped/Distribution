package typings.plottable

import typings.plottable.plottableStrings.canvas
import typings.plottable.plottableStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanvas extends js.Object {
  var canvas: typings.plottable.plottableStrings.canvas
  var svg: typings.plottable.plottableStrings.svg
}

object AnonCanvas {
  @scala.inline
  def apply(canvas: canvas, svg: svg): AnonCanvas = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCanvas]
  }
}

