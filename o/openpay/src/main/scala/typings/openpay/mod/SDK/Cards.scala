package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cards extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(cardId: String, callback: Callback[Any]): Unit
  
  def get(cardId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
}
object Cards {
  
  inline def apply(
    create: (Any, Callback[Any]) => Unit,
    delete: (String, Callback[Any]) => Unit,
    get: (String, Callback[Any]) => Unit,
    list: (Any, Callback[Any]) => Unit
  ): Cards = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), list = js.Any.fromFunction2(list))
    __obj.asInstanceOf[Cards]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cards] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
  }
}
