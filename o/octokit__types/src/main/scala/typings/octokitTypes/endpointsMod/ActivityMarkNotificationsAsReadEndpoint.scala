package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityMarkNotificationsAsReadEndpoint extends StObject {
  
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.native
}
object ActivityMarkNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(): ActivityMarkNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ActivityMarkNotificationsAsReadEndpointMutableBuilder[Self <: ActivityMarkNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_read_atUndefined: Self = StObject.set(x, "last_read_at", js.undefined)
  }
}
