package typings.postmark.statsMod

import typings.postmark.anon.Clicks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickCounts extends js.Object {
  
  var Clicks: Double = js.native
  
  var Days: js.Array[Clicks] = js.native
  
  var Unique: Double = js.native
}
object ClickCounts {
  
  @scala.inline
  def apply(Clicks: Double, Days: js.Array[Clicks], Unique: Double): ClickCounts = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Days = Days.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickCounts]
  }
  
  @scala.inline
  implicit class ClickCountsOps[Self <: ClickCounts] (val x: Self) extends AnyVal {
    
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
    def setClicks(value: Double): Self = this.set("Clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysVarargs(value: Clicks*): Self = this.set("Days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[Clicks]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Double): Self = this.set("Unique", value.asInstanceOf[js.Any])
  }
}
