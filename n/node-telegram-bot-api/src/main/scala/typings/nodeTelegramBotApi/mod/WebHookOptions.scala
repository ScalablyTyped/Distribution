package typings.nodeTelegramBotApi.mod

import typings.node.httpsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebHookOptions extends StObject {
  
  var autoOpen: js.UndefOr[Boolean] = js.native
  
  var cert: js.UndefOr[String] = js.native
  
  var healthEndpoint: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var https: js.UndefOr[ServerOptions] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var pfx: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
}
object WebHookOptions {
  
  @scala.inline
  def apply(): WebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebHookOptions]
  }
  
  @scala.inline
  implicit class WebHookOptionsMutableBuilder[Self <: WebHookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setHealthEndpoint(value: String): Self = StObject.set(x, "healthEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthEndpointUndefined: Self = StObject.set(x, "healthEndpoint", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
