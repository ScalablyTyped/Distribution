package typings.nivoLine

import typings.nivoLine.mod.DatumValue
import typings.nivoLine.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var id: DatumValue
  var points: js.Array[Point]
  var width: Double
  var x: Double
  var x0: Double
  var y: Double
  var y0: Double
}

object AnonHeight {
  @scala.inline
  def apply(
    height: Double,
    id: DatumValue,
    points: js.Array[Point],
    width: Double,
    x: Double,
    x0: Double,
    y: Double,
    y0: Double
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeight]
  }
}

