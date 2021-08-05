package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadingSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to the Shading. */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
}
object ShadingSuggestionState {
  
  inline def apply(): ShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadingSuggestionState]
  }
  
  extension [Self <: ShadingSuggestionState](x: Self) {
    
    inline def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
