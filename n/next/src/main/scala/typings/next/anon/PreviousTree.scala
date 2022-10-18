package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousTree extends StObject {
  
  var patchedTree: js.UndefOr[FlightRouterState] = js.undefined
  
  var previousTree: js.UndefOr[FlightRouterState] = js.undefined
}
object PreviousTree {
  
  inline def apply(): PreviousTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousTree]
  }
  
  extension [Self <: PreviousTree](x: Self) {
    
    inline def setPatchedTree(value: FlightRouterState): Self = StObject.set(x, "patchedTree", value.asInstanceOf[js.Any])
    
    inline def setPatchedTreeUndefined: Self = StObject.set(x, "patchedTree", js.undefined)
    
    inline def setPreviousTree(value: FlightRouterState): Self = StObject.set(x, "previousTree", value.asInstanceOf[js.Any])
    
    inline def setPreviousTreeUndefined: Self = StObject.set(x, "previousTree", js.undefined)
  }
}
