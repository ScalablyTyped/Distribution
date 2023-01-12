package typings.orbitUiReactComponents

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOverlaySrcUseInteractOutsideMod {
  
  @JSImport("@orbit-ui/react-components/dist/overlay/src/useInteractOutside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInteractOutside(rootElementRef: RefObject[HTMLElement]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useInteractOutside")(rootElementRef.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useInteractOutside(rootElementRef: RefObject[HTMLElement], param1: UseInteractOutsideOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useInteractOutside")(rootElementRef.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait UseInteractOutsideOptions extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    var onInteractOutside: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
  }
  object UseInteractOutsideOptions {
    
    inline def apply(): UseInteractOutsideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInteractOutsideOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseInteractOutsideOptions] (val x: Self) extends AnyVal {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnInteractOutside(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInteractOutside", js.Any.fromFunction1(value))
      
      inline def setOnInteractOutsideUndefined: Self = StObject.set(x, "onInteractOutside", js.undefined)
    }
  }
}
