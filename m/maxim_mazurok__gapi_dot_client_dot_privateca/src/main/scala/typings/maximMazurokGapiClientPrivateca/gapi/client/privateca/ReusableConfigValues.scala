package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableConfigValues extends StObject {
  
  /** Optional. Describes custom X.509 extensions. */
  var additionalExtensions: js.UndefOr[js.Array[X509Extension]] = js.native
  
  /** Optional. Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the "Authority Information Access" extension in the certificate. */
  var aiaOcspServers: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. Describes options in this ReusableConfigValues that are relevant in a CA certificate. */
  var caOptions: js.UndefOr[CaOptions] = js.native
  
  /** Optional. Indicates the intended use for keys that correspond to a certificate. */
  var keyUsage: js.UndefOr[KeyUsage] = js.native
  
  /** Optional. Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4. */
  var policyIds: js.UndefOr[js.Array[ObjectId]] = js.native
}
object ReusableConfigValues {
  
  @scala.inline
  def apply(): ReusableConfigValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReusableConfigValues]
  }
  
  @scala.inline
  implicit class ReusableConfigValuesMutableBuilder[Self <: ReusableConfigValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalExtensions(value: js.Array[X509Extension]): Self = StObject.set(x, "additionalExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalExtensionsUndefined: Self = StObject.set(x, "additionalExtensions", js.undefined)
    
    @scala.inline
    def setAdditionalExtensionsVarargs(value: X509Extension*): Self = StObject.set(x, "additionalExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAiaOcspServers(value: js.Array[String]): Self = StObject.set(x, "aiaOcspServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAiaOcspServersUndefined: Self = StObject.set(x, "aiaOcspServers", js.undefined)
    
    @scala.inline
    def setAiaOcspServersVarargs(value: String*): Self = StObject.set(x, "aiaOcspServers", js.Array(value :_*))
    
    @scala.inline
    def setCaOptions(value: CaOptions): Self = StObject.set(x, "caOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaOptionsUndefined: Self = StObject.set(x, "caOptions", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsage): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsageUndefined: Self = StObject.set(x, "keyUsage", js.undefined)
    
    @scala.inline
    def setPolicyIds(value: js.Array[ObjectId]): Self = StObject.set(x, "policyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdsUndefined: Self = StObject.set(x, "policyIds", js.undefined)
    
    @scala.inline
    def setPolicyIdsVarargs(value: ObjectId*): Self = StObject.set(x, "policyIds", js.Array(value :_*))
  }
}
