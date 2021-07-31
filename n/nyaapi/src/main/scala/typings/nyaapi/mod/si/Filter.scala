package typings.nyaapi.mod.si

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Filter extends StObject
@JSImport("nyaapi", "si.Filter")
@js.native
object Filter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Filter & Double] = js.native
  
  @js.native
  sealed trait NO_FILTER
    extends StObject
       with Filter
  /* 0 */ val NO_FILTER: typings.nyaapi.mod.si.Filter.NO_FILTER & Double = js.native
  
  @js.native
  sealed trait NO_REMAKES
    extends StObject
       with Filter
  /* 1 */ val NO_REMAKES: typings.nyaapi.mod.si.Filter.NO_REMAKES & Double = js.native
  
  @js.native
  sealed trait TRUSTED_ONLY
    extends StObject
       with Filter
  /* 2 */ val TRUSTED_ONLY: typings.nyaapi.mod.si.Filter.TRUSTED_ONLY & Double = js.native
}
