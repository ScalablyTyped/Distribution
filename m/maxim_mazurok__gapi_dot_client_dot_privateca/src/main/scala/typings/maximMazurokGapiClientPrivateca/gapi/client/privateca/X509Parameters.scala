package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509Parameters extends StObject {
  
  /** Optional. Describes custom X.509 extensions. */
  var additionalExtensions: js.UndefOr[js.Array[X509Extension]] = js.undefined
  
  /** Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate. */
  var aiaOcspServers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. Describes options in this X509Parameters that are relevant in a CA certificate. */
  var caOptions: js.UndefOr[CaOptions] = js.undefined
  
  /** Optional. Indicates the intended use for keys that correspond to a certificate. */
  var keyUsage: js.UndefOr[KeyUsage] = js.undefined
  
  /** Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4. */
  var policyIds: js.UndefOr[js.Array[ObjectId]] = js.undefined
}
object X509Parameters {
  
  inline def apply(): X509Parameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509Parameters]
  }
  
  extension [Self <: X509Parameters](x: Self) {
    
    inline def setAdditionalExtensions(value: js.Array[X509Extension]): Self = StObject.set(x, "additionalExtensions", value.asInstanceOf[js.Any])
    
    inline def setAdditionalExtensionsUndefined: Self = StObject.set(x, "additionalExtensions", js.undefined)
    
    inline def setAdditionalExtensionsVarargs(value: X509Extension*): Self = StObject.set(x, "additionalExtensions", js.Array(value*))
    
    inline def setAiaOcspServers(value: js.Array[String]): Self = StObject.set(x, "aiaOcspServers", value.asInstanceOf[js.Any])
    
    inline def setAiaOcspServersUndefined: Self = StObject.set(x, "aiaOcspServers", js.undefined)
    
    inline def setAiaOcspServersVarargs(value: String*): Self = StObject.set(x, "aiaOcspServers", js.Array(value*))
    
    inline def setCaOptions(value: CaOptions): Self = StObject.set(x, "caOptions", value.asInstanceOf[js.Any])
    
    inline def setCaOptionsUndefined: Self = StObject.set(x, "caOptions", js.undefined)
    
    inline def setKeyUsage(value: KeyUsage): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
    
    inline def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
    
    inline def setPolicyIds(value: js.Array[ObjectId]): Self = StObject.set(x, "policyIds", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdsUndefined: Self = StObject.set(x, "policyIds", js.undefined)
    
    inline def setPolicyIdsVarargs(value: ObjectId*): Self = StObject.set(x, "policyIds", js.Array(value*))
  }
}
