package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TodoTaskListMutableBuilder[Self <: TodoTaskList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setExtensions(value: NullableOption[js.Array[Extension]]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsNull: Self = StObject.set(x, "extensions", null)
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setExtensionsVarargs(value: Extension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setIsOwner(value: Boolean): Self = StObject.set(x, "isOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwnerUndefined: Self = StObject.set(x, "isOwner", js.undefined)
    
    @scala.inline
    def setIsShared(value: Boolean): Self = StObject.set(x, "isShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharedUndefined: Self = StObject.set(x, "isShared", js.undefined)
    
    @scala.inline
    def setTasks(value: NullableOption[js.Array[TodoTask]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: TodoTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    
    @scala.inline
    def setWellknownListName(value: WellknownListName): Self = StObject.set(x, "wellknownListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWellknownListNameUndefined: Self = StObject.set(x, "wellknownListName", js.undefined)
  }
}
