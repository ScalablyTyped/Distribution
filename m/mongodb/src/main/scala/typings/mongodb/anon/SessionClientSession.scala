package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionClientSession extends StObject {
  
  var session: ClientSession
}
object SessionClientSession {
  
  inline def apply(session: ClientSession): SessionClientSession = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionClientSession]
  }
  
  extension [Self <: SessionClientSession](x: Self) {
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
