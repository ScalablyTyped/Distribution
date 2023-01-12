package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuerName extends StObject {
  
  var baseCertificateID: js.UndefOr[String] = js.undefined
  
  var issuerName: js.UndefOr[String] = js.undefined
  
  var objectDigestInfo: js.UndefOr[String] = js.undefined
}
object IssuerName {
  
  inline def apply(): IssuerName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuerName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuerName] (val x: Self) extends AnyVal {
    
    inline def setBaseCertificateID(value: String): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setObjectDigestInfo(value: String): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
