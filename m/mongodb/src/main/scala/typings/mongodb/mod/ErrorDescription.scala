package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDescription
  extends StObject
     with Document {
  
  @JSName("$err")
  var $err: js.UndefOr[String] = js.undefined
  
  var errInfo: js.UndefOr[Document] = js.undefined
  
  var errmsg: js.UndefOr[String] = js.undefined
  
  var errorLabels: js.UndefOr[js.Array[String]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object ErrorDescription {
  
  inline def apply(): ErrorDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDescription]
  }
  
  extension [Self <: ErrorDescription](x: Self) {
    
    inline def set$err(value: String): Self = StObject.set(x, "$err", value.asInstanceOf[js.Any])
    
    inline def set$errUndefined: Self = StObject.set(x, "$err", js.undefined)
    
    inline def setErrInfo(value: Document): Self = StObject.set(x, "errInfo", value.asInstanceOf[js.Any])
    
    inline def setErrInfoUndefined: Self = StObject.set(x, "errInfo", js.undefined)
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    inline def setErrmsgUndefined: Self = StObject.set(x, "errmsg", js.undefined)
    
    inline def setErrorLabels(value: js.Array[String]): Self = StObject.set(x, "errorLabels", value.asInstanceOf[js.Any])
    
    inline def setErrorLabelsUndefined: Self = StObject.set(x, "errorLabels", js.undefined)
    
    inline def setErrorLabelsVarargs(value: String*): Self = StObject.set(x, "errorLabels", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
