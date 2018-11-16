package typings
package nodegitLib.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/tree", "Tree")
@js.native
object TreeNs extends js.Object {
  @js.native
  sealed trait WALK_MODE extends js.Object
  
  @js.native
  object WALK_MODE extends js.Object {
    @js.native
    sealed trait WALK_POST
      extends nodegitLib.treeMod.TreeNs.WALK_MODE
    
    @js.native
    sealed trait WALK_PRE
      extends nodegitLib.treeMod.TreeNs.WALK_MODE
    
    /* 1 */ val WALK_POST: WALK_POST with scala.Double = js.native
    /* 0 */ val WALK_PRE: WALK_PRE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.treeMod.TreeNs.WALK_MODE with scala.Double] = js.native
  }
  
}

