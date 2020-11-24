package typings.orientjs.mod

import typings.orientjs.anon.Max
import typings.orientjs.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrientDBClientConfig extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[js.Any] = js.native
  
  var pool: js.UndefOr[Max] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var servers: js.UndefOr[js.Array[OServerConfig]] = js.native
  
  var subscribePool: js.UndefOr[`0`] = js.native
}
object OrientDBClientConfig {
  
  @scala.inline
  def apply(): OrientDBClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrientDBClientConfig]
  }
  
  @scala.inline
  implicit class OrientDBClientConfigOps[Self <: OrientDBClientConfig] (val x: Self) extends AnyVal {
    
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
    def setLogger(value: js.Any): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setPool(value: Max): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setServersVarargs(value: OServerConfig*): Self = this.set("servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[OServerConfig]): Self = this.set("servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServers: Self = this.set("servers", js.undefined)
    
    @scala.inline
    def setSubscribePool(value: `0`): Self = this.set("subscribePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribePool: Self = this.set("subscribePool", js.undefined)
  }
}
