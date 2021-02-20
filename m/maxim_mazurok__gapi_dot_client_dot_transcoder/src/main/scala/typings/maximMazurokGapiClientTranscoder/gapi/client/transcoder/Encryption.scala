package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encryption extends StObject {
  
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
  implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAes128(value: Aes128Encryption): Self = StObject.set(x, "aes128", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAes128Undefined: Self = StObject.set(x, "aes128", js.undefined)
    
    @scala.inline
    def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMpegCenc(value: MpegCommonEncryption): Self = StObject.set(x, "mpegCenc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpegCencUndefined: Self = StObject.set(x, "mpegCenc", js.undefined)
    
    @scala.inline
    def setSampleAes(value: SampleAesEncryption): Self = StObject.set(x, "sampleAes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleAesUndefined: Self = StObject.set(x, "sampleAes", js.undefined)
  }
}
