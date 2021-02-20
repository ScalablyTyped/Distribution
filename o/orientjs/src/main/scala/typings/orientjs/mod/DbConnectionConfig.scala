package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbConnectionConfig extends StObject {
  
  var forcePrepare: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var server: js.UndefOr[OServer] = js.native
  
  var sessionId: js.UndefOr[Double] = js.native
  
  var storage: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[js.Any] = js.native
  
  var transformers: js.UndefOr[js.Array[js.Function1[/* item */ ORecord, _]]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var useToken: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object DbConnectionConfig {
  
  @scala.inline
  def apply(): DbConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbConnectionConfig]
  }
  
  @scala.inline
  implicit class DbConnectionConfigMutableBuilder[Self <: DbConnectionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForcePrepare(value: Boolean): Self = StObject.set(x, "forcePrepare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePrepareUndefined: Self = StObject.set(x, "forcePrepare", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setServer(value: OServer): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setSessionId(value: Double): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    @scala.inline
    def setTransformers(value: js.Array[js.Function1[/* item */ ORecord, _]]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
    
    @scala.inline
    def setTransformersVarargs(value: (js.Function1[/* item */ ORecord, js.Any])*): Self = StObject.set(x, "transformers", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseToken(value: Boolean): Self = StObject.set(x, "useToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTokenUndefined: Self = StObject.set(x, "useToken", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
