package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanonicalUrlOverrideMpaNavigation extends StObject {
  
  var canonicalUrlOverride: js.UndefOr[String] = js.undefined
  
  var mpaNavigation: js.UndefOr[Boolean] = js.undefined
  
  var patchedTree: js.UndefOr[FlightRouterState] = js.undefined
}
object CanonicalUrlOverrideMpaNavigation {
  
  inline def apply(): CanonicalUrlOverrideMpaNavigation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanonicalUrlOverrideMpaNavigation]
  }
  
  extension [Self <: CanonicalUrlOverrideMpaNavigation](x: Self) {
    
    inline def setCanonicalUrlOverride(value: String): Self = StObject.set(x, "canonicalUrlOverride", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlOverrideUndefined: Self = StObject.set(x, "canonicalUrlOverride", js.undefined)
    
    inline def setMpaNavigation(value: Boolean): Self = StObject.set(x, "mpaNavigation", value.asInstanceOf[js.Any])
    
    inline def setMpaNavigationUndefined: Self = StObject.set(x, "mpaNavigation", js.undefined)
    
    inline def setPatchedTree(value: FlightRouterState): Self = StObject.set(x, "patchedTree", value.asInstanceOf[js.Any])
    
    inline def setPatchedTreeUndefined: Self = StObject.set(x, "patchedTree", js.undefined)
  }
}
