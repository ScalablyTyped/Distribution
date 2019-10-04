package typings.atPollyjsUtils.atPollyjsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ACTIONS extends js.Object

@JSImport("@pollyjs/utils", "ACTIONS")
@js.native
object ACTIONS extends js.Object {
  @js.native
  sealed trait INTERCEPT extends ACTIONS
  
  @js.native
  sealed trait PASSTHROUGH extends ACTIONS
  
  @js.native
  sealed trait RECORD extends ACTIONS
  
  @js.native
  sealed trait REPLAY extends ACTIONS
  
  /* "intercept" */ val INTERCEPT: typings.atPollyjsUtils.atPollyjsUtilsMod.ACTIONS.INTERCEPT with String = js.native
  /* "passthrough" */ val PASSTHROUGH: typings.atPollyjsUtils.atPollyjsUtilsMod.ACTIONS.PASSTHROUGH with String = js.native
  /* "record" */ val RECORD: typings.atPollyjsUtils.atPollyjsUtilsMod.ACTIONS.RECORD with String = js.native
  /* "replay" */ val REPLAY: typings.atPollyjsUtils.atPollyjsUtilsMod.ACTIONS.REPLAY with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
}

