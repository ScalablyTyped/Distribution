package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitySetThreadSubscriptionResponseData extends StObject {
  
  var created_at: String
  
  var ignored: Boolean
  
  var reason: String
  
  var subscribed: Boolean
  
  var thread_url: String
  
  var url: String
}
object ActivitySetThreadSubscriptionResponseData {
  
  inline def apply(
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
  
  extension [Self <: ActivitySetThreadSubscriptionResponseData](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setThread_url(value: String): Self = StObject.set(x, "thread_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
