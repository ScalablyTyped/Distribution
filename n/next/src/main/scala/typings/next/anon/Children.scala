package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: ReactNode
  
  var hotReloader: js.UndefOr[ReactNode] = js.undefined
  
  var initialCanonicalUrl: String
  
  var initialTree: FlightRouterState
}
object Children {
  
  inline def apply(initialCanonicalUrl: String, initialTree: FlightRouterState): Children = {
    val __obj = js.Dynamic.literal(initialCanonicalUrl = initialCanonicalUrl.asInstanceOf[js.Any], initialTree = initialTree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHotReloader(value: ReactNode): Self = StObject.set(x, "hotReloader", value.asInstanceOf[js.Any])
    
    inline def setHotReloaderUndefined: Self = StObject.set(x, "hotReloader", js.undefined)
    
    inline def setInitialCanonicalUrl(value: String): Self = StObject.set(x, "initialCanonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setInitialTree(value: FlightRouterState): Self = StObject.set(x, "initialTree", value.asInstanceOf[js.Any])
  }
}
