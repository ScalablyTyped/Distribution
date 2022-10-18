package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var patchedTree: js.UndefOr[FlightRouterState] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setPatchedTree(value: FlightRouterState): Self = StObject.set(x, "patchedTree", value.asInstanceOf[js.Any])
    
    inline def setPatchedTreeUndefined: Self = StObject.set(x, "patchedTree", js.undefined)
  }
}
