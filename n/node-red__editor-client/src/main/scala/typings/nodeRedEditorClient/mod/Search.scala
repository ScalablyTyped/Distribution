package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Search extends StObject {
  
  def hide(): Unit
  
  def init(): Unit
  
  def search(`val`: String): js.Array[js.Object]
  
  def show(v: String): Unit
}
object Search {
  
  inline def apply(hide: () => Unit, init: () => Unit, search: String => js.Array[js.Object], show: String => Unit): Search = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), search = js.Any.fromFunction1(search), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[Search]
  }
  
  extension [Self <: Search](x: Self) {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setSearch(value: String => js.Array[js.Object]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setShow(value: String => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
