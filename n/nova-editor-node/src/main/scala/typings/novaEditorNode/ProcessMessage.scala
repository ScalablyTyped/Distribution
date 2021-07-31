package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/process-message/
trait ProcessMessage[P, R, E] extends StObject {
  
  val errorCode: Double | Null
  
  val errorData: E | Null
  
  val errorReason: String | Null
  
  val method: String | Null
  
  val parameters: js.UndefOr[P] = js.undefined
  
  val result: js.UndefOr[R | Null] = js.undefined
}
object ProcessMessage {
  
  @scala.inline
  def apply[P, R, E](): ProcessMessage[P, R, E] = {
    val __obj = js.Dynamic.literal(errorCode = null, errorData = null, errorReason = null, method = null)
    __obj.asInstanceOf[ProcessMessage[P, R, E]]
  }
  
  @scala.inline
  implicit class ProcessMessageMutableBuilder[Self <: ProcessMessage[?, ?, ?], P, R, E] (val x: Self & (ProcessMessage[P, R, E])) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    @scala.inline
    def setErrorData(value: E): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDataNull: Self = StObject.set(x, "errorData", null)
    
    @scala.inline
    def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorReasonNull: Self = StObject.set(x, "errorReason", null)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNull: Self = StObject.set(x, "method", null)
    
    @scala.inline
    def setParameters(value: P): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setResult(value: R): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultNull: Self = StObject.set(x, "result", null)
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
