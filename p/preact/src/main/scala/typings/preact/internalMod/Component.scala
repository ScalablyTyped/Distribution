package typings.preact.internalMod

import typings.preact.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[P, S]
  extends typings.preact.mod.Component[P, S] {
   // Only class components
  var _context: js.UndefOr[js.Any] = js.native
  var _dirty: Boolean = js.native
  var _force: js.UndefOr[Boolean | Null] = js.native
  var _nextState: js.UndefOr[S | Null] = js.native
  /**
  	 * Pointer to the parent dom node. This is only needed for top-level Fragment
  	 * components or array returns.
  	 */
  var _parentDom: js.UndefOr[PreactElement | Null] = js.native
  // Always read, set only when handling error. This is used to indicate at diffTime to set _processingException
  var _pendingError: js.UndefOr[(Component[_, _]) | Null] = js.native
   // Only class components
  /** Only used in the devtools to later dirty check if state has changed */
  var _prevState: js.UndefOr[S | Null] = js.native
  // Always read, set only when handling error
  var _processingException: js.UndefOr[(Component[_, _]) | Null] = js.native
  var _renderCallbacks: js.Array[js.Function0[Unit]] = js.native
  var _vnode: js.UndefOr[VNode[P] | Null] = js.native
  // When component is functional component, this is reset to functional component
  var constructor: ComponentType[P] = js.native
}

