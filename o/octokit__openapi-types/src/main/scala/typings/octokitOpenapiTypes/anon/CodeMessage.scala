package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeMessage extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object CodeMessage {
  
  inline def apply(): CodeMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeMessage] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
