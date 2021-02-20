package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityGetThreadEndpoint extends StObject {
  
  var thread_id: Double = js.native
}
object ActivityGetThreadEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadEndpoint]
  }
  
  @scala.inline
  implicit class ActivityGetThreadEndpointMutableBuilder[Self <: ActivityGetThreadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
