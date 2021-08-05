package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulletSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to the list_id. */
  var listIdSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to the nesting_level. */
  var nestingLevelSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** A mask that indicates which of the fields in text style have been changed in this suggestion. */
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.undefined
}
object BulletSuggestionState {
  
  inline def apply(): BulletSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulletSuggestionState]
  }
  
  extension [Self <: BulletSuggestionState](x: Self) {
    
    inline def setListIdSuggested(value: Boolean): Self = StObject.set(x, "listIdSuggested", value.asInstanceOf[js.Any])
    
    inline def setListIdSuggestedUndefined: Self = StObject.set(x, "listIdSuggested", js.undefined)
    
    inline def setNestingLevelSuggested(value: Boolean): Self = StObject.set(x, "nestingLevelSuggested", value.asInstanceOf[js.Any])
    
    inline def setNestingLevelSuggestedUndefined: Self = StObject.set(x, "nestingLevelSuggested", js.undefined)
    
    inline def setTextStyleSuggestionState(value: TextStyleSuggestionState): Self = StObject.set(x, "textStyleSuggestionState", value.asInstanceOf[js.Any])
    
    inline def setTextStyleSuggestionStateUndefined: Self = StObject.set(x, "textStyleSuggestionState", js.undefined)
  }
}
