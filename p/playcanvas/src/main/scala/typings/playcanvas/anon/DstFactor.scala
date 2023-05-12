package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DstFactor extends StObject {
  
  var dstFactor: String
  
  var operation: String
  
  var srcFactor: String
}
object DstFactor {
  
  inline def apply(dstFactor: String, operation: String, srcFactor: String): DstFactor = {
    val __obj = js.Dynamic.literal(dstFactor = dstFactor.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], srcFactor = srcFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DstFactor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DstFactor] (val x: Self) extends AnyVal {
    
    inline def setDstFactor(value: String): Self = StObject.set(x, "dstFactor", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setSrcFactor(value: String): Self = StObject.set(x, "srcFactor", value.asInstanceOf[js.Any])
  }
}
