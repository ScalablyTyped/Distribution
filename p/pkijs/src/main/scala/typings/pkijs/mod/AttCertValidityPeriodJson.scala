package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttCertValidityPeriodJson extends StObject {
  
  var notAfterTime: js.Date
  
  var notBeforeTime: js.Date
}
object AttCertValidityPeriodJson {
  
  inline def apply(notAfterTime: js.Date, notBeforeTime: js.Date): AttCertValidityPeriodJson = {
    val __obj = js.Dynamic.literal(notAfterTime = notAfterTime.asInstanceOf[js.Any], notBeforeTime = notBeforeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttCertValidityPeriodJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttCertValidityPeriodJson] (val x: Self) extends AnyVal {
    
    inline def setNotAfterTime(value: js.Date): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTime(value: js.Date): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
  }
}
