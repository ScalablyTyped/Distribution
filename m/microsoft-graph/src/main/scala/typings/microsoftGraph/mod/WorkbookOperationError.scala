package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookOperationError extends StObject {
  
  // The error code.
  var code: js.UndefOr[NullableOption[String]] = js.native
  
  var innerError: js.UndefOr[NullableOption[WorkbookOperationError]] = js.native
  
  // The error message.
  var message: js.UndefOr[NullableOption[String]] = js.native
}
object WorkbookOperationError {
  
  @scala.inline
  def apply(): WorkbookOperationError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookOperationError]
  }
  
  @scala.inline
  implicit class WorkbookOperationErrorMutableBuilder[Self <: WorkbookOperationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setInnerError(value: NullableOption[WorkbookOperationError]): Self = StObject.set(x, "innerError", value.asInstanceOf[js.Any])
    
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
  }
}
