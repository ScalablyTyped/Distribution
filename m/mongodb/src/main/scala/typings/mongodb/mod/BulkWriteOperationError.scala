package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkWriteOperationError extends StObject {
  
  var code: scala.Double
  
  var errInfo: Document
  
  var errmsg: String
  
  var index: scala.Double
  
  var op: Document | UpdateStatement | DeleteStatement
}
object BulkWriteOperationError {
  
  inline def apply(
    code: scala.Double,
    errInfo: Document,
    errmsg: String,
    index: scala.Double,
    op: Document | UpdateStatement | DeleteStatement
  ): BulkWriteOperationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errInfo = errInfo.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkWriteOperationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BulkWriteOperationError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: scala.Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setErrInfo(value: Document): Self = StObject.set(x, "errInfo", value.asInstanceOf[js.Any])
    
    inline def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setOp(value: Document | UpdateStatement | DeleteStatement): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
