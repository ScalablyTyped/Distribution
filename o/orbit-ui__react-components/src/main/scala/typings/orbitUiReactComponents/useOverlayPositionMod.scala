package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ArrowRef
import typings.popperjsCore.enumsMod.Placement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useOverlayPositionMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useOverlayPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOverlayPosition(): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")().asInstanceOf[ArrowRef]
  inline def useOverlayPosition(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow: UseOverlayPositionOptions): ArrowRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayPosition")(hasPositionOffsetAllowFlipAllowPreventOverflowBoundaryElementHasArrow.asInstanceOf[js.Any]).asInstanceOf[ArrowRef]
  
  type OverlayPosition = Placement
  
  trait UseOverlayPositionOptions extends StObject {
    
    var allowFlip: js.UndefOr[Boolean] = js.undefined
    
    var allowPreventOverflow: js.UndefOr[Boolean] = js.undefined
    
    var boundaryElement: js.UndefOr[HTMLElement] = js.undefined
    
    var hasArrow: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var position: js.UndefOr[OverlayPosition] = js.undefined
  }
  object UseOverlayPositionOptions {
    
    inline def apply(): UseOverlayPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseOverlayPositionOptions]
    }
    
    extension [Self <: UseOverlayPositionOptions](x: Self) {
      
      inline def setAllowFlip(value: Boolean): Self = StObject.set(x, "allowFlip", value.asInstanceOf[js.Any])
      
      inline def setAllowFlipUndefined: Self = StObject.set(x, "allowFlip", js.undefined)
      
      inline def setAllowPreventOverflow(value: Boolean): Self = StObject.set(x, "allowPreventOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowPreventOverflowUndefined: Self = StObject.set(x, "allowPreventOverflow", js.undefined)
      
      inline def setBoundaryElement(value: HTMLElement): Self = StObject.set(x, "boundaryElement", value.asInstanceOf[js.Any])
      
      inline def setBoundaryElementUndefined: Self = StObject.set(x, "boundaryElement", js.undefined)
      
      inline def setHasArrow(value: Boolean): Self = StObject.set(x, "hasArrow", value.asInstanceOf[js.Any])
      
      inline def setHasArrowUndefined: Self = StObject.set(x, "hasArrow", js.undefined)
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setPosition(value: OverlayPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
