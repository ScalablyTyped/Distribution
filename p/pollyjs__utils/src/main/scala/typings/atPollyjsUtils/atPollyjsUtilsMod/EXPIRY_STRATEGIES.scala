package typings.atPollyjsUtils.atPollyjsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EXPIRY_STRATEGIES extends js.Object

@JSImport("@pollyjs/utils", "EXPIRY_STRATEGIES")
@js.native
object EXPIRY_STRATEGIES extends js.Object {
  @js.native
  sealed trait ERROR extends EXPIRY_STRATEGIES
  
  @js.native
  sealed trait RECORD extends EXPIRY_STRATEGIES
  
  @js.native
  sealed trait WARN extends EXPIRY_STRATEGIES
  
  /* "error" */ val ERROR: typings.atPollyjsUtils.atPollyjsUtilsMod.EXPIRY_STRATEGIES.ERROR with String = js.native
  /* "record" */ val RECORD: typings.atPollyjsUtils.atPollyjsUtilsMod.EXPIRY_STRATEGIES.RECORD with String = js.native
  /* "warn" */ val WARN: typings.atPollyjsUtils.atPollyjsUtilsMod.EXPIRY_STRATEGIES.WARN with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EXPIRY_STRATEGIES with String] = js.native
}

