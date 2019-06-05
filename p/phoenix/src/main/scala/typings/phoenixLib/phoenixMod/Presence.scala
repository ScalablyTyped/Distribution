package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Presence")
@js.native
class Presence protected () extends js.Object {
  def this(channel: Channel) = this()
  def this(channel: Channel, opts: PresenceOpts) = this()
  def inPendingSyncState(): scala.Boolean = js.native
  def list[T](): js.Array[T] = js.native
  def list[T](chooser: js.Function2[/* key */ java.lang.String, /* presence */ js.Any, T]): js.Array[T] = js.native
  def onJoin(callback: PresenceOnJoinCallback): scala.Unit = js.native
  def onLeave(callback: PresenceOnLeaveCallback): scala.Unit = js.native
  def onSync(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSImport("phoenix", "Presence")
@js.native
object Presence extends js.Object {
  def list[T](presences: js.Object): js.Array[T] = js.native
  def list[T](presences: js.Object, chooser: js.Function2[/* key */ java.lang.String, /* presence */ js.Any, T]): js.Array[T] = js.native
  def syncDiff(currentState: js.Object, diff: phoenixLib.Anon_Joins): js.Any = js.native
  def syncDiff(
    currentState: js.Object,
    diff: phoenixLib.Anon_Joins,
    onJoin: phoenixLib.phoenixMod.PresenceOnJoinCallback
  ): js.Any = js.native
  def syncDiff(
    currentState: js.Object,
    diff: phoenixLib.Anon_Joins,
    onJoin: phoenixLib.phoenixMod.PresenceOnJoinCallback,
    onLeave: phoenixLib.phoenixMod.PresenceOnLeaveCallback
  ): js.Any = js.native
  def syncState(currentState: js.Object, newState: js.Object): js.Any = js.native
  def syncState(currentState: js.Object, newState: js.Object, onJoin: phoenixLib.phoenixMod.PresenceOnJoinCallback): js.Any = js.native
  def syncState(
    currentState: js.Object,
    newState: js.Object,
    onJoin: phoenixLib.phoenixMod.PresenceOnJoinCallback,
    onLeave: phoenixLib.phoenixMod.PresenceOnLeaveCallback
  ): js.Any = js.native
}

