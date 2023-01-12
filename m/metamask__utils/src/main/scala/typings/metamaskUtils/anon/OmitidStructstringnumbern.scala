package typings.metamaskUtils.anon

import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.std.Record
import typings.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<{  id :superstruct.superstruct.Struct<string | number | null, null>,   jsonrpc :superstruct.superstruct.Struct<'2.0', '2.0'>,   method :superstruct.superstruct.Struct<string, null>,   params :superstruct.superstruct.Struct<std.Array<unknown> | std.Record<string, unknown> | undefined, null>}, 'id'> */
trait OmitidStructstringnumbern extends StObject {
  
  var jsonrpc: Struct_[`2Dot0`, `2Dot0`]
  
  var method: Struct_[String, Null]
  
  var params: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]
}
object OmitidStructstringnumbern {
  
  inline def apply(
    jsonrpc: Struct_[`2Dot0`, `2Dot0`],
    method: Struct_[String, Null],
    params: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]
  ): OmitidStructstringnumbern = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitidStructstringnumbern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitidStructstringnumbern] (val x: Self) extends AnyVal {
    
    inline def setJsonrpc(value: Struct_[`2Dot0`, `2Dot0`]): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Struct_[String, Null]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Struct_[js.UndefOr[js.Array[Any] | (Record[String, Any])], Null]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
