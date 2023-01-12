package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionResultPart extends StObject {
  
  // The error that occurred, if any, during the course of the bulk operation.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
}
object ActionResultPart {
  
  inline def apply(): ActionResultPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionResultPart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionResultPart] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
