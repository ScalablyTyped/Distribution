package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Filter extends StObject
@JSImport("nyaapi", "si.Filter")
@js.native
object Filter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Filter with Double] = js.native
  
  @js.native
  sealed trait NO_FILTER extends Filter
  /* 0 */ val NO_FILTER: typings.nyaapi.mod.si.Filter.NO_FILTER with Double = js.native
  
  @js.native
  sealed trait NO_REMAKES extends Filter
  /* 1 */ val NO_REMAKES: typings.nyaapi.mod.si.Filter.NO_REMAKES with Double = js.native
  
  @js.native
  sealed trait TRUSTED_ONLY extends Filter
  /* 2 */ val TRUSTED_ONLY: typings.nyaapi.mod.si.Filter.TRUSTED_ONLY with Double = js.native
}
