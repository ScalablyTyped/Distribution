package typings.pako.pakoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlushValues extends js.Object

@JSImport("pako", "FlushValues")
@js.native
object FlushValues extends js.Object {
  @js.native
  sealed trait Z_BLOCK extends FlushValues
  
  @js.native
  sealed trait Z_FINISH extends FlushValues
  
  @js.native
  sealed trait Z_FULL_FLUSH extends FlushValues
  
  @js.native
  sealed trait Z_NO_FLUSH extends FlushValues
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH extends FlushValues
  
  @js.native
  sealed trait Z_SYNC_FLUSH extends FlushValues
  
  @js.native
  sealed trait Z_TREES extends FlushValues
  
  /* 5 */ val Z_BLOCK: typings.pako.pakoMod.FlushValues.Z_BLOCK with Double = js.native
  /* 4 */ val Z_FINISH: typings.pako.pakoMod.FlushValues.Z_FINISH with Double = js.native
  /* 3 */ val Z_FULL_FLUSH: typings.pako.pakoMod.FlushValues.Z_FULL_FLUSH with Double = js.native
  /* 0 */ val Z_NO_FLUSH: typings.pako.pakoMod.FlushValues.Z_NO_FLUSH with Double = js.native
  /* 1 */ val Z_PARTIAL_FLUSH: typings.pako.pakoMod.FlushValues.Z_PARTIAL_FLUSH with Double = js.native
  /* 2 */ val Z_SYNC_FLUSH: typings.pako.pakoMod.FlushValues.Z_SYNC_FLUSH with Double = js.native
  /* 6 */ val Z_TREES: typings.pako.pakoMod.FlushValues.Z_TREES with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlushValues with Double] = js.native
}

