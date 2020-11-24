package typings.momentMini.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeSpec extends js.Object {
  
  var M: RelativeTimeSpecVal = js.native
  
  var MM: RelativeTimeSpecVal = js.native
  
  var d: RelativeTimeSpecVal = js.native
  
  var dd: RelativeTimeSpecVal = js.native
  
  var future: RelativeTimeFuturePastVal = js.native
  
  var h: RelativeTimeSpecVal = js.native
  
  var hh: RelativeTimeSpecVal = js.native
  
  var m: RelativeTimeSpecVal = js.native
  
  var mm: RelativeTimeSpecVal = js.native
  
  var past: RelativeTimeFuturePastVal = js.native
  
  var s: RelativeTimeSpecVal = js.native
  
  var ss: RelativeTimeSpecVal = js.native
  
  var y: RelativeTimeSpecVal = js.native
  
  var yy: RelativeTimeSpecVal = js.native
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
  
  @scala.inline
  implicit class RelativeTimeSpecOps[Self <: RelativeTimeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("M", js.Any.fromFunction4(value))
    
    @scala.inline
    def setM(value: RelativeTimeSpecVal): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("MM", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMM(value: RelativeTimeSpecVal): Self = this.set("MM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("d", js.Any.fromFunction4(value))
    
    @scala.inline
    def setD(value: RelativeTimeSpecVal): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("dd", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDd(value: RelativeTimeSpecVal): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureFunction1(value: /* relTime */ String => String): Self = this.set("future", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFuture(value: RelativeTimeFuturePastVal): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("h", js.Any.fromFunction4(value))
    
    @scala.inline
    def setH(value: RelativeTimeSpecVal): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHhFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("hh", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHh(value: RelativeTimeSpecVal): Self = this.set("hh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastFunction1(value: /* relTime */ String => String): Self = this.set("past", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPast(value: RelativeTimeFuturePastVal): Self = this.set("past", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("s", js.Any.fromFunction4(value))
    
    @scala.inline
    def setS(value: RelativeTimeSpecVal): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("ss", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSs(value: RelativeTimeSpecVal): Self = this.set("ss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("y", js.Any.fromFunction4(value))
    
    @scala.inline
    def setY(value: RelativeTimeSpecVal): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYyFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("yy", js.Any.fromFunction4(value))
    
    @scala.inline
    def setYy(value: RelativeTimeSpecVal): Self = this.set("yy", value.asInstanceOf[js.Any])
  }
}
