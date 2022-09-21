package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeafSize extends StObject {
  
  var leafSize: js.UndefOr[Double] = js.undefined
  
  var maxLeaves: js.UndefOr[Double] = js.undefined
  
  var maxMidNodes: js.UndefOr[Double] = js.undefined
  
  var midSize: js.UndefOr[Double] = js.undefined
  
  var minLeaves: js.UndefOr[Double] = js.undefined
  
  var minMidNodes: js.UndefOr[Double] = js.undefined
  
  var rootSize: js.UndefOr[Double] = js.undefined
}
object LeafSize {
  
  inline def apply(): LeafSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafSize]
  }
  
  extension [Self <: LeafSize](x: Self) {
    
    inline def setLeafSize(value: Double): Self = StObject.set(x, "leafSize", value.asInstanceOf[js.Any])
    
    inline def setLeafSizeUndefined: Self = StObject.set(x, "leafSize", js.undefined)
    
    inline def setMaxLeaves(value: Double): Self = StObject.set(x, "maxLeaves", value.asInstanceOf[js.Any])
    
    inline def setMaxLeavesUndefined: Self = StObject.set(x, "maxLeaves", js.undefined)
    
    inline def setMaxMidNodes(value: Double): Self = StObject.set(x, "maxMidNodes", value.asInstanceOf[js.Any])
    
    inline def setMaxMidNodesUndefined: Self = StObject.set(x, "maxMidNodes", js.undefined)
    
    inline def setMidSize(value: Double): Self = StObject.set(x, "midSize", value.asInstanceOf[js.Any])
    
    inline def setMidSizeUndefined: Self = StObject.set(x, "midSize", js.undefined)
    
    inline def setMinLeaves(value: Double): Self = StObject.set(x, "minLeaves", value.asInstanceOf[js.Any])
    
    inline def setMinLeavesUndefined: Self = StObject.set(x, "minLeaves", js.undefined)
    
    inline def setMinMidNodes(value: Double): Self = StObject.set(x, "minMidNodes", value.asInstanceOf[js.Any])
    
    inline def setMinMidNodesUndefined: Self = StObject.set(x, "minMidNodes", js.undefined)
    
    inline def setRootSize(value: Double): Self = StObject.set(x, "rootSize", value.asInstanceOf[js.Any])
    
    inline def setRootSizeUndefined: Self = StObject.set(x, "rootSize", js.undefined)
  }
}
