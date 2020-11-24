package typings.postmark.statsMod

import typings.postmark.anon.Opens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenCounts extends js.Object {
  
  var Days: js.Array[Opens] = js.native
  
  var Opens: Double = js.native
  
  var Unique: Double = js.native
}
object OpenCounts {
  
  @scala.inline
  def apply(Days: js.Array[Opens], Opens: Double, Unique: Double): OpenCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCounts]
  }
  
  @scala.inline
  implicit class OpenCountsOps[Self <: OpenCounts] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: Opens*): Self = this.set("Days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[Opens]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpens(value: Double): Self = this.set("Opens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Double): Self = this.set("Unique", value.asInstanceOf[js.Any])
  }
}
