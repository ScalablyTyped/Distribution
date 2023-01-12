package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptError extends StObject {
  
  /** The column number in the script where the error was thrown. */
  var column: js.UndefOr[String] = js.undefined
  
  /** The type of error. */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /** The detailed error message. */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /** The line number in the script where the error was thrown. */
  var line: js.UndefOr[String] = js.undefined
}
object ScriptError {
  
  inline def apply(): ScriptError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptError] (val x: Self) extends AnyVal {
    
    inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
