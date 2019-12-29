package typings.nodemailer

import typings.nodemailer.libSmtpDashConnectionMod.Options
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/well-known", JSImport.Namespace)
@js.native
object libWellDashKnownMod extends js.Object {
  /** Resolves SMTP config for given key. Key can be a name (like 'Gmail'), alias (like 'Google Mail') or an email address (like 'test@googlemail.com'). */
  def apply(key: String): Options | `false` = js.native
}

