package typings.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeTimeSpec extends js.Object {
  var M: RelativeTimeSpecVal
  var MM: RelativeTimeSpecVal
  var d: RelativeTimeSpecVal
  var dd: RelativeTimeSpecVal
  var future: RelativeTimeFuturePastVal
  var h: RelativeTimeSpecVal
  var hh: RelativeTimeSpecVal
  var m: RelativeTimeSpecVal
  var mm: RelativeTimeSpecVal
  var past: RelativeTimeFuturePastVal
  var s: RelativeTimeSpecVal
  var ss: RelativeTimeSpecVal
  var y: RelativeTimeSpecVal
  var yy: RelativeTimeSpecVal
}

object RelativeTimeSpec {
  @scala.inline
  def apply(
    M: RelativeTimeSpecVal,
    MM: RelativeTimeSpecVal,
    d: RelativeTimeSpecVal,
    dd: RelativeTimeSpecVal,
    future: RelativeTimeFuturePastVal,
    h: RelativeTimeSpecVal,
    hh: RelativeTimeSpecVal,
    m: RelativeTimeSpecVal,
    mm: RelativeTimeSpecVal,
    past: RelativeTimeFuturePastVal,
    s: RelativeTimeSpecVal,
    ss: RelativeTimeSpecVal,
    y: RelativeTimeSpecVal,
    yy: RelativeTimeSpecVal
  ): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], future = future.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelativeTimeSpec]
  }
}

