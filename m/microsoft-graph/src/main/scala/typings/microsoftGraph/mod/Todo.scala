package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class TodoMutableBuilder[Self <: Todo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLists(value: NullableOption[js.Array[TodoTaskList]]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsNull: Self = StObject.set(x, "lists", null)
    
    @scala.inline
    def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    @scala.inline
    def setListsVarargs(value: TodoTaskList*): Self = StObject.set(x, "lists", js.Array(value :_*))
  }
}
