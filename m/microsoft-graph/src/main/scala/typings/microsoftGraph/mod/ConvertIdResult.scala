package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertIdResult extends StObject {
  
  /**
    * An error object indicating the reason for the conversion failure. This value is not present if the conversion
    * succeeded.
    */
  var errorDetails: js.UndefOr[NullableOption[GenericError]] = js.undefined
  
  // The identifier that was converted. This value is the original, un-converted identifier.
  var sourceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The converted identifier. This value is not present if the conversion failed.
  var targetId: js.UndefOr[NullableOption[String]] = js.undefined
}
object ConvertIdResult {
  
  inline def apply(): ConvertIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertIdResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertIdResult] (val x: Self) extends AnyVal {
    
    inline def setErrorDetails(value: NullableOption[GenericError]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsNull: Self = StObject.set(x, "errorDetails", null)
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setSourceId(value: NullableOption[String]): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setSourceIdNull: Self = StObject.set(x, "sourceId", null)
    
    inline def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    inline def setTargetId(value: NullableOption[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
