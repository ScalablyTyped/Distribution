package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint extends StObject {
  
  var thread_id: Double
}
object ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint {
  
  inline def apply(thread_id: Double): ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint]
  }
  
  extension [Self <: ActivityGetThreadSubscriptionForAuthenticatedUserEndpoint](x: Self) {
    
    inline def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
