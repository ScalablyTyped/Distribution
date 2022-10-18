package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterSession
import typings.nextAuth.adaptersMod.AdapterUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var session: AdapterSession
  
  var user: AdapterUser
}
object Session {
  
  inline def apply(session: AdapterSession, user: AdapterUser): Session = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setSession(value: AdapterSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setUser(value: AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
