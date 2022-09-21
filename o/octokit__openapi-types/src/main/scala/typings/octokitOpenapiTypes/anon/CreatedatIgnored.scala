package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedatIgnored extends StObject {
  
  /**
    * Format: date-time
    * @example 2012-10-06T21:34:12Z
    */
  var created_at: String
  
  /** @description Determines if all notifications should be blocked from this repository. */
  var ignored: Boolean
  
  var reason: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example
    */
  var repository_url: String
  
  /**
    * @description Determines if notifications should be received from this repository.
    * @example true
    */
  var subscribed: Boolean
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/subscription
    */
  var url: String
}
object CreatedatIgnored {
  
  inline def apply(created_at: String, ignored: Boolean, repository_url: String, subscribed: Boolean, url: String): CreatedatIgnored = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], ignored = ignored.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], reason = null)
    __obj.asInstanceOf[CreatedatIgnored]
  }
  
  extension [Self <: CreatedatIgnored](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
