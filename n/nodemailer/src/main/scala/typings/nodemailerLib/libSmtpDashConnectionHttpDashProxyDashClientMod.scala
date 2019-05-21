package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/smtp-connection/http-proxy-client", JSImport.Namespace)
@js.native
object libSmtpDashConnectionHttpDashProxyDashClientMod extends js.Object {
  /**
    * Establishes proxied connection to destinationPort
    */
  def apply(
    proxyUrl: java.lang.String,
    destinationPort: scala.Double,
    destinationHost: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* socket */ nodeLib.tlsMod.TLSSocket | nodeLib.netMod.Socket, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

