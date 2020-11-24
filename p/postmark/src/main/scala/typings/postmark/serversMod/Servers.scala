package typings.postmark.serversMod

import typings.postmark.serverMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Servers extends js.Object {
  
  var Servers: js.Array[Server] = js.native
  
  var TotalCount: Double = js.native
}
object Servers {
  
  @scala.inline
  def apply(Servers: js.Array[Server], TotalCount: Double): Servers = {
    val __obj = js.Dynamic.literal(Servers = Servers.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Servers]
  }
  
  @scala.inline
  implicit class ServersOps[Self <: Servers] (val x: Self) extends AnyVal {
    
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
    def setServersVarargs(value: Server*): Self = this.set("Servers", js.Array(value :_*))
    
    @scala.inline
    def setServers(value: js.Array[Server]): Self = this.set("Servers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
}
