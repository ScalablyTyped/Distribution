package typings.postmark.statsMod

import typings.postmark.anon.SpamComplaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpamCounts extends js.Object {
  
  var Days: js.Array[SpamComplaint] = js.native
  
  var SpamComplaint: Double = js.native
}
object SpamCounts {
  
  @scala.inline
  def apply(Days: js.Array[SpamComplaint], SpamComplaint: Double): SpamCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpamCounts]
  }
  
  @scala.inline
  implicit class SpamCountsOps[Self <: SpamCounts] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: SpamComplaint*): Self = this.set("Days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[SpamComplaint]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpamComplaint(value: Double): Self = this.set("SpamComplaint", value.asInstanceOf[js.Any])
  }
}
