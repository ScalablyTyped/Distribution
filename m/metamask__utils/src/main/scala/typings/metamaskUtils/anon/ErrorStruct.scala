package typings.metamaskUtils.anon

import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorStruct extends StObject {
  
  var error: Struct_[DataMessage, MessageStack]
  
  var id: Struct_[String | Double | Null, Null]
  
  var jsonrpc: Struct_[`2Dot0`, `2Dot0`]
}
object ErrorStruct {
  
  inline def apply(
    error: Struct_[DataMessage, MessageStack],
    id: Struct_[String | Double | Null, Null],
    jsonrpc: Struct_[`2Dot0`, `2Dot0`]
  ): ErrorStruct = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorStruct]
  }
  
  extension [Self <: ErrorStruct](x: Self) {
    
    inline def setError(value: Struct_[DataMessage, MessageStack]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Struct_[String | Double | Null, Null]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Struct_[`2Dot0`, `2Dot0`]): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
