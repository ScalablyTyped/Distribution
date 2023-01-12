package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcKeyType extends StObject {
  
  /** Optional. A signature algorithm that must be used. If this is omitted, any EC-based signature algorithm will be allowed. */
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
}
object EcKeyType {
  
  inline def apply(): EcKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcKeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcKeyType] (val x: Self) extends AnyVal {
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
  }
}
