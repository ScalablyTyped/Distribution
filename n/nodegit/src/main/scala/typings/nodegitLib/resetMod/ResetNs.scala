package typings
package nodegitLib.resetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/reset", "Reset")
@js.native
object ResetNs extends js.Object {
  @js.native
  sealed trait TYPE extends js.Object
  
  @js.native
  object TYPE extends js.Object {
    @js.native
    sealed trait HARD
      extends nodegitLib.resetMod.ResetNs.TYPE
    
    @js.native
    sealed trait MIXED
      extends nodegitLib.resetMod.ResetNs.TYPE
    
    @js.native
    sealed trait SOFT
      extends nodegitLib.resetMod.ResetNs.TYPE
    
    /* 3 */ val HARD: HARD with scala.Double = js.native
    /* 2 */ val MIXED: MIXED with scala.Double = js.native
    /* 1 */ val SOFT: SOFT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.resetMod.ResetNs.TYPE with scala.Double] = js.native
  }
  
}

