package typings.nodeCron.mod

import typings.tzOffset.mod.Timezone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleOptions extends js.Object {
  
  /**
    * A boolean to set if the created task is scheduled.
    *
    * Defaults to `true`
    */
  var scheduled: js.UndefOr[Boolean] = js.native
  
  /**
    * The timezone that is used for job scheduling
    */
  var timezone: js.UndefOr[Timezone] = js.native
}
object ScheduleOptions {
  
  @scala.inline
  def apply(): ScheduleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleOptions]
  }
  
  @scala.inline
  implicit class ScheduleOptionsOps[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
    
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
    def setScheduled(value: Boolean): Self = this.set("scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduled: Self = this.set("scheduled", js.undefined)
    
    @scala.inline
    def setTimezone(value: Timezone): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
