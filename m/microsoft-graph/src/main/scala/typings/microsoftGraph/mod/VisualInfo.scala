package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualInfo extends js.Object {
  
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
  implicit class VisualInfoOps[Self <: VisualInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttribution(value: NullableOption[ImageInfo]): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setAttributionNull: Self = this.set("attribution", null)
    
    @scala.inline
    def setBackgroundColor(value: NullableOption[String]): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorNull: Self = this.set("backgroundColor", null)
    
    @scala.inline
    def setContent(value: NullableOption[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
  }
}
