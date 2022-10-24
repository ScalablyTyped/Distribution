package typings.orbitUiReactComponents

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import typings.std.ResizeObserverEntry
import typings.std.ResizeObserverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcUseResizeObserverMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/useResizeObserver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit]): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  inline def useResizeObserver(onResize: js.Function1[/* entry */ ResizeObserverEntry, Unit], param1: UseResizeObserverOptions): RefCallback[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")(onResize.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[RefCallback[HTMLElement]]
  
  trait UseResizeObserverOptions
    extends StObject
       with ResizeObserverOptions {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object UseResizeObserverOptions {
    
    inline def apply(): UseResizeObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseResizeObserverOptions]
    }
    
    extension [Self <: UseResizeObserverOptions](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    }
  }
}
