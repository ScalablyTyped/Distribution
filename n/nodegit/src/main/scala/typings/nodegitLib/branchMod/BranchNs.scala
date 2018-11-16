package typings
package nodegitLib.branchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/branch", "Branch")
@js.native
object BranchNs extends js.Object {
  @js.native
  sealed trait BRANCH extends js.Object
  
  @js.native
  object BRANCH extends js.Object {
    @js.native
    sealed trait ALL
      extends nodegitLib.branchMod.BranchNs.BRANCH
    
    @js.native
    sealed trait LOCAL
      extends nodegitLib.branchMod.BranchNs.BRANCH
    
    @js.native
    sealed trait REMOTE
      extends nodegitLib.branchMod.BranchNs.BRANCH
    
    /* 3 */ val ALL: ALL with scala.Double = js.native
    /* 1 */ val LOCAL: LOCAL with scala.Double = js.native
    /* 2 */ val REMOTE: REMOTE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.branchMod.BranchNs.BRANCH with scala.Double] = js.native
  }
  
}

