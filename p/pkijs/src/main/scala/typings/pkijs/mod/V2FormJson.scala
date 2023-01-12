package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V2FormJson extends StObject {
  
  var baseCertificateID: js.UndefOr[IssuerSerialJson] = js.undefined
  
  var issuerName: js.UndefOr[GeneralNamesJson] = js.undefined
  
  var objectDigestInfo: js.UndefOr[ObjectDigestInfoJson] = js.undefined
}
object V2FormJson {
  
  inline def apply(): V2FormJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V2FormJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: V2FormJson] (val x: Self) extends AnyVal {
    
    inline def setBaseCertificateID(value: IssuerSerialJson): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setIssuerName(value: GeneralNamesJson): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setObjectDigestInfo(value: ObjectDigestInfoJson): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
