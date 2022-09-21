package typings.nodeForge.anon

import typings.nodeForge.mod.pki.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidityCheckDate extends StObject {
  
  var validityCheckDate: js.UndefOr[js.Date | Null] = js.undefined
  
  var verify: js.UndefOr[
    js.Function3[
      /* verified */ Boolean | String, 
      /* depth */ Double, 
      /* certs */ js.Array[Certificate], 
      Boolean
    ]
  ] = js.undefined
}
object ValidityCheckDate {
  
  inline def apply(): ValidityCheckDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidityCheckDate]
  }
  
  extension [Self <: ValidityCheckDate](x: Self) {
    
    inline def setValidityCheckDate(value: js.Date): Self = StObject.set(x, "validityCheckDate", value.asInstanceOf[js.Any])
    
    inline def setValidityCheckDateNull: Self = StObject.set(x, "validityCheckDate", null)
    
    inline def setValidityCheckDateUndefined: Self = StObject.set(x, "validityCheckDate", js.undefined)
    
    inline def setVerify(
      value: (/* verified */ Boolean | String, /* depth */ Double, /* certs */ js.Array[Certificate]) => Boolean
    ): Self = StObject.set(x, "verify", js.Any.fromFunction3(value))
    
    inline def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}
