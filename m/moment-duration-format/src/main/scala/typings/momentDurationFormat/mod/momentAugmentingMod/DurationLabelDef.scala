package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ duration in moment-duration-format.moment-duration-format.moment.DurationToken ]: string} */
@js.native
trait DurationLabelDef extends js.Object {
  
  var M: String = js.native
  
  var MM: String = js.native
  
  var MMM: String = js.native
  
  var S: String = js.native
  
  var SS: String = js.native
  
  var SSS: String = js.native
  
  var d: String = js.native
  
  var dd: String = js.native
  
  var ddd: String = js.native
  
  var h: String = js.native
  
  var hh: String = js.native
  
  var hhh: String = js.native
  
  var m: String = js.native
  
  var mm: String = js.native
  
  var mmm: String = js.native
  
  var s: String = js.native
  
  var ss: String = js.native
  
  var sss: String = js.native
  
  var w: String = js.native
  
  var ww: String = js.native
  
  var www: String = js.native
  
  var y: String = js.native
  
  var yy: String = js.native
  
  var yyy: String = js.native
}
object DurationLabelDef {
  
  @scala.inline
  def apply(
    M: String,
    MM: String,
    MMM: String,
    S: String,
    SS: String,
    SSS: String,
    d: String,
    dd: String,
    ddd: String,
    h: String,
    hh: String,
    hhh: String,
    m: String,
    mm: String,
    mmm: String,
    s: String,
    ss: String,
    sss: String,
    w: String,
    ww: String,
    www: String,
    y: String,
    yy: String,
    yyy: String
  ): DurationLabelDef = {
    val __obj = js.Dynamic.literal(M = M.asInstanceOf[js.Any], MM = MM.asInstanceOf[js.Any], MMM = MMM.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], SS = SS.asInstanceOf[js.Any], SSS = SSS.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], hhh = hhh.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], mmm = mmm.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any], sss = sss.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], ww = ww.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yyy = yyy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationLabelDef]
  }
  
  @scala.inline
  implicit class DurationLabelDefOps[Self <: DurationLabelDef] (val x: Self) extends AnyVal {
    
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
    def setM(value: String): Self = this.set("M", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMM(value: String): Self = this.set("MM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMMM(value: String): Self = this.set("MMM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = this.set("S", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS(value: String): Self = this.set("SS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSS(value: String): Self = this.set("SSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDd(value: String): Self = this.set("dd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdd(value: String): Self = this.set("ddd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: String): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHh(value: String): Self = this.set("hh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHhh(value: String): Self = this.set("hhh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: String): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWw(value: String): Self = this.set("ww", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWww(value: String): Self = this.set("www", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: String): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYy(value: String): Self = this.set("yy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYyy(value: String): Self = this.set("yyy", value.asInstanceOf[js.Any])
  }
}
