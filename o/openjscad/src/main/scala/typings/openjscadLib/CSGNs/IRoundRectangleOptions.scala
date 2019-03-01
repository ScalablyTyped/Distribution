package typings
package openjscadLib.CSGNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoundRectangleOptions extends js.Object {
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var roundradius: scala.Double
}

object IRoundRectangleOptions {
  @scala.inline
  def apply(roundradius: scala.Double, resolution: scala.Int | scala.Double = null): IRoundRectangleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roundradius")(roundradius)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoundRectangleOptions]
  }
}

