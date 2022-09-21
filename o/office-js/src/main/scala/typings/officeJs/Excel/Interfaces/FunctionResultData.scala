package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `functionResult.toJSON()`. */
trait FunctionResultData[T] extends StObject {
  
  /**
    * Error value (such as "#DIV/0") representing the error. If the error string is not set, then the function succeeded, and its result is written to the Value field. The error is always in the English locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * The value of function evaluation. The value field will be populated only if no error has occurred (i.e., the Error property is not set).
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var value: js.UndefOr[T] = js.undefined
}
object FunctionResultData {
  
  inline def apply[T](): FunctionResultData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionResultData[T]]
  }
  
  extension [Self <: FunctionResultData[?], T](x: Self & FunctionResultData[T]) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
