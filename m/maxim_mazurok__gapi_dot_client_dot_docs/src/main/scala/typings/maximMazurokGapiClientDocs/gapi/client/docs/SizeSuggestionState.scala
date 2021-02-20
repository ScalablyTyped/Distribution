package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeSuggestionState extends StObject {
  
  /** Indicates if there was a suggested change to height. */
  var heightSuggested: js.UndefOr[Boolean] = js.native
  
  /** Indicates if there was a suggested change to width. */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}
object SizeSuggestionState {
  
  @scala.inline
  def apply(): SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeSuggestionState]
  }
  
  @scala.inline
  implicit class SizeSuggestionStateMutableBuilder[Self <: SizeSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightSuggested(value: Boolean): Self = StObject.set(x, "heightSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightSuggestedUndefined: Self = StObject.set(x, "heightSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = StObject.set(x, "widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthSuggestedUndefined: Self = StObject.set(x, "widthSuggested", js.undefined)
  }
}
