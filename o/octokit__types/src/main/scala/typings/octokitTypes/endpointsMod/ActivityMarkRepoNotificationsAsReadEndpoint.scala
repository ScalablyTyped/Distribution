package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityMarkRepoNotificationsAsReadEndpoint extends StObject {
  
  /**
    * Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
    */
  var last_read_at: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object ActivityMarkRepoNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ActivityMarkRepoNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkRepoNotificationsAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ActivityMarkRepoNotificationsAsReadEndpointMutableBuilder[Self <: ActivityMarkRepoNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_read_atUndefined: Self = StObject.set(x, "last_read_at", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
