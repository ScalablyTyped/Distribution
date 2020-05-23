package typings.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoundRectangleOptions extends js.Object {
  var resolution: js.UndefOr[Double] = js.undefined
  var roundradius: Double
}

object IRoundRectangleOptions {
  @scala.inline
  def apply(roundradius: Double, resolution: js.UndefOr[Double] = js.undefined): IRoundRectangleOptions = {
    val __obj = js.Dynamic.literal(roundradius = roundradius.asInstanceOf[js.Any])
    if (!js.isUndefined(resolution)) __obj.updateDynamic("resolution")(resolution.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoundRectangleOptions]
  }
}

