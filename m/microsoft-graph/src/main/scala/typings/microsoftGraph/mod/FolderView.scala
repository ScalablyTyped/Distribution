package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderView extends js.Object {
  
  // The method by which the folder should be sorted.
  var sortBy: js.UndefOr[NullableOption[String]] = js.native
  
  // If true, indicates that items should be sorted in descending order. Otherwise, items should be sorted ascending.
  var sortOrder: js.UndefOr[NullableOption[String]] = js.native
  
  // The type of view that should be used to represent the folder.
  var viewType: js.UndefOr[NullableOption[String]] = js.native
}
object FolderView {
  
  @scala.inline
  def apply(): FolderView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderView]
  }
  
  @scala.inline
  implicit class FolderViewOps[Self <: FolderView] (val x: Self) extends AnyVal {
    
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
    def setSortBy(value: NullableOption[String]): Self = this.set("sortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("sortBy", js.undefined)
    
    @scala.inline
    def setSortByNull: Self = this.set("sortBy", null)
    
    @scala.inline
    def setSortOrder(value: NullableOption[String]): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
    
    @scala.inline
    def setSortOrderNull: Self = this.set("sortOrder", null)
    
    @scala.inline
    def setViewType(value: NullableOption[String]): Self = this.set("viewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewType: Self = this.set("viewType", js.undefined)
    
    @scala.inline
    def setViewTypeNull: Self = this.set("viewType", null)
  }
}
