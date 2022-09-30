package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HolderJson extends StObject {
  
  var baseCertificateID: js.UndefOr[IssuerSerialJson] = js.undefined
  
  var entityName: js.UndefOr[GeneralNamesJson] = js.undefined
  
  var objectDigestInfo: js.UndefOr[ObjectDigestInfoJson] = js.undefined
}
object HolderJson {
  
  inline def apply(): HolderJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HolderJson]
  }
  
  extension [Self <: HolderJson](x: Self) {
    
    inline def setBaseCertificateID(value: IssuerSerialJson): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setEntityName(value: GeneralNamesJson): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    inline def setObjectDigestInfo(value: ObjectDigestInfoJson): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
