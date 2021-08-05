package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRequest extends StObject {
  
  def message(response: js.Any): Unit
  
  var params: js.Any
}
object JobRequest {
  
  inline def apply(message: js.Any => Unit, params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1(message), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequest]
  }
  
  extension [Self <: JobRequest](x: Self) {
    
    inline def setMessage(value: js.Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
