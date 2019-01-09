package typings
package phoenixLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Chooser extends js.Object {
  def list(presences: js.Any): js.Any = js.native
  def list(presences: js.Any, chooser: js.Function): js.Any = js.native
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

