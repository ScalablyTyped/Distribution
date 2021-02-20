package typings.paypalRestSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureOptions extends StObject {
  
  var authorize_url: js.UndefOr[String] = js.native
  
  var client_id: String = js.native
  
  var client_secret: String = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var logout_url: js.UndefOr[String] = js.native
  
  var mode: String = js.native
  
  var openid_connect_host: js.UndefOr[String] = js.native
  
  var openid_connect_port: js.UndefOr[String] = js.native
  
  var openid_connect_schema: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[String] = js.native
  
  var schema: js.UndefOr[String] = js.native
}
object ConfigureOptions {
  
  @scala.inline
  def apply(client_id: String, client_secret: String, mode: String): ConfigureOptions = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigureOptions]
  }
  
  @scala.inline
  implicit class ConfigureOptionsMutableBuilder[Self <: ConfigureOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorize_url(value: String): Self = StObject.set(x, "authorize_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorize_urlUndefined: Self = StObject.set(x, "authorize_url", js.undefined)
    
    @scala.inline
    def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setLogout_url(value: String): Self = StObject.set(x, "logout_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogout_urlUndefined: Self = StObject.set(x, "logout_url", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenid_connect_host(value: String): Self = StObject.set(x, "openid_connect_host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenid_connect_hostUndefined: Self = StObject.set(x, "openid_connect_host", js.undefined)
    
    @scala.inline
    def setOpenid_connect_port(value: String): Self = StObject.set(x, "openid_connect_port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenid_connect_portUndefined: Self = StObject.set(x, "openid_connect_port", js.undefined)
    
    @scala.inline
    def setOpenid_connect_schema(value: String): Self = StObject.set(x, "openid_connect_schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenid_connect_schemaUndefined: Self = StObject.set(x, "openid_connect_schema", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
