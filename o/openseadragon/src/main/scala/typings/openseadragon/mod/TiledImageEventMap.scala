package typings.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TiledImageEventMap extends StObject {
  
  var `bounds-change`: TiledImageEvent
  
  var `clip-change`: TiledImageEvent
  
  var `composite-operation-change`: CompositeOperationChangeTiledImageEvent
  
  var `fully-loaded-change`: FullyLoadedChangeTiledImageEvent
  
  var `opacity-change`: OpacityChangeTiledImageEvent
}
object TiledImageEventMap {
  
  inline def apply(
    `bounds-change`: TiledImageEvent,
    `clip-change`: TiledImageEvent,
    `composite-operation-change`: CompositeOperationChangeTiledImageEvent,
    `fully-loaded-change`: FullyLoadedChangeTiledImageEvent,
    `opacity-change`: OpacityChangeTiledImageEvent
  ): TiledImageEventMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds-change")(`bounds-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("clip-change")(`clip-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("composite-operation-change")(`composite-operation-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("fully-loaded-change")(`fully-loaded-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("opacity-change")(`opacity-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledImageEventMap]
  }
  
  extension [Self <: TiledImageEventMap](x: Self) {
    
    inline def `setBounds-change`(value: TiledImageEvent): Self = StObject.set(x, "bounds-change", value.asInstanceOf[js.Any])
    
    inline def `setClip-change`(value: TiledImageEvent): Self = StObject.set(x, "clip-change", value.asInstanceOf[js.Any])
    
    inline def `setComposite-operation-change`(value: CompositeOperationChangeTiledImageEvent): Self = StObject.set(x, "composite-operation-change", value.asInstanceOf[js.Any])
    
    inline def `setFully-loaded-change`(value: FullyLoadedChangeTiledImageEvent): Self = StObject.set(x, "fully-loaded-change", value.asInstanceOf[js.Any])
    
    inline def `setOpacity-change`(value: OpacityChangeTiledImageEvent): Self = StObject.set(x, "opacity-change", value.asInstanceOf[js.Any])
  }
}
