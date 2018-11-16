package typings
package nodegitLib.odbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/odb", "Odb")
@js.native
object OdbNs extends js.Object {
  @js.native
  sealed trait STREAM extends js.Object
  
  @js.native
  object STREAM extends js.Object {
    @js.native
    sealed trait RDONLY
      extends nodegitLib.odbMod.OdbNs.STREAM
    
    @js.native
    sealed trait RW
      extends nodegitLib.odbMod.OdbNs.STREAM
    
    @js.native
    sealed trait WRONLY
      extends nodegitLib.odbMod.OdbNs.STREAM
    
    /* 2 */ val RDONLY: RDONLY with scala.Double = js.native
    /* 6 */ val RW: RW with scala.Double = js.native
    /* 4 */ val WRONLY: WRONLY with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodegitLib.odbMod.OdbNs.STREAM with scala.Double] = js.native
  }
  
}

