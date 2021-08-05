package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MpegCommonEncryption extends StObject {
  
  /** Required. 128 bit Key ID represented as lowercase hexadecimal digits for use with common encryption. */
  var keyId: js.UndefOr[String] = js.undefined
  
  /** Required. Specify the encryption scheme. Supported encryption schemes: - 'cenc' - 'cbcs' */
  var scheme: js.UndefOr[String] = js.undefined
}
object MpegCommonEncryption {
  
  inline def apply(): MpegCommonEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MpegCommonEncryption]
  }
  
  extension [Self <: MpegCommonEncryption](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
