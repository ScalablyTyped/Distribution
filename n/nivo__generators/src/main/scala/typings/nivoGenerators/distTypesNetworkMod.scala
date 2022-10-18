package typings.nivoGenerators

import typings.nivoGenerators.anon.LeafSize
import typings.nivoGenerators.anon.Links
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNetworkMod {
  
  @JSImport("@nivo/generators/dist/types/network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateNetworkData(): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")().asInstanceOf[Links]
  inline def generateNetworkData(hasRootSizeMidSizeLeafSizeMinMidNodesMaxMidNodesMinLeavesMaxLeaves: LeafSize): Links = ^.asInstanceOf[js.Dynamic].applyDynamic("generateNetworkData")(hasRootSizeMidSizeLeafSizeMinMidNodesMaxMidNodesMinLeavesMaxLeaves.asInstanceOf[js.Any]).asInstanceOf[Links]
  
  trait Link extends StObject {
    
    var distance: Double
    
    var source: String
    
    var target: String
  }
  object Link {
    
    inline def apply(distance: Double, source: String, target: String): Link = {
      val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
