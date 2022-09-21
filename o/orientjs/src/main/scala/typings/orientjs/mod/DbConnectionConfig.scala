package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbConnectionConfig extends StObject {
  
  var forcePrepare: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var server: js.UndefOr[OServer] = js.undefined
  
  var sessionId: js.UndefOr[Double] = js.undefined
  
  var storage: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[Any] = js.undefined
  
  var transformers: js.UndefOr[js.Array[js.Function1[/* item */ ORecord, Any]]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var useToken: js.UndefOr[Boolean] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object DbConnectionConfig {
  
  inline def apply(): DbConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbConnectionConfig]
  }
  
  extension [Self <: DbConnectionConfig](x: Self) {
    
    inline def setForcePrepare(value: Boolean): Self = StObject.set(x, "forcePrepare", value.asInstanceOf[js.Any])
    
    inline def setForcePrepareUndefined: Self = StObject.set(x, "forcePrepare", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setServer(value: OServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setSessionId(value: Double): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setToken(value: Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setTransformers(value: js.Array[js.Function1[/* item */ ORecord, Any]]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
    
    inline def setTransformersVarargs(value: (js.Function1[/* item */ ORecord, Any])*): Self = StObject.set(x, "transformers", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseToken(value: Boolean): Self = StObject.set(x, "useToken", value.asInstanceOf[js.Any])
    
    inline def setUseTokenUndefined: Self = StObject.set(x, "useToken", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
