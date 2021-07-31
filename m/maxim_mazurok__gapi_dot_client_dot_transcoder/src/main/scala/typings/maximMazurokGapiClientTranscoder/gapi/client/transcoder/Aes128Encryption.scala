package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aes128Encryption extends StObject {
  
  /** Required. URI of the key delivery service. This URI is inserted into the M3U8 header. */
  var keyUri: js.UndefOr[String] = js.undefined
}
object Aes128Encryption {
  
  @scala.inline
  def apply(): Aes128Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aes128Encryption]
  }
  
  @scala.inline
  implicit class Aes128EncryptionMutableBuilder[Self <: Aes128Encryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyUri(value: String): Self = StObject.set(x, "keyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUriUndefined: Self = StObject.set(x, "keyUri", js.undefined)
  }
}
