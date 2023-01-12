package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to height. */
  var heightSuggested: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if there was a suggested change to width. */
  var widthSuggested: js.UndefOr[Boolean] = js.undefined
}
object SizeSuggestionState {
  
  inline def apply(): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSuggestionState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeSuggestionState] (val x: Self) extends AnyVal {
    
    inline def setHeightSuggested(value: Boolean): Self = StObject.set(x, "heightSuggested", value.asInstanceOf[js.Any])
    
    inline def setHeightSuggestedUndefined: Self = StObject.set(x, "heightSuggested", js.undefined)
    
    inline def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    inline def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
