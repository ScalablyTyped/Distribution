package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Webhooks extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def delete(webhook_id: String, callback: Callback[Any]): Unit
  
  def get(webhook_id: String, callback: Callback[Any]): Unit
  
  def list(callback: Callback[Any]): Unit
  
  def verify(webhook_id: String, verification_code: String, callback: Callback[Any]): Unit
}
object Webhooks {
  
  inline def apply(
    create: (Any, Callback[Any]) => Unit,
    delete: (String, Callback[Any]) => Unit,
    get: (String, Callback[Any]) => Unit,
    list: Callback[Any] => Unit,
    verify: (String, String, Callback[Any]) => Unit
  ): Webhooks = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), verify = js.Any.fromFunction3(verify))
    __obj.asInstanceOf[Webhooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Webhooks] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setDelete(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction2(value))
    
    inline def setGet(value: (String, Callback[Any]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setList(value: Callback[Any] => Unit): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
    
    inline def setVerify(value: (String, String, Callback[Any]) => Unit): Self = StObject.set(x, "verify", js.Any.fromFunction3(value))
  }
}
