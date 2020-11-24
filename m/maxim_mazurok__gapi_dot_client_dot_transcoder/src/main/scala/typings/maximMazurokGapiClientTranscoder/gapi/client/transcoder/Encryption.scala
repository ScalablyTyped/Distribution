package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encryption extends js.Object {
  
  /** Configuration for AES-128 encryption. */
  var aes128: js.UndefOr[Aes128Encryption] = js.native
  
  /** Required. 128 bit Initialization Vector (IV) represented as lowercase hexadecimal digits. */
  var iv: js.UndefOr[String] = js.native
  
  /** Required. 128 bit encryption key represented as lowercase hexadecimal digits. */
  var key: js.UndefOr[String] = js.native
  
  /** Configuration for MPEG Common Encryption (MPEG-CENC). */
  var mpegCenc: js.UndefOr[MpegCommonEncryption] = js.native
  
  /** Configuration for SAMPLE-AES encryption. */
  var sampleAes: js.UndefOr[SampleAesEncryption] = js.native
}
object Encryption {
  
  @scala.inline
  def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  @scala.inline
  implicit class EncryptionOps[Self <: Encryption] (val x: Self) extends AnyVal {
    
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
    def setAes128(value: Aes128Encryption): Self = this.set("aes128", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAes128: Self = this.set("aes128", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMpegCenc(value: MpegCommonEncryption): Self = this.set("mpegCenc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpegCenc: Self = this.set("mpegCenc", js.undefined)
    
    @scala.inline
    def setSampleAes(value: SampleAesEncryption): Self = this.set("sampleAes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleAes: Self = this.set("sampleAes", js.undefined)
  }
}
