package typings.nodeMailjet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  val perform_api_call: js.UndefOr[Boolean] = js.undefined
  
  val proxyUrl: js.UndefOr[String] = js.undefined
  
  val timeout: js.UndefOr[Double] = js.undefined
  
  val url: js.UndefOr[String] = js.undefined
  
  val version: js.UndefOr[String] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setPerform_api_call(value: Boolean): Self = StObject.set(x, "perform_api_call", value.asInstanceOf[js.Any])
    
    inline def setPerform_api_callUndefined: Self = StObject.set(x, "perform_api_call", js.undefined)
    
    inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
