package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerConfig extends StObject {
  
  var host: String = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var servers: js.UndefOr[js.Array[ServerConfig]] = js.native
  
  var useToken: js.UndefOr[Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ServerConfig {
  
  @scala.inline
  def apply(host: String): ServerConfig = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
  
  @scala.inline
  implicit class ServerConfigMutableBuilder[Self <: ServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setServers(value: js.Array[ServerConfig]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: ServerConfig*): Self = StObject.set(x, "servers", js.Array(value :_*))
    
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
