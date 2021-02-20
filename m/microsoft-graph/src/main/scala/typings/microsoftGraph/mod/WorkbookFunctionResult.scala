package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookFunctionResult extends Entity {
  
  var error: js.UndefOr[NullableOption[String]] = js.native
  
  var value: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookFunctionResult {
  
  @scala.inline
  def apply(): WorkbookFunctionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFunctionResult]
  }
  
  @scala.inline
  implicit class WorkbookFunctionResultMutableBuilder[Self <: WorkbookFunctionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: NullableOption[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
