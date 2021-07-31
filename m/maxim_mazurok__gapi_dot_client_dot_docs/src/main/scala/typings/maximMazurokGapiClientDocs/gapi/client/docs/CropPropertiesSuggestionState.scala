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
  
  @scala.inline
  def apply(): CropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropPropertiesSuggestionState]
  }
  
  @scala.inline
  implicit class CropPropertiesSuggestionStateMutableBuilder[Self <: CropPropertiesSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleSuggested(value: Boolean): Self = StObject.set(x, "angleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleSuggestedUndefined: Self = StObject.set(x, "angleSuggested", js.undefined)
    
    @scala.inline
    def setOffsetBottomSuggested(value: Boolean): Self = StObject.set(x, "offsetBottomSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetBottomSuggestedUndefined: Self = StObject.set(x, "offsetBottomSuggested", js.undefined)
    
    @scala.inline
    def setOffsetLeftSuggested(value: Boolean): Self = StObject.set(x, "offsetLeftSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeftSuggestedUndefined: Self = StObject.set(x, "offsetLeftSuggested", js.undefined)
    
    @scala.inline
    def setOffsetRightSuggested(value: Boolean): Self = StObject.set(x, "offsetRightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetRightSuggestedUndefined: Self = StObject.set(x, "offsetRightSuggested", js.undefined)
    
    @scala.inline
    def setOffsetTopSuggested(value: Boolean): Self = StObject.set(x, "offsetTopSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTopSuggestedUndefined: Self = StObject.set(x, "offsetTopSuggested", js.undefined)
  }
}
