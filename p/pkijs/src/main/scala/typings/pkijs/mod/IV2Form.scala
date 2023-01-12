package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IV2Form extends StObject {
  
  var baseCertificateID: js.UndefOr[IssuerSerial] = js.undefined
  
  var issuerName: js.UndefOr[GeneralNames] = js.undefined
  
  var objectDigestInfo: js.UndefOr[ObjectDigestInfo] = js.undefined
}
object IV2Form {
  
  inline def apply(): IV2Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IV2Form]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IV2Form] (val x: Self) extends AnyVal {
    
    inline def setBaseCertificateID(value: IssuerSerial): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setIssuerName(value: GeneralNames): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setObjectDigestInfo(value: ObjectDigestInfo): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
