package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositoryurl extends StObject {
  
  /**
    * Format: date-time
    * @example 2012-10-06T21:34:12Z
    */
  var created_at: String | Null
  
  var ignored: Boolean
  
  var reason: String | Null
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/1
    */
  var repository_url: js.UndefOr[String] = js.undefined
  
  /** @example true */
  var subscribed: Boolean
  
  /**
    * Format: uri
    * @example https://api.github.com/notifications/threads/1
    */
  var thread_url: js.UndefOr[String] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/notifications/threads/1/subscription
    */
  var url: String
}
object Repositoryurl {
  
  inline def apply(ignored: Boolean, subscribed: Boolean, url: String): Repositoryurl = {
    val __obj = js.Dynamic.literal(ignored = ignored.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], created_at = null, reason = null)
    __obj.asInstanceOf[Repositoryurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Repositoryurl] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setIgnored(value: Boolean): Self = StObject.set(x, "ignored", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setRepository_urlUndefined: Self = StObject.set(x, "repository_url", js.undefined)
    
    inline def setSubscribed(value: Boolean): Self = StObject.set(x, "subscribed", value.asInstanceOf[js.Any])
    
    inline def setThread_url(value: String): Self = StObject.set(x, "thread_url", value.asInstanceOf[js.Any])
    
    inline def setThread_urlUndefined: Self = StObject.set(x, "thread_url", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
