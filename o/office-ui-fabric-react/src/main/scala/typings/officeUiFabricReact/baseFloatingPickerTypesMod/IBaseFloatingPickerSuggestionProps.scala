package typings.officeUiFabricReact.baseFloatingPickerTypesMod

import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/FloatingPicker/Suggestions/Suggestions.types.ISuggestionsControlProps<any>, 'shouldSelectFirstItem' | 'headerItemsProps' | 'footerItemsProps' | 'showRemoveButtons'> */
@js.native
trait IBaseFloatingPickerSuggestionProps extends js.Object {
  
  var footerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  
  var headerItemsProps: js.UndefOr[js.Array[ISuggestionsHeaderFooterProps]] = js.native
  
  var shouldSelectFirstItem: js.UndefOr[js.Function0[Boolean]] = js.native
  
  var showRemoveButtons: js.UndefOr[Boolean] = js.native
}
object IBaseFloatingPickerSuggestionProps {
  
  @scala.inline
  def apply(): IBaseFloatingPickerSuggestionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseFloatingPickerSuggestionProps]
  }
  
  @scala.inline
  implicit class IBaseFloatingPickerSuggestionPropsOps[Self <: IBaseFloatingPickerSuggestionProps] (val x: Self) extends AnyVal {
    
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
    def setFooterItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): Self = this.set("footerItemsProps", js.Array(value :_*))
    
    @scala.inline
    def setFooterItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = this.set("footerItemsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterItemsProps: Self = this.set("footerItemsProps", js.undefined)
    
    @scala.inline
    def setHeaderItemsPropsVarargs(value: ISuggestionsHeaderFooterProps*): Self = this.set("headerItemsProps", js.Array(value :_*))
    
    @scala.inline
    def setHeaderItemsProps(value: js.Array[ISuggestionsHeaderFooterProps]): Self = this.set("headerItemsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderItemsProps: Self = this.set("headerItemsProps", js.undefined)
    
    @scala.inline
    def setShouldSelectFirstItem(value: () => Boolean): Self = this.set("shouldSelectFirstItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShouldSelectFirstItem: Self = this.set("shouldSelectFirstItem", js.undefined)
    
    @scala.inline
    def setShowRemoveButtons(value: Boolean): Self = this.set("showRemoveButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRemoveButtons: Self = this.set("showRemoveButtons", js.undefined)
  }
}
