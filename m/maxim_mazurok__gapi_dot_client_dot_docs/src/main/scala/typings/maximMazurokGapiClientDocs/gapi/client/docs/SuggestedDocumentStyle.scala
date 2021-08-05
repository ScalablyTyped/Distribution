package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestedDocumentStyle extends StObject {
  
  /**
    * A DocumentStyle that only includes the changes made in this suggestion. This can be used along with the document_style_suggestion_state to see which fields have changed and their
    * new values.
    */
  var documentStyle: js.UndefOr[DocumentStyle] = js.undefined
  
  /** A mask that indicates which of the fields on the base DocumentStyle have been changed in this suggestion. */
  var documentStyleSuggestionState: js.UndefOr[DocumentStyleSuggestionState] = js.undefined
}
object SuggestedDocumentStyle {
  
  inline def apply(): SuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedDocumentStyle]
  }
  
  extension [Self <: SuggestedDocumentStyle](x: Self) {
    
    inline def setDocumentStyle(value: DocumentStyle): Self = StObject.set(x, "documentStyle", value.asInstanceOf[js.Any])
    
    inline def setDocumentStyleSuggestionState(value: DocumentStyleSuggestionState): Self = StObject.set(x, "documentStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setDocumentStyleSuggestionStateUndefined: Self = StObject.set(x, "documentStyleSuggestionState", js.undefined)
    
    inline def setDocumentStyleUndefined: Self = StObject.set(x, "documentStyle", js.undefined)
  }
}
