package typings
package phoenixLib.phoenixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Presence")
@js.native
class Presence protected () extends js.Object {
  def this(channel: Channel) = this()
  def this(channel: Channel, opts: js.Object) = this()
  def inPendingSyncState(): scala.Boolean = js.native
  def list[T](): js.Array[T] = js.native
  def list[T](chooser: js.Function2[/* key */ java.lang.String, /* presence */ js.Any, T]): js.Array[T] = js.native
  def onJoin(callback: js.Function): scala.Unit = js.native
  def onLeave(callback: js.Function): scala.Unit = js.native
  def onSync(callback: js.Function): scala.Unit = js.native
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
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
  def syncDiff(
    currentState: js.Object,
    diff: phoenixLib.Anon_Joins,
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    onLeave: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
  def syncState(currentState: js.Object, newState: js.Object): js.Any = js.native
  def syncState(
    currentState: js.Object,
    newState: js.Object,
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
  def syncState(
    currentState: js.Object,
    newState: js.Object,
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ],
    onLeave: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
}

