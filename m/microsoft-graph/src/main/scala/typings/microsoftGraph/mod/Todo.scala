package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Todo
  extends StObject
     with Entity {
  
  // The task lists in the users mailbox.
  var lists: js.UndefOr[NullableOption[js.Array[TodoTaskList]]] = js.undefined
}
object Todo {
  
  inline def apply(): Todo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Todo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Todo] (val x: Self) extends AnyVal {
    
    inline def setLists(value: NullableOption[js.Array[TodoTaskList]]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    inline def setListsNull: Self = StObject.set(x, "lists", null)
    
    inline def setListsUndefined: Self = StObject.set(x, "lists", js.undefined)
    
    inline def setListsVarargs(value: TodoTaskList*): Self = StObject.set(x, "lists", js.Array(value*))
  }
}
