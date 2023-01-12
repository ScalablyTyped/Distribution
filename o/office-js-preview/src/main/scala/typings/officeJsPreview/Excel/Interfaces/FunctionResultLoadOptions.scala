package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the result of a function-evaluation operation
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait FunctionResultLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Error value (such as "#DIV/0") representing the error. If the error string is not set, then the function succeeded, and its result is written to the Value field. The error is always in the English locale.
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of function evaluation. The value field will be populated only if no error has occurred (i.e., the Error property is not set).
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object FunctionResultLoadOptions {
  
  inline def apply(): FunctionResultLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionResultLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionResultLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
