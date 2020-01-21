package typings.nodemailer.mod

import typings.nodemailer.AnonHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAccount extends js.Object {
  var imap: AnonHost
  var pass: String
  var pop3: AnonHost
  var smtp: AnonHost
  var user: String
  var web: String
}

object TestAccount {
  @scala.inline
  def apply(imap: AnonHost, pass: String, pop3: AnonHost, smtp: AnonHost, user: String, web: String): TestAccount = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestAccount]
  }
}

