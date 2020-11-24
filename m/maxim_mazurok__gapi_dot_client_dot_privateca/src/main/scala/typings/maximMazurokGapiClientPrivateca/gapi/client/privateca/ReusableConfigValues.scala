package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableConfigValues extends js.Object {
  
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
  implicit class ReusableConfigValuesOps[Self <: ReusableConfigValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalExtensionsVarargs(value: X509Extension*): Self = this.set("additionalExtensions", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalExtensions(value: js.Array[X509Extension]): Self = this.set("additionalExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalExtensions: Self = this.set("additionalExtensions", js.undefined)
    
    @scala.inline
    def setAiaOcspServersVarargs(value: String*): Self = this.set("aiaOcspServers", js.Array(value :_*))
    
    @scala.inline
    def setAiaOcspServers(value: js.Array[String]): Self = this.set("aiaOcspServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAiaOcspServers: Self = this.set("aiaOcspServers", js.undefined)
    
    @scala.inline
    def setCaOptions(value: CaOptions): Self = this.set("caOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaOptions: Self = this.set("caOptions", js.undefined)
    
    @scala.inline
    def setKeyUsage(value: KeyUsage): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUsage: Self = this.set("keyUsage", js.undefined)
    
    @scala.inline
    def setPolicyIdsVarargs(value: ObjectId*): Self = this.set("policyIds", js.Array(value :_*))
    
    @scala.inline
    def setPolicyIds(value: js.Array[ObjectId]): Self = this.set("policyIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyIds: Self = this.set("policyIds", js.undefined)
  }
}
