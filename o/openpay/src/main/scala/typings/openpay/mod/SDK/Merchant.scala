package typings.openpay.mod.SDK

import typings.openpay.mod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merchant extends StObject {
  
  def get(callback: Callback[Any]): Unit
}
object Merchant {
  
  inline def apply(get: Callback[Any] => Unit): Merchant = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Merchant]
  }
  
  extension [Self <: Merchant](x: Self) {
    
    inline def setGet(value: Callback[Any] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
