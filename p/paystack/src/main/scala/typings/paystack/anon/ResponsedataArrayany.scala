package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :std.Array<any>} */
trait ResponsedataArrayany
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] & js.Array[js.Any]
  
  var message: String
  
  var status: Boolean
}
object ResponsedataArrayany {
  
  inline def apply(data: js.UndefOr[js.Any] & js.Array[js.Any], message: String, status: Boolean): ResponsedataArrayany = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayany]
  }
  
  extension [Self <: ResponsedataArrayany](x: Self) {
    
    inline def setData(value: js.UndefOr[js.Any] & js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
