package typings.nodemailer

import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpProxyClientMod {
  
  /**
    * Establishes proxied connection to destinationPort
    */
  @scala.inline
  def apply(
    proxyUrl: String,
    destinationPort: Double,
    destinationHost: String,
    callback: js.Function2[/* err */ Error | Null, /* socket */ TLSSocket | Socket, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(proxyUrl.asInstanceOf[js.Any], destinationPort.asInstanceOf[js.Any], destinationHost.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("nodemailer/lib/smtp-connection/http-proxy-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
