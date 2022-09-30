package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttCertValidityPeriod extends StObject {
  
  var notAfterTime: js.Date
  
  var notBeforeTime: js.Date
}
object IAttCertValidityPeriod {
  
  inline def apply(notAfterTime: js.Date, notBeforeTime: js.Date): IAttCertValidityPeriod = {
    val __obj = js.Dynamic.literal(notAfterTime = notAfterTime.asInstanceOf[js.Any], notBeforeTime = notBeforeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttCertValidityPeriod]
  }
  
  extension [Self <: IAttCertValidityPeriod](x: Self) {
    
    inline def setNotAfterTime(value: js.Date): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTime(value: js.Date): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
  }
}
