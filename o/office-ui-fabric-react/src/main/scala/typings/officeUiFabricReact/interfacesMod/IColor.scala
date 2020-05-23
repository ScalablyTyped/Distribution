package typings.officeUiFabricReact.interfacesMod

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
  /** Transparency value, range 0 (opaque) to 100 (transparent). Usually assumed to be 0 if not specified. */
  var t: js.UndefOr[Double] = js.undefined
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
    a: js.UndefOr[Double] = js.undefined,
    t: js.UndefOr[Double] = js.undefined
  ): IColor = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (!js.isUndefined(a)) __obj.updateDynamic("a")(a.get.asInstanceOf[js.Any])
    if (!js.isUndefined(t)) __obj.updateDynamic("t")(t.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
}

