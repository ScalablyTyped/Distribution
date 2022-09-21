package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fees extends StObject {
  
  def create(data: Any, callback: Callback[Any]): Unit
  
  def list(data: Any, callback: Callback[Any]): Unit
}
object Fees {
  
  inline def apply(create: (Any, Callback[Any]) => Unit, list: (Any, Callback[Any]) => Unit): Fees = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), list = js.Any.fromFunction2(list))
    __obj.asInstanceOf[Fees]
  }
  
  extension [Self <: Fees](x: Self) {
    
    inline def setCreate(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setList(value: (Any, Callback[Any]) => Unit): Self = StObject.set(x, "list", js.Any.fromFunction2(value))
  }
}
