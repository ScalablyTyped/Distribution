package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedParagraphStyle extends StObject {
  
  /**
    * A ParagraphStyle that only includes the changes made in this suggestion. This can be used along with the paragraph_style_suggestion_state to see which fields have changed and their
    * new values.
    */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** A mask that indicates which of the fields on the base ParagraphStyle have been changed in this suggestion. */
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.undefined
}
object SuggestedParagraphStyle {
  
  inline def apply(): SuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedParagraphStyle]
  }
  
  extension [Self <: SuggestedParagraphStyle](x: Self) {
    
    inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = StObject.set(x, "paragraphStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleSuggestionStateUndefined: Self = StObject.set(x, "paragraphStyleSuggestionState", js.undefined)
    
    inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
  }
}
