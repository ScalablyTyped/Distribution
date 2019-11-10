package typings.momentDashMini.momentDashMiniMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongDateFormatSpec extends js.Object {
  var L: String
  var LL: String
  var LLL: String
  var LLLL: String
  var LT: String
  var LTS: String
  var l: js.UndefOr[String] = js.undefined
  var ll: js.UndefOr[String] = js.undefined
  var lll: js.UndefOr[String] = js.undefined
  var llll: js.UndefOr[String] = js.undefined
  var lt: js.UndefOr[String] = js.undefined
  // lets forget for a sec that any upper/lower permutation will also work
  var lts: js.UndefOr[String] = js.undefined
}

object LongDateFormatSpec {
  @scala.inline
  def apply(
    L: String,
    LL: String,
    LLL: String,
    LLLL: String,
    LT: String,
    LTS: String,
    l: String = null,
    ll: String = null,
    lll: String = null,
    llll: String = null,
    lt: String = null,
    lts: String = null
  ): LongDateFormatSpec = {
    val __obj = js.Dynamic.literal(L = L, LL = LL, LLL = LLL, LLLL = LLLL, LT = LT, LTS = LTS)
    if (l != null) __obj.updateDynamic("l")(l)
    if (ll != null) __obj.updateDynamic("ll")(ll)
    if (lll != null) __obj.updateDynamic("lll")(lll)
    if (llll != null) __obj.updateDynamic("llll")(llll)
    if (lt != null) __obj.updateDynamic("lt")(lt)
    if (lts != null) __obj.updateDynamic("lts")(lts)
    __obj.asInstanceOf[LongDateFormatSpec]
  }
}

