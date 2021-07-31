package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundSuggestionState extends StObject {
  
  /** Indicates whether the current background color has been modified in this suggestion. */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined
}
object BackgroundSuggestionState {
  
  @scala.inline
  def apply(): BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSuggestionState]
  }
  
  @scala.inline
  implicit class BackgroundSuggestionStateMutableBuilder[Self <: BackgroundSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = StObject.set(x, "backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorSuggestedUndefined: Self = StObject.set(x, "backgroundColorSuggested", js.undefined)
  }
}
