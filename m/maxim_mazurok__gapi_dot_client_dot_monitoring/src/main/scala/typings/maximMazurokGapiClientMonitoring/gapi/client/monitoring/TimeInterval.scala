package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInterval extends StObject {
  
  /** Required. The end of the time interval. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Optional. The beginning of the time interval. The default value for the start time is the end time. The start time must not be later than the end time. */
  var startTime: js.UndefOr[String] = js.native
}
object TimeInterval {
  
  @scala.inline
  def apply(): TimeInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInterval]
  }
  
  @scala.inline
  implicit class TimeIntervalMutableBuilder[Self <: TimeInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
