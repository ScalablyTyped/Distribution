package typings.officeUiFabricReact.baseExtendedPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseExtendedPickerState[T] extends js.Object {
  
  var queryString: String | Null = js.native
  
  var selectedItems: js.Array[T] | Null = js.native
  
  var suggestionItems: js.Array[T] | Null = js.native
}
object IBaseExtendedPickerState {
  
  @scala.inline
  def apply[T](): IBaseExtendedPickerState[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseExtendedPickerState[T]]
  }
  
  @scala.inline
  implicit class IBaseExtendedPickerStateOps[Self <: IBaseExtendedPickerState[_], T] (val x: Self with IBaseExtendedPickerState[T]) extends AnyVal {
    
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
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringNull: Self = this.set("queryString", null)
    
    @scala.inline
    def setSelectedItemsVarargs(value: T*): Self = this.set("selectedItems", js.Array(value :_*))
    
    @scala.inline
    def setSelectedItems(value: js.Array[T]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItemsNull: Self = this.set("selectedItems", null)
    
    @scala.inline
    def setSuggestionItemsVarargs(value: T*): Self = this.set("suggestionItems", js.Array(value :_*))
    
    @scala.inline
    def setSuggestionItems(value: js.Array[T]): Self = this.set("suggestionItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionItemsNull: Self = this.set("suggestionItems", null)
  }
}
