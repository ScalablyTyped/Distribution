package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MpegCommonEncryption extends js.Object {
  
  /** Required. 128 bit Key ID represented as lowercase hexadecimal digits for use with common encryption. */
  var keyId: js.UndefOr[String] = js.native
  
  /** Required. Specify the encryption scheme. Supported encryption schemes: - 'cenc' - 'cbcs' */
  var scheme: js.UndefOr[String] = js.native
}
object MpegCommonEncryption {
  
  @scala.inline
  def apply(): MpegCommonEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MpegCommonEncryption]
  }
  
  @scala.inline
  implicit class MpegCommonEncryptionOps[Self <: MpegCommonEncryption] (val x: Self) extends AnyVal {
    
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
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
