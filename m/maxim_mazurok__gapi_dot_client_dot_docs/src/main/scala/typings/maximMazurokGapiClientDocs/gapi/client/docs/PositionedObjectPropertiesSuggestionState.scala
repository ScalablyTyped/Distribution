package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedObjectPropertiesSuggestionState extends StObject {
  
  /** A mask that indicates which of the fields in embedded_object have been changed in this suggestion. */
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.undefined
  
  /** A mask that indicates which of the fields in positioning have been changed in this suggestion. */
  var positioningSuggestionState: js.UndefOr[PositionedObjectPositioningSuggestionState] = js.undefined
}
object PositionedObjectPropertiesSuggestionState {
  
  inline def apply(): PositionedObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionedObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = StObject.set(x, "embeddedObjectSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedObjectSuggestionStateUndefined: Self = StObject.set(x, "embeddedObjectSuggestionState", js.undefined)
    
    inline def setPositioningSuggestionState(value: PositionedObjectPositioningSuggestionState): Self = StObject.set(x, "positioningSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setPositioningSuggestionStateUndefined: Self = StObject.set(x, "positioningSuggestionState", js.undefined)
  }
}
