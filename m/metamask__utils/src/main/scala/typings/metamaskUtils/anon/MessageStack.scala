package typings.metamaskUtils.anon

import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStack extends StObject {
  
  var code: Struct_[Double, Null]
  
  var data: Struct_[Any, Null]
  
  var message: Struct_[String, Null]
  
  var stack: Struct_[js.UndefOr[String], Null]
}
object MessageStack {
  
  inline def apply(
    code: Struct_[Double, Null],
    data: Struct_[Any, Null],
    message: Struct_[String, Null],
    stack: Struct_[js.UndefOr[String], Null]
  ): MessageStack = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageStack]
  }
  
  extension [Self <: MessageStack](x: Self) {
    
    inline def setCode(value: Struct_[Double, Null]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setData(value: Struct_[Any, Null]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Struct_[String, Null]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStack(value: Struct_[js.UndefOr[String], Null]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
