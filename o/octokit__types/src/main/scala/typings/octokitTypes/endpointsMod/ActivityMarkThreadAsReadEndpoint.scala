package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityMarkThreadAsReadEndpoint extends StObject {
  
  var thread_id: Double
}
object ActivityMarkThreadAsReadEndpoint {
  
  @scala.inline
  def apply(thread_id: Double): ActivityMarkThreadAsReadEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityMarkThreadAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ActivityMarkThreadAsReadEndpointMutableBuilder[Self <: ActivityMarkThreadAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
