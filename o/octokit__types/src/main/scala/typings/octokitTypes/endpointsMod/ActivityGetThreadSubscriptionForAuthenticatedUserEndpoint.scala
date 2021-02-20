package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends StObject {
  
  var thread_id: Double = js.native
}
object ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ActivityGetThreadSubscriptionForAuthenticatedUserEndpointMutableBuilder[Self <: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
