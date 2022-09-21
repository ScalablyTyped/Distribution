package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsCache extends StObject {
  
  var _key: Any
  
  def add(tag: Any, item: Any): Unit
  
  def addItem(item: Any): Unit
  
  def find(args: Any): js.Array[Any]
  
  def remove(tag: Any, item: Any): Unit
  
  def removeItem(item: Any): Unit
}
object TagsCache {
  
  inline def apply(
    _key: Any,
    add: (Any, Any) => Unit,
    addItem: Any => Unit,
    find: Any => js.Array[Any],
    remove: (Any, Any) => Unit,
    removeItem: Any => Unit
  ): TagsCache = {
    val __obj = js.Dynamic.literal(_key = _key.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), addItem = js.Any.fromFunction1(addItem), find = js.Any.fromFunction1(find), remove = js.Any.fromFunction2(remove), removeItem = js.Any.fromFunction1(removeItem))
    __obj.asInstanceOf[TagsCache]
  }
  
  extension [Self <: TagsCache](x: Self) {
    
    inline def setAdd(value: (Any, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setAddItem(value: Any => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
    
    inline def setFind(value: Any => js.Array[Any]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
    
    inline def setRemove(value: (Any, Any) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveItem(value: Any => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
    
    inline def set_key(value: Any): Self = StObject.set(x, "_key", value.asInstanceOf[js.Any])
  }
}
