package typings.nextReactDevOverlay

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayOverlayMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Overlay/Overlay", "Overlay")
  @js.native
  val Overlay: FC[OverlayProps] = js.native
  
  trait OverlayProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayProps {
    
    @scala.inline
    def apply(): OverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    }
  }
}
