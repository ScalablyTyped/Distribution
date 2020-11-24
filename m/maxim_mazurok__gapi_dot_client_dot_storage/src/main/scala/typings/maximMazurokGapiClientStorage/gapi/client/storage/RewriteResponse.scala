package typings.maximMazurokGapiClientStorage.gapi.client.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RewriteResponse extends js.Object {
  
  /** true if the copy is finished; otherwise, false if the copy is in progress. This property is always present in the response. */
  var done: js.UndefOr[Boolean] = js.native
  
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.native
  
  /** The total size of the object being copied in bytes. This property is always present in the response. */
  var objectSize: js.UndefOr[String] = js.native
  
  /** A resource containing the metadata for the copied-to object. This property is present in the response only when copying completes. */
  // tslint:disable-next-line:ban-types
  var resource: js.UndefOr[Object] = js.native
  
  /** A token to use in subsequent requests to continue copying data. This token is present in the response only when there is more data to copy. */
  var rewriteToken: js.UndefOr[String] = js.native
  
  /** The total bytes written so far, which can be used to provide a waiting user with a progress indicator. This property is always present in the response. */
  var totalBytesRewritten: js.UndefOr[String] = js.native
}
object RewriteResponse {
  
  @scala.inline
  def apply(): RewriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RewriteResponse]
  }
  
  @scala.inline
  implicit class RewriteResponseOps[Self <: RewriteResponse] (val x: Self) extends AnyVal {
    
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
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setObjectSize(value: String): Self = this.set("objectSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectSize: Self = this.set("objectSize", js.undefined)
    
    @scala.inline
    def setResource(value: Object): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setRewriteToken(value: String): Self = this.set("rewriteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewriteToken: Self = this.set("rewriteToken", js.undefined)
    
    @scala.inline
    def setTotalBytesRewritten(value: String): Self = this.set("totalBytesRewritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalBytesRewritten: Self = this.set("totalBytesRewritten", js.undefined)
  }
}
