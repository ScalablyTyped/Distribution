package typings.maximMazurokGapiClientRedis.gapi.client.redis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TlsCertificate extends js.Object {
  
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
  implicit class TlsCertificateOps[Self <: TlsCertificate] (val x: Self) extends AnyVal {
    
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setSerialNumber(value: String): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialNumber: Self = this.set("serialNumber", js.undefined)
    
    @scala.inline
    def setSha1Fingerprint(value: String): Self = this.set("sha1Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1Fingerprint: Self = this.set("sha1Fingerprint", js.undefined)
  }
}
