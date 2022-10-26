package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTree extends StObject {
  
  var assetPrefix: js.UndefOr[String] = js.undefined
  
  def getTree(): FlightRouterState
}
object GetTree {
  
  inline def apply(getTree: () => FlightRouterState): GetTree = {
    val __obj = js.Dynamic.literal(getTree = js.Any.fromFunction0(getTree))
    __obj.asInstanceOf[GetTree]
  }
  
  extension [Self <: GetTree](x: Self) {
    
    inline def setAssetPrefix(value: String): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
    
    inline def setAssetPrefixUndefined: Self = StObject.set(x, "assetPrefix", js.undefined)
    
    inline def setGetTree(value: () => FlightRouterState): Self = StObject.set(x, "getTree", js.Any.fromFunction0(value))
  }
}
