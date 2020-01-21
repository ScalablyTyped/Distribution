package typings.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MomentLongDateFormat extends js.Object {
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
  var lts: js.UndefOr[String] = js.undefined
}

object MomentLongDateFormat {
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
  ): MomentLongDateFormat = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], LL = LL.asInstanceOf[js.Any], LLL = LLL.asInstanceOf[js.Any], LLLL = LLLL.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], LTS = LTS.asInstanceOf[js.Any])
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (ll != null) __obj.updateDynamic("ll")(ll.asInstanceOf[js.Any])
    if (lll != null) __obj.updateDynamic("lll")(lll.asInstanceOf[js.Any])
    if (llll != null) __obj.updateDynamic("llll")(llll.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (lts != null) __obj.updateDynamic("lts")(lts.asInstanceOf[js.Any])
    __obj.asInstanceOf[MomentLongDateFormat]
  }
}

