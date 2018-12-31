package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationTypeLogin extends Credentials {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
  var `type`: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.login | nodemailerLib.nodemailerLibStrings.Login | nodemailerLib.nodemailerLibStrings.LOGIN
  ] = js.undefined
}

