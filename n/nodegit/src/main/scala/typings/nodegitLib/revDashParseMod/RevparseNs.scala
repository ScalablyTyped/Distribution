package typings
package nodegitLib.revDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rev-parse", "Revparse")
@js.native
object RevparseNs extends js.Object {
  @js.native
  sealed trait MODE extends js.Object
  
  @js.native
  object MODE extends js.Object {
    @js.native
    sealed trait MERGE_BASE
      extends nodegitLib.revDashParseMod.RevparseNs.MODE
    
    @js.native
    sealed trait RANGE
      extends nodegitLib.revDashParseMod.RevparseNs.MODE
    
    @js.native
    sealed trait SINGLE
      extends nodegitLib.revDashParseMod.RevparseNs.MODE
    
    /* 4 */ val MERGE_BASE: MERGE_BASE with scala.Double = js.native
    /* 2 */ val RANGE: RANGE with scala.Double = js.native
    /* 1 */ val SINGLE: SINGLE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.revDashParseMod.RevparseNs.MODE with scala.Double] = js.native
  }
  
}

