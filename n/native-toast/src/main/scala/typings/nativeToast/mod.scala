package typings.nativeToast

import typings.nativeToast.nativeToastStrings.`north-east`
import typings.nativeToast.nativeToastStrings.`north-west`
import typings.nativeToast.nativeToastStrings.`south-east`
import typings.nativeToast.nativeToastStrings.`south-west`
import typings.nativeToast.nativeToastStrings.center
import typings.nativeToast.nativeToastStrings.east
import typings.nativeToast.nativeToastStrings.error
import typings.nativeToast.nativeToastStrings.info
import typings.nativeToast.nativeToastStrings.north
import typings.nativeToast.nativeToastStrings.south
import typings.nativeToast.nativeToastStrings.success
import typings.nativeToast.nativeToastStrings.warning
import typings.nativeToast.nativeToastStrings.west
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  @JSImport("native-toast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def info(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def success(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  inline def warning(options: ToastOptions): Toast = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(options.asInstanceOf[js.Any]).asInstanceOf[Toast]
  
  trait Toast extends StObject {
    
    def destroy(): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object Toast {
    
    inline def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit): Toast = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Toast]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait ToastOptions extends StObject {
    
    var closeOnClick: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var edge: js.UndefOr[Boolean] = js.undefined
    
    var el: js.UndefOr[HTMLElement] = js.undefined
    
    var elements: js.UndefOr[js.Array[HTMLElement]] = js.undefined
    
    var icon: js.UndefOr[Boolean] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[
        center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ] = js.undefined
    
    var rounded: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[success | warning | info | error] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
      
      inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setPosition(
        value: center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setType(value: success | warning | info | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
