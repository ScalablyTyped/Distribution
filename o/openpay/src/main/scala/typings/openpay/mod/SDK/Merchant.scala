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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Merchant] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Callback[Any] => Unit): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
