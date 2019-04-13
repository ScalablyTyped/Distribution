package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Filter")
@js.native
object FilterNs extends js.Object {
  @js.native
  object FLAG extends js.Object {
    /* 1 */ val ALLOW_UNSAFE: nodegitLib.filterMod.FilterNs.FLAG.ALLOW_UNSAFE with scala.Double = js.native
    /* 0 */ val DEFAULT: nodegitLib.filterMod.FilterNs.FLAG.DEFAULT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.filterMod.FilterNs.FLAG with scala.Double] = js.native
  }
  
  @js.native
  object MODE extends js.Object {
    /* 1 */ val CLEAN: nodegitLib.filterMod.FilterNs.MODE.CLEAN with scala.Double = js.native
    /* 0 */ val SMUDGE: nodegitLib.filterMod.FilterNs.MODE.SMUDGE with scala.Double = js.native
    /* 1 */ val TO_ODB: nodegitLib.filterMod.FilterNs.MODE.TO_ODB with scala.Double = js.native
    /* 0 */ val TO_WORKTREE: nodegitLib.filterMod.FilterNs.MODE.TO_WORKTREE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.filterMod.FilterNs.MODE with scala.Double] = js.native
  }
  
}

