package typings.preact.mod

import typings.std.Event
import typings.std.FrameRequestCallback
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
trait Options_ extends js.Object {
  
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
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__suspenseDidResolve(value: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Unit): Self = this.set("__suspenseDidResolve", js.Any.fromFunction2(value))
    
    @scala.inline
    def delete__suspenseDidResolve: Self = this.set("__suspenseDidResolve", js.undefined)
    
    @scala.inline
    def setDebounceRendering(value: /* cb */ js.Function0[Unit] => Unit): Self = this.set("debounceRendering", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebounceRendering: Self = this.set("debounceRendering", js.undefined)
    
    @scala.inline
    def setDiffed(value: /* vnode */ VNode[js.Object] => Unit): Self = this.set("diffed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDiffed: Self = this.set("diffed", js.undefined)
    
    @scala.inline
    def setEvent(value: /* e */ Event => _): Self = this.set("event", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = this.set("requestAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRequestAnimationFrame: Self = this.set("requestAnimationFrame", js.undefined)
    
    @scala.inline
    def setUnmount(value: /* vnode */ VNode[js.Object] => Unit): Self = this.set("unmount", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnmount: Self = this.set("unmount", js.undefined)
    
    @scala.inline
    def setUseDebugValue(value: /* value */ String | Double => Unit): Self = this.set("useDebugValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUseDebugValue: Self = this.set("useDebugValue", js.undefined)
    
    @scala.inline
    def setVnode(value: /* vnode */ VNode[js.Object] => Unit): Self = this.set("vnode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVnode: Self = this.set("vnode", js.undefined)
  }
}
