package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends js.Object {
  
  /** Which ResourceRecordSets to add? */
  var additions: js.UndefOr[js.Array[ResourceRecordSet]] = js.native
  
  /** Which ResourceRecordSets to remove? Must match existing data exactly. */
  var deletions: js.UndefOr[js.Array[ResourceRecordSet]] = js.native
  
  /** Unique identifier for the resource; defined by the server (output only). */
  var id: js.UndefOr[String] = js.native
  
  /** If the DNS queries for the zone will be served. */
  var isServing: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** The time that this operation was started by the server (output only). This is in RFC3339 text format. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Status of the operation (output only). A status of "done" means that the request to update the authoritative servers has been sent but the servers might not be updated yet. */
  var status: js.UndefOr[String] = js.native
}
object Change {
  
  @scala.inline
  def apply(): Change = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    
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
    def setAdditionsVarargs(value: ResourceRecordSet*): Self = this.set("additions", js.Array(value :_*))
    
    @scala.inline
    def setAdditions(value: js.Array[ResourceRecordSet]): Self = this.set("additions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditions: Self = this.set("additions", js.undefined)
    
    @scala.inline
    def setDeletionsVarargs(value: ResourceRecordSet*): Self = this.set("deletions", js.Array(value :_*))
    
    @scala.inline
    def setDeletions(value: js.Array[ResourceRecordSet]): Self = this.set("deletions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletions: Self = this.set("deletions", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsServing(value: Boolean): Self = this.set("isServing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsServing: Self = this.set("isServing", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
