package typings.officeUiFabricReact.indexBundleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup")
@js.native
class EventGroup protected ()
  extends typings.officeUiFabricReact.mod.EventGroup {
  /** parent: the context in which events attached to non-HTMLElements are called */
  def this(parent: js.Any) = this()
}

/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "EventGroup")
@js.native
object EventGroup extends js.Object {
  var _isElement: js.Any = js.native
  var _uniqueId: js.Any = js.native
  /** Check to see if the target has declared support of the given event. */
  def isDeclared(target: js.Any, eventName: String): Boolean = js.native
  def isObserved(target: js.Any, eventName: String): Boolean = js.native
  /** For IE8, bubbleEvent is ignored here and must be dealt with by the handler.
    *  Events raised here by default have bubbling set to false and cancelable set to true.
    *  This applies also to built-in events being raised manually here on HTMLElements,
    *  which may lead to unexpected behavior if it differs from the defaults.
    *
    */
  def raise(target: js.Any, eventName: String): js.UndefOr[Boolean] = js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.UndefOr[scala.Nothing], bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.Any): js.UndefOr[Boolean] = js.native
  def raise(target: js.Any, eventName: String, eventArgs: js.Any, bubbleEvent: Boolean): js.UndefOr[Boolean] = js.native
  def stopPropagation(event: js.Any): Unit = js.native
}

