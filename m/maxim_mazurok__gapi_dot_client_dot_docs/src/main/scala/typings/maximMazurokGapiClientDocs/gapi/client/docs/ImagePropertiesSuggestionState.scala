package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagePropertiesSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to angle. */
  var angleSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to brightness. */
  var brightnessSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to content_uri. */
  var contentUriSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to contrast. */
  var contrastSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** A mask that indicates which of the fields in crop_properties have been changed in this suggestion. */
  var cropPropertiesSuggestionState: js.UndefOr[CropPropertiesSuggestionState] = js.undefined
  
  /** Indicates if there was a suggested change to source_uri. */
  var sourceUriSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to transparency. */
  var transparencySuggested: js.UndefOr[Boolean] = js.undefined
}
object ImagePropertiesSuggestionState {
  
  inline def apply(): ImagePropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropertiesSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    inline def setBrightnessSuggested(value: Boolean): Self = StObject.set(x, "brightnessSuggested", value.asInstanceOf[js.Any])
    
    inline def setBrightnessSuggestedUndefined: Self = StObject.set(x, "brightnessSuggested", js.undefined)
    
    inline def setContentUriSuggested(value: Boolean): Self = StObject.set(x, "contentUriSuggested", value.asInstanceOf[js.Any])
    
    inline def setContentUriSuggestedUndefined: Self = StObject.set(x, "contentUriSuggested", js.undefined)
    
    inline def setContrastSuggested(value: Boolean): Self = StObject.set(x, "contrastSuggested", value.asInstanceOf[js.Any])
    
    inline def setContrastSuggestedUndefined: Self = StObject.set(x, "contrastSuggested", js.undefined)
    
    inline def setCropPropertiesSuggestionState(value: CropPropertiesSuggestionState): Self = StObject.set(x, "cropPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setCropPropertiesSuggestionStateUndefined: Self = StObject.set(x, "cropPropertiesSuggestionState", js.undefined)
    
    inline def setSourceUriSuggested(value: Boolean): Self = StObject.set(x, "sourceUriSuggested", value.asInstanceOf[js.Any])
    
    inline def setSourceUriSuggestedUndefined: Self = StObject.set(x, "sourceUriSuggested", js.undefined)
    
    inline def setTransparencySuggested(value: Boolean): Self = StObject.set(x, "transparencySuggested", value.asInstanceOf[js.Any])
    
    inline def setTransparencySuggestedUndefined: Self = StObject.set(x, "transparencySuggested", js.undefined)
  }
}
