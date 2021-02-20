package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsCertificate extends StObject {
  
  /** PEM representation. */
  var cert: js.UndefOr[String] = js.native
  
  /** Output only. The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2020-05-18T00:00:00.094Z`. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** Serial number, as extracted from the certificate. */
  var serialNumber: js.UndefOr[String] = js.native
  
  /** Sha1 Fingerprint of the certificate. */
  var sha1Fingerprint: js.UndefOr[String] = js.native
}
object TlsCertificate {
  
  @scala.inline
  def apply(): TlsCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsCertificate]
  }
  
  @scala.inline
  implicit class TlsCertificateMutableBuilder[Self <: TlsCertificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    @scala.inline
    def setSha1Fingerprint(value: String): Self = StObject.set(x, "sha1Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1FingerprintUndefined: Self = StObject.set(x, "sha1Fingerprint", js.undefined)
  }
}
