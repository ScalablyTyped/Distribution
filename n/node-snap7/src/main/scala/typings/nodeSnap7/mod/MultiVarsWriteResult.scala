package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiVarsWriteResult extends StObject {
  
  var Result: Double
}
object MultiVarsWriteResult {
  
  inline def apply(Result: Double): MultiVarsWriteResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsWriteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiVarsWriteResult] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
