package typings
package momentLib.momentMod.momentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentLongDateFormat extends js.Object {
  var L: java.lang.String
  var LL: java.lang.String
  var LLL: java.lang.String
  var LLLL: java.lang.String
  var LT: java.lang.String
  var LTS: java.lang.String
  var l: js.UndefOr[java.lang.String] = js.undefined
  var ll: js.UndefOr[java.lang.String] = js.undefined
  var lll: js.UndefOr[java.lang.String] = js.undefined
  var llll: js.UndefOr[java.lang.String] = js.undefined
  var lt: js.UndefOr[java.lang.String] = js.undefined
  var lts: js.UndefOr[java.lang.String] = js.undefined
}

object MomentLongDateFormat {
  @scala.inline
  def apply(
    L: java.lang.String,
    LL: java.lang.String,
    LLL: java.lang.String,
    LLLL: java.lang.String,
    LT: java.lang.String,
    LTS: java.lang.String,
    l: java.lang.String = null,
    ll: java.lang.String = null,
    lll: java.lang.String = null,
    llll: java.lang.String = null,
    lt: java.lang.String = null,
    lts: java.lang.String = null
  ): MomentLongDateFormat = {
    val __obj = js.Dynamic.literal(L = L, LL = LL, LLL = LLL, LLLL = LLLL, LT = LT, LTS = LTS)
    if (l != null) __obj.updateDynamic("l")(l)
    if (ll != null) __obj.updateDynamic("ll")(ll)
    if (lll != null) __obj.updateDynamic("lll")(lll)
    if (llll != null) __obj.updateDynamic("llll")(llll)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lts != null) __obj.updateDynamic("lts")(lts)
    __obj.asInstanceOf[MomentLongDateFormat]
  }
}

