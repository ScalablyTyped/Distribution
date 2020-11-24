package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Todo extends Entity {
  
  // The task lists in the users mailbox.
  var lists: js.UndefOr[NullableOption[js.Array[TodoTaskList]]] = js.native
}
object Todo {
  
  @scala.inline
  def apply(): Todo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Todo]
  }
  
  @scala.inline
  implicit class TodoOps[Self <: Todo] (val x: Self) extends AnyVal {
    
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
    def setListsVarargs(value: TodoTaskList*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: NullableOption[js.Array[TodoTaskList]]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLists: Self = this.set("lists", js.undefined)
    
    @scala.inline
    def setListsNull: Self = this.set("lists", null)
  }
}
