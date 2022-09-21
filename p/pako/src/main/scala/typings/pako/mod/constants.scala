package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait constants extends StObject
@JSImport("pako", "constants")
@js.native
object constants extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[constants & Double] = js.native
  
  @js.native
  sealed trait Z_BLOCK
    extends StObject
       with constants
       with FlushValues
  /* 5 */ val Z_BLOCK: typings.pako.mod.constants.Z_BLOCK & Double = js.native
  
  @js.native
  sealed trait Z_BUF_ERROR
    extends StObject
       with constants
       with ReturnCodes
  /* -5 */ val Z_BUF_ERROR: typings.pako.mod.constants.Z_BUF_ERROR & Double = js.native
  
  @js.native
  sealed trait Z_DATA_ERROR
    extends StObject
       with constants
       with ReturnCodes
  /* -3 */ val Z_DATA_ERROR: typings.pako.mod.constants.Z_DATA_ERROR & Double = js.native
  
  @js.native
  sealed trait Z_DEFAULT_STRATEGY
    extends StObject
       with constants
       with ReturnCodes
       with StrategyValues
  /* 0 */ val Z_DEFAULT_STRATEGY: typings.pako.mod.constants.Z_DEFAULT_STRATEGY & Double = js.native
  
  @js.native
  sealed trait Z_ERRNO
    extends StObject
       with constants
       with ReturnCodes
  /* -1 */ val Z_ERRNO: typings.pako.mod.constants.Z_ERRNO & Double = js.native
  
  // StrategyValues
  @js.native
  sealed trait Z_FILTERED
    extends StObject
       with constants
       with StrategyValues
  /* 1 */ val Z_FILTERED: typings.pako.mod.constants.Z_FILTERED & Double = js.native
  
  @js.native
  sealed trait Z_FINISH
    extends StObject
       with constants
       with FlushValues
  /* 4 */ val Z_FINISH: typings.pako.mod.constants.Z_FINISH & Double = js.native
  
  @js.native
  sealed trait Z_FIXED
    extends StObject
       with constants
       with StrategyValues
  /* 4 */ val Z_FIXED: typings.pako.mod.constants.Z_FIXED & Double = js.native
  
  @js.native
  sealed trait Z_FULL_FLUSH
    extends StObject
       with constants
  /* 3 */ val Z_FULL_FLUSH: typings.pako.mod.constants.Z_FULL_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_HUFFMAN_ONLY
    extends StObject
       with constants
       with StrategyValues
  /* 2 */ val Z_HUFFMAN_ONLY: typings.pako.mod.constants.Z_HUFFMAN_ONLY & Double = js.native
  
  @js.native
  sealed trait Z_NEED_DICT
    extends StObject
       with constants
       with ReturnCodes
  /* 2 */ val Z_NEED_DICT: typings.pako.mod.constants.Z_NEED_DICT & Double = js.native
  
  // FlushValues
  @js.native
  sealed trait Z_NO_FLUSH
    extends StObject
       with constants
       with FlushValues
  /* 0 */ val Z_NO_FLUSH: typings.pako.mod.constants.Z_NO_FLUSH & Double = js.native
  
  // ReturnCodes
  @js.native
  sealed trait Z_OK
    extends StObject
       with constants
       with ReturnCodes
  /* 0 */ val Z_OK: typings.pako.mod.constants.Z_OK & Double = js.native
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH
    extends StObject
       with constants
       with FlushValues
  /* 1 */ val Z_PARTIAL_FLUSH: typings.pako.mod.constants.Z_PARTIAL_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_RLE
    extends StObject
       with constants
       with StrategyValues
  /* 3 */ val Z_RLE: typings.pako.mod.constants.Z_RLE & Double = js.native
  
  @js.native
  sealed trait Z_STREAM_END
    extends StObject
       with constants
       with ReturnCodes
  /* 1 */ val Z_STREAM_END: typings.pako.mod.constants.Z_STREAM_END & Double = js.native
  
  @js.native
  sealed trait Z_STREAM_ERROR
    extends StObject
       with constants
       with ReturnCodes
  /* -2 */ val Z_STREAM_ERROR: typings.pako.mod.constants.Z_STREAM_ERROR & Double = js.native
  
  @js.native
  sealed trait Z_SYNC_FLUSH
    extends StObject
       with constants
       with FlushValues
  /* 2 */ val Z_SYNC_FLUSH: typings.pako.mod.constants.Z_SYNC_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_TREES
    extends StObject
       with constants
       with FlushValues
  /* 6 */ val Z_TREES: typings.pako.mod.constants.Z_TREES & Double = js.native
}
