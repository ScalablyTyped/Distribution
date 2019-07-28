package typings.ol.eventsMod

import typings.ol.eventsEventMod.default
import typings.ol.eventsTargetMod.EventTargetLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsKey extends js.Object {
  var bindTo: js.UndefOr[js.Any] = js.native
  var boundListener: js.UndefOr[ListenerFunction] = js.native
  var callOnce: Boolean = js.native
  var deleteIndex: js.UndefOr[Double] = js.native
  @JSName("listener")
  var listener_Original: ListenerFunction = js.native
  var target: EventTargetLike = js.native
  var `type`: String = js.native
  def listener(p0: default): Boolean = js.native
}

