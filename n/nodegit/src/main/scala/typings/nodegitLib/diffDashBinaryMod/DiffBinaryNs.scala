package typings
package nodegitLib.diffDashBinaryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-binary", "DiffBinary")
@js.native
object DiffBinaryNs extends js.Object {
  @js.native
  sealed trait DIFF_BINARY extends js.Object
  
  @js.native
  object DIFF_BINARY extends js.Object {
    @js.native
    sealed trait DELTA
      extends nodegitLib.diffDashBinaryMod.DiffBinaryNs.DIFF_BINARY
    
    @js.native
    sealed trait LITERAL
      extends nodegitLib.diffDashBinaryMod.DiffBinaryNs.DIFF_BINARY
    
    @js.native
    sealed trait NONE
      extends nodegitLib.diffDashBinaryMod.DiffBinaryNs.DIFF_BINARY
    
    /* 2 */ val DELTA: DELTA with scala.Double = js.native
    /* 1 */ val LITERAL: LITERAL with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.diffDashBinaryMod.DiffBinaryNs.DIFF_BINARY with scala.Double] = js.native
  }
  
}

