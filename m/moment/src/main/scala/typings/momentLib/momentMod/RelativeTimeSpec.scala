package typings
package momentLib.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeSpec extends js.Object {
  var M: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var MM: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var d: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var dd: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var future: js.UndefOr[RelativeTimeFuturePastVal] = js.undefined
  var h: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var hh: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var m: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var mm: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var past: js.UndefOr[RelativeTimeFuturePastVal] = js.undefined
  var s: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var ss: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var y: js.UndefOr[RelativeTimeSpecVal] = js.undefined
  var yy: js.UndefOr[RelativeTimeSpecVal] = js.undefined
}

object RelativeTimeSpec {
  @scala.inline
  def apply(
    M: RelativeTimeSpecVal = null,
    MM: RelativeTimeSpecVal = null,
    d: RelativeTimeSpecVal = null,
    dd: RelativeTimeSpecVal = null,
    future: RelativeTimeFuturePastVal = null,
    h: RelativeTimeSpecVal = null,
    hh: RelativeTimeSpecVal = null,
    m: RelativeTimeSpecVal = null,
    mm: RelativeTimeSpecVal = null,
    past: RelativeTimeFuturePastVal = null,
    s: RelativeTimeSpecVal = null,
    ss: RelativeTimeSpecVal = null,
    y: RelativeTimeSpecVal = null,
    yy: RelativeTimeSpecVal = null
  ): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal()
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (MM != null) __obj.updateDynamic("MM")(MM.asInstanceOf[js.Any])
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (dd != null) __obj.updateDynamic("dd")(dd.asInstanceOf[js.Any])
    if (future != null) __obj.updateDynamic("future")(future.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (hh != null) __obj.updateDynamic("hh")(hh.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mm != null) __obj.updateDynamic("mm")(mm.asInstanceOf[js.Any])
    if (past != null) __obj.updateDynamic("past")(past.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (ss != null) __obj.updateDynamic("ss")(ss.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (yy != null) __obj.updateDynamic("yy")(yy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeSpec]
  }
}

