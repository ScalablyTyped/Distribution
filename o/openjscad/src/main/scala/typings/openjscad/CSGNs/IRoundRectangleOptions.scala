package typings.openjscad.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoundRectangleOptions extends js.Object {
  var resolution: js.UndefOr[Double] = js.undefined
  var roundradius: Double
}

object IRoundRectangleOptions {
  @scala.inline
  def apply(roundradius: Double, resolution: Int | Double = null): IRoundRectangleOptions = {
    val __obj = js.Dynamic.literal(roundradius = roundradius)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoundRectangleOptions]
  }
}

