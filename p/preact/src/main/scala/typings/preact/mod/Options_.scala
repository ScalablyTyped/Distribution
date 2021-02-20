package typings.preact.mod

import typings.std.Event
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Preact options
// -----------------------------------
/**
	 * Global options for preact
	 */
@js.native
trait Options_ extends StObject {
  
  var __suspenseDidResolve: js.UndefOr[js.Function2[/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit], Unit]] = js.native
  
  var debounceRendering: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.native
  
  /** Attach a hook that is invoked after a vnode has rendered. */
  var diffed: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  
  var event: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
  
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.native
  
  /** Attach a hook that is invoked immediately before a vnode is unmounted. */
  var unmount: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
  
  var useDebugValue: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.native
  
  /** Attach a hook that is invoked whenever a VNode is created. */
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.native
}
object Options_ {
  
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  
  @scala.inline
  implicit class Options_MutableBuilder[Self <: Options_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebounceRendering(value: /* cb */ js.Function0[Unit] => Unit): Self = StObject.set(x, "debounceRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebounceRenderingUndefined: Self = StObject.set(x, "debounceRendering", js.undefined)
    
    @scala.inline
    def setDiffed(value: /* vnode */ VNode[js.Object] => Unit): Self = StObject.set(x, "diffed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiffedUndefined: Self = StObject.set(x, "diffed", js.undefined)
    
    @scala.inline
    def setEvent(value: /* e */ Event => _): Self = StObject.set(x, "event", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestAnimationFrameUndefined: Self = StObject.set(x, "requestAnimationFrame", js.undefined)
    
    @scala.inline
    def setUnmount(value: /* vnode */ VNode[js.Object] => Unit): Self = StObject.set(x, "unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnmountUndefined: Self = StObject.set(x, "unmount", js.undefined)
    
    @scala.inline
    def setUseDebugValue(value: /* value */ String | Double => Unit): Self = StObject.set(x, "useDebugValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUseDebugValueUndefined: Self = StObject.set(x, "useDebugValue", js.undefined)
    
    @scala.inline
    def setVnode(value: /* vnode */ VNode[js.Object] => Unit): Self = StObject.set(x, "vnode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVnodeUndefined: Self = StObject.set(x, "vnode", js.undefined)
    
    @scala.inline
    def set__suspenseDidResolve(value: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "__suspenseDidResolve", js.Any.fromFunction2(value))
    
    @scala.inline
    def set__suspenseDidResolveUndefined: Self = StObject.set(x, "__suspenseDidResolve", js.undefined)
  }
}
