package typings.pako.pakoMod

import org.scalablytyped.runtime.TopLevel
import typings.pako.pakoMod.FlushValues.Z_BLOCK
import typings.pako.pakoMod.FlushValues.Z_FINISH
import typings.pako.pakoMod.FlushValues.Z_FULL_FLUSH
import typings.pako.pakoMod.FlushValues.Z_NO_FLUSH
import typings.pako.pakoMod.FlushValues.Z_PARTIAL_FLUSH
import typings.pako.pakoMod.FlushValues.Z_SYNC_FLUSH
import typings.pako.pakoMod.FlushValues.Z_TREES
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlushValues with Double] = js.native
  /* 5 */ @js.native
  object Z_BLOCK extends TopLevel[Z_BLOCK with Double]
  
  /* 4 */ @js.native
  object Z_FINISH extends TopLevel[Z_FINISH with Double]
  
  /* 3 */ @js.native
  object Z_FULL_FLUSH extends TopLevel[Z_FULL_FLUSH with Double]
  
  /* 0 */ @js.native
  object Z_NO_FLUSH extends TopLevel[Z_NO_FLUSH with Double]
  
  /* 1 */ @js.native
  object Z_PARTIAL_FLUSH extends TopLevel[Z_PARTIAL_FLUSH with Double]
  
  /* 2 */ @js.native
  object Z_SYNC_FLUSH extends TopLevel[Z_SYNC_FLUSH with Double]
  
  /* 6 */ @js.native
  object Z_TREES extends TopLevel[Z_TREES with Double]
  
}

