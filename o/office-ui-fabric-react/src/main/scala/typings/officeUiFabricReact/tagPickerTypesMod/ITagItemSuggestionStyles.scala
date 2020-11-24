package typings.officeUiFabricReact.tagPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITagItemSuggestionStyles extends js.Object {
  
  /** Refers to the text element of the TagItemSuggestion */
  var suggestionTextOverflow: js.UndefOr[IStyle] = js.native
}
object ITagItemSuggestionStyles {
  
  @scala.inline
  def apply(): ITagItemSuggestionStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagItemSuggestionStyles]
  }
  
  @scala.inline
  implicit class ITagItemSuggestionStylesOps[Self <: ITagItemSuggestionStyles] (val x: Self) extends AnyVal {
    
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
    def setSuggestionTextOverflow(value: IStyle): Self = this.set("suggestionTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionTextOverflow: Self = this.set("suggestionTextOverflow", js.undefined)
    
    @scala.inline
    def setSuggestionTextOverflowNull: Self = this.set("suggestionTextOverflow", null)
  }
}
