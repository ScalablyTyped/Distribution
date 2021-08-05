package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var readPreference: ReadPreferenceOrMode
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object Session {
  
  inline def apply(readPreference: ReadPreferenceOrMode): Session = {
    val __obj = js.Dynamic.literal(readPreference = readPreference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
