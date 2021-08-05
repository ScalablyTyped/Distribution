package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityGetThreadEndpoint extends StObject {
  
  var thread_id: Double
}
object ActivityGetThreadEndpoint {
  
  inline def apply(thread_id: Double): ActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(thread_id = thread_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadEndpoint]
  }
  
  extension [Self <: ActivityGetThreadEndpoint](x: Self) {
    
    inline def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
  }
}
