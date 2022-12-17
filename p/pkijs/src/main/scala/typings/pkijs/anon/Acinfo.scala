package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import typings.pkijs.mod.AttributeCertificateInfoV1Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Acinfo extends StObject {
  
  var acinfo: js.UndefOr[AttributeCertificateInfoV1Schema] = js.undefined
  
  var signatureAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var signatureValue: js.UndefOr[String] = js.undefined
}
object Acinfo {
  
  inline def apply(): Acinfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acinfo]
  }
  
  extension [Self <: Acinfo](x: Self) {
    
    inline def setAcinfo(value: AttributeCertificateInfoV1Schema): Self = StObject.set(x, "acinfo", value.asInstanceOf[js.Any])
    
    inline def setAcinfoUndefined: Self = StObject.set(x, "acinfo", js.undefined)
    
    inline def setSignatureAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureValue(value: String): Self = StObject.set(x, "signatureValue", value.asInstanceOf[js.Any])
    
    inline def setSignatureValueUndefined: Self = StObject.set(x, "signatureValue", js.undefined)
  }
}
