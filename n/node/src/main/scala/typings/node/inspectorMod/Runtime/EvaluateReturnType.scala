package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateReturnType extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}
object EvaluateReturnType {
  
  @scala.inline
  def apply(result: RemoteObject): EvaluateReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateReturnType]
  }
  
  @scala.inline
  implicit class EvaluateReturnTypeMutableBuilder[Self <: EvaluateReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
