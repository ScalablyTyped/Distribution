package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginUri extends js.Object {
  
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
  implicit class OriginUriOps[Self <: OriginUri] (val x: Self) extends AnyVal {
    
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
    def setDash(value: String): Self = this.set("dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    
    @scala.inline
    def setHls(value: String): Self = this.set("hls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHls: Self = this.set("hls", js.undefined)
  }
}
