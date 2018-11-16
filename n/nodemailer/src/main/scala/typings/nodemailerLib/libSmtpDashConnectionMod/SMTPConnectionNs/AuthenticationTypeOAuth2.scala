package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthenticationTypeOAuth2
  extends nodemailerLib.libXoauth2Mod.XOAuth2Ns.Options {
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
  var `type`: js.UndefOr[
    nodemailerLib.nodemailerLibStrings.oauth2 | nodemailerLib.nodemailerLibStrings.OAuth2 | nodemailerLib.nodemailerLibStrings.OAUTH2
  ] = js.undefined
}

