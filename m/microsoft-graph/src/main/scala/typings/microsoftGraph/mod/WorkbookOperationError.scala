package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookOperationError extends StObject {
  
  // The error code.
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  var innerError: js.UndefOr[NullableOption[WorkbookOperationError]] = js.undefined
  
  // The error message.
  var message: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookOperationError {
  
  inline def apply(): WorkbookOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookOperationError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookOperationError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setInnerError(value: NullableOption[WorkbookOperationError]): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
    inline def setInnerErrorNull: Self = StObject.set(x, "innerError", null)
    
    inline def setInnerErrorUndefined: Self = StObject.set(x, "innerError", js.undefined)
    
    inline def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
