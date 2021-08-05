package typings.popperjsCore.anon

import typings.popperjsCore.enumsMod.BasePlacement
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.Rect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adaptive extends StObject {
  
  var adaptive: Boolean
  
  var gpuAcceleration: Boolean
  
  var offsets: Partialxnumberynumbercent
  
  var placement: BasePlacement
  
  var popper: HTMLElement
  
  var popperRect: Rect
  
  var position: PositioningStrategy
}
object Adaptive {
  
  inline def apply(
    adaptive: Boolean,
    gpuAcceleration: Boolean,
    offsets: Partialxnumberynumbercent,
    placement: BasePlacement,
    popper: HTMLElement,
    popperRect: Rect,
    position: PositioningStrategy
  ): Adaptive = {
    val __obj = js.Dynamic.literal(adaptive = adaptive.asInstanceOf[js.Any], gpuAcceleration = gpuAcceleration.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], popperRect = popperRect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
  
  extension [Self <: Adaptive](x: Self) {
    
    inline def setAdaptive(value: Boolean): Self = StObject.set(x, "adaptive", value.asInstanceOf[js.Any])
    
    inline def setGpuAcceleration(value: Boolean): Self = StObject.set(x, "gpuAcceleration", value.asInstanceOf[js.Any])
    
    inline def setOffsets(value: Partialxnumberynumbercent): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: BasePlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopper(value: HTMLElement): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setPopperRect(value: Rect): Self = StObject.set(x, "popperRect", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: PositioningStrategy): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
