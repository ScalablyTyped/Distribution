package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashAlgorithm extends StObject {
  
  var hashAlgorithm: js.UndefOr[String] = js.undefined
  
  var hashAlgorithmObject: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var issuerKeyHash: js.UndefOr[String] = js.undefined
  
  var issuerNameHash: js.UndefOr[String] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
}
object HashAlgorithm {
  
  inline def apply(): HashAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmObject(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "hashAlgorithmObject", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmObjectUndefined: Self = StObject.set(x, "hashAlgorithmObject", js.undefined)
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setIssuerKeyHash(value: String): Self = StObject.set(x, "issuerKeyHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerKeyHashUndefined: Self = StObject.set(x, "issuerKeyHash", js.undefined)
    
    inline def setIssuerNameHash(value: String): Self = StObject.set(x, "issuerNameHash", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameHashUndefined: Self = StObject.set(x, "issuerNameHash", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
  }
}
