package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginUri extends StObject {
  
  /** Dash manifest URI. If multiple Dash manifests are created, only the first one is listed. */
  var dash: js.UndefOr[String] = js.undefined
  
  /** HLS manifest URI per https://tools.ietf.org/html/rfc8216#section-4.3.4. If multiple HLS manifests are created, only the first one is listed. */
  var hls: js.UndefOr[String] = js.undefined
}
object OriginUri {
  
  inline def apply(): OriginUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginUri]
  }
  
  extension [Self <: OriginUri](x: Self) {
    
    inline def setDash(value: String): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setHls(value: String): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
  }
}
