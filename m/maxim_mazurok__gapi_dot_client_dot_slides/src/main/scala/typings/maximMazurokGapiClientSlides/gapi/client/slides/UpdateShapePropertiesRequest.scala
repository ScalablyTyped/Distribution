package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateShapePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `shapeProperties` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the shape background solid fill color, set `fields` to `"shapeBackgroundFill.solidFill.color"`. To reset a property to its default
    * value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The object ID of the shape the updates are applied to. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The shape properties to update. */
  var shapeProperties: js.UndefOr[ShapeProperties] = js.undefined
}
object UpdateShapePropertiesRequest {
  
  inline def apply(): UpdateShapePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShapePropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateShapePropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setShapeProperties(value: ShapeProperties): Self = StObject.set(x, "shapeProperties", value.asInstanceOf[js.Any])
    
    inline def setShapePropertiesUndefined: Self = StObject.set(x, "shapeProperties", js.undefined)
  }
}
