package typings.preact.preactMod

import org.scalablytyped.runtime.TopLevel
import typings.std.Event
import typings.std.FrameRequestCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Preact options
// -----------------------------------
/**
	 * Global options for preact
	 */
trait Options extends js.Object {
  var __suspenseDidResolve: js.UndefOr[js.Function2[/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit], Unit]] = js.undefined
  var debounceRendering: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
  /** Attach a hook that is invoked after a vnode has rendered. */
  var diffed: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  var event: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var requestAnimationFrame: js.UndefOr[js.Function1[/* callback */ FrameRequestCallback, Double]] = js.undefined
  /** Attach a hook that is invoked immediately before a vnode is unmounted. */
  var unmount: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
  var useDebugValue: js.UndefOr[js.Function1[/* value */ String | Double, Unit]] = js.undefined
  /** Attach a hook that is invoked whenever a VNode is created. */
  var vnode: js.UndefOr[js.Function1[/* vnode */ VNode[js.Object], Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    __suspenseDidResolve: (/* vnode */ VNode[js.Object], /* cb */ js.Function0[Unit]) => Unit = null,
    debounceRendering: /* cb */ js.Function0[Unit] => Unit = null,
    diffed: /* vnode */ VNode[js.Object] => Unit = null,
    event: /* e */ Event => Unit = null,
    requestAnimationFrame: /* callback */ FrameRequestCallback => Double = null,
    unmount: /* vnode */ VNode[js.Object] => Unit = null,
    useDebugValue: /* value */ String | Double => Unit = null,
    vnode: /* vnode */ VNode[js.Object] => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (__suspenseDidResolve != null) __obj.updateDynamic("__suspenseDidResolve")(js.Any.fromFunction2(__suspenseDidResolve))
    if (debounceRendering != null) __obj.updateDynamic("debounceRendering")(js.Any.fromFunction1(debounceRendering))
    if (diffed != null) __obj.updateDynamic("diffed")(js.Any.fromFunction1(diffed))
    if (event != null) __obj.updateDynamic("event")(js.Any.fromFunction1(event))
    if (requestAnimationFrame != null) __obj.updateDynamic("requestAnimationFrame")(js.Any.fromFunction1(requestAnimationFrame))
    if (unmount != null) __obj.updateDynamic("unmount")(js.Any.fromFunction1(unmount))
    if (useDebugValue != null) __obj.updateDynamic("useDebugValue")(js.Any.fromFunction1(useDebugValue))
    if (vnode != null) __obj.updateDynamic("vnode")(js.Any.fromFunction1(vnode))
    __obj.asInstanceOf[Options]
  }
}

@JSImport("preact", "options")
@js.native
object options extends TopLevel[Options]

