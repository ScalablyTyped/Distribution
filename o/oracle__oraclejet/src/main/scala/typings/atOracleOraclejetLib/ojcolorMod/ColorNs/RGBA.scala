package typings
package atOracleOraclejetLib.ojcolorMod.ColorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RGBA extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var b: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object RGBA {
  @scala.inline
  def apply(b: scala.Double, g: scala.Double, r: scala.Double, a: scala.Int | scala.Double = null): RGBA = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
}

