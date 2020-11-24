package typings.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterOptions extends js.Object {
  
  var filterText: js.UndefOr[String] = js.native
  
  var useExternalFilter: js.UndefOr[Boolean] = js.native
}
object IFilterOptions {
  
  @scala.inline
  def apply(): IFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterOptions]
  }
  
  @scala.inline
  implicit class IFilterOptionsOps[Self <: IFilterOptions] (val x: Self) extends AnyVal {
    
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
    def setFilterText(value: String): Self = this.set("filterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterText: Self = this.set("filterText", js.undefined)
    
    @scala.inline
    def setUseExternalFilter(value: Boolean): Self = this.set("useExternalFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseExternalFilter: Self = this.set("useExternalFilter", js.undefined)
  }
}
