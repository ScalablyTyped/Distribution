package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePagePropertiesRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `pageProperties` is implied and should not be specified. A single `"*"` can be used as short-hand
    * for listing every field. For example to update the page background solid fill color, set `fields` to `"pageBackgroundFill.solidFill.color"`. To reset a property to its default
    * value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The object ID of the page the update is applied to. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The page properties to update. */
  var pageProperties: js.UndefOr[PageProperties] = js.undefined
}
object UpdatePagePropertiesRequest {
  
  inline def apply(): UpdatePagePropertiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePagePropertiesRequest]
  }
  
  extension [Self <: UpdatePagePropertiesRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPageProperties(value: PageProperties): Self = StObject.set(x, "pageProperties", value.asInstanceOf[js.Any])
    
    inline def setPagePropertiesUndefined: Self = StObject.set(x, "pageProperties", js.undefined)
  }
}
