package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePropertiesSuggestionState extends js.Object {
  
  /** Indicates if there was a suggested change to angle. */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to brightness. */
  var brightnessSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to content_uri. */
  var contentUriSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to contrast. */
  var contrastSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in crop_properties have been changed in this suggestion. */
  var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to source_uri. */
  var sourceUriSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to transparency. */
  var transparencySuggested: js.UndefOr[Boolean] = js.native
}
object ImagePropertiesSuggestionState {
  
  @scala.inline
  def apply(): ImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class ImagePropertiesSuggestionStateOps[Self <: ImagePropertiesSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setAngleSuggested(value: Boolean): Self = this.set("angleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleSuggested: Self = this.set("angleSuggested", js.undefined)
    
    @scala.inline
    def setBrightnessSuggested(value: Boolean): Self = this.set("brightnessSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrightnessSuggested: Self = this.set("brightnessSuggested", js.undefined)
    
    @scala.inline
    def setContentUriSuggested(value: Boolean): Self = this.set("contentUriSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUriSuggested: Self = this.set("contentUriSuggested", js.undefined)
    
    @scala.inline
    def setContrastSuggested(value: Boolean): Self = this.set("contrastSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContrastSuggested: Self = this.set("contrastSuggested", js.undefined)
    
    @scala.inline
    def setCropPropertiesSuggestionState(value: CropPropertiesSuggestionState): Self = this.set("cropPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCropPropertiesSuggestionState: Self = this.set("cropPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setSourceUriSuggested(value: Boolean): Self = this.set("sourceUriSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceUriSuggested: Self = this.set("sourceUriSuggested", js.undefined)
    
    @scala.inline
    def setTransparencySuggested(value: Boolean): Self = this.set("transparencySuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparencySuggested: Self = this.set("transparencySuggested", js.undefined)
  }
}
