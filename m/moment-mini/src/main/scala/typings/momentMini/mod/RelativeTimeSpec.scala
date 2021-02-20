package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeSpec extends StObject {
  
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
  implicit class RelativeTimeSpecMutableBuilder[Self <: RelativeTimeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setD(value: RelativeTimeSpecVal): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "d", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDd(value: RelativeTimeSpecVal): Self = StObject.set(x, "dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "dd", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFuture(value: RelativeTimeFuturePastVal): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFutureFunction1(value: /* relTime */ String => String): Self = StObject.set(x, "future", js.Any.fromFunction1(value))
    
    @scala.inline
    def setH(value: RelativeTimeSpecVal): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "h", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHh(value: RelativeTimeSpecVal): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHhFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "hh", js.Any.fromFunction4(value))
    
    @scala.inline
    def setM(value: RelativeTimeSpecVal): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "M", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMM(value: RelativeTimeSpecVal): Self = StObject.set(x, "MM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "MM", js.Any.fromFunction4(value))
    
    @scala.inline
    def setPast(value: RelativeTimeFuturePastVal): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPastFunction1(value: /* relTime */ String => String): Self = StObject.set(x, "past", js.Any.fromFunction1(value))
    
    @scala.inline
    def setS(value: RelativeTimeSpecVal): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "s", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSs(value: RelativeTimeSpecVal): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "ss", js.Any.fromFunction4(value))
    
    @scala.inline
    def setY(value: RelativeTimeSpecVal): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "y", js.Any.fromFunction4(value))
    
    @scala.inline
    def setYy(value: RelativeTimeSpecVal): Self = StObject.set(x, "yy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYyFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = StObject.set(x, "yy", js.Any.fromFunction4(value))
  }
}
