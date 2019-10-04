package typings.preact.srcInternalMod

import typings.preact.srcMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[P, S]
  extends typings.preact.srcMod.Component[P, S] {
  var _context: js.UndefOr[js.Any] = js.native
  var _dirty: Boolean = js.native
  var _nextState: js.UndefOr[S | Null] = js.native
  /**
  	 * Pointer to the parent dom node. This is only needed for top-level Fragment
  	 * components or array returns.
  	 */
  var _parentDom: js.UndefOr[PreactElement | Null] = js.native
  var _pendingError: js.UndefOr[(Component[_, _]) | Null] = js.native
  /** Only used in the devtools to later dirty check if state has changed */
  var _prevState: js.UndefOr[S | Null] = js.native
  var _processingException: js.UndefOr[(Component[_, _]) | Null] = js.native
  var _renderCallbacks: js.Array[js.Function0[Unit]] = js.native
  var _vnode: js.UndefOr[VNode[P] | Null] = js.native
   // Override Component["state"] to not be readonly for internal use, specifically Hooks
  @JSName("base")
  var base_Component: js.UndefOr[PreactElement] = js.native
  var constructor: ComponentType[P] = js.native
}

