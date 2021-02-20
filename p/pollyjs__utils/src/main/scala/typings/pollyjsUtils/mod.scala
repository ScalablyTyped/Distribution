package typings.pollyjsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ACTIONS extends StObject
  @JSImport("@pollyjs/utils", "ACTIONS")
  @js.native
  object ACTIONS extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
    
    @js.native
    sealed trait INTERCEPT extends ACTIONS
    /* "intercept" */ val INTERCEPT: typings.pollyjsUtils.mod.ACTIONS.INTERCEPT with String = js.native
    
    @js.native
    sealed trait PASSTHROUGH extends ACTIONS
    /* "passthrough" */ val PASSTHROUGH: typings.pollyjsUtils.mod.ACTIONS.PASSTHROUGH with String = js.native
    
    @js.native
    sealed trait RECORD extends ACTIONS
    /* "record" */ val RECORD: typings.pollyjsUtils.mod.ACTIONS.RECORD with String = js.native
    
    @js.native
    sealed trait REPLAY extends ACTIONS
    /* "replay" */ val REPLAY: typings.pollyjsUtils.mod.ACTIONS.REPLAY with String = js.native
  }
  
  @js.native
  sealed trait EXPIRY_STRATEGIES extends StObject
  @JSImport("@pollyjs/utils", "EXPIRY_STRATEGIES")
  @js.native
  object EXPIRY_STRATEGIES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EXPIRY_STRATEGIES with String] = js.native
    
    @js.native
    sealed trait ERROR extends EXPIRY_STRATEGIES
    /* "error" */ val ERROR: typings.pollyjsUtils.mod.EXPIRY_STRATEGIES.ERROR with String = js.native
    
    @js.native
    sealed trait RECORD extends EXPIRY_STRATEGIES
    /* "record" */ val RECORD: typings.pollyjsUtils.mod.EXPIRY_STRATEGIES.RECORD with String = js.native
    
    @js.native
    sealed trait WARN extends EXPIRY_STRATEGIES
    /* "warn" */ val WARN: typings.pollyjsUtils.mod.EXPIRY_STRATEGIES.WARN with String = js.native
  }
  
  @js.native
  sealed trait MODES extends StObject
  @JSImport("@pollyjs/utils", "MODES")
  @js.native
  object MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MODES with String] = js.native
    
    @js.native
    sealed trait PASSTHROUGH extends MODES
    /* "passthrough" */ val PASSTHROUGH: typings.pollyjsUtils.mod.MODES.PASSTHROUGH with String = js.native
    
    @js.native
    sealed trait RECORD extends MODES
    /* "record" */ val RECORD: typings.pollyjsUtils.mod.MODES.RECORD with String = js.native
    
    @js.native
    sealed trait REPLAY extends MODES
    /* "replay" */ val REPLAY: typings.pollyjsUtils.mod.MODES.REPLAY with String = js.native
    
    @js.native
    sealed trait STOPPED extends MODES
    /* "stopped" */ val STOPPED: typings.pollyjsUtils.mod.MODES.STOPPED with String = js.native
  }
}
