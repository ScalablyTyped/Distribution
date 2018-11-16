package typings
package nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SMTPError
  extends nodeLib.NodeJSNs.ErrnoException {
  /** command which provoked an error */
  var command: js.UndefOr[java.lang.String] = js.undefined
  /** the last response received from the server (if the error is caused by an error response from the server) */
  var response: js.UndefOr[java.lang.String] = js.undefined
  /** the numeric response code of the response string (if available) */
  var responseCode: js.UndefOr[scala.Double] = js.undefined
}

