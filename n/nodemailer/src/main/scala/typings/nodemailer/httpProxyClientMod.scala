package typings.nodemailer

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer/lib/smtp-connection/http-proxy-client", JSImport.Namespace)
@js.native
object httpProxyClientMod extends js.Object {
  
  /**
    * Establishes proxied connection to destinationPort
    */
  def apply(
    proxyUrl: String,
    destinationPort: Double,
    destinationHost: String,
    callback: js.Function2[/* err */ Error | Null, /* socket */ TLSSocket | Socket, Unit]
  ): Unit = js.native
}
