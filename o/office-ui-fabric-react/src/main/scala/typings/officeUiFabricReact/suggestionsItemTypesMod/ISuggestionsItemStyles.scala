package typings.officeUiFabricReact.suggestionsItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISuggestionsItemStyles extends js.Object {
  
  /** Refers to the remove button in case it's rendered. */
  var closeButton: IStyle = js.native
  
  /** Refers to the CommandButton holding the content of the suggested item. */
  var itemButton: IStyle = js.native
  
  /** Root element of the suggested item. */
  var root: IStyle = js.native
}
object ISuggestionsItemStyles {
  
  @scala.inline
  def apply(): ISuggestionsItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestionsItemStyles]
  }
  
  @scala.inline
  implicit class ISuggestionsItemStylesOps[Self <: ISuggestionsItemStyles] (val x: Self) extends AnyVal {
    
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
    def setCloseButton(value: IStyle): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setCloseButtonNull: Self = this.set("closeButton", null)
    
    @scala.inline
    def setItemButton(value: IStyle): Self = this.set("itemButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemButton: Self = this.set("itemButton", js.undefined)
    
    @scala.inline
    def setItemButtonNull: Self = this.set("itemButton", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
