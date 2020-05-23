package typings.phoenix.mod

import typings.phoenix.anon.Joins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Presence")
@js.native
class Presence protected () extends js.Object {
  def this(channel: Channel) = this()
  def this(channel: Channel, opts: PresenceOpts) = this()
  def inPendingSyncState(): Boolean = js.native
  def list[T](): js.Array[T] = js.native
  def list[T](chooser: js.Function2[/* key */ String, /* presence */ js.Any, T]): js.Array[T] = js.native
  def onJoin(callback: PresenceOnJoinCallback): Unit = js.native
  def onLeave(callback: PresenceOnLeaveCallback): Unit = js.native
  def onSync(callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSImport("phoenix", "Presence")
@js.native
object Presence extends js.Object {
  def list[T](presences: js.Object): js.Array[T] = js.native
  def list[T](presences: js.Object, chooser: js.Function2[/* key */ String, /* presence */ js.Any, T]): js.Array[T] = js.native
  def syncDiff(currentState: js.Object, diff: Joins): js.Any = js.native
  def syncDiff(currentState: js.Object, diff: Joins, onJoin: PresenceOnJoinCallback): js.Any = js.native
  def syncDiff(
    currentState: js.Object,
    diff: Joins,
    onJoin: PresenceOnJoinCallback,
    onLeave: PresenceOnLeaveCallback
  ): js.Any = js.native
  def syncState(currentState: js.Object, newState: js.Object): js.Any = js.native
  def syncState(currentState: js.Object, newState: js.Object, onJoin: PresenceOnJoinCallback): js.Any = js.native
  def syncState(
    currentState: js.Object,
    newState: js.Object,
    onJoin: PresenceOnJoinCallback,
    onLeave: PresenceOnLeaveCallback
  ): js.Any = js.native
}

