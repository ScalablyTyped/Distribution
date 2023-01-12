package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plans extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(planId: String, callback: Callback[Any]): Unit
  
  def get(planId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
  
  def listSubscriptions(planId: String, data: Any, callback: Callback[Any]): Unit
  
  def update(planId: String, data: Any, callback: Callback[Any]): Unit
}
object Plans {
  
  inline def apply(
    create: (Any, Callback[Any]) => Unit,
    delete: (String, Callback[Any]) => Unit,
    get: (String, Callback[Any]) => Unit,
    list: (Any, Callback[Any]) => Unit,
    listSubscriptions: (String, Any, Callback[Any]) => Unit,
    update: (String, Any, Callback[Any]) => Unit
  ): Plans = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), list = js.Any.fromFunction2(list), listSubscriptions = js.Any.fromFunction3(listSubscriptions), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[Plans]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Plans] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
    
    inline def setListSubscriptions(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "listSubscriptions", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (String, Any, Callback[Any]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
