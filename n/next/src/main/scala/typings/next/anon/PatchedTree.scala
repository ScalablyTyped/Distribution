package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.nextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchedTree extends StObject {
  
  var patchedTree: js.UndefOr[FlightRouterState] = js.undefined
  
  var previousTree: js.UndefOr[FlightRouterState] = js.undefined
  
  var useExistingCache: js.UndefOr[`true`] = js.undefined
}
object PatchedTree {
  
  inline def apply(): PatchedTree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchedTree]
  }
  
  extension [Self <: PatchedTree](x: Self) {
    
    inline def setPatchedTree(value: FlightRouterState): Self = StObject.set(x, "patchedTree", value.asInstanceOf[js.Any])
    
    inline def setPatchedTreeUndefined: Self = StObject.set(x, "patchedTree", js.undefined)
    
    inline def setPreviousTree(value: FlightRouterState): Self = StObject.set(x, "previousTree", value.asInstanceOf[js.Any])
    
    inline def setPreviousTreeUndefined: Self = StObject.set(x, "previousTree", js.undefined)
    
    inline def setUseExistingCache(value: `true`): Self = StObject.set(x, "useExistingCache", value.asInstanceOf[js.Any])
    
    inline def setUseExistingCacheUndefined: Self = StObject.set(x, "useExistingCache", js.undefined)
  }
}
