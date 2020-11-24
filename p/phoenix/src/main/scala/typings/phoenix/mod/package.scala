package typings.phoenix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MessageRef = java.lang.String
  
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
