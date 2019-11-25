package typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor
  extends IRGB
     with IHSV {
  /** Hex string for the color (excluding alpha component), *not* prefixed with #. */
  var hex: String
  /** CSS color string. If a hex value, it must be prefixed with #. */
  var str: String
}

object IColor {
  @scala.inline
  def apply(
    b: Double,
    g: Double,
    h: Double,
    hex: String,
    r: Double,
    s: Double,
    str: String,
    v: Double,
    a: Int | Double = null
  ): IColor = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
}

