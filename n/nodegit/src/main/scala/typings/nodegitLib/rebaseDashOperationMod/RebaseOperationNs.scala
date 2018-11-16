package typings
package nodegitLib.rebaseDashOperationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rebase-operation", "RebaseOperation")
@js.native
object RebaseOperationNs extends js.Object {
  @js.native
  sealed trait REBASE_OPERATION extends js.Object
  
  @js.native
  object REBASE_OPERATION extends js.Object {
    @js.native
    sealed trait EDIT
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    @js.native
    sealed trait EXEC
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    @js.native
    sealed trait FIXUP
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    @js.native
    sealed trait PICK
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    @js.native
    sealed trait REWORD
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    @js.native
    sealed trait SQUASH
      extends nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION
    
    /* 2 */ val EDIT: EDIT with scala.Double = js.native
    /* 5 */ val EXEC: EXEC with scala.Double = js.native
    /* 4 */ val FIXUP: FIXUP with scala.Double = js.native
    /* 0 */ val PICK: PICK with scala.Double = js.native
    /* 1 */ val REWORD: REWORD with scala.Double = js.native
    /* 3 */ val SQUASH: SQUASH with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        nodegitLib.rebaseDashOperationMod.RebaseOperationNs.REBASE_OPERATION with scala.Double
      ] = js.native
  }
  
}

