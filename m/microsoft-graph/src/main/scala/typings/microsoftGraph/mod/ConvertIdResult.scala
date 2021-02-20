package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConvertIdResult extends StObject {
  
  /**
    * An error object indicating the reason for the conversion failure. This value is not present if the conversion
    * succeeded.
    */
  var errorDetails: js.UndefOr[NullableOption[GenericError]] = js.native
  
  // The identifier that was converted. This value is the original, un-converted identifier.
  var sourceId: js.UndefOr[NullableOption[String]] = js.native
  
  // The converted identifier. This value is not present if the conversion failed.
  var targetId: js.UndefOr[NullableOption[String]] = js.native
}
object ConvertIdResult {
  
  @scala.inline
  def apply(): ConvertIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertIdResult]
  }
  
  @scala.inline
  implicit class ConvertIdResultMutableBuilder[Self <: ConvertIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorDetails(value: NullableOption[GenericError]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsNull: Self = StObject.set(x, "errorDetails", null)
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setSourceId(value: NullableOption[String]): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdNull: Self = StObject.set(x, "sourceId", null)
    
    @scala.inline
    def setSourceIdUndefined: Self = StObject.set(x, "sourceId", js.undefined)
    
    @scala.inline
    def setTargetId(value: NullableOption[String]): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
