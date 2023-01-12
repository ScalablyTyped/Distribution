package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEmbeddedObjectBorderRequest extends StObject {
  
  /** The border that applies to the embedded object. */
  var border: js.UndefOr[EmbeddedObjectBorder] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `border` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The ID of the embedded object to update. */
  var objectId: js.UndefOr[Double] = js.undefined
}
object UpdateEmbeddedObjectBorderRequest {
  
  inline def apply(): UpdateEmbeddedObjectBorderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEmbeddedObjectBorderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEmbeddedObjectBorderRequest] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: EmbeddedObjectBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
