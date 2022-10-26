package typings.next.anon

import typings.next.distClientComponentsReactDevOverlayInternalErrorOverlayReducerMod.OverlayState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var children: ReactNode
  
  var state: OverlayState
}
object State {
  
  inline def apply(state: OverlayState): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setState(value: OverlayState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
