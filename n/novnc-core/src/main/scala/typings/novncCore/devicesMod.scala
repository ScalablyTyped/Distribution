package typings.novncCore

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devicesMod {
  
  @JSImport("novnc-core/lib/input/devices", "Keyboard")
  @js.native
  class Keyboard () extends StObject {
    def this(defaults: NvKeyboardDefaults) = this()
    
    def get_focused(): Boolean = js.native
    
    def get_onKeyPress(): js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit] = js.native
    
    def get_target(): Element = js.native
    
    def grab(): Unit = js.native
    
    def set_focused(focused: Boolean): Unit = js.native
    
    def set_onKeyPress(handler: js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]): Unit = js.native
    
    def set_target(target: Element): Unit = js.native
    
    def ungrab(): Unit = js.native
  }
  
  @JSImport("novnc-core/lib/input/devices", "Mouse")
  @js.native
  class Mouse () extends StObject {
    def this(defaults: NvMouseDefaults) = this()
    
    def get_focused(): Boolean = js.native
    
    def get_onMouseButton(): js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit] = js.native
    
    def get_onMouseMove(): js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    def get_target(): Element = js.native
    
    def get_touchButton(): Double = js.native
    
    def grab(): Unit = js.native
    
    def set_focused(focused: Boolean): Unit = js.native
    
    def set_onMouseButton(
      handler: js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
    ): Unit = js.native
    
    def set_onMouseMove(handler: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
    
    def set_target(target: Element): Unit = js.native
    
    def set_touchButton(touchButton: Double): Unit = js.native
    
    def ungrab(): Unit = js.native
  }
  
  trait NvKeyboardDefaults extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function3[/* keysym */ String, /* code */ Double, /* down */ Boolean, Unit]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
  }
  object NvKeyboardDefaults {
    
    inline def apply(): NvKeyboardDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NvKeyboardDefaults]
    }
    
    extension [Self <: NvKeyboardDefaults](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setOnKeyPress(value: (/* keysym */ String, /* code */ Double, /* down */ Boolean) => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction3(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait NvMouseDefaults extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var onMouseButton: js.UndefOr[
        js.Function4[/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double, Unit]
      ] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, Unit]] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
    
    var touchButton: js.UndefOr[Double] = js.undefined
  }
  object NvMouseDefaults {
    
    inline def apply(): NvMouseDefaults = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NvMouseDefaults]
    }
    
    extension [Self <: NvMouseDefaults](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setOnMouseButton(value: (/* x */ Double, /* y */ Double, /* down */ Boolean, /* bmask */ Double) => Unit): Self = StObject.set(x, "onMouseButton", js.Any.fromFunction4(value))
      
      inline def setOnMouseButtonUndefined: Self = StObject.set(x, "onMouseButton", js.undefined)
      
      inline def setOnMouseMove(value: (/* x */ Double, /* y */ Double) => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTouchButton(value: Double): Self = StObject.set(x, "touchButton", value.asInstanceOf[js.Any])
      
      inline def setTouchButtonUndefined: Self = StObject.set(x, "touchButton", js.undefined)
    }
  }
}
