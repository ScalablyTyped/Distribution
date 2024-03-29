package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :std.Array<any>} */
trait ResponsedataArrayany
  extends StObject
     with /* others */ StringDictionary[Any] {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var message: String
  
  var status: Boolean
}
object ResponsedataArrayany {
  
  inline def apply(message: String, status: Boolean): ResponsedataArrayany = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponsedataArrayany] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
