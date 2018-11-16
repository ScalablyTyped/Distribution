package typings
package nodegitLib.filterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/filter", "Filter")
@js.native
object FilterNs extends js.Object {
  @js.native
  sealed trait FLAG extends js.Object
  
  @js.native
  sealed trait MODE extends js.Object
  
  @js.native
  object FLAG extends js.Object {
    @js.native
    sealed trait ALLOW_UNSAFE
      extends nodegitLib.filterMod.FilterNs.FLAG
    
    @js.native
    sealed trait DEFAULT
      extends nodegitLib.filterMod.FilterNs.FLAG
    
    /* 1 */ val ALLOW_UNSAFE: ALLOW_UNSAFE with scala.Double = js.native
    /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.filterMod.FilterNs.FLAG with scala.Double] = js.native
  }
  
  @js.native
  object MODE extends js.Object {
    @js.native
    sealed trait CLEAN
      extends nodegitLib.filterMod.FilterNs.MODE
    
    @js.native
    sealed trait SMUDGE
      extends nodegitLib.filterMod.FilterNs.MODE
    
    @js.native
    sealed trait TO_ODB
      extends nodegitLib.filterMod.FilterNs.MODE
    
    @js.native
    sealed trait TO_WORKTREE
      extends nodegitLib.filterMod.FilterNs.MODE
    
    /* 1 */ val CLEAN: CLEAN with scala.Double = js.native
    /* 0 */ val SMUDGE: SMUDGE with scala.Double = js.native
    /* 1 */ val TO_ODB: TO_ODB with scala.Double = js.native
    /* 0 */ val TO_WORKTREE: TO_WORKTREE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.filterMod.FilterNs.MODE with scala.Double] = js.native
  }
  
}

