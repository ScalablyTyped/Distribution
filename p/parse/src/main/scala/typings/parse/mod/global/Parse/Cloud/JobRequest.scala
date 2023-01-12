package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobRequest[T /* <: Params */] extends StObject {
  
  def message(response: Any): Unit
  
  var params: T
}
object JobRequest {
  
  inline def apply[T /* <: Params */](message: Any => Unit, params: T): JobRequest[T] = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1(message), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobRequest[?], T /* <: Params */] (val x: Self & JobRequest[T]) extends AnyVal {
    
    inline def setMessage(value: Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
