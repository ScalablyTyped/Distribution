package typings
package nodegitLib.hashDashSigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/hash-sig", "Hashsig")
@js.native
object HashsigNs extends js.Object {
  @js.native
  sealed trait OPTION extends js.Object
  
  @js.native
  object OPTION extends js.Object {
    @js.native
    sealed trait ALLOW_SMALL_FILES
      extends nodegitLib.hashDashSigMod.HashsigNs.OPTION
    
    @js.native
    sealed trait IGNORE_WHITESPACE
      extends nodegitLib.hashDashSigMod.HashsigNs.OPTION
    
    @js.native
    sealed trait NORMAL
      extends nodegitLib.hashDashSigMod.HashsigNs.OPTION
    
    @js.native
    sealed trait SMART_WHITESPACE
      extends nodegitLib.hashDashSigMod.HashsigNs.OPTION
    
    /* 4 */ val ALLOW_SMALL_FILES: ALLOW_SMALL_FILES with scala.Double = js.native
    /* 1 */ val IGNORE_WHITESPACE: IGNORE_WHITESPACE with scala.Double = js.native
    /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
    /* 2 */ val SMART_WHITESPACE: SMART_WHITESPACE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.hashDashSigMod.HashsigNs.OPTION with scala.Double] = js.native
  }
  
}

