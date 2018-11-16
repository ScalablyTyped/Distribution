package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Revwalk")
@js.native
object RevwalkNs extends js.Object {
  @js.native
  object SORT extends js.Object {
    /* 0 */ val NONE: nodegitLib.revDashWalkMod.RevwalkNs.SORT.NONE with scala.Double = js.native
    /* 4 */ val REVERSE: nodegitLib.revDashWalkMod.RevwalkNs.SORT.REVERSE with scala.Double = js.native
    /* 2 */ val TIME: nodegitLib.revDashWalkMod.RevwalkNs.SORT.TIME with scala.Double = js.native
    /* 1 */ val TOPOLOGICAL: nodegitLib.revDashWalkMod.RevwalkNs.SORT.TOPOLOGICAL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.revDashWalkMod.RevwalkNs.SORT with scala.Double] = js.native
  }
  
  type SORT = nodegitLib.revDashWalkMod.RevwalkNs.SORT
}

