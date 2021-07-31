package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedObjectBorderSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to color. */
  var colorSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to dash_style. */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to property_state. */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to width. */
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}
object EmbeddedObjectBorderSuggestionState {
  
  @scala.inline
  def apply(): EmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
  }
  
  @scala.inline
  implicit class EmbeddedObjectBorderSuggestionStateMutableBuilder[Self <: EmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSuggested(value: Boolean): Self = StObject.set(x, "colorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSuggestedUndefined: Self = StObject.set(x, "colorSuggested", js.undefined)
    
    @scala.inline
    def setDashStyleSuggested(value: Boolean): Self = StObject.set(x, "dashStyleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashStyleSuggestedUndefined: Self = StObject.set(x, "dashStyleSuggested", js.undefined)
    
    @scala.inline
    def setPropertyStateSuggested(value: Boolean): Self = StObject.set(x, "propertyStateSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyStateSuggestedUndefined: Self = StObject.set(x, "propertyStateSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
