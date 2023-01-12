package typings.minappEnv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Proxy[T /* <: js.Object */] extends StObject {
  
  var proxy: T
  
  def revoke(): Unit
}
object Proxy {
  
  inline def apply[T /* <: js.Object */](proxy: T, revoke: () => Unit): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
    __obj.asInstanceOf[Proxy[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Proxy[?], T /* <: js.Object */] (val x: Self & Proxy[T]) extends AnyVal {
    
    inline def setProxy(value: T): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setRevoke(value: () => Unit): Self = StObject.set(x, "revoke", js.Any.fromFunction0(value))
  }
}
