package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  def next(): js.Promise[Done | Value | DoneValue]
}
object Next {
  
  inline def apply(next: () => js.Promise[Done | Value | DoneValue]): Next = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[Next]
  }
  
  extension [Self <: Next](x: Self) {
    
    inline def setNext(value: () => js.Promise[Done | Value | DoneValue]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
  }
}
