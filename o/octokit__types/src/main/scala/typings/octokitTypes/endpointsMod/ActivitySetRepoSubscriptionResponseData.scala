package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitySetRepoSubscriptionResponseData extends StObject {
  
  var created_at: String
  
  var ignored: Boolean
  
  var reason: String
  
  var repository_url: String
  
  var subscribed: Boolean
  
  var url: String
}
object ActivitySetRepoSubscriptionResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: String,
    repository_url: String,
    subscribed: Boolean,
    url: String
  ): ActivitySetRepoSubscriptionResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetRepoSubscriptionResponseData]
  }
  
  @scala.inline
  implicit class ActivitySetRepoSubscriptionResponseDataMutableBuilder[Self <: ActivitySetRepoSubscriptionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
