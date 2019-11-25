package typings.nodemailer.nodemailerMod

import typings.nodemailer.Anon_Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAccount extends js.Object {
  var imap: Anon_Host
  var pass: String
  var pop3: Anon_Host
  var smtp: Anon_Host
  var user: String
  var web: String
}

object TestAccount {
  @scala.inline
  def apply(imap: Anon_Host, pass: String, pop3: Anon_Host, smtp: Anon_Host, user: String, web: String): TestAccount = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestAccount]
  }
}

