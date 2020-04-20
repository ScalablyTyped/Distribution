package typings.nivoScatterplot

import typings.nivoScatterplot.mod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormattedX extends js.Object {
  var formattedX: String | Double
  var formattedY: String | Double
  var x: Value
  var y: Value
}

object AnonFormattedX {
  @scala.inline
  def apply(formattedX: String | Double, formattedY: String | Double, x: Value, y: Value): AnonFormattedX = {
    val __obj = js.Dynamic.literal(formattedX = formattedX.asInstanceOf[js.Any], formattedY = formattedY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormattedX]
  }
}

