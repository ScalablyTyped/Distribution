package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Latestcommenturl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityGetThreadResponseData extends js.Object {
  
  var id: String = js.native
  
  var last_read_at: String = js.native
  
  var reason: String = js.native
  
  var repository: Archiveurl = js.native
  
  var subject: Latestcommenturl = js.native
  
  var unread: Boolean = js.native
  
  var updated_at: String = js.native
  
  var url: String = js.native
}
object ActivityGetThreadResponseData {
  
  @scala.inline
  def apply(
    id: String,
    last_read_at: String,
    reason: String,
    repository: Archiveurl,
    subject: Latestcommenturl,
    unread: Boolean,
    updated_at: String,
    url: String
  ): ActivityGetThreadResponseData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_read_at = last_read_at.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityGetThreadResponseData]
  }
  
  @scala.inline
  implicit class ActivityGetThreadResponseDataOps[Self <: ActivityGetThreadResponseData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_read_at(value: String): Self = this.set("last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Latestcommenturl): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnread(value: Boolean): Self = this.set("unread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}
