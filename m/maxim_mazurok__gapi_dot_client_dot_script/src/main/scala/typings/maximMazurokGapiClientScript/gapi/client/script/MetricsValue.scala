package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricsValue extends StObject {
  
  /** Required field indicating the end time of the interval. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Required field indicating the start time of the interval. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Indicates the number of executions counted. */
  var value: js.UndefOr[String] = js.native
}
object MetricsValue {
  
  @scala.inline
  def apply(): MetricsValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricsValue]
  }
  
  @scala.inline
  implicit class MetricsValueMutableBuilder[Self <: MetricsValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
