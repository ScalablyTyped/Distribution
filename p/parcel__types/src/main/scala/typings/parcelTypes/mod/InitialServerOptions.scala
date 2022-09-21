package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialServerOptions extends StObject {
  
  val host: js.UndefOr[String] = js.undefined
  
  val https: js.UndefOr[HTTPSOptions | Boolean] = js.undefined
  
  val port: Double
  
  val publicUrl: js.UndefOr[String] = js.undefined
}
object InitialServerOptions {
  
  inline def apply(port: Double): InitialServerOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialServerOptions]
  }
  
  extension [Self <: InitialServerOptions](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: HTTPSOptions | Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
  }
}
