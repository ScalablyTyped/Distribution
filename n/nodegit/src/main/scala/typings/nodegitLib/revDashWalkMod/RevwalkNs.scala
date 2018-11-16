package typings
package nodegitLib.revDashWalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/rev-walk", "Revwalk")
@js.native
object RevwalkNs extends js.Object {
  @js.native
  sealed trait SORT extends js.Object
  
  @js.native
  object SORT extends js.Object {
    @js.native
    sealed trait NONE
      extends nodegitLib.revDashWalkMod.RevwalkNs.SORT
    
    @js.native
    sealed trait REVERSE
      extends nodegitLib.revDashWalkMod.RevwalkNs.SORT
    
    @js.native
    sealed trait TIME
      extends nodegitLib.revDashWalkMod.RevwalkNs.SORT
    
    @js.native
    sealed trait TOPOLOGICAL
      extends nodegitLib.revDashWalkMod.RevwalkNs.SORT
    
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 4 */ val REVERSE: REVERSE with scala.Double = js.native
    /* 2 */ val TIME: TIME with scala.Double = js.native
    /* 1 */ val TOPOLOGICAL: TOPOLOGICAL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.revDashWalkMod.RevwalkNs.SORT with scala.Double] = js.native
  }
  
}

