package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityMarkNotificationsAsReadEndpoint extends js.Object {
  
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
  implicit class ActivityMarkNotificationsAsReadEndpointOps[Self <: ActivityMarkNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
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
    def setLast_read_at(value: String): Self = this.set("last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_read_at: Self = this.set("last_read_at", js.undefined)
  }
}
