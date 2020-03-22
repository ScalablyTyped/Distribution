package typings.nivoLine

import typings.nivoLine.mod.DatumValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXFormatted extends js.Object {
  var x: DatumValue
  var xFormatted: String | Double
  var y: DatumValue
  var yFormatted: String | Double
  var yStacked: js.UndefOr[Double] = js.undefined
}

object AnonXFormatted {
  @scala.inline
  def apply(
    x: DatumValue,
    xFormatted: String | Double,
    y: DatumValue,
    yFormatted: String | Double,
    yStacked: Int | Double = null
  ): AnonXFormatted = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any])
    if (yStacked != null) __obj.updateDynamic("yStacked")(yStacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXFormatted]
  }
}

