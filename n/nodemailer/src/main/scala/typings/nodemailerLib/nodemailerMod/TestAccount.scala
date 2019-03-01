package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestAccount extends js.Object {
  var imap: nodemailerLib.Anon_Host
  var pass: java.lang.String
  var pop3: nodemailerLib.Anon_Host
  var smtp: nodemailerLib.Anon_Host
  var user: java.lang.String
  var web: java.lang.String
}

object TestAccount {
  @scala.inline
  def apply(
    imap: nodemailerLib.Anon_Host,
    pass: java.lang.String,
    pop3: nodemailerLib.Anon_Host,
    smtp: nodemailerLib.Anon_Host,
    user: java.lang.String,
    web: java.lang.String
  ): TestAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imap")(imap)
    __obj.updateDynamic("pass")(pass)
    __obj.updateDynamic("pop3")(pop3)
    __obj.updateDynamic("smtp")(smtp)
    __obj.updateDynamic("user")(user)
    __obj.updateDynamic("web")(web)
    __obj.asInstanceOf[TestAccount]
  }
}

