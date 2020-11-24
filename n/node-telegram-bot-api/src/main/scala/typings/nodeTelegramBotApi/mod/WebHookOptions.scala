package typings.nodeTelegramBotApi.mod

import typings.node.httpsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebHookOptions extends js.Object {
  
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
  implicit class WebHookOptionsOps[Self <: WebHookOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setHealthEndpoint(value: String): Self = this.set("healthEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthEndpoint: Self = this.set("healthEndpoint", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttps(value: ServerOptions): Self = this.set("https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttps: Self = this.set("https", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
}
