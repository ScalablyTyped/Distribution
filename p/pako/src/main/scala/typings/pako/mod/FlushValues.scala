package typings.pako.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlushValues extends js.Object
@JSImport("pako", "FlushValues")
@js.native
object FlushValues extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlushValues with Double] = js.native
  
  @js.native
  sealed trait Z_BLOCK extends FlushValues
  /* 5 */ @js.native
  object Z_BLOCK extends TopLevel[Z_BLOCK with Double]
  
  @js.native
  sealed trait Z_FINISH extends FlushValues
  /* 4 */ @js.native
  object Z_FINISH extends TopLevel[Z_FINISH with Double]
  
  @js.native
  sealed trait Z_FULL_FLUSH extends FlushValues
  /* 3 */ @js.native
  object Z_FULL_FLUSH extends TopLevel[Z_FULL_FLUSH with Double]
  
  @js.native
  sealed trait Z_NO_FLUSH extends FlushValues
  /* 0 */ @js.native
  object Z_NO_FLUSH extends TopLevel[Z_NO_FLUSH with Double]
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH extends FlushValues
  /* 1 */ @js.native
  object Z_PARTIAL_FLUSH extends TopLevel[Z_PARTIAL_FLUSH with Double]
  
  @js.native
  sealed trait Z_SYNC_FLUSH extends FlushValues
  /* 2 */ @js.native
  object Z_SYNC_FLUSH extends TopLevel[Z_SYNC_FLUSH with Double]
  
  @js.native
  sealed trait Z_TREES extends FlushValues
  /* 6 */ @js.native
  object Z_TREES extends TopLevel[Z_TREES with Double]
}
