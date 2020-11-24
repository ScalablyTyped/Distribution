package typings.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NotebookCollection object, for use in "notebookCollection.set({ ... })". */
@js.native
trait NotebookCollectionUpdateData extends js.Object {
  
  var items: js.UndefOr[js.Array[NotebookData]] = js.native
}
object NotebookCollectionUpdateData {
  
  @scala.inline
  def apply(): NotebookCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookCollectionUpdateData]
  }
  
  @scala.inline
  implicit class NotebookCollectionUpdateDataOps[Self <: NotebookCollectionUpdateData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: NotebookData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[NotebookData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
