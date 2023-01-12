package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlidePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root 'slideProperties' is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update whether a slide is skipped, set `fields` to `"isSkipped"`. To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The object ID of the slide the update is applied to. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The slide properties to update. */
  var slideProperties: js.UndefOr[SlideProperties] = js.undefined
}
object UpdateSlidePropertiesRequest {
  
  inline def apply(): UpdateSlidePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlidePropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSlidePropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setSlideProperties(value: SlideProperties): Self = StObject.set(x, "slideProperties", value.asInstanceOf[js.Any])
    
    inline def setSlidePropertiesUndefined: Self = StObject.set(x, "slideProperties", js.undefined)
  }
}
