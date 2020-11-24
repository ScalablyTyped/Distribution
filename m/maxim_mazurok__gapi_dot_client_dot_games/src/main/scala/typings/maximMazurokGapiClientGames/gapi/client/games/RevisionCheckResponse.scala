package typings.maximMazurokGapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevisionCheckResponse extends js.Object {
  
  /** The version of the API this client revision should use when calling API methods. */
  var apiVersion: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#revisionCheckResponse`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The result of the revision check. */
  var revisionStatus: js.UndefOr[String] = js.native
}
object RevisionCheckResponse {
  
  @scala.inline
  def apply(): RevisionCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionCheckResponse]
  }
  
  @scala.inline
  implicit class RevisionCheckResponseOps[Self <: RevisionCheckResponse] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRevisionStatus(value: String): Self = this.set("revisionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionStatus: Self = this.set("revisionStatus", js.undefined)
  }
}
