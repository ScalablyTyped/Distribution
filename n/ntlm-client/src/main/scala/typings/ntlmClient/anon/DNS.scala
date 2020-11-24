package typings.ntlmClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DNS extends js.Object {
  
  var DNS: String = js.native
  
  var DOMAIN: String = js.native
  
  var FQDN: String = js.native
  
  var PARENT_DNS: String = js.native
  
  var SERVER: String = js.native
}
object DNS {
  
  @scala.inline
  def apply(DNS: String, DOMAIN: String, FQDN: String, PARENT_DNS: String, SERVER: String): DNS = {
    val __obj = js.Dynamic.literal(DNS = DNS.asInstanceOf[js.Any], DOMAIN = DOMAIN.asInstanceOf[js.Any], FQDN = FQDN.asInstanceOf[js.Any], PARENT_DNS = PARENT_DNS.asInstanceOf[js.Any], SERVER = SERVER.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNS]
  }
  
  @scala.inline
  implicit class DNSOps[Self <: DNS] (val x: Self) extends AnyVal {
    
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
    def setDNS(value: String): Self = this.set("DNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOMAIN(value: String): Self = this.set("DOMAIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFQDN(value: String): Self = this.set("FQDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPARENT_DNS(value: String): Self = this.set("PARENT_DNS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSERVER(value: String): Self = this.set("SERVER", value.asInstanceOf[js.Any])
  }
}
