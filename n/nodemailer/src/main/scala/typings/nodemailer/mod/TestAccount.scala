package typings.nodemailer.mod

import typings.nodemailer.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAccount extends js.Object {
  var imap: Host
  var pass: String
  var pop3: Host
  var smtp: Host
  var user: String
  var web: String
}

object TestAccount {
  @scala.inline
  def apply(imap: Host, pass: String, pop3: Host, smtp: Host, user: String, web: String): TestAccount = {
    val __obj = js.Dynamic.literal(imap = imap.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pop3 = pop3.asInstanceOf[js.Any], smtp = smtp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAccount]
  }
}

