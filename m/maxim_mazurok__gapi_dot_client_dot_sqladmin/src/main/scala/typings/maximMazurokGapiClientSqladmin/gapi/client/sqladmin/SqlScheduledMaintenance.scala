package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlScheduledMaintenance extends StObject {
  
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
  implicit class SqlScheduledMaintenanceMutableBuilder[Self <: SqlScheduledMaintenance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanDefer(value: Boolean): Self = StObject.set(x, "canDefer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDeferUndefined: Self = StObject.set(x, "canDefer", js.undefined)
    
    @scala.inline
    def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
