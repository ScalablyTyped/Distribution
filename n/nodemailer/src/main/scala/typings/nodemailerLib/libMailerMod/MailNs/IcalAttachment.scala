package typings
package nodemailerLib.libMailerMod.MailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IcalAttachment extends AttachmentLike {
  /** defines optional content encoding, eg. ‘base64’ or ‘hex’. This only applies if the content is a string. By default an unicode string is assumed. */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /** optional filename, defaults to ‘invite.ics’ */
  var filename: js.UndefOr[java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`] = js.undefined
  /** is an alternative for content to load the calendar data from an URL */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /** optional method, case insensitive, defaults to ‘publish’. Other possible values would be ‘request’, ‘reply’, ‘cancel’ or any other valid calendar method listed in RFC5546. This should match the METHOD: value in calendar event file. */
  var method: js.UndefOr[java.lang.String] = js.undefined
}

