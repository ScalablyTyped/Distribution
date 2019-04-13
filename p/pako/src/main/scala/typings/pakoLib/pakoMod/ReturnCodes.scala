package typings
package pakoLib.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReturnCodes extends js.Object

@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends js.Object {
  @js.native
  sealed trait Z_BUF_ERROR
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_DATA_ERROR
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_ERRNO
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_NEED_DICT
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_OK
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_END
    extends pakoLib.pakoMod.ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_ERROR
    extends pakoLib.pakoMod.ReturnCodes
  
  /* -5 */ val Z_BUF_ERROR: Z_BUF_ERROR with scala.Double = js.native
  /* -3 */ val Z_DATA_ERROR: Z_DATA_ERROR with scala.Double = js.native
  /* -1 */ val Z_ERRNO: Z_ERRNO with scala.Double = js.native
  /* 2 */ val Z_NEED_DICT: Z_NEED_DICT with scala.Double = js.native
  /* 0 */ val Z_OK: Z_OK with scala.Double = js.native
  /* 1 */ val Z_STREAM_END: Z_STREAM_END with scala.Double = js.native
  /* -2 */ val Z_STREAM_ERROR: Z_STREAM_ERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pakoLib.pakoMod.ReturnCodes with scala.Double] = js.native
}

