package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlScheduledMaintenance extends js.Object {
  
  var canDefer: js.UndefOr[Boolean] = js.native
  
  /** If the scheduled maintenance can be rescheduled. */
  var canReschedule: js.UndefOr[Boolean] = js.native
  
  /** The start time of any upcoming scheduled maintenance for this instance. */
  var startTime: js.UndefOr[String] = js.native
}
object SqlScheduledMaintenance {
  
  @scala.inline
  def apply(): SqlScheduledMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlScheduledMaintenance]
  }
  
  @scala.inline
  implicit class SqlScheduledMaintenanceOps[Self <: SqlScheduledMaintenance] (val x: Self) extends AnyVal {
    
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
    def setCanDefer(value: Boolean): Self = this.set("canDefer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanDefer: Self = this.set("canDefer", js.undefined)
    
    @scala.inline
    def setCanReschedule(value: Boolean): Self = this.set("canReschedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanReschedule: Self = this.set("canReschedule", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
