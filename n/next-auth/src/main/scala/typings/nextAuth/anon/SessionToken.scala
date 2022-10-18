package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.AdapterUser
import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionToken extends StObject {
  
  var session: typings.nextAuth.coreTypesMod.Session
  
  var token: JWT
  
  var user: typings.nextAuth.coreTypesMod.User | AdapterUser
}
object SessionToken {
  
  inline def apply(
    session: typings.nextAuth.coreTypesMod.Session,
    token: JWT,
    user: typings.nextAuth.coreTypesMod.User | AdapterUser
  ): SessionToken = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionToken]
  }
  
  extension [Self <: SessionToken](x: Self) {
    
    inline def setSession(value: typings.nextAuth.coreTypesMod.Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUser(value: typings.nextAuth.coreTypesMod.User | AdapterUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
