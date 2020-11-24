package typings.mongodbMemoryServerCore.mongoBinaryDownloadMod

import typings.httpsProxyAgent.mod.HttpsProxyAgent
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.GET
import typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpDownloadOptions extends js.Object {
  
  var agent: js.UndefOr[HttpsProxyAgent] = js.native
  
  var hostname: String = js.native
  
  var method: GET | POST = js.native
  
  var path: String = js.native
  
  var port: String = js.native
  
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
}
object HttpDownloadOptions {
  
  @scala.inline
  def apply(hostname: String, method: GET | POST, path: String, port: String): HttpDownloadOptions = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadOptions]
  }
  
  @scala.inline
  implicit class HttpDownloadOptionsOps[Self <: HttpDownloadOptions] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: GET | POST): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgent(value: HttpsProxyAgent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
  }
}
