package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiVarsWriteResult extends StObject {
  
  var Result: Double = js.native
}
object MultiVarsWriteResult {
  
  @scala.inline
  def apply(Result: Double): MultiVarsWriteResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsWriteResult]
  }
  
  @scala.inline
  implicit class MultiVarsWriteResultMutableBuilder[Self <: MultiVarsWriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
