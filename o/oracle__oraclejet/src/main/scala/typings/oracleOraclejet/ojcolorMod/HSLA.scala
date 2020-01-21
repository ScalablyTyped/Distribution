package typings.oracleOraclejet.ojcolorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HSLA extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var h: Double
  var l: Double
  var s: Double
}

object HSLA {
  @scala.inline
  def apply(h: Double, l: Double, s: Double, a: Int | Double = null): HSLA = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSLA]
  }
}

