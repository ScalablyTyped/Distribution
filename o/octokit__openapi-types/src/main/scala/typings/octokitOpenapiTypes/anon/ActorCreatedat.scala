package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActorCreatedat extends StObject {
  
  var actor: js.UndefOr[Avatarurl] = js.undefined
  
  /** Format: date-time */
  var created_at: String
  
  var event: String
  
  var source: IssueType
  
  /** Format: date-time */
  var updated_at: String
}
object ActorCreatedat {
  
  inline def apply(created_at: String, event: String, source: IssueType, updated_at: String): ActorCreatedat = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorCreatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActorCreatedat] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IssueType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
