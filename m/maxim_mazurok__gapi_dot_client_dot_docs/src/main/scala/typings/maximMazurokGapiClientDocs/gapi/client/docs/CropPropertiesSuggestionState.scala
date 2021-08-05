package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CropPropertiesSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to angle. */
  var angleSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to offset_bottom. */
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to offset_left. */
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to offset_right. */
  var offsetRightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to offset_top. */
  var offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
}
object CropPropertiesSuggestionState {
  
  inline def apply(): CropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropPropertiesSuggestionState]
  }
  
  extension [Self <: CropPropertiesSuggestionState](x: Self) {
    
    inline def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    inline def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    inline def setOffsetBottomSuggested(value: Boolean): Self = StObject.set(x, "offsetBottomSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetBottomSuggestedUndefined: Self = StObject.set(x, "offsetBottomSuggested", js.undefined)
    
    inline def setOffsetLeftSuggested(value: Boolean): Self = StObject.set(x, "offsetLeftSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftSuggestedUndefined: Self = StObject.set(x, "offsetLeftSuggested", js.undefined)
    
    inline def setOffsetRightSuggested(value: Boolean): Self = StObject.set(x, "offsetRightSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetRightSuggestedUndefined: Self = StObject.set(x, "offsetRightSuggested", js.undefined)
    
    inline def setOffsetTopSuggested(value: Boolean): Self = StObject.set(x, "offsetTopSuggested", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopSuggestedUndefined: Self = StObject.set(x, "offsetTopSuggested", js.undefined)
  }
}
