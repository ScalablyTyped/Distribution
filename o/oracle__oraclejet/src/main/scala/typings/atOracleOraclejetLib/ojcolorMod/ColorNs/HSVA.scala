package typings
package atOracleOraclejetLib.ojcolorMod.ColorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HSVA extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var h: scala.Double
  var s: scala.Double
  var v: scala.Double
}

object HSVA {
  @scala.inline
  def apply(h: scala.Double, s: scala.Double, v: scala.Double, a: scala.Int | scala.Double = null): HSVA = {
    val __obj = js.Dynamic.literal(h = h, s = s, v = v)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSVA]
  }
}

