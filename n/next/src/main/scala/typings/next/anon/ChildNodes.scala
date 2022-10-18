package typings.next.anon

import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.distSharedLibAppRouterContextMod.ChildSegmentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildNodes extends StObject {
  
  var childNodes: ChildSegmentMap
  
  var childProp: typings.next.distServerAppRenderMod.ChildProp | Null
  
  var isActive: Boolean
  
  var parallelRouterKey: String
  
  var path: String
  
  var rootLayoutIncluded: Boolean
  
  var segmentPath: typings.next.distServerAppRenderMod.FlightSegmentPath
  
  var tree: FlightRouterState
  
  var url: String
}
object ChildNodes {
  
  inline def apply(
    childNodes: ChildSegmentMap,
    isActive: Boolean,
    parallelRouterKey: String,
    path: String,
    rootLayoutIncluded: Boolean,
    segmentPath: typings.next.distServerAppRenderMod.FlightSegmentPath,
    tree: FlightRouterState,
    url: String
  ): ChildNodes = {
    val __obj = js.Dynamic.literal(childNodes = childNodes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], parallelRouterKey = parallelRouterKey.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootLayoutIncluded = rootLayoutIncluded.asInstanceOf[js.Any], segmentPath = segmentPath.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], childProp = null)
    __obj.asInstanceOf[ChildNodes]
  }
  
  extension [Self <: ChildNodes](x: Self) {
    
    inline def setChildNodes(value: ChildSegmentMap): Self = StObject.set(x, "childNodes", value.asInstanceOf[js.Any])
    
    inline def setChildProp(value: typings.next.distServerAppRenderMod.ChildProp): Self = StObject.set(x, "childProp", value.asInstanceOf[js.Any])
    
    inline def setChildPropNull: Self = StObject.set(x, "childProp", null)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setParallelRouterKey(value: String): Self = StObject.set(x, "parallelRouterKey", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRootLayoutIncluded(value: Boolean): Self = StObject.set(x, "rootLayoutIncluded", value.asInstanceOf[js.Any])
    
    inline def setSegmentPath(value: typings.next.distServerAppRenderMod.FlightSegmentPath): Self = StObject.set(x, "segmentPath", value.asInstanceOf[js.Any])
    
    inline def setSegmentPathVarargs(value: Any*): Self = StObject.set(x, "segmentPath", js.Array(value*))
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
