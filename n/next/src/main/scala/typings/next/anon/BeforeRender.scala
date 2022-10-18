package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeRender extends StObject {
  
  var beforeRender: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object BeforeRender {
  
  inline def apply(): BeforeRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeforeRender]
  }
  
  extension [Self <: BeforeRender](x: Self) {
    
    inline def setBeforeRender(value: () => js.Promise[Unit]): Self = StObject.set(x, "beforeRender", js.Any.fromFunction0(value))
    
    inline def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
  }
}
