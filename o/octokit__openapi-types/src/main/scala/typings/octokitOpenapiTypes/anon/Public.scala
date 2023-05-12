package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Public extends StObject {
  
  var actor: Displaylogin
  
  /** Format: date-time */
  var created_at: String | Null
  
  var id: String
  
  @JSName("org")
  var org_ : js.UndefOr[Displaylogin] = js.undefined
  
  var payload: Issue
  
  var public: Boolean
  
  var repo: IdName
  
  var `type`: String | Null
}
object Public {
  
  inline def apply(actor: Displaylogin, id: String, payload: Issue, public: Boolean, repo: IdName): Public = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], created_at = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Public]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Public] (val x: Self) extends AnyVal {
    
    inline def setActor(value: Displaylogin): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atNull: Self = StObject.set(x, "created_at", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: Displaylogin): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
    
    inline def setPayload(value: Issue): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setRepo(value: IdName): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
  }
}
