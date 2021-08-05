package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SampleAesEncryption extends StObject {
  
  /** Required. URI of the key delivery service. This URI is inserted into the M3U8 header. */
  var keyUri: js.UndefOr[String] = js.undefined
}
object SampleAesEncryption {
  
  inline def apply(): SampleAesEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SampleAesEncryption]
  }
  
  extension [Self <: SampleAesEncryption](x: Self) {
    
    inline def setKeyUri(value: String): Self = StObject.set(x, "keyUri", value.asInstanceOf[js.Any])
    
    inline def setKeyUriUndefined: Self = StObject.set(x, "keyUri", js.undefined)
  }
}
