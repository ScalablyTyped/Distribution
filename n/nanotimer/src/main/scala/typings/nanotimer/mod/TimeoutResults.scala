package typings.nanotimer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeoutResults extends js.Object {
  
  var waitTime: Double = js.native
}
object TimeoutResults {
  
  @scala.inline
  def apply(waitTime: Double): TimeoutResults = {
    val __obj = js.Dynamic.literal(waitTime = waitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutResults]
  }
  
  @scala.inline
  implicit class TimeoutResultsOps[Self <: TimeoutResults] (val x: Self) extends AnyVal {
    
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
    def setWaitTime(value: Double): Self = this.set("waitTime", value.asInstanceOf[js.Any])
  }
}
