package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DailyCycle extends StObject {
  
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
  implicit class DailyCycleMutableBuilder[Self <: DailyCycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setStartTime(value: TimeOfDay): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
