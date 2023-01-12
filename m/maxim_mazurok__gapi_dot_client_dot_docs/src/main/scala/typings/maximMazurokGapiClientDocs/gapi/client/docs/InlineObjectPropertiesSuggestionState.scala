package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineObjectPropertiesSuggestionState extends StObject {
  
  /** A mask that indicates which of the fields in embedded_object have been changed in this suggestion. */
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
}
object InlineObjectPropertiesSuggestionState {
  
  inline def apply(): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
  }
}
