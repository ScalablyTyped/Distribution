package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :std.Array<any> | undefined,   meta :any | undefined} */
trait ResponsedataArrayanyundef
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] & js.UndefOr[js.Array[js.Any]]
  
  var message: String
  
  var meta: js.UndefOr[js.Any] = js.undefined
  
  var status: Boolean
}
object ResponsedataArrayanyundef {
  
  @scala.inline
  def apply(data: js.UndefOr[js.Any] & js.UndefOr[js.Array[js.Any]], message: String, status: Boolean): ResponsedataArrayanyundef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayanyundef]
  }
  
  @scala.inline
  implicit class ResponsedataArrayanyundefMutableBuilder[Self <: ResponsedataArrayanyundef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.UndefOr[js.Any] & js.UndefOr[js.Array[js.Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
