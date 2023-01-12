package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookFunctionResult
  extends StObject
     with Entity {
  
  var error: js.UndefOr[NullableOption[String]] = js.undefined
  
  var value: js.UndefOr[NullableOption[Any]] = js.undefined
}
object WorkbookFunctionResult {
  
  inline def apply(): WorkbookFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFunctionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookFunctionResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setValue(value: NullableOption[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
