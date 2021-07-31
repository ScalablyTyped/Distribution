package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitySetThreadSubscriptionEndpoint extends StObject {
  
  /**
    * Unsubscribes and subscribes you to a conversation. Set `ignored` to `true` to block all notifications from this thread.
    */
  var ignored: js.UndefOr[Boolean] = js.undefined
  
  var thread_id: Double
}
object ActivitySetThreadSubscriptionEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivitySetThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivitySetThreadSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ActivitySetThreadSubscriptionEndpointMutableBuilder[Self <: ActivitySetThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoredUndefined: Self = StObject.set(x, "ignored", js.undefined)
    
    @scala.inline
    def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
