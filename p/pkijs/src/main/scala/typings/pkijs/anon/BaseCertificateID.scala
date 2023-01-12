package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCertificateID extends StObject {
  
  var baseCertificateID: js.UndefOr[String] = js.undefined
  
  var entityName: js.UndefOr[String] = js.undefined
  
  var objectDigestInfo: js.UndefOr[String] = js.undefined
}
object BaseCertificateID {
  
  inline def apply(): BaseCertificateID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseCertificateID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseCertificateID] (val x: Self) extends AnyVal {
    
    inline def setBaseCertificateID(value: String): Self = StObject.set(x, "baseCertificateID", value.asInstanceOf[js.Any])
    
    inline def setBaseCertificateIDUndefined: Self = StObject.set(x, "baseCertificateID", js.undefined)
    
    inline def setEntityName(value: String): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNameUndefined: Self = StObject.set(x, "entityName", js.undefined)
    
    inline def setObjectDigestInfo(value: String): Self = StObject.set(x, "objectDigestInfo", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestInfoUndefined: Self = StObject.set(x, "objectDigestInfo", js.undefined)
  }
}
