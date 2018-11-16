package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SMTPConnectionNs {
  type AuthenticationType = AuthenticationTypeLogin | AuthenticationTypeOAuth2
  type DSNOption = nodemailerLib.nodemailerLibStrings.NEVER | nodemailerLib.nodemailerLibStrings.SUCCESS | nodemailerLib.nodemailerLibStrings.FAILURE | nodemailerLib.nodemailerLibStrings.DELAY
  type OAuth2 = nodemailerLib.libXoauth2Mod.XOAuth2Ns.Options
}
