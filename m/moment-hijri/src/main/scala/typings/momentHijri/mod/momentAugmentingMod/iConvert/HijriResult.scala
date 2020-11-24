package typings.momentHijri.mod.momentAugmentingMod.iConvert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HijriResult extends js.Object {
  
  var hd: Double = js.native
  
  var hm: Double = js.native
  
  var hy: Double = js.native
}
object HijriResult {
  
  @scala.inline
  def apply(hd: Double, hm: Double, hy: Double): HijriResult = {
    val __obj = js.Dynamic.literal(hd = hd.asInstanceOf[js.Any], hm = hm.asInstanceOf[js.Any], hy = hy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HijriResult]
  }
  
  @scala.inline
  implicit class HijriResultOps[Self <: HijriResult] (val x: Self) extends AnyVal {
    
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
    def setHd(value: Double): Self = this.set("hd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHm(value: Double): Self = this.set("hm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHy(value: Double): Self = this.set("hy", value.asInstanceOf[js.Any])
  }
}
