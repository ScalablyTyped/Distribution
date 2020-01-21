package typings.oracleOraclejet.ojcolorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait HSVA extends js.Object {
  var a: js.UndefOr[Double] = js.undefined
  var h: Double
  var s: Double
  var v: Double
}

object HSVA {
  @scala.inline
  def apply(h: Double, s: Double, v: Double, a: Int | Double = null): HSVA = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    if (a != null) __obj.updateDynamic("a")(a.asInstanceOf[js.Any])
    __obj.asInstanceOf[HSVA]
  }
}

