package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualInfo extends StObject {
  
  // Optional. JSON object used to represent an icon which represents the application used to generate the activity
  var attribution: js.UndefOr[NullableOption[ImageInfo]] = js.native
  
  /**
    * Optional. Background color used to render the activity in the UI - brand color for the application source of the
    * activity. Must be a valid hex color
    */
  var backgroundColor: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell
    * UI
    */
  var content: js.UndefOr[NullableOption[_]] = js.native
  
  /**
    * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or
    * metadata)
    */
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Required. Short text description of the user's unique activity (for example, document name in cases where an activity
    * refers to document creation)
    */
  var displayText: js.UndefOr[String] = js.native
}
object VisualInfo {
  
  @scala.inline
  def apply(): VisualInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualInfo]
  }
  
  @scala.inline
  implicit class VisualInfoMutableBuilder[Self <: VisualInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: NullableOption[ImageInfo]): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionNull: Self = StObject.set(x, "attribution", null)
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: NullableOption[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setContent(value: NullableOption[_]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentNull: Self = StObject.set(x, "content", null)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
  }
}
