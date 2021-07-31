package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicError extends StObject {
  
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  var details: js.UndefOr[NullableOption[js.Array[PublicErrorDetail]]] = js.undefined
  
  var innerError: js.UndefOr[NullableOption[PublicInnerError]] = js.undefined
  
  var message: js.UndefOr[NullableOption[String]] = js.undefined
  
  var target: js.UndefOr[NullableOption[String]] = js.undefined
}
object PublicError {
  
  @scala.inline
  def apply(): PublicError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicError]
  }
  
  @scala.inline
  implicit class PublicErrorMutableBuilder[Self <: PublicError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDetails(value: NullableOption[js.Array[PublicErrorDetail]]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsNull: Self = StObject.set(x, "details", null)
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: PublicErrorDetail*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setInnerError(value: NullableOption[PublicInnerError]): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerErrorNull: Self = StObject.set(x, "innerError", null)
    
    @scala.inline
    def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setTarget(value: NullableOption[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
