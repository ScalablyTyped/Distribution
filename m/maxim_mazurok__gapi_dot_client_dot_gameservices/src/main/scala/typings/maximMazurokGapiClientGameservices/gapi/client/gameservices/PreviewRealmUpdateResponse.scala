package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewRealmUpdateResponse extends js.Object {
  
  /** ETag of the realm. */
  var etag: js.UndefOr[String] = js.native
  
  /** The target state. */
  var targetState: js.UndefOr[TargetState] = js.native
}
object PreviewRealmUpdateResponse {
  
  @scala.inline
  def apply(): PreviewRealmUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewRealmUpdateResponse]
  }
  
  @scala.inline
  implicit class PreviewRealmUpdateResponseOps[Self <: PreviewRealmUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setTargetState(value: TargetState): Self = this.set("targetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetState: Self = this.set("targetState", js.undefined)
  }
}
