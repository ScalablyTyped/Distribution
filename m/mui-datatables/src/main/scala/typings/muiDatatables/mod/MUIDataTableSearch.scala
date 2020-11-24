package typings.muiDatatables.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MUIDataTableSearch extends js.Object {
  
  var classes: js.UndefOr[js.Object] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var onSearch: js.UndefOr[js.Function1[/* args */ js.Any, _]] = js.native
  
  var options: js.UndefOr[MUIDataTableOptions] = js.native
  
  var searchText: js.UndefOr[String] = js.native
}
object MUIDataTableSearch {
  
  @scala.inline
  def apply(): MUIDataTableSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUIDataTableSearch]
  }
  
  @scala.inline
  implicit class MUIDataTableSearchOps[Self <: MUIDataTableSearch] (val x: Self) extends AnyVal {
    
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
    def setClasses(value: js.Object): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* args */ js.Any => _): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnSearch(value: /* args */ js.Any => _): Self = this.set("onSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    
    @scala.inline
    def setOptions(value: MUIDataTableOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
  }
}
