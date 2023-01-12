package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transfers extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def get(transactionId: String, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
}
object Transfers {
  
  inline def apply(
    create: (Any, Callback[Any]) => Unit,
    get: (String, Callback[Any]) => Unit,
    list: (Any, Callback[Any]) => Unit
  ): Transfers = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction2(list))
    __obj.asInstanceOf[Transfers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transfers] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
  }
}
