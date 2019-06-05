package typings
package phoenixLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phoenixMod {
  type PresenceOnJoinCallback = js.Function3[
    /* key */ js.UndefOr[java.lang.String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type PresenceOnLeaveCallback = js.Function3[
    /* key */ js.UndefOr[java.lang.String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
