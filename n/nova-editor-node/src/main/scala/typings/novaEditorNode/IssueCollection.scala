package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/issue-collection/
trait IssueCollection extends StObject {
  
  def append(uri: String, issues: js.Array[Issue]): Unit
  
  def clear(): Unit
  
  def dispose(): Unit
  
  def get(uri: String): js.Array[Issue]
  
  def has(uri: String): Boolean
  
  var name: String
  
  def remove(uri: String): Unit
  
  def set(uri: String, issues: js.Array[Issue]): Unit
}
object IssueCollection {
  
  @scala.inline
  def apply(
    append: (String, js.Array[Issue]) => Unit,
    clear: () => Unit,
    dispose: () => Unit,
    get: String => js.Array[Issue],
    has: String => Boolean,
    name: String,
    remove: String => Unit,
    set: (String, js.Array[Issue]) => Unit
  ): IssueCollection = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), dispose = js.Any.fromFunction0(dispose), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[IssueCollection]
  }
  
  @scala.inline
  implicit class IssueCollectionMutableBuilder[Self <: IssueCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: (String, js.Array[Issue]) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.Array[Issue]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (String, js.Array[Issue]) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
