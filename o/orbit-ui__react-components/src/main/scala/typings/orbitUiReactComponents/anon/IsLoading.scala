package typings.orbitUiReactComponents.anon

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLoading[T] extends StObject {
  
  var isLoading: Boolean
  
  var items: js.Array[T]
  
  def search(event: SyntheticEvent[Element, Event], query: String): js.Promise[Unit]
}
object IsLoading {
  
  inline def apply[T](
    isLoading: Boolean,
    items: js.Array[T],
    search: (SyntheticEvent[Element, Event], String) => js.Promise[Unit]
  ): IsLoading[T] = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], search = js.Any.fromFunction2(search))
    __obj.asInstanceOf[IsLoading[T]]
  }
  
  extension [Self <: IsLoading[?], T](x: Self & IsLoading[T]) {
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSearch(value: (SyntheticEvent[Element, Event], String) => js.Promise[Unit]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
  }
}
