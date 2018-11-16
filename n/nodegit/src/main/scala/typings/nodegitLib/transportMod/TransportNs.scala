package typings
package nodegitLib.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/transport", "Transport")
@js.native
object TransportNs extends js.Object {
  @js.native
  sealed trait FLAGS extends js.Object
  
  @js.native
  object FLAGS extends js.Object {
    @js.native
    sealed trait NONE
      extends nodegitLib.transportMod.TransportNs.FLAGS
    
    /* 0 */ val NONE: NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.transportMod.TransportNs.FLAGS with scala.Double] = js.native
  }
  
}

