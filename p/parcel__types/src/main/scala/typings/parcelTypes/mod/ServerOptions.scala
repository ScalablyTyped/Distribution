package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerOptions extends StObject {
  
  val distDir: FilePath
  
  val host: js.UndefOr[String] = js.undefined
  
  val https: js.UndefOr[HTTPSOptions | Boolean] = js.undefined
  
  val port: Double
  
  val publicUrl: js.UndefOr[String] = js.undefined
}
object ServerOptions {
  
  inline def apply(distDir: FilePath, port: Double): ServerOptions = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    inline def setDistDir(value: FilePath): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHttps(value: HTTPSOptions | Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
  }
}
