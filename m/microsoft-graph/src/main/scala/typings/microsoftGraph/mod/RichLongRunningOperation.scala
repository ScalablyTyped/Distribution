package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichLongRunningOperation
  extends StObject
     with LongRunningOperation {
  
  // Error that caused the operation to fail.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  // A value between 0 and 100 that indicates the progress of the operation.
  var percentageComplete: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The unique identifier for the result.
  var resourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The type of the operation.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object RichLongRunningOperation {
  
  inline def apply(): RichLongRunningOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichLongRunningOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichLongRunningOperation] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPercentageComplete(value: NullableOption[Double]): Self = StObject.set(x, "percentageComplete", value.asInstanceOf[js.Any])
    
    inline def setPercentageCompleteNull: Self = StObject.set(x, "percentageComplete", null)
    
    inline def setPercentageCompleteUndefined: Self = StObject.set(x, "percentageComplete", js.undefined)
    
    inline def setResourceId(value: NullableOption[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
