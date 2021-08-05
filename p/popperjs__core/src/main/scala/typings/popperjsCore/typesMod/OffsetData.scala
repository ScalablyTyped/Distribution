package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in @popperjs/core.@popperjs/core/lib/enums.Placement ]: @popperjs/core.@popperjs/core/lib/types.Offsets} */
trait OffsetData extends StObject {
  
  var auto: Offsets
  
  var `auto-end`: Offsets
  
  var `auto-start`: Offsets
  
  var bottom: Offsets
  
  var `bottom-end`: Offsets
  
  var `bottom-start`: Offsets
  
  var left: Offsets
  
  var `left-end`: Offsets
  
  var `left-start`: Offsets
  
  var right: Offsets
  
  var `right-end`: Offsets
  
  var `right-start`: Offsets
  
  var top: Offsets
  
  var `top-end`: Offsets
  
  var `top-start`: Offsets
}
object OffsetData {
  
  inline def apply(
    auto: Offsets,
    `auto-end`: Offsets,
    `auto-start`: Offsets,
    bottom: Offsets,
    `bottom-end`: Offsets,
    `bottom-start`: Offsets,
    left: Offsets,
    `left-end`: Offsets,
    `left-start`: Offsets,
    right: Offsets,
    `right-end`: Offsets,
    `right-start`: Offsets,
    top: Offsets,
    `top-end`: Offsets,
    `top-start`: Offsets
  ): OffsetData = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-end")(`auto-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-start")(`auto-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-end")(`bottom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("bottom-start")(`bottom-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-end")(`left-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("left-start")(`left-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-end")(`right-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("right-start")(`right-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-end")(`top-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("top-start")(`top-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetData]
  }
  
  extension [Self <: OffsetData](x: Self) {
    
    inline def setAuto(value: Offsets): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def `setAuto-end`(value: Offsets): Self = StObject.set(x, "auto-end", value.asInstanceOf[js.Any])
    
    inline def `setAuto-start`(value: Offsets): Self = StObject.set(x, "auto-start", value.asInstanceOf[js.Any])
    
    inline def setBottom(value: Offsets): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def `setBottom-end`(value: Offsets): Self = StObject.set(x, "bottom-end", value.asInstanceOf[js.Any])
    
    inline def `setBottom-start`(value: Offsets): Self = StObject.set(x, "bottom-start", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Offsets): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def `setLeft-end`(value: Offsets): Self = StObject.set(x, "left-end", value.asInstanceOf[js.Any])
    
    inline def `setLeft-start`(value: Offsets): Self = StObject.set(x, "left-start", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Offsets): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def `setRight-end`(value: Offsets): Self = StObject.set(x, "right-end", value.asInstanceOf[js.Any])
    
    inline def `setRight-start`(value: Offsets): Self = StObject.set(x, "right-start", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Offsets): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def `setTop-end`(value: Offsets): Self = StObject.set(x, "top-end", value.asInstanceOf[js.Any])
    
    inline def `setTop-start`(value: Offsets): Self = StObject.set(x, "top-start", value.asInstanceOf[js.Any])
  }
}
