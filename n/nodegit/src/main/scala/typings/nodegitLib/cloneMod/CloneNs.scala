package typings
package nodegitLib.cloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/clone", "Clone")
@js.native
object CloneNs extends js.Object {
  @js.native
  sealed trait LOCAL extends js.Object
  
  @js.native
  object LOCAL extends js.Object {
    @js.native
    sealed trait AUTO
      extends nodegitLib.cloneMod.CloneNs.LOCAL
    
    @js.native
    sealed trait LOCAL
      extends nodegitLib.cloneMod.CloneNs.LOCAL
    
    @js.native
    sealed trait NO_LINKS
      extends nodegitLib.cloneMod.CloneNs.LOCAL
    
    @js.native
    sealed trait NO_LOCAL
      extends nodegitLib.cloneMod.CloneNs.LOCAL
    
    /* 0 */ val AUTO: AUTO with scala.Double = js.native
    /* 1 */ val LOCAL: LOCAL with scala.Double = js.native
    /* 3 */ val NO_LINKS: NO_LINKS with scala.Double = js.native
    /* 2 */ val NO_LOCAL: NO_LOCAL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.cloneMod.CloneNs.LOCAL with scala.Double] = js.native
  }
  
}

