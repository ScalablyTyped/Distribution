package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProtectedRangeRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `protectedRange` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The protected range to update with the new properties. */
  var protectedRange: js.UndefOr[ProtectedRange] = js.undefined
}
object UpdateProtectedRangeRequest {
  
  @scala.inline
  def apply(): UpdateProtectedRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProtectedRangeRequest]
  }
  
  @scala.inline
  implicit class UpdateProtectedRangeRequestMutableBuilder[Self <: UpdateProtectedRangeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setProtectedRange(value: ProtectedRange): Self = StObject.set(x, "protectedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectedRangeUndefined: Self = StObject.set(x, "protectedRange", js.undefined)
  }
}
