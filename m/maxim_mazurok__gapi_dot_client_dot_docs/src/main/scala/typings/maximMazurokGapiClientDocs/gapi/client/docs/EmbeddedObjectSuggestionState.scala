package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObjectSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to description. */
  var descriptionSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** A mask that indicates which of the fields in embedded_drawing_properties have been changed in this suggestion. */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[Any] = js.undefined
  
  /** A mask that indicates which of the fields in embedded_object_border have been changed in this suggestion. */
  var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.undefined
  
  /** A mask that indicates which of the fields in image_properties have been changed in this suggestion. */
  var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.undefined
  
  /** A mask that indicates which of the fields in linked_content_reference have been changed in this suggestion. */
  var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.undefined
  
  /** Indicates if there was a suggested change to margin_bottom. */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_left. */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_right. */
  var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to margin_top. */
  var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** A mask that indicates which of the fields in size have been changed in this suggestion. */
  var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
  
  /** Indicates if there was a suggested change to title. */
  var titleSuggested: js.UndefOr[Boolean] = js.undefined
}
object EmbeddedObjectSuggestionState {
  
  inline def apply(): EmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbeddedObjectSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setDescriptionSuggested(value: Boolean): Self = StObject.set(x, "descriptionSuggested", value.asInstanceOf[js.Any])
    
    inline def setDescriptionSuggestedUndefined: Self = StObject.set(x, "descriptionSuggested", js.undefined)
    
    inline def setEmbeddedDrawingPropertiesSuggestionState(value: Any): Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedDrawingPropertiesSuggestionStateUndefined: Self = StObject.set(x, "embeddedDrawingPropertiesSuggestionState", js.undefined)
    
    inline def setEmbeddedObjectBorderSuggestionState(value: EmbeddedObjectBorderSuggestionState): Self = StObject.set(x, "embeddedObjectBorderSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectBorderSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectBorderSuggestionState", js.undefined)
    
    inline def setImagePropertiesSuggestionState(value: ImagePropertiesSuggestionState): Self = StObject.set(x, "imagePropertiesSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setImagePropertiesSuggestionStateUndefined: Self = StObject.set(x, "imagePropertiesSuggestionState", js.undefined)
    
    inline def setLinkedContentReferenceSuggestionState(value: LinkedContentReferenceSuggestionState): Self = StObject.set(x, "linkedContentReferenceSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setLinkedContentReferenceSuggestionStateUndefined: Self = StObject.set(x, "linkedContentReferenceSuggestionState", js.undefined)
    
    inline def setMarginBottomSuggested(value: Boolean): Self = StObject.set(x, "marginBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomSuggestedUndefined: Self = StObject.set(x, "marginBottomSuggested", js.undefined)
    
    inline def setMarginLeftSuggested(value: Boolean): Self = StObject.set(x, "marginLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftSuggestedUndefined: Self = StObject.set(x, "marginLeftSuggested", js.undefined)
    
    inline def setMarginRightSuggested(value: Boolean): Self = StObject.set(x, "marginRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginRightSuggestedUndefined: Self = StObject.set(x, "marginRightSuggested", js.undefined)
    
    inline def setMarginTopSuggested(value: Boolean): Self = StObject.set(x, "marginTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setMarginTopSuggestedUndefined: Self = StObject.set(x, "marginTopSuggested", js.undefined)
    
    inline def setSizeSuggestionState(value: SizeSuggestionState): Self = StObject.set(x, "sizeSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setSizeSuggestionStateUndefined: Self = StObject.set(x, "sizeSuggestionState", js.undefined)
    
    inline def setTitleSuggested(value: Boolean): Self = StObject.set(x, "titleSuggested", value.asInstanceOf[js.Any])
    
    inline def setTitleSuggestedUndefined: Self = StObject.set(x, "titleSuggested", js.undefined)
  }
}
