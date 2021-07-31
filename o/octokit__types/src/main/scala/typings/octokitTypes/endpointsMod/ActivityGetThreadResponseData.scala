package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archiveurl
import typings.octokitTypes.anon.Latestcommenturl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityGetThreadResponseData extends StObject {
  
  var id: String
  
  var last_read_at: String
  
  var reason: String
  
  var repository: Archiveurl
  
  var subject: Latestcommenturl
  
  var unread: Boolean
  
  var updated_at: String
  
  var url: String
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
  implicit class ActivityGetThreadResponseDataMutableBuilder[Self <: ActivityGetThreadResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository(value: Archiveurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Latestcommenturl): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnread(value: Boolean): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
