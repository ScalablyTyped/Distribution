package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Follower extends StObject {
  
  var action: String
  
  var user_email: js.UndefOr[String] = js.undefined
  
  var user_id: js.UndefOr[ZendeskID] = js.undefined
}
object Follower {
  
  inline def apply(action: String): Follower = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Follower]
  }
  
  extension [Self <: Follower](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    inline def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
    
    inline def setUser_id(value: ZendeskID): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
