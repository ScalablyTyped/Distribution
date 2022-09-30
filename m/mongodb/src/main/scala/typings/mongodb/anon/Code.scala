package typings.mongodb.anon

import typings.mongodb.mod.WriteError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: Double
  
  var message: String
  
  var writeErrors: js.UndefOr[js.Array[WriteError]] = js.undefined
}
object Code {
  
  inline def apply(code: Double, message: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setWriteErrors(value: js.Array[WriteError]): Self = StObject.set(x, "writeErrors", value.asInstanceOf[js.Any])
    
    inline def setWriteErrorsUndefined: Self = StObject.set(x, "writeErrors", js.undefined)
    
    inline def setWriteErrorsVarargs(value: WriteError*): Self = StObject.set(x, "writeErrors", js.Array(value*))
  }
}
