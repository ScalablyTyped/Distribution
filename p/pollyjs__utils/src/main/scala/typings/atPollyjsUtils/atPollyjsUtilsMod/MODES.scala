package typings.atPollyjsUtils.atPollyjsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MODES extends js.Object

@JSImport("@pollyjs/utils", "MODES")
@js.native
object MODES extends js.Object {
  @js.native
  sealed trait PASSTHROUGH extends MODES
  
  @js.native
  sealed trait RECORD extends MODES
  
  @js.native
  sealed trait REPLAY extends MODES
  
  @js.native
  sealed trait STOPPED extends MODES
  
  /* "passthrough" */ val PASSTHROUGH: typings.atPollyjsUtils.atPollyjsUtilsMod.MODES.PASSTHROUGH with String = js.native
  /* "record" */ val RECORD: typings.atPollyjsUtils.atPollyjsUtilsMod.MODES.RECORD with String = js.native
  /* "replay" */ val REPLAY: typings.atPollyjsUtils.atPollyjsUtilsMod.MODES.REPLAY with String = js.native
  /* "stopped" */ val STOPPED: typings.atPollyjsUtils.atPollyjsUtilsMod.MODES.STOPPED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MODES with String] = js.native
}

