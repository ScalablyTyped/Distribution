package typings.pollyjsUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pollyjs/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  sealed trait ACTIONS extends js.Object
  @js.native
  object ACTIONS extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
    
    @js.native
    sealed trait INTERCEPT extends ACTIONS
    /* "intercept" */ @js.native
    object INTERCEPT extends TopLevel[INTERCEPT with String]
    
    @js.native
    sealed trait PASSTHROUGH extends ACTIONS
    /* "passthrough" */ @js.native
    object PASSTHROUGH extends TopLevel[PASSTHROUGH with String]
    
    @js.native
    sealed trait RECORD extends ACTIONS
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    @js.native
    sealed trait REPLAY extends ACTIONS
    /* "replay" */ @js.native
    object REPLAY extends TopLevel[REPLAY with String]
  }
  
  @js.native
  sealed trait EXPIRY_STRATEGIES extends js.Object
  @js.native
  object EXPIRY_STRATEGIES extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EXPIRY_STRATEGIES with String] = js.native
    
    @js.native
    sealed trait ERROR extends EXPIRY_STRATEGIES
    /* "error" */ @js.native
    object ERROR extends TopLevel[ERROR with String]
    
    @js.native
    sealed trait RECORD extends EXPIRY_STRATEGIES
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    @js.native
    sealed trait WARN extends EXPIRY_STRATEGIES
    /* "warn" */ @js.native
    object WARN extends TopLevel[WARN with String]
  }
  
  @js.native
  sealed trait MODES extends js.Object
  @js.native
  object MODES extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MODES with String] = js.native
    
    @js.native
    sealed trait PASSTHROUGH extends MODES
    /* "passthrough" */ @js.native
    object PASSTHROUGH extends TopLevel[PASSTHROUGH with String]
    
    @js.native
    sealed trait RECORD extends MODES
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    @js.native
    sealed trait REPLAY extends MODES
    /* "replay" */ @js.native
    object REPLAY extends TopLevel[REPLAY with String]
    
    @js.native
    sealed trait STOPPED extends MODES
    /* "stopped" */ @js.native
    object STOPPED extends TopLevel[STOPPED with String]
  }
}
