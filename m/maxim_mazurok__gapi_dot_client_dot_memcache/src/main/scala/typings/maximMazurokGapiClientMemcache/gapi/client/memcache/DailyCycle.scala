package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyCycle extends js.Object {
  
  /** Output only. Duration of the time window, set by service producer. */
  var duration: js.UndefOr[String] = js.native
  
  /** Time within the day to start the operations. */
  var startTime: js.UndefOr[TimeOfDay] = js.native
}
object DailyCycle {
  
  @scala.inline
  def apply(): DailyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DailyCycle]
  }
  
  @scala.inline
  implicit class DailyCycleOps[Self <: DailyCycle] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
