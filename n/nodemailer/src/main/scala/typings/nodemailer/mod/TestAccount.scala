package typings.nodemailer.mod

import typings.nodemailer.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAccount extends js.Object {
  
  var imap: Host = js.native
  
  var pass: String = js.native
  
  var pop3: Host = js.native
  
  var smtp: Host = js.native
  
  var user: String = js.native
  
  var web: String = js.native
}
object TestAccount {
  
  @scala.inline
  def apply(imap: Host, pass: String, pop3: Host, smtp: Host, user: String, web: String): TestAccount = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAccount]
  }
  
  @scala.inline
  implicit class TestAccountOps[Self <: TestAccount] (val x: Self) extends AnyVal {
    
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
    def setImap(value: Host): Self = this.set("imap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPop3(value: Host): Self = this.set("pop3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmtp(value: Host): Self = this.set("smtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb(value: String): Self = this.set("web", value.asInstanceOf[js.Any])
  }
}
