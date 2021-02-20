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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("native-toast", JSImport.Namespace)
  @js.native
  def apply(options: ToastOptions): Toast = js.native
  
  @JSImport("native-toast", "error")
  @js.native
  def error(options: ToastOptions): Toast = js.native
  
  @JSImport("native-toast", "info")
  @js.native
  def info(options: ToastOptions): Toast = js.native
  
  @JSImport("native-toast", "success")
  @js.native
  def success(options: ToastOptions): Toast = js.native
  
  @JSImport("native-toast", "warning")
  @js.native
  def warning(options: ToastOptions): Toast = js.native
  
  @js.native
  trait Toast extends StObject {
    
    def destroy(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  object Toast {
    
    @scala.inline
    def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit): Toast = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[Toast]
    }
    
    @scala.inline
    implicit class ToastMutableBuilder[Self <: Toast] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ToastOptions extends StObject {
    
    var closeOnClick: js.UndefOr[Boolean] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var edge: js.UndefOr[Boolean] = js.native
    
    var el: js.UndefOr[HTMLElement] = js.native
    
    var elements: js.UndefOr[js.Array[HTMLElement]] = js.native
    
    var icon: js.UndefOr[Boolean] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var position: js.UndefOr[
        center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ] = js.native
    
    var rounded: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[success | warning | info | error] = js.native
  }
  object ToastOptions {
    
    @scala.inline
    def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    @scala.inline
    implicit class ToastOptionsMutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEdge(value: Boolean): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setElements(value: js.Array[HTMLElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      @scala.inline
      def setElementsVarargs(value: HTMLElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setPosition(
        value: center | west | east | south | `south-west` | `south-east` | north | `north-west` | `north-east`
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: success | warning | info | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
