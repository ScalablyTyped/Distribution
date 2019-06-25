package typings
package olLib.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsKey extends js.Object {
  var bindTo: js.UndefOr[js.Any] = js.native
  var boundListener: js.UndefOr[ListenerFunction] = js.native
  var callOnce: scala.Boolean = js.native
  var deleteIndex: js.UndefOr[scala.Double] = js.native
  @JSName("listener")
  var listener_Original: ListenerFunction = js.native
  var target: olLib.eventsTargetMod.EventTargetLike = js.native
  var `type`: java.lang.String = js.native
  def listener(param0: olLib.eventsEventMod.default): scala.Unit | scala.Boolean = js.native
}

