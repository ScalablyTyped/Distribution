package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined paystack.paystack.Response & {  data :std.Array<any>,   meta :any} */
trait ResponsedataArrayanymetaa
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var data: js.UndefOr[js.Any] & js.Array[js.Any]
  
  var message: String
  
  var meta: js.Any
  
  var status: Boolean
}
object ResponsedataArrayanymetaa {
  
  @scala.inline
  def apply(data: js.UndefOr[js.Any] & js.Array[js.Any], message: String, meta: js.Any, status: Boolean): ResponsedataArrayanymetaa = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponsedataArrayanymetaa]
  }
  
  @scala.inline
  implicit class ResponsedataArrayanymetaaMutableBuilder[Self <: ResponsedataArrayanymetaa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.UndefOr[js.Any] & js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
