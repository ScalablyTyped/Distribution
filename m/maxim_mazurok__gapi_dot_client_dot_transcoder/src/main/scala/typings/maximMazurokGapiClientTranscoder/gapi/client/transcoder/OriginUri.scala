package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginUri extends StObject {
  
  /** Dash manifest URI. If multiple Dash manifests are created, only the first one is listed. */
  var dash: js.UndefOr[String] = js.native
  
  /** HLS manifest URI per https://tools.ietf.org/html/rfc8216#section-4.3.4. If multiple HLS manifests are created, only the first one is listed. */
  var hls: js.UndefOr[String] = js.native
}
object OriginUri {
  
  @scala.inline
  def apply(): OriginUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginUri]
  }
  
  @scala.inline
  implicit class OriginUriMutableBuilder[Self <: OriginUri] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDash(value: String): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setHls(value: String): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
  }
}
