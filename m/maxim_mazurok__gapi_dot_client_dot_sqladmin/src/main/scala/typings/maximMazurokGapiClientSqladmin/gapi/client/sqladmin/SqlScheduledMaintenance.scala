package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlScheduledMaintenance extends StObject {
  
  var canDefer: js.UndefOr[Boolean] = js.undefined
  
  /** If the scheduled maintenance can be rescheduled. */
  var canReschedule: js.UndefOr[Boolean] = js.undefined
  
  /** The start time of any upcoming scheduled maintenance for this instance. */
  var startTime: js.UndefOr[String] = js.undefined
}
object SqlScheduledMaintenance {
  
  inline def apply(): SqlScheduledMaintenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlScheduledMaintenance]
  }
  
  extension [Self <: SqlScheduledMaintenance](x: Self) {
    
    inline def setCanDefer(value: Boolean): Self = StObject.set(x, "canDefer", value.asInstanceOf[js.Any])
    
    inline def setCanDeferUndefined: Self = StObject.set(x, "canDefer", js.undefined)
    
    inline def setCanReschedule(value: Boolean): Self = StObject.set(x, "canReschedule", value.asInstanceOf[js.Any])
    
    inline def setCanRescheduleUndefined: Self = StObject.set(x, "canReschedule", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
