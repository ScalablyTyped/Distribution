package typings.nextAuth.anon

import typings.nextAuth.jwtTypesMod.JWT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var session: typings.nextAuth.coreTypesMod.Session
  
  var token: JWT
}
object Token {
  
  inline def apply(session: typings.nextAuth.coreTypesMod.Session, token: JWT): Token = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setSession(value: typings.nextAuth.coreTypesMod.Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setToken(value: JWT): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
