package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastreadat extends StObject {
  
  var id: String
  
  var last_read_at: String | Null
  
  var reason: String
  
  var repository: Blobsurl
  
  var subject: Latestcommenturl
  
  /** @example https://api.github.com/notifications/threads/2/subscription */
  var subscription_url: String
  
  var unread: Boolean
  
  var updated_at: String
  
  var url: String
}
object Lastreadat {
  
  inline def apply(
    id: String,
    reason: String,
    repository: Blobsurl,
    subject: Latestcommenturl,
    subscription_url: String,
    unread: Boolean,
    updated_at: String,
    url: String
  ): Lastreadat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subscription_url = subscription_url.asInstanceOf[js.Any], unread = unread.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], last_read_at = null)
    __obj.asInstanceOf[Lastreadat]
  }
  
  extension [Self <: Lastreadat](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_read_at(value: String): Self = StObject.set(x, "last_read_at", value.asInstanceOf[js.Any])
    
    inline def setLast_read_atNull: Self = StObject.set(x, "last_read_at", null)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: Blobsurl): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Latestcommenturl): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
    
    inline def setUnread(value: Boolean): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
