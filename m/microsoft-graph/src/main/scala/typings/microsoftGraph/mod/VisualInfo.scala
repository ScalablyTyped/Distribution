package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualInfo extends StObject {
  
  // Optional. JSON object used to represent an icon which represents the application used to generate the activity
  var attribution: js.UndefOr[NullableOption[ImageInfo]] = js.undefined
  
  /**
    * Optional. Background color used to render the activity in the UI - brand color for the application source of the
    * activity. Must be a valid hex color
    */
  var backgroundColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell
    * UI
    */
  var content: js.UndefOr[NullableOption[Any]] = js.undefined
  
  /**
    * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or
    * metadata)
    */
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Required. Short text description of the user's unique activity (for example, document name in cases where an activity
    * refers to document creation)
    */
  var displayText: js.UndefOr[String] = js.undefined
}
object VisualInfo {
  
  inline def apply(): VisualInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualInfo]
  }
  
  extension [Self <: VisualInfo](x: Self) {
    
    inline def setAttribution(value: NullableOption[ImageInfo]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionNull: Self = StObject.set(x, "attribution", null)
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBackgroundColor(value: NullableOption[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setContent(value: NullableOption[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
  }
}
