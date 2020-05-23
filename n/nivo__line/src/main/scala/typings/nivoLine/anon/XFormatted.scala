package typings.nivoLine.anon

import typings.nivoLine.mod.DatumValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormatted extends js.Object {
  var x: DatumValue
  var xFormatted: String | Double
  var y: DatumValue
  var yFormatted: String | Double
  var yStacked: js.UndefOr[Double] = js.undefined
}

object XFormatted {
  @scala.inline
  def apply(
    x: DatumValue,
    xFormatted: String | Double,
    y: DatumValue,
    yFormatted: String | Double,
    yStacked: js.UndefOr[Double] = js.undefined
  ): XFormatted = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], xFormatted = xFormatted.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yFormatted = yFormatted.asInstanceOf[js.Any])
    if (!js.isUndefined(yStacked)) __obj.updateDynamic("yStacked")(yStacked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[XFormatted]
  }
}

