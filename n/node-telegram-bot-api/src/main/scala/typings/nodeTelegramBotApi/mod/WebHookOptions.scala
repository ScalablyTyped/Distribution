package typings.nodeTelegramBotApi.mod

import typings.node.httpsMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebHookOptions extends StObject {
  
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  
  var cert: js.UndefOr[String] = js.undefined
  
  var healthEndpoint: js.UndefOr[String] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var https: js.UndefOr[ServerOptions] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var pfx: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
}
object WebHookOptions {
  
  inline def apply(): WebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebHookOptions]
  }
  
  extension [Self <: WebHookOptions](x: Self) {
    
    inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
    
    inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    inline def setHealthEndpoint(value: String): Self = StObject.set(x, "healthEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHealthEndpointUndefined: Self = StObject.set(x, "healthEndpoint", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: ServerOptions): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
