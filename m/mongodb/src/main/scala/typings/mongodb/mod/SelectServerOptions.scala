package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectServerOptions extends StObject {
  
  var readPreference: js.UndefOr[ReadPreferenceLike] = js.undefined
  
  /** How long to block for server selection before throwing an error */
  var serverSelectionTimeoutMS: js.UndefOr[scala.Double] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object SelectServerOptions {
  
  inline def apply(): SelectServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectServerOptions] (val x: Self) extends AnyVal {
    
    inline def setReadPreference(value: ReadPreferenceLike): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    inline def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    inline def setServerSelectionTimeoutMS(value: scala.Double): Self = StObject.set(x, "serverSelectionTimeoutMS", value.asInstanceOf[js.Any])
    
    inline def setServerSelectionTimeoutMSUndefined: Self = StObject.set(x, "serverSelectionTimeoutMS", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
