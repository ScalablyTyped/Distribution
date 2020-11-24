package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TodoTaskList extends Entity {
  
  // The name of the task list.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  // The collection of open extensions defined for the task list. Nullable.
  var extensions: js.UndefOr[NullableOption[js.Array[Extension]]] = js.native
  
  // True if the user is owner of the given task list.
  var isOwner: js.UndefOr[Boolean] = js.native
  
  // True if the task list is shared with other users
  var isShared: js.UndefOr[Boolean] = js.native
  
  // The tasks in this task list. Read-only. Nullable.
  var tasks: js.UndefOr[NullableOption[js.Array[TodoTask]]] = js.native
  
  /**
    * Property indicating the list name if the given list is a well-known list. Possible values are: none, defaultList,
    * flaggedEmails, unknownFutureValue.
    */
  var wellknownListName: js.UndefOr[WellknownListName] = js.native
}
object TodoTaskList {
  
  @scala.inline
  def apply(): TodoTaskList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TodoTaskList]
  }
  
  @scala.inline
  implicit class TodoTaskListOps[Self <: TodoTaskList] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: NullableOption[String]): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setDisplayNameNull: Self = this.set("displayName", null)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
    
    @scala.inline
    def setIsOwner(value: Boolean): Self = this.set("isOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOwner: Self = this.set("isOwner", js.undefined)
    
    @scala.inline
    def setIsShared(value: Boolean): Self = this.set("isShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShared: Self = this.set("isShared", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: TodoTask*): Self = this.set("tasks", js.Array(value :_*))
    
    @scala.inline
    def setTasks(value: NullableOption[js.Array[TodoTask]]): Self = this.set("tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
    
    @scala.inline
    def setTasksNull: Self = this.set("tasks", null)
    
    @scala.inline
    def setWellknownListName(value: WellknownListName): Self = this.set("wellknownListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWellknownListName: Self = this.set("wellknownListName", js.undefined)
  }
}
