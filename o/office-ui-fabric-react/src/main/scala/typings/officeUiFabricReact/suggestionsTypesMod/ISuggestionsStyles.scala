package typings.officeUiFabricReact.suggestionsTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestionsStyles extends js.Object {
  
  /** Refers to the 'Force resolve' actionButton. */
  var forceResolveButton: IStyle = js.native
  
  /** Refers to the text rendered when no suggestions are found. */
  var noSuggestions: IStyle = js.native
  
  /** Root element of the suggestions outer wrapper. */
  var root: IStyle = js.native
  
  /** Refers to the 'Search for more' actionButton. */
  var searchForMoreButton: IStyle = js.native
  
  /** SubComponents (Spinner) styles. */
  var subComponentStyles: ISuggestionsSubComponentStyles = js.native
  
  /** Refers to the text displaying if more suggestions available. */
  var suggestionsAvailable: IStyle = js.native
  
  /** Refers to the suggestions container. */
  var suggestionsContainer: IStyle = js.native
  
  /** Refers to the title rendered for suggestions container header and/or footer (if provided). */
  var title: IStyle = js.native
}
object ISuggestionsStyles {
  
  @scala.inline
  def apply(subComponentStyles: ISuggestionsSubComponentStyles): ISuggestionsStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsStyles]
  }
  
  @scala.inline
  implicit class ISuggestionsStylesOps[Self <: ISuggestionsStyles] (val x: Self) extends AnyVal {
    
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
    def setSubComponentStyles(value: ISuggestionsSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceResolveButton(value: IStyle): Self = this.set("forceResolveButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceResolveButton: Self = this.set("forceResolveButton", js.undefined)
    
    @scala.inline
    def setForceResolveButtonNull: Self = this.set("forceResolveButton", null)
    
    @scala.inline
    def setNoSuggestions(value: IStyle): Self = this.set("noSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoSuggestions: Self = this.set("noSuggestions", js.undefined)
    
    @scala.inline
    def setNoSuggestionsNull: Self = this.set("noSuggestions", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setSearchForMoreButton(value: IStyle): Self = this.set("searchForMoreButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchForMoreButton: Self = this.set("searchForMoreButton", js.undefined)
    
    @scala.inline
    def setSearchForMoreButtonNull: Self = this.set("searchForMoreButton", null)
    
    @scala.inline
    def setSuggestionsAvailable(value: IStyle): Self = this.set("suggestionsAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsAvailable: Self = this.set("suggestionsAvailable", js.undefined)
    
    @scala.inline
    def setSuggestionsAvailableNull: Self = this.set("suggestionsAvailable", null)
    
    @scala.inline
    def setSuggestionsContainer(value: IStyle): Self = this.set("suggestionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsContainer: Self = this.set("suggestionsContainer", js.undefined)
    
    @scala.inline
    def setSuggestionsContainerNull: Self = this.set("suggestionsContainer", null)
    
    @scala.inline
    def setTitle(value: IStyle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleNull: Self = this.set("title", null)
  }
}
