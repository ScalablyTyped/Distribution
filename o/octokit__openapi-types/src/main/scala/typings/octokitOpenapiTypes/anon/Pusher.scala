package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pusher extends StObject {
  
  var commit: String | Null
  
  var created_at: String
  
  var duration: Double
  
  var error: `441`
  
  /** User */
  var pusher: Deleted | Null
  
  var status: String
  
  var updated_at: String
  
  /** Format: uri */
  var url: String
}
object Pusher {
  
  inline def apply(
    created_at: String,
    duration: Double,
    error: `441`,
    status: String,
    updated_at: String,
    url: String
  ): Pusher = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], commit = null, pusher = null)
    __obj.asInstanceOf[Pusher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pusher] (val x: Self) extends AnyVal {
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitNull: Self = StObject.set(x, "commit", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setError(value: `441`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPusher(value: Deleted): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
    
    inline def setPusherNull: Self = StObject.set(x, "pusher", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
