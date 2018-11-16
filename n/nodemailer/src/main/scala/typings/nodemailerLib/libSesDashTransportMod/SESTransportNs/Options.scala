package typings
package nodemailerLib.libSesDashTransportMod.SESTransportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options
  extends MailOptions
     with nodemailerLib.nodemailerMod.TransportOptions {
  /** is an option that expects an instantiated aws.SES object */
  var SES: js.Any
   // aws-sdk.SES object
  /** How many messages per second is allowed to be delivered to SES */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /** How many parallel connections to allow towards SES */
  var sendingRate: js.UndefOr[scala.Double] = js.undefined
}

