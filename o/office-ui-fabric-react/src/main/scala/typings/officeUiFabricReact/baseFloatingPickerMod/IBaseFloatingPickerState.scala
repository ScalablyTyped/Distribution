package typings.officeUiFabricReact.baseFloatingPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseFloatingPickerState extends js.Object {
  
  var didBind: Boolean = js.native
  
  var queryString: String = js.native
  
  var suggestionsVisible: js.UndefOr[Boolean] = js.native
}
object IBaseFloatingPickerState {
  
  @scala.inline
  def apply(didBind: Boolean, queryString: String): IBaseFloatingPickerState = {
    val __obj = js.Dynamic.literal(didBind = didBind.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseFloatingPickerState]
  }
  
  @scala.inline
  implicit class IBaseFloatingPickerStateOps[Self <: IBaseFloatingPickerState] (val x: Self) extends AnyVal {
    
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
    def setDidBind(value: Boolean): Self = this.set("didBind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsVisible(value: Boolean): Self = this.set("suggestionsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestionsVisible: Self = this.set("suggestionsVisible", js.undefined)
  }
}
