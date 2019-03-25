package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlushValues extends js.Object

@JSImport("pako/Pako", "FlushValues")
@js.native
object FlushValues extends js.Object {
  @js.native
  sealed trait Z_BLOCK
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_FINISH
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_FULL_FLUSH
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_NO_FLUSH
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_SYNC_FLUSH
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
  @js.native
  sealed trait Z_TREES
    extends pakoLib.pakoMod.PakoNs.FlushValues
  
}

