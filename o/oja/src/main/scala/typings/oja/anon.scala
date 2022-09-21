package typings.oja

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Next extends StObject {
    
    def next(): js.Promise[Any]
  }
  object Next {
    
    inline def apply(next: () => js.Promise[Any]): Next = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(value: () => js.Promise[Any]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
}
