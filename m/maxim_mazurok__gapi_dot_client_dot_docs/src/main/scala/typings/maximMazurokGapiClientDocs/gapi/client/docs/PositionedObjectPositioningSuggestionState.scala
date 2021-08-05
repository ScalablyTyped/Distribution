package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionedObjectPositioningSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to layout. */
  var layoutSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to left_offset. */
  var leftOffsetSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to top_offset. */
  var topOffsetSuggested: js.UndefOr[Boolean] = js.undefined
}
object PositionedObjectPositioningSuggestionState {
  
  inline def apply(): PositionedObjectPositioningSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionedObjectPositioningSuggestionState]
  }
  
  extension [Self <: PositionedObjectPositioningSuggestionState](x: Self) {
    
    inline def setLayoutSuggested(value: Boolean): Self = StObject.set(x, "layoutSuggested", value.asInstanceOf[js.Any])
    
    inline def setLayoutSuggestedUndefined: Self = StObject.set(x, "layoutSuggested", js.undefined)
    
    inline def setLeftOffsetSuggested(value: Boolean): Self = StObject.set(x, "leftOffsetSuggested", value.asInstanceOf[js.Any])
    
    inline def setLeftOffsetSuggestedUndefined: Self = StObject.set(x, "leftOffsetSuggested", js.undefined)
    
    inline def setTopOffsetSuggested(value: Boolean): Self = StObject.set(x, "topOffsetSuggested", value.asInstanceOf[js.Any])
    
    inline def setTopOffsetSuggestedUndefined: Self = StObject.set(x, "topOffsetSuggested", js.undefined)
  }
}
