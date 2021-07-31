package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateRevocationList extends StObject {
  
  /** Output only. The location where 'pem_crl' can be accessed. */
  var accessUrl: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this CertificateRevocationList was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateRevocationList & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The resource path for this CertificateRevocationList in the format `projects/∗/locations/∗/certificateAuthorities/∗/ certificateRevocationLists/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The PEM-encoded X.509 CRL. */
  var pemCrl: js.UndefOr[String] = js.undefined
  
  /** Output only. The revoked serial numbers that appear in pem_crl. */
  var revokedCertificates: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  /** Output only. The CRL sequence number that appears in pem_crl. */
  var sequenceNumber: js.UndefOr[String] = js.undefined
  
  /** Output only. The State for this CertificateRevocationList. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which this CertificateRevocationList was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object CertificateRevocationList {
  
  @scala.inline
  def apply(): CertificateRevocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationList]
  }
  
  @scala.inline
  implicit class CertificateRevocationListMutableBuilder[Self <: CertificateRevocationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessUrl(value: String): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUrlUndefined: Self = StObject.set(x, "accessUrl", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.CertificateRevocationList & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPemCrl(value: String): Self = StObject.set(x, "pemCrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCrlUndefined: Self = StObject.set(x, "pemCrl", js.undefined)
    
    @scala.inline
    def setRevokedCertificates(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "revokedCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedCertificatesUndefined: Self = StObject.set(x, "revokedCertificates", js.undefined)
    
    @scala.inline
    def setRevokedCertificatesVarargs(value: RevokedCertificate*): Self = StObject.set(x, "revokedCertificates", js.Array(value :_*))
    
    @scala.inline
    def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
