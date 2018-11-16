package typings
package nodemailerLib.libSendmailDashTransportMod.SendmailTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends nodemailerLib.libMailerMod.MailNs.Options
     with nodemailerLib.nodemailerMod.TransportOptions {
  /** an optional array of command line options to pass to the sendmail command (ie. ["-f", "foo@blurdybloop.com"]). This overrides all default arguments except for ’-i’ and recipient list so you need to make sure you have all required arguments set (ie. the ‘-f’ flag). */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[java.lang.String] = js.undefined
  /** path to the sendmail command (defaults to ‘sendmail’) */
  var path: js.UndefOr[java.lang.String] = js.undefined
  var sendmail: nodemailerLib.nodemailerLibNumbers.`true`
}

