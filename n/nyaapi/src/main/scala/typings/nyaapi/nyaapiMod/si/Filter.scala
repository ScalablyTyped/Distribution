package typings.nyaapi.nyaapiMod.si

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Filter extends js.Object

@JSImport("nyaapi", "si.Filter")
@js.native
object Filter extends js.Object {
  @js.native
  sealed trait NO_FILTER extends Filter
  
  @js.native
  sealed trait NO_REMAKES extends Filter
  
  @js.native
  sealed trait TRUSTED_ONLY extends Filter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Filter with Double] = js.native
  /* 0 */ @js.native
  object NO_FILTER extends TopLevel[NO_FILTER with Double]
  
  /* 1 */ @js.native
  object NO_REMAKES extends TopLevel[NO_REMAKES with Double]
  
  /* 2 */ @js.native
  object TRUSTED_ONLY extends TopLevel[TRUSTED_ONLY with Double]
  
}

