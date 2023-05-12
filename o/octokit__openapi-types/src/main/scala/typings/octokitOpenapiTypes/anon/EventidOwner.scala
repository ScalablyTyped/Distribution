package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventidOwner extends StObject {
  
  var event_id: Double
  
  var owner: String
  
  var repo: String
}
object EventidOwner {
  
  inline def apply(event_id: Double, owner: String, repo: String): EventidOwner = {
    val __obj = js.Dynamic.literal(event_id = event_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventidOwner] (val x: Self) extends AnyVal {
    
    inline def setEvent_id(value: Double): Self = StObject.set(x, "event_id", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
