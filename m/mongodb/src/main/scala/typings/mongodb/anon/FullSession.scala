package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullSession extends StObject {
  
  var full: Boolean
  
  var session: ClientSession
}
object FullSession {
  
  inline def apply(full: Boolean, session: ClientSession): FullSession = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullSession]
  }
  
  extension [Self <: FullSession](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
