package typings.atPollyjsUtils

import typings.atPollyjsUtils.atPollyjsUtilsMod.ACTIONS
import typings.atPollyjsUtils.atPollyjsUtilsMod.EXPIRY_STRATEGIES
import typings.atPollyjsUtils.atPollyjsUtilsMod.MODES
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/utils", JSImport.Namespace)
@js.native
object atPollyjsUtilsMod extends js.Object {
  @js.native
  sealed trait ACTIONS extends js.Object
  
  @js.native
  sealed trait EXPIRY_STRATEGIES extends js.Object
  
  @js.native
  sealed trait MODES extends js.Object
  
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
  
}

