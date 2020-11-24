package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITemporarySearchView extends js.Object {
  
  val BaseSearchConditions: ISearchConditions = js.native
  
  var SearchCriteria: ISearchCriteria = js.native
  
  val View: IView = js.native
}
object ITemporarySearchView {
  
  @scala.inline
  def apply(BaseSearchConditions: ISearchConditions, SearchCriteria: ISearchCriteria, View: IView): ITemporarySearchView = {
    val __obj = js.Dynamic.literal(BaseSearchConditions = BaseSearchConditions.asInstanceOf[js.Any], SearchCriteria = SearchCriteria.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemporarySearchView]
  }
  
  @scala.inline
  implicit class ITemporarySearchViewOps[Self <: ITemporarySearchView] (val x: Self) extends AnyVal {
    
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
    def setBaseSearchConditions(value: ISearchConditions): Self = this.set("BaseSearchConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCriteria(value: ISearchCriteria): Self = this.set("SearchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IView): Self = this.set("View", value.asInstanceOf[js.Any])
  }
}
