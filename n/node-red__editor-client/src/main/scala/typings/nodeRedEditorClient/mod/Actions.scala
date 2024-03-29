package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions extends StObject {
  
  def add(name: String, handler: js.Function0[Unit]): Unit
  
  def get(name: String): js.Function0[Unit]
  
  def invoke(name: String, args: Any): Unit
  
  def list(): js.Array[Id]
  
  def remove(name: String): Unit
}
object Actions {
  
  inline def apply(
    add: (String, js.Function0[Unit]) => Unit,
    get: String => js.Function0[Unit],
    invoke: (String, Any) => Unit,
    list: () => js.Array[Id],
    remove: String => Unit
  ): Actions = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), invoke = js.Any.fromFunction2(invoke), list = js.Any.fromFunction0(list), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[Actions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setGet(value: String => js.Function0[Unit]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setInvoke(value: (String, Any) => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
    
    inline def setList(value: () => js.Array[Id]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
