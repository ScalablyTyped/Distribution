package typings.pako.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReturnCodes extends js.Object
@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReturnCodes with Double] = js.native
  
  @js.native
  sealed trait Z_BUF_ERROR extends ReturnCodes
  /* -5 */ @js.native
  object Z_BUF_ERROR extends TopLevel[Z_BUF_ERROR with Double]
  
  @js.native
  sealed trait Z_DATA_ERROR extends ReturnCodes
  /* -3 */ @js.native
  object Z_DATA_ERROR extends TopLevel[Z_DATA_ERROR with Double]
  
  @js.native
  sealed trait Z_ERRNO extends ReturnCodes
  /* -1 */ @js.native
  object Z_ERRNO extends TopLevel[Z_ERRNO with Double]
  
  @js.native
  sealed trait Z_NEED_DICT extends ReturnCodes
  /* 2 */ @js.native
  object Z_NEED_DICT extends TopLevel[Z_NEED_DICT with Double]
  
  @js.native
  sealed trait Z_OK extends ReturnCodes
  /* 0 */ @js.native
  object Z_OK extends TopLevel[Z_OK with Double]
  
  @js.native
  sealed trait Z_STREAM_END extends ReturnCodes
  /* 1 */ @js.native
  object Z_STREAM_END extends TopLevel[Z_STREAM_END with Double]
  
  @js.native
  sealed trait Z_STREAM_ERROR extends ReturnCodes
  /* -2 */ @js.native
  object Z_STREAM_ERROR extends TopLevel[Z_STREAM_ERROR with Double]
}
