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
}

/* static members */
@JSImport("phoenix", "Presence")
@js.native
object Presence extends js.Object {
  def list(presences: js.Object): js.Any = js.native
  def list(presences: js.Object, chooser: js.Function): js.Any = js.native
  def syncDiff(currentState: js.Any, newState: js.Any): js.Any = js.native
  def syncDiff(
    currentState: js.Any,
    newState: js.Any,
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
  def syncDiff(
    currentState: js.Any,
    newState: js.Any,
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
  def syncState(currentState: js.Any, newState: js.Any): js.Any = js.native
  def syncState(
    currentState: js.Any,
    newState: js.Any,
    onJoin: js.Function3[
      /* key */ js.UndefOr[java.lang.String], 
      /* currentPresence */ js.UndefOr[js.Any], 
      /* newPresence */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): js.Any = js.native
  def syncState(
    currentState: js.Any,
    newState: js.Any,
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

