package typings.pollyjsUtils

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pollyjs/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ACTIONS with String] = js.native
    /* "intercept" */ @js.native
    object INTERCEPT extends TopLevel[INTERCEPT with String]
    
    /* "passthrough" */ @js.native
    object PASSTHROUGH extends TopLevel[PASSTHROUGH with String]
    
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    /* "replay" */ @js.native
    object REPLAY extends TopLevel[REPLAY with String]
    
  }
  
  @js.native
  object EXPIRY_STRATEGIES extends js.Object {
    @js.native
    sealed trait ERROR extends EXPIRY_STRATEGIES
    
    @js.native
    sealed trait RECORD extends EXPIRY_STRATEGIES
    
    @js.native
    sealed trait WARN extends EXPIRY_STRATEGIES
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EXPIRY_STRATEGIES with String] = js.native
    /* "error" */ @js.native
    object ERROR extends TopLevel[ERROR with String]
    
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    /* "warn" */ @js.native
    object WARN extends TopLevel[WARN with String]
    
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MODES with String] = js.native
    /* "passthrough" */ @js.native
    object PASSTHROUGH extends TopLevel[PASSTHROUGH with String]
    
    /* "record" */ @js.native
    object RECORD extends TopLevel[RECORD with String]
    
    /* "replay" */ @js.native
    object REPLAY extends TopLevel[REPLAY with String]
    
    /* "stopped" */ @js.native
    object STOPPED extends TopLevel[STOPPED with String]
    
  }
  
}

