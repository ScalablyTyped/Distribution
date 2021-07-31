package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.ExceptionDetails
import typings.node.inspectorMod.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluateOnCallFrameReturnType extends StObject {
  
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  
  /**
    * Object wrapper for the evaluation result.
    */
  var result: RemoteObject
}
object EvaluateOnCallFrameReturnType {
  
  @scala.inline
  def apply(result: RemoteObject): EvaluateOnCallFrameReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameReturnType]
  }
  
  @scala.inline
  implicit class EvaluateOnCallFrameReturnTypeMutableBuilder[Self <: EvaluateOnCallFrameReturnType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDetailsUndefined: Self = StObject.set(x, "exceptionDetails", js.undefined)
    
    @scala.inline
    def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
