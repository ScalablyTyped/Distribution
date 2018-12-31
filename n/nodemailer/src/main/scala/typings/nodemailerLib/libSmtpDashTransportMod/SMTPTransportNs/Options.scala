package typings
package nodemailerLib.libSmtpDashTransportMod.SMTPTransportNs

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
  var service: js.UndefOr[java.lang.String] = js.undefined
   // TODO http.ClientRequest?
  var url: js.UndefOr[java.lang.String] = js.undefined
}

