package typings.mosca.mod

import typings.mosca.anon.CertPath
import typings.mosca.anon.Port
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  var allowNonSecure: js.UndefOr[Boolean] = js.native
  
  var ascoltatore: js.UndefOr[js.Any] = js.native
  
  var backend: js.UndefOr[js.Any] = js.native
  
  var bundle: js.UndefOr[js.Any] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var http: js.UndefOr[Port] = js.native
  
  var logger: js.UndefOr[js.Any] = js.native
  
  var maxInflightMessages: js.UndefOr[Double] = js.native
  
  var persistence: js.UndefOr[js.Any] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var secure: js.UndefOr[CertPath] = js.native
  
  var static: js.UndefOr[js.Any] = js.native
  
  var stats: js.UndefOr[js.Any] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowNonSecure(value: Boolean): Self = this.set("allowNonSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonSecure: Self = this.set("allowNonSecure", js.undefined)
    
    @scala.inline
    def setAscoltatore(value: js.Any): Self = this.set("ascoltatore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAscoltatore: Self = this.set("ascoltatore", js.undefined)
    
    @scala.inline
    def setBackend(value: js.Any): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setBundle(value: js.Any): Self = this.set("bundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundle: Self = this.set("bundle", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttp(value: Port): Self = this.set("http", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    
    @scala.inline
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setMaxInflightMessages(value: Double): Self = this.set("maxInflightMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInflightMessages: Self = this.set("maxInflightMessages", js.undefined)
    
    @scala.inline
    def setPersistence(value: js.Any): Self = this.set("persistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistence: Self = this.set("persistence", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSecure(value: CertPath): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setStatic(value: js.Any): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    
    @scala.inline
    def setStats(value: js.Any): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
}
