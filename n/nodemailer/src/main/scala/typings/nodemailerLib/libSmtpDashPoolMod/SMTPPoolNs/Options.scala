package typings
package nodemailerLib.libSmtpDashPoolMod.SMTPPoolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(nodemailerLib.libSmtpDashConnectionMod.SMTPConnectionNs.Options because Would inherit conflicting mutable fields List(auth))*/
trait Options
  extends MailOptions
     with nodemailerLib.nodemailerMod.TransportOptions {
  var getSocket: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* callback */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* socketOptions */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /** the count of maximum simultaneous connections to make against the SMTP server (defaults to 5) */
  var maxConnections: js.UndefOr[scala.Double] = js.undefined
  /** limits the message count to be sent using a single connection (defaults to 100). After maxMessages is reached the connection is dropped and a new one is created for the following messages */
  var maxMessages: js.UndefOr[scala.Double] = js.undefined
  /** set to true to use pooled connections (defaults to false) instead of creating a new connection for every email */
  var pool: nodemailerLib.nodemailerLibNumbers.`true`
  /** defines the time measuring period in milliseconds (defaults to 1000, ie. to 1 second) for rate limiting */
  var rateDelta: js.UndefOr[scala.Double] = js.undefined
  /** limits the message count to be sent in rateDelta time. Once rateLimit is reached, sending is paused until the end of the measuring period. This limit is shared between connections, so if one connection uses up the limit, then other connections are paused as well. If rateLimit is not set then sending rate is not limited */
  var rateLimit: js.UndefOr[scala.Double] = js.undefined
  var service: js.UndefOr[java.lang.String] = js.undefined
   // TODO http.ClientRequest?
  var url: js.UndefOr[java.lang.String] = js.undefined
}

