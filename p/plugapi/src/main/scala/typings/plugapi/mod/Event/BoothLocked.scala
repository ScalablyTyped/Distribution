package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoothLocked extends js.Object {
  
  var c: Boolean = js.native
  
  var f: Boolean = js.native
  
  var m: String = js.native
  
  var ml: String = js.native
}
object BoothLocked {
  
  @scala.inline
  def apply(c: Boolean, f: Boolean, m: String, ml: String): BoothLocked = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoothLocked]
  }
  
  @scala.inline
  implicit class BoothLockedOps[Self <: BoothLocked] (val x: Self) extends AnyVal {
    
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
    def setC(value: Boolean): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF(value: Boolean): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM(value: String): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMl(value: String): Self = this.set("ml", value.asInstanceOf[js.Any])
  }
}
