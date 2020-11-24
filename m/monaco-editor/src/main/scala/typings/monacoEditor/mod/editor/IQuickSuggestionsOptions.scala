package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IQuickSuggestionsOptions extends js.Object {
  
  var comments: js.UndefOr[Boolean] = js.native
  
  var other: js.UndefOr[Boolean] = js.native
  
  var strings: js.UndefOr[Boolean] = js.native
}
object IQuickSuggestionsOptions {
  
  @scala.inline
  def apply(): IQuickSuggestionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IQuickSuggestionsOptions]
  }
  
  @scala.inline
  implicit class IQuickSuggestionsOptionsOps[Self <: IQuickSuggestionsOptions] (val x: Self) extends AnyVal {
    
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
    def setComments(value: Boolean): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setOther(value: Boolean): Self = this.set("other", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    
    @scala.inline
    def setStrings(value: Boolean): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
}
