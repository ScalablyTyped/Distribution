package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :undefined} */
trait Responsedataundefined
  extends StObject
     with /* others */ StringDictionary[Any] {
  
  var data: js.UndefOr[Any] & Unit
  
  var message: String
  
  var status: Boolean
}
object Responsedataundefined {
  
  inline def apply(data: js.UndefOr[Any] & Unit, message: String, status: Boolean): Responsedataundefined = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responsedataundefined]
  }
  
  extension [Self <: Responsedataundefined](x: Self) {
    
    inline def setData(value: js.UndefOr[Any] & Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
