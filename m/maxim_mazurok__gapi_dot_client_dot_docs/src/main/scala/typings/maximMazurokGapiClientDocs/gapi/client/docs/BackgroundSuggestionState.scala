package typings.maximMazurokGapiClientDocs.gapi.client.docs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundSuggestionState extends js.Object {
  
  /** Indicates whether the current background color has been modified in this suggestion. */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}
object BackgroundSuggestionState {
  
  @scala.inline
  def apply(): BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundSuggestionState]
  }
  
  @scala.inline
  implicit class BackgroundSuggestionStateOps[Self <: BackgroundSuggestionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackgroundColorSuggested(value: Boolean): Self = this.set("backgroundColorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorSuggested: Self = this.set("backgroundColorSuggested", js.undefined)
  }
}
