package typings.pem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientKey extends js.Object {
  
  var clientKey: String = js.native
  
  var csr: String = js.native
}
object ClientKey {
  
  @scala.inline
  def apply(clientKey: String, csr: String): ClientKey = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientKey]
  }
  
  @scala.inline
  implicit class ClientKeyOps[Self <: ClientKey] (val x: Self) extends AnyVal {
    
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
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsr(value: String): Self = this.set("csr", value.asInstanceOf[js.Any])
  }
}
