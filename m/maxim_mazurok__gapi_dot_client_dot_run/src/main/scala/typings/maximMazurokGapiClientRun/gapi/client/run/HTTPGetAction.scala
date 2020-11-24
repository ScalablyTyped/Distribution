package typings.maximMazurokGapiClientRun.gapi.client.run

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTPGetAction extends js.Object {
  
  /**
    * (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders
    * instead.
    */
  var host: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Custom headers to set in the request. HTTP allows repeated headers. */
  var httpHeaders: js.UndefOr[js.Array[HTTPHeader]] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Path to access on the HTTP server. */
  var path: js.UndefOr[String] = js.native
  
  /** (Optional) Cloud Run fully managed: not supported Cloud Run for Anthos: supported Scheme to use for connecting to the host. Defaults to HTTP. */
  var scheme: js.UndefOr[String] = js.native
}
object HTTPGetAction {
  
  @scala.inline
  def apply(): HTTPGetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTPGetAction]
  }
  
  @scala.inline
  implicit class HTTPGetActionOps[Self <: HTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: HTTPHeader*): Self = this.set("httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHttpHeaders(value: js.Array[HTTPHeader]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
