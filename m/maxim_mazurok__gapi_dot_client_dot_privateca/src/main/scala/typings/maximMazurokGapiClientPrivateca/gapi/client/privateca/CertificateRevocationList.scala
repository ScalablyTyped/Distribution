package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRevocationList extends js.Object {
  
  /** Output only. The location where 'pem_crl' can be accessed. */
  var accessUrl: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this CertificateRevocationList was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateRevocationList with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The resource path for this CertificateRevocationList in the format `projects/∗/locations/∗/certificateAuthorities/∗/ certificateRevocationLists/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The PEM-encoded X.509 CRL. */
  var pemCrl: js.UndefOr[String] = js.native
  
  /** Output only. The revoked serial numbers that appear in pem_crl. */
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificate]] = js.native
  
  /** Output only. The CRL sequence number that appears in pem_crl. */
  var sequenceNumber: js.UndefOr[String] = js.native
  
  /** Output only. The State for this CertificateRevocationList. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The time at which this CertificateRevocationList was updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object CertificateRevocationList {
  
  @scala.inline
  def apply(): CertificateRevocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationList]
  }
  
  @scala.inline
  implicit class CertificateRevocationListOps[Self <: CertificateRevocationList] (val x: Self) extends AnyVal {
    
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
    def setAccessUrl(value: String): Self = this.set("accessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessUrl: Self = this.set("accessUrl", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateRevocationList with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPemCrl(value: String): Self = this.set("pemCrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCrl: Self = this.set("pemCrl", js.undefined)
    
    @scala.inline
    def setRevokedCertificatesVarargs(value: RevokedCertificate*): Self = this.set("revokedCertificates", js.Array(value :_*))
    
    @scala.inline
    def setRevokedCertificates(value: js.Array[RevokedCertificate]): Self = this.set("revokedCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevokedCertificates: Self = this.set("revokedCertificates", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("sequenceNumber", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
