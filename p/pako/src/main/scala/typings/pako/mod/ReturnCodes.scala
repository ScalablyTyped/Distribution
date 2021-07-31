package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReturnCodes extends StObject
@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReturnCodes & Double] = js.native
  
  @js.native
  sealed trait Z_BUF_ERROR
    extends StObject
       with ReturnCodes
  /* -5 */ val Z_BUF_ERROR: typings.pako.mod.ReturnCodes.Z_BUF_ERROR & Double = js.native
  
  @js.native
  sealed trait Z_DATA_ERROR
    extends StObject
       with ReturnCodes
  /* -3 */ val Z_DATA_ERROR: typings.pako.mod.ReturnCodes.Z_DATA_ERROR & Double = js.native
  
  @js.native
  sealed trait Z_ERRNO
    extends StObject
       with ReturnCodes
  /* -1 */ val Z_ERRNO: typings.pako.mod.ReturnCodes.Z_ERRNO & Double = js.native
  
  @js.native
  sealed trait Z_NEED_DICT
    extends StObject
       with ReturnCodes
  /* 2 */ val Z_NEED_DICT: typings.pako.mod.ReturnCodes.Z_NEED_DICT & Double = js.native
  
  @js.native
  sealed trait Z_OK
    extends StObject
       with ReturnCodes
  /* 0 */ val Z_OK: typings.pako.mod.ReturnCodes.Z_OK & Double = js.native
  
  @js.native
  sealed trait Z_STREAM_END
    extends StObject
       with ReturnCodes
  /* 1 */ val Z_STREAM_END: typings.pako.mod.ReturnCodes.Z_STREAM_END & Double = js.native
  
  @js.native
  sealed trait Z_STREAM_ERROR
    extends StObject
       with ReturnCodes
  /* -2 */ val Z_STREAM_ERROR: typings.pako.mod.ReturnCodes.Z_STREAM_ERROR & Double = js.native
}
