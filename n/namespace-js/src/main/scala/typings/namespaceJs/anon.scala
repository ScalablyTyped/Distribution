package typings.namespaceJs

import typings.namespaceJs.mod.NamespaceJs.UserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Provide extends StObject {
    
    // eslint-disable-next-line no-unnecessary-generics
    def provide[U /* <: UserObject */](obj: U): Unit
  }
  object Provide {
    
    inline def apply(provide: Any => Unit): Provide = {
      val __obj = js.Dynamic.literal(provide = js.Any.fromFunction1(provide))
      __obj.asInstanceOf[Provide]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Provide] (val x: Self) extends AnyVal {
      
      inline def setProvide(value: Any => Unit): Self = StObject.set(x, "provide", js.Any.fromFunction1(value))
    }
  }
}
