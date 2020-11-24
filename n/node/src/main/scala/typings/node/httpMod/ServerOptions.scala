package typings.node.httpMod

import org.scalablytyped.runtime.Instantiable1
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptions extends js.Object {
  
  var IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, typings.node.httpMod.IncomingMessage]] = js.native
  
  var ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, typings.node.httpMod.ServerResponse]] = js.native
  
  /**
    * Use an insecure HTTP parser that accepts invalid HTTP headers when true.
    * Using the insecure parser should be avoided.
    * See --insecure-http-parser for more information.
    * @default false
    */
  var insecureHTTPParser: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionally overrides the value of
    * [`--max-http-header-size`][] for requests received by this server, i.e.
    * the maximum length of request headers in bytes.
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.native
}
object ServerOptions {
  
  @scala.inline
  def apply(): ServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptions]
  }
  
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncomingMessage(value: Instantiable1[/* socket */ Socket, IncomingMessage]): Self = this.set("IncomingMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomingMessage: Self = this.set("IncomingMessage", js.undefined)
    
    @scala.inline
    def setServerResponse(value: Instantiable1[/* req */ IncomingMessage, ServerResponse]): Self = this.set("ServerResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerResponse: Self = this.set("ServerResponse", js.undefined)
    
    @scala.inline
    def setInsecureHTTPParser(value: Boolean): Self = this.set("insecureHTTPParser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureHTTPParser: Self = this.set("insecureHTTPParser", js.undefined)
    
    @scala.inline
    def setMaxHeaderSize(value: Double): Self = this.set("maxHeaderSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeaderSize: Self = this.set("maxHeaderSize", js.undefined)
  }
}
