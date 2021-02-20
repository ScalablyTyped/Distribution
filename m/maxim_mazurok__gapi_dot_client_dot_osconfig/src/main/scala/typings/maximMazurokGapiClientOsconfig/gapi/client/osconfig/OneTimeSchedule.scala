package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneTimeSchedule extends StObject {
  
  /** Required. The desired patch job execution time. */
  var executeTime: js.UndefOr[String] = js.native
}
object OneTimeSchedule {
  
  @scala.inline
  def apply(): OneTimeSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneTimeSchedule]
  }
  
  @scala.inline
  implicit class OneTimeScheduleMutableBuilder[Self <: OneTimeSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecuteTime(value: String): Self = StObject.set(x, "executeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteTimeUndefined: Self = StObject.set(x, "executeTime", js.undefined)
  }
}
