package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKeyUsagePeriodJson extends StObject {
  
  var notAfter: js.UndefOr[js.Date] = js.undefined
  
  var notBefore: js.UndefOr[js.Date] = js.undefined
}
object PrivateKeyUsagePeriodJson {
  
  inline def apply(): PrivateKeyUsagePeriodJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateKeyUsagePeriodJson]
  }
  
  extension [Self <: PrivateKeyUsagePeriodJson](x: Self) {
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
