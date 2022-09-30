package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHolder extends StObject {
  
  var baseCertificateID: js.UndefOr[IssuerSerial] = js.undefined
  
  var entityName: js.UndefOr[GeneralNames] = js.undefined
  
  var objectDigestInfo: js.UndefOr[ObjectDigestInfo] = js.undefined
}
object IHolder {
  
  inline def apply(): IHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHolder]
  }
  
  extension [Self <: IHolder](x: Self) {
    
    inline def setBaseCertificateID(value: IssuerSerial): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setEntityName(value: GeneralNames): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    inline def setObjectDigestInfo(value: ObjectDigestInfo): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
