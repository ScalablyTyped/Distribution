package typings.metamaskUtils.anon

import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.std.Record
import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdStruct extends StObject {
  
  var id: Struct_[String | Double | Null, Null]
  
  var jsonrpc: Struct_[`2Dot0`, `2Dot0`]
  
  var method: Struct_[String, Null]
  
  var params: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]
}
object IdStruct {
  
  inline def apply(
    id: Struct_[String | Double | Null, Null],
    jsonrpc: Struct_[`2Dot0`, `2Dot0`],
    method: Struct_[String, Null],
    params: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]
  ): IdStruct = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdStruct]
  }
  
  extension [Self <: IdStruct](x: Self) {
    
    inline def setId(value: Struct_[String | Double | Null, Null]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Struct_[`2Dot0`, `2Dot0`]): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Struct_[String, Null]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
