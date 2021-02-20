package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitySetRepoSubscriptionEndpoint extends StObject {
  
  /**
    * Determines if all notifications should be blocked from this repository.
    */
  var ignored: js.UndefOr[Boolean] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Determines if notifications should be received from this repository.
    */
  var subscribed: js.UndefOr[Boolean] = js.native
}
object ActivitySetRepoSubscriptionEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String): ActivitySetRepoSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetRepoSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ActivitySetRepoSubscriptionEndpointMutableBuilder[Self <: ActivitySetRepoSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedUndefined: Self = StObject.set(x, "subscribed", js.undefined)
  }
}
