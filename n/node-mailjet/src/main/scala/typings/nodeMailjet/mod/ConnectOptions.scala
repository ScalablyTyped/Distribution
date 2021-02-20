package typings.nodeMailjet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends StObject {
  
  val perform_api_call: js.UndefOr[Boolean] = js.native
  
  val proxyUrl: js.UndefOr[String] = js.native
  
  val timeout: js.UndefOr[Double] = js.native
  
  val url: js.UndefOr[String] = js.native
  
  val version: js.UndefOr[String] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPerform_api_call(value: Boolean): Self = StObject.set(x, "perform_api_call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerform_api_callUndefined: Self = StObject.set(x, "perform_api_call", js.undefined)
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
