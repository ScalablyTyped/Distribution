package typings.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeeklyCycle extends StObject {
  
  /** User can specify multiple windows in a week. Minimum of 1 window. */
  var schedule: js.UndefOr[js.Array[Schedule]] = js.native
}
object WeeklyCycle {
  
  @scala.inline
  def apply(): WeeklyCycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeeklyCycle]
  }
  
  @scala.inline
  implicit class WeeklyCycleMutableBuilder[Self <: WeeklyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchedule(value: js.Array[Schedule]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setScheduleVarargs(value: Schedule*): Self = StObject.set(x, "schedule", js.Array(value :_*))
  }
}
