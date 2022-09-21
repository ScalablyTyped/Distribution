package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lister[T] extends StObject {
  
  def next(): js.Promise[js.Array[T]]
}
object Lister {
  
  inline def apply[T](next: () => js.Promise[js.Array[T]]): Lister[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Lister[T]]
  }
  
  extension [Self <: Lister[?], T](x: Self & Lister[T]) {
    
    inline def setNext(value: () => js.Promise[js.Array[T]]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
