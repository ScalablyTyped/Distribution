package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitySetThreadSubscriptionResponseData extends StObject {
  
  var created_at: String = js.native
  
  var ignored: Boolean = js.native
  
  var reason: String = js.native
  
  var subscribed: Boolean = js.native
  
  var thread_url: String = js.native
  
  var url: String = js.native
}
object ActivitySetThreadSubscriptionResponseData {
  
  @scala.inline
  def apply(
    created_at: String,
    ignored: Boolean,
    reason: String,
    subscribed: Boolean,
    thread_url: String,
    url: String
  ): ActivitySetThreadSubscriptionResponseData = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], thread_url = thread_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetThreadSubscriptionResponseData]
  }
  
  @scala.inline
  implicit class ActivitySetThreadSubscriptionResponseDataMutableBuilder[Self <: ActivitySetThreadSubscriptionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThread_url(value: String): Self = StObject.set(x, "thread_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
