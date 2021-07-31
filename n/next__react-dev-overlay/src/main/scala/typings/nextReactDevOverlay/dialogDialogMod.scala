package typings.nextReactDevOverlay

import typings.nextReactDevOverlay.nextReactDevOverlayStrings.error
import typings.nextReactDevOverlay.nextReactDevOverlayStrings.warning
import typings.react.mod.FC
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogDialogMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/components/Dialog/Dialog", "Dialog")
  @js.native
  val Dialog: FC[DialogProps] = js.native
  
  trait DialogProps extends StObject {
    
    var `aria-describedby`: String
    
    var `aria-labelledby`: String
    
    var onClose: js.UndefOr[js.Function1[/* e */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    var `type`: error | warning
  }
  object DialogProps {
    
    @scala.inline
    def apply(`aria-describedby`: String, `aria-labelledby`: String, `type`: error | warning): DialogProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogProps]
    }
    
    @scala.inline
    implicit class DialogPropsMutableBuilder[Self <: DialogProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClose(value: /* e */ MouseEvent | TouchEvent => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setType(value: error | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
