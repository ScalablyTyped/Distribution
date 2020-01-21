package typings.pako.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReturnCodes extends js.Object

@JSImport("pako", "ReturnCodes")
@js.native
object ReturnCodes extends js.Object {
  @js.native
  sealed trait Z_BUF_ERROR extends ReturnCodes
  
  @js.native
  sealed trait Z_DATA_ERROR extends ReturnCodes
  
  @js.native
  sealed trait Z_ERRNO extends ReturnCodes
  
  @js.native
  sealed trait Z_NEED_DICT extends ReturnCodes
  
  @js.native
  sealed trait Z_OK extends ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_END extends ReturnCodes
  
  @js.native
  sealed trait Z_STREAM_ERROR extends ReturnCodes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReturnCodes with Double] = js.native
  /* -5 */ @js.native
  object Z_BUF_ERROR extends TopLevel[Z_BUF_ERROR with Double]
  
  /* -3 */ @js.native
  object Z_DATA_ERROR extends TopLevel[Z_DATA_ERROR with Double]
  
  /* -1 */ @js.native
  object Z_ERRNO extends TopLevel[Z_ERRNO with Double]
  
  /* 2 */ @js.native
  object Z_NEED_DICT extends TopLevel[Z_NEED_DICT with Double]
  
  /* 0 */ @js.native
  object Z_OK extends TopLevel[Z_OK with Double]
  
  /* 1 */ @js.native
  object Z_STREAM_END extends TopLevel[Z_STREAM_END with Double]
  
  /* -2 */ @js.native
  object Z_STREAM_ERROR extends TopLevel[Z_STREAM_ERROR with Double]
  
}

