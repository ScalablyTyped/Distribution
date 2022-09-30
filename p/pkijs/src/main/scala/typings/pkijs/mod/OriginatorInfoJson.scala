package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginatorInfoJson extends StObject {
  
  var certs: js.UndefOr[CertificateSetJson] = js.undefined
  
  var crls: js.UndefOr[RevocationInfoChoicesJson] = js.undefined
}
object OriginatorInfoJson {
  
  inline def apply(): OriginatorInfoJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginatorInfoJson]
  }
  
  extension [Self <: OriginatorInfoJson](x: Self) {
    
    inline def setCerts(value: CertificateSetJson): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCrls(value: RevocationInfoChoicesJson): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
  }
}
