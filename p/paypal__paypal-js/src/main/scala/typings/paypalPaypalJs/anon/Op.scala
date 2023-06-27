package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.add
import typings.paypalPaypalJs.paypalPaypalJsStrings.copy
import typings.paypalPaypalJs.paypalPaypalJsStrings.replace
import typings.paypalPaypalJs.paypalPaypalJsStrings.test
import typings.paypalPaypalJs.typesApisOrdersMod.UpdateOrderOperation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Op
  extends StObject
     with UpdateOrderOperation {
  
  var op: add | replace | copy | test
  
  /**
    * The JSON Pointer to the target document location at which to complete the operation.
    */
  var path: String
  
  var value: Record[String, Any]
}
object Op {
  
  inline def apply(op: add | replace | copy | test, path: String, value: Record[String, Any]): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Op] (val x: Self) extends AnyVal {
    
    inline def setOp(value: add | replace | copy | test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Record[String, Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
