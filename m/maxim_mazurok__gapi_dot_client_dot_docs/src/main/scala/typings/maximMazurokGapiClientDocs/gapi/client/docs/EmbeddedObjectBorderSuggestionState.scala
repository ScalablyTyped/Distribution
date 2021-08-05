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
  
  inline def apply(): EmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbeddedObjectBorderSuggestionState]
  }
  
  extension [Self <: EmbeddedObjectBorderSuggestionState](x: Self) {
    
    inline def setColorSuggested(value: Boolean): Self = StObject.set(x, "colorSuggested", value.asInstanceOf[js.Any])
    
    inline def setColorSuggestedUndefined: Self = StObject.set(x, "colorSuggested", js.undefined)
    
    inline def setDashStyleSuggested(value: Boolean): Self = StObject.set(x, "dashStyleSuggested", value.asInstanceOf[js.Any])
    
    inline def setDashStyleSuggestedUndefined: Self = StObject.set(x, "dashStyleSuggested", js.undefined)
    
    inline def setPropertyStateSuggested(value: Boolean): Self = StObject.set(x, "propertyStateSuggested", value.asInstanceOf[js.Any])
    
    inline def setPropertyStateSuggestedUndefined: Self = StObject.set(x, "propertyStateSuggested", js.undefined)
    
    inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
