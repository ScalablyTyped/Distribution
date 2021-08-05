package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundSuggestionState extends StObject {
  
  /** Indicates whether the current background color has been modified in this suggestion. */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
}
object BackgroundSuggestionState {
  
  inline def apply(): BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSuggestionState]
  }
  
  extension [Self <: BackgroundSuggestionState](x: Self) {
    
    inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
