package typings.orbitUiReactComponents

import typings.orbitUiReactComponents.anon.ClassNameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseOverlayFocusRingMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useOverlayFocusRing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useOverlayFocusRing(): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")().asInstanceOf[ClassNameString]
  inline def useOverlayFocusRing(param0: UseOverlayFocusRingProps): ClassNameString = ^.asInstanceOf[js.Dynamic].applyDynamic("useOverlayFocusRing")(param0.asInstanceOf[js.Any]).asInstanceOf[ClassNameString]
  
  trait UseOverlayFocusRingProps extends StObject {
    
    var focus: js.UndefOr[Boolean] = js.undefined
  }
  object UseOverlayFocusRingProps {
    
    inline def apply(): UseOverlayFocusRingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseOverlayFocusRingProps]
    }
    
    extension [Self <: UseOverlayFocusRingProps](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    }
  }
}
