package typings
package atOracleOraclejetLib.ojcolorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HSLA extends js.Object {
  var a: js.UndefOr[scala.Double] = js.undefined
  var h: scala.Double
  var l: scala.Double
  var s: scala.Double
}

object HSLA {
  @scala.inline
  def apply(h: scala.Double, l: scala.Double, s: scala.Double, a: scala.Int | scala.Double = null): HSLA = {
    val __obj = js.Dynamic.literal(h = h, l = l, s = s)
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLA]
  }
}

