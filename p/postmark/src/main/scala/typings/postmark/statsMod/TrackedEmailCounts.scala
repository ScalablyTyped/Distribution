package typings.postmark.statsMod

import typings.postmark.anon.Tracked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackedEmailCounts extends js.Object {
  
  var Days: js.Array[Tracked] = js.native
  
  var Tracked: Double = js.native
}
object TrackedEmailCounts {
  
  @scala.inline
  def apply(Days: js.Array[Tracked], Tracked: Double): TrackedEmailCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedEmailCounts]
  }
  
  @scala.inline
  implicit class TrackedEmailCountsOps[Self <: TrackedEmailCounts] (val x: Self) extends AnyVal {
    
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
    def setDaysVarargs(value: Tracked*): Self = this.set("Days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[Tracked]): Self = this.set("Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracked(value: Double): Self = this.set("Tracked", value.asInstanceOf[js.Any])
  }
}
