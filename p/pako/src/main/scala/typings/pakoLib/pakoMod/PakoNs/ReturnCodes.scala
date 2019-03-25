package typings
package pakoLib.pakoMod.PakoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReturnCodes extends js.Object

@JSImport("pako/Pako", "ReturnCodes")
@js.native
object ReturnCodes extends js.Object {
  @js.native
  sealed trait Z_BUF_ERROR
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_DATA_ERROR
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_ERRNO
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_NEED_DICT
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_OK
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_END
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_ERROR
    extends pakoLib.pakoMod.PakoNs.ReturnCodes
  
}

