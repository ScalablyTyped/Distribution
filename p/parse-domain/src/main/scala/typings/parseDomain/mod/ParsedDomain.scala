package typings.parseDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedDomain extends js.Object {
  
  var domain: String = js.native
  
  var subdomain: String = js.native
  
  var tld: String = js.native
}
object ParsedDomain {
  
  @scala.inline
  def apply(domain: String, subdomain: String, tld: String): ParsedDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDomain]
  }
  
  @scala.inline
  implicit class ParsedDomainOps[Self <: ParsedDomain] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomain(value: String): Self = this.set("subdomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTld(value: String): Self = this.set("tld", value.asInstanceOf[js.Any])
  }
}
