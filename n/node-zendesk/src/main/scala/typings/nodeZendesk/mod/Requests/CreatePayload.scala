package typings.nodeZendesk.mod.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePayload extends StObject {
  
  val request: CreateModel
}
object CreatePayload {
  
  inline def apply(request: CreateModel): CreatePayload = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePayload] (val x: Self) extends AnyVal {
    
    inline def setRequest(value: CreateModel): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
