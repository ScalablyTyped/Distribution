package typings.orientjs.mod

import typings.orientjs.anon.Max
import typings.orientjs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrientDBClientConfig extends StObject {
  
  var host: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[Any] = js.undefined
  
  var pool: js.UndefOr[Max] = js.undefined
  
  var port: js.UndefOr[Double] = js.undefined
  
  var servers: js.UndefOr[js.Array[OServerConfig]] = js.undefined
  
  var subscribePool: js.UndefOr[`0`] = js.undefined
}
object OrientDBClientConfig {
  
  inline def apply(): OrientDBClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientDBClientConfig]
  }
  
  extension [Self <: OrientDBClientConfig](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setPool(value: Max): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setServers(value: js.Array[OServerConfig]): Self = StObject.set(x, "servers", value.asInstanceOf[js.Any])
    
    inline def setServersUndefined: Self = StObject.set(x, "servers", js.undefined)
    
    inline def setServersVarargs(value: OServerConfig*): Self = StObject.set(x, "servers", js.Array(value*))
    
    inline def setSubscribePool(value: `0`): Self = StObject.set(x, "subscribePool", value.asInstanceOf[js.Any])
    
    inline def setSubscribePoolUndefined: Self = StObject.set(x, "subscribePool", js.undefined)
  }
}
