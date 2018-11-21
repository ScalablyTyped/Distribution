package typings
package atPollyjsUtilsLib.utilsMod

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
    extends atPollyjsUtilsLib.utilsMod.MODES
  
  @js.native
  sealed trait RECORD
    extends atPollyjsUtilsLib.utilsMod.MODES
  
  @js.native
  sealed trait REPLAY
    extends atPollyjsUtilsLib.utilsMod.MODES
  
  @js.native
  sealed trait STOPPED
    extends atPollyjsUtilsLib.utilsMod.MODES
  
  /* "passthrough" */ val PASSTHROUGH: PASSTHROUGH with java.lang.String = js.native
  /* "record" */ val RECORD: RECORD with java.lang.String = js.native
  /* "replay" */ val REPLAY: REPLAY with java.lang.String = js.native
  /* "stopped" */ val STOPPED: STOPPED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atPollyjsUtilsLib.utilsMod.MODES with java.lang.String] = js.native
}

