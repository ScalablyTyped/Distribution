package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReturnCodes extends StObject
@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReturnCodes with Double] = js.native
  
  @js.native
  sealed trait Z_BUF_ERROR extends ReturnCodes
  /* -5 */ val Z_BUF_ERROR: typings.pako.mod.ReturnCodes.Z_BUF_ERROR with Double = js.native
  
  @js.native
  sealed trait Z_DATA_ERROR extends ReturnCodes
  /* -3 */ val Z_DATA_ERROR: typings.pako.mod.ReturnCodes.Z_DATA_ERROR with Double = js.native
  
  @js.native
  sealed trait Z_ERRNO extends ReturnCodes
  /* -1 */ val Z_ERRNO: typings.pako.mod.ReturnCodes.Z_ERRNO with Double = js.native
  
  @js.native
  sealed trait Z_NEED_DICT extends ReturnCodes
  /* 2 */ val Z_NEED_DICT: typings.pako.mod.ReturnCodes.Z_NEED_DICT with Double = js.native
  
  @js.native
  sealed trait Z_OK extends ReturnCodes
  /* 0 */ val Z_OK: typings.pako.mod.ReturnCodes.Z_OK with Double = js.native
  
  @js.native
  sealed trait Z_STREAM_END extends ReturnCodes
  /* 1 */ val Z_STREAM_END: typings.pako.mod.ReturnCodes.Z_STREAM_END with Double = js.native
  
  @js.native
  sealed trait Z_STREAM_ERROR extends ReturnCodes
  /* -2 */ val Z_STREAM_ERROR: typings.pako.mod.ReturnCodes.Z_STREAM_ERROR with Double = js.native
}
