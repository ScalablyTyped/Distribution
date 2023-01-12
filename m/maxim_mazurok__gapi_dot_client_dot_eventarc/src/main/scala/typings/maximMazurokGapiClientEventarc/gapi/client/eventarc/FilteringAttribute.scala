package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteringAttribute extends StObject {
  
  /** Output only. Attribute used for filtering the event type. */
  var attribute: js.UndefOr[String] = js.undefined
  
  /** Output only. Description of the purpose of the attribute. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Output only. If true, the attribute accepts matching expressions in the Eventarc PathPattern format. */
  var pathPatternSupported: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. If true, the triggers for this provider should always specify a filter on these attributes. Trigger creation will fail otherwise. */
  var required: js.UndefOr[Boolean] = js.undefined
}
object FilteringAttribute {
  
  inline def apply(): FilteringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteringAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilteringAttribute] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPathPatternSupported(value: Boolean): Self = StObject.set(x, "pathPatternSupported", value.asInstanceOf[js.Any])
    
    inline def setPathPatternSupportedUndefined: Self = StObject.set(x, "pathPatternSupported", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
