package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KvRemove extends StObject {
  
  def remove(k: String): js.Promise[Unit]
}
object KvRemove {
  
  inline def apply(remove: String => js.Promise[Unit]): KvRemove = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[KvRemove]
  }
  
  extension [Self <: KvRemove](x: Self) {
    
    inline def setRemove(value: String => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
