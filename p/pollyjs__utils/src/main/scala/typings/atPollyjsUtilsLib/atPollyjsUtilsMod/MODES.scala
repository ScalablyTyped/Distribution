package typings
package atPollyjsUtilsLib.atPollyjsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MODES extends js.Object

@JSImport("@pollyjs/utils", "MODES")
@js.native
object MODES extends js.Object {
  @js.native
  sealed trait PASSTHROUGH
    extends atPollyjsUtilsLib.atPollyjsUtilsMod.MODES
  
  @js.native
  sealed trait RECORD
    extends atPollyjsUtilsLib.atPollyjsUtilsMod.MODES
  
  @js.native
  sealed trait REPLAY
    extends atPollyjsUtilsLib.atPollyjsUtilsMod.MODES
  
  @js.native
  sealed trait STOPPED
    extends atPollyjsUtilsLib.atPollyjsUtilsMod.MODES
  
  /* "passthrough" */ val PASSTHROUGH: PASSTHROUGH with java.lang.String = js.native
  /* "record" */ val RECORD: RECORD with java.lang.String = js.native
  /* "replay" */ val REPLAY: REPLAY with java.lang.String = js.native
  /* "stopped" */ val STOPPED: STOPPED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atPollyjsUtilsLib.atPollyjsUtilsMod.MODES with java.lang.String] = js.native
}

