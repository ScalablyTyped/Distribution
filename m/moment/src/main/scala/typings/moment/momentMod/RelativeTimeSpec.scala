package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTimeSpec extends js.Object {
  
  var M: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var MM: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var d: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var dd: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var future: js.UndefOr[RelativeTimeFuturePastVal] = js.native
  
  var h: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var hh: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var m: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var mm: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var past: js.UndefOr[RelativeTimeFuturePastVal] = js.native
  
  var s: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var ss: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var w: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var ww: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var y: js.UndefOr[RelativeTimeSpecVal] = js.native
  
  var yy: js.UndefOr[RelativeTimeSpecVal] = js.native
}
object RelativeTimeSpec {
  
  @scala.inline
  def apply(): RelativeTimeSpec = {
    val __obj = js.Dynamic.literal()
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
    def deleteM: Self = this.set("M", js.undefined)
    
    @scala.inline
    def setMMFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("MM", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMM(value: RelativeTimeSpecVal): Self = this.set("MM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMM: Self = this.set("MM", js.undefined)
    
    @scala.inline
    def setDFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("d", js.Any.fromFunction4(value))
    
    @scala.inline
    def setD(value: RelativeTimeSpecVal): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    
    @scala.inline
    def setDdFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("dd", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDd(value: RelativeTimeSpecVal): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDd: Self = this.set("dd", js.undefined)
    
    @scala.inline
    def setFutureFunction1(value: /* relTime */ String => String): Self = this.set("future", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFuture(value: RelativeTimeFuturePastVal): Self = this.set("future", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuture: Self = this.set("future", js.undefined)
    
    @scala.inline
    def setHFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("h", js.Any.fromFunction4(value))
    
    @scala.inline
    def setH(value: RelativeTimeSpecVal): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    
    @scala.inline
    def setHhFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("hh", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHh(value: RelativeTimeSpecVal): Self = this.set("hh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHh: Self = this.set("hh", js.undefined)
    
    @scala.inline
    def setPastFunction1(value: /* relTime */ String => String): Self = this.set("past", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPast(value: RelativeTimeFuturePastVal): Self = this.set("past", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePast: Self = this.set("past", js.undefined)
    
    @scala.inline
    def setSFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("s", js.Any.fromFunction4(value))
    
    @scala.inline
    def setS(value: RelativeTimeSpecVal): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    
    @scala.inline
    def setSsFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("ss", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSs(value: RelativeTimeSpecVal): Self = this.set("ss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSs: Self = this.set("ss", js.undefined)
    
    @scala.inline
    def setWFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("w", js.Any.fromFunction4(value))
    
    @scala.inline
    def setW(value: RelativeTimeSpecVal): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWwFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("ww", js.Any.fromFunction4(value))
    
    @scala.inline
    def setWw(value: RelativeTimeSpecVal): Self = this.set("ww", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWw: Self = this.set("ww", js.undefined)
    
    @scala.inline
    def setYFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("y", js.Any.fromFunction4(value))
    
    @scala.inline
    def setY(value: RelativeTimeSpecVal): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYyFunction4(
      value: (/* n */ Double, /* withoutSuffix */ Boolean, /* key */ RelativeTimeKey, /* isFuture */ Boolean) => String
    ): Self = this.set("yy", js.Any.fromFunction4(value))
    
    @scala.inline
    def setYy(value: RelativeTimeSpecVal): Self = this.set("yy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYy: Self = this.set("yy", js.undefined)
  }
}
