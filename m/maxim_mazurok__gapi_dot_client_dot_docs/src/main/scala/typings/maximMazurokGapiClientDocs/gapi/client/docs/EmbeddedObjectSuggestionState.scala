package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedObjectSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to description. */
  var descriptionSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in embedded_drawing_properties have been changed in this suggestion. */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[js.Any] = js.native
  
  /** A mask that indicates which of the fields in embedded_object_border have been changed in this suggestion. */
  var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.native
  
  /** A mask that indicates which of the fields in image_properties have been changed in this suggestion. */
  var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.native
  
  /** A mask that indicates which of the fields in linked_content_reference have been changed in this suggestion. */
  var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to margin_bottom. */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_left. */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_right. */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to margin_top. */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  
  /** A mask that indicates which of the fields in size have been changed in this suggestion. */
  var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.native
  
  /** Indicates if there was a suggested change to title. */
  var titleSuggested: js.UndefOr[Boolean] = js.native
}
object EmbeddedObjectSuggestionState {
  
  @scala.inline
  def apply(): EmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
  
  @scala.inline
  implicit class EmbeddedObjectSuggestionStateMutableBuilder[Self <: EmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptionSuggested(value: Boolean): Self = StObject.set(x, "descriptionSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionSuggestedUndefined: Self = StObject.set(x, "descriptionSuggested", js.undefined)
    
    @scala.inline
    def setEmbeddedDrawingPropertiesSuggestionState(value: js.Any): Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedDrawingPropertiesSuggestionStateUndefined: Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setEmbeddedObjectBorderSuggestionState(value: EmbeddedObjectBorderSuggestionState): Self = StObject.set(x, "embeddedObjectBorderSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedObjectBorderSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectBorderSuggestionState", js.undefined)
    
    @scala.inline
    def setImagePropertiesSuggestionState(value: ImagePropertiesSuggestionState): Self = StObject.set(x, "imagePropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePropertiesSuggestionStateUndefined: Self = StObject.set(x, "imagePropertiesSuggestionState", js.undefined)
    
    @scala.inline
    def setLinkedContentReferenceSuggestionState(value: LinkedContentReferenceSuggestionState): Self = StObject.set(x, "linkedContentReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedContentReferenceSuggestionStateUndefined: Self = StObject.set(x, "linkedContentReferenceSuggestionState", js.undefined)
    
    @scala.inline
    def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
    
    @scala.inline
    def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
    
    @scala.inline
    def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
    
    @scala.inline
    def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
    
    @scala.inline
    def setSizeSuggestionState(value: SizeSuggestionState): Self = StObject.set(x, "sizeSuggestionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeSuggestionStateUndefined: Self = StObject.set(x, "sizeSuggestionState", js.undefined)
    
    @scala.inline
    def setTitleSuggested(value: Boolean): Self = StObject.set(x, "titleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleSuggestedUndefined: Self = StObject.set(x, "titleSuggested", js.undefined)
  }
}
