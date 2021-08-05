package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxTimeMSSession extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object MaxTimeMSSession {
  
  inline def apply(): MaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMSSession]
  }
  
  extension [Self <: MaxTimeMSSession](x: Self) {
    
    inline def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
