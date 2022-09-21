package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaKeyType extends StObject {
  
  /**
    * Optional. The maximum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service will not enforce an explicit upper bound on RSA modulus
    * sizes.
    */
  var maxModulusSize: js.UndefOr[String] = js.undefined
  
  /** Optional. The minimum allowed RSA modulus size (inclusive), in bits. If this is not set, or if set to zero, the service-level min RSA modulus size will continue to apply. */
  var minModulusSize: js.UndefOr[String] = js.undefined
}
object RsaKeyType {
  
  inline def apply(): RsaKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RsaKeyType]
  }
  
  extension [Self <: RsaKeyType](x: Self) {
    
    inline def setMaxModulusSize(value: String): Self = StObject.set(x, "maxModulusSize", value.asInstanceOf[js.Any])
    
    inline def setMaxModulusSizeUndefined: Self = StObject.set(x, "maxModulusSize", js.undefined)
    
    inline def setMinModulusSize(value: String): Self = StObject.set(x, "minModulusSize", value.asInstanceOf[js.Any])
    
    inline def setMinModulusSizeUndefined: Self = StObject.set(x, "minModulusSize", js.undefined)
  }
}
