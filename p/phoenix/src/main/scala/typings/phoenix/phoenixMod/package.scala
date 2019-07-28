package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phoenixMod {
  type PresenceOnJoinCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    Unit
  ]
  type PresenceOnLeaveCallback = js.Function3[
    /* key */ js.UndefOr[String], 
    /* currentPresence */ js.UndefOr[js.Any], 
    /* newPresence */ js.UndefOr[js.Any], 
    Unit
  ]
}
