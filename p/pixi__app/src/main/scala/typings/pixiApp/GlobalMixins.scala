package typings.pixiApp

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GlobalMixins {
  
  trait Application extends StObject {
    
    def cancelResize(): Unit
    
    def queueResize(): Unit
    
    def resize(): Unit
    
    var resizeTo: Window | HTMLElement
  }
  object Application {
    
    inline def apply(
      cancelResize: () => Unit,
      queueResize: () => Unit,
      resize: () => Unit,
      resizeTo: Window | HTMLElement
    ): Application = {
      val __obj = js.Dynamic.literal(cancelResize = js.Any.fromFunction0(cancelResize), queueResize = js.Any.fromFunction0(queueResize), resize = js.Any.fromFunction0(resize), resizeTo = resizeTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    extension [Self <: Application](x: Self) {
      
      inline def setCancelResize(value: () => Unit): Self = StObject.set(x, "cancelResize", js.Any.fromFunction0(value))
      
      inline def setQueueResize(value: () => Unit): Self = StObject.set(x, "queueResize", js.Any.fromFunction0(value))
      
      inline def setResize(value: () => Unit): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
      
      inline def setResizeTo(value: Window | HTMLElement): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
    }
  }
  
  trait IApplicationOptions extends StObject {
    
    var resizeTo: js.UndefOr[Window | HTMLElement] = js.undefined
  }
  object IApplicationOptions {
    
    inline def apply(): IApplicationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IApplicationOptions]
    }
    
    extension [Self <: IApplicationOptions](x: Self) {
      
      inline def setResizeTo(value: Window | HTMLElement): Self = StObject.set(x, "resizeTo", value.asInstanceOf[js.Any])
      
      inline def setResizeToUndefined: Self = StObject.set(x, "resizeTo", js.undefined)
    }
  }
}
