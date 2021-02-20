package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobRequest extends StObject {
  
  def message(response: js.Any): Unit = js.native
  
  var params: js.Any = js.native
}
object JobRequest {
  
  @scala.inline
  def apply(message: js.Any => Unit, params: js.Any): JobRequest = {
    val __obj = js.Dynamic.literal(message = js.Any.fromFunction1(message), params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobRequest]
  }
  
  @scala.inline
  implicit class JobRequestMutableBuilder[Self <: JobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: js.Any => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
