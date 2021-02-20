package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityDeleteThreadSubscriptionEndpoint extends StObject {
  
  var thread_id: Double = js.native
}
object ActivityDeleteThreadSubscriptionEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivityDeleteThreadSubscriptionEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDeleteThreadSubscriptionEndpoint]
  }
  
  @scala.inline
  implicit class ActivityDeleteThreadSubscriptionEndpointMutableBuilder[Self <: ActivityDeleteThreadSubscriptionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
