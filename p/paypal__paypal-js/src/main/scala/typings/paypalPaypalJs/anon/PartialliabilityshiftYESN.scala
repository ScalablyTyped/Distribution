package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.NO
import typings.paypalPaypalJs.paypalPaypalJsStrings.POSSIBLE
import typings.paypalPaypalJs.paypalPaypalJsStrings.UNKNOWN
import typings.paypalPaypalJs.paypalPaypalJsStrings.YES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  liability_shift :'YES' | 'NO' | 'POSSIBLE' | 'UNKNOWN',   three_d_secure :std.Partial<{  authentication_status :'Y' | 'N' | 'U' | 'A' | 'C' | 'R' | 'D' | 'I',   enrollment_status :'Y' | 'N' | 'U' | 'B'}>}> */
trait PartialliabilityshiftYESN extends StObject {
  
  var liability_shift: js.UndefOr[YES | NO | POSSIBLE | UNKNOWN] = js.undefined
  
  var three_d_secure: js.UndefOr[Partialauthenticationstat] = js.undefined
}
object PartialliabilityshiftYESN {
  
  inline def apply(): PartialliabilityshiftYESN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialliabilityshiftYESN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialliabilityshiftYESN] (val x: Self) extends AnyVal {
    
    inline def setLiability_shift(value: YES | NO | POSSIBLE | UNKNOWN): Self = StObject.set(x, "liability_shift", value.asInstanceOf[js.Any])
    
    inline def setLiability_shiftUndefined: Self = StObject.set(x, "liability_shift", js.undefined)
    
    inline def setThree_d_secure(value: Partialauthenticationstat): Self = StObject.set(x, "three_d_secure", value.asInstanceOf[js.Any])
    
    inline def setThree_d_secureUndefined: Self = StObject.set(x, "three_d_secure", js.undefined)
  }
}
