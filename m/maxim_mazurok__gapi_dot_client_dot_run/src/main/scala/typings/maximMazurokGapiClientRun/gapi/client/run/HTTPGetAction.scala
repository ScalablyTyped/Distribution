package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTTPGetAction extends StObject {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders
    * instead.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Custom headers to set in the request. HTTP allows repeated headers. */
  var httpHeaders: js.UndefOr[js.Array[HTTPHeader]] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path to access on the HTTP server. */
  var path: js.UndefOr[String] = js.undefined
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Scheme to use for connecting to the host. Defaults to HTTP. */
  var scheme: js.UndefOr[String] = js.undefined
}
object HTTPGetAction {
  
  @scala.inline
  def apply(): HTTPGetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPGetAction]
  }
  
  @scala.inline
  implicit class HTTPGetActionMutableBuilder[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: js.Array[HTTPHeader]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: HTTPHeader*): Self = StObject.set(x, "httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
