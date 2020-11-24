package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionTypeResponse extends Response {
  
  val connection_type: String = js.native
  
  var ip_address: js.UndefOr[String] = js.native
}
object ConnectionTypeResponse {
  
  @scala.inline
  def apply(connection_type: String): ConnectionTypeResponse = {
    val __obj = js.Dynamic.literal(connection_type = connection_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionTypeResponse]
  }
  
  @scala.inline
  implicit class ConnectionTypeResponseOps[Self <: ConnectionTypeResponse] (val x: Self) extends AnyVal {
    
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
    def setConnection_type(value: String): Self = this.set("connection_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_address(value: String): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp_address: Self = this.set("ip_address", js.undefined)
  }
}
