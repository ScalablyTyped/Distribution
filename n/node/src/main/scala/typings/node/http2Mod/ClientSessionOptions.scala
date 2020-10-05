package typings.node.http2Mod

import typings.node.nodeStrings.httpColon
import typings.node.nodeStrings.httpsColon
import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientSessionOptions extends SessionOptions {
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ SessionOptions, Duplex]] = js.native
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.native
  var protocol: js.UndefOr[httpColon | httpsColon] = js.native
}

object ClientSessionOptions {
  @scala.inline
  def apply(): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionOptions]
  }
  @scala.inline
  implicit class ClientSessionOptionsOps[Self <: ClientSessionOptions] (val x: Self) extends AnyVal {
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
    def setCreateConnection(value: (/* authority */ URL_, /* option */ SessionOptions) => Duplex): Self = this.set("createConnection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateConnection: Self = this.set("createConnection", js.undefined)
    @scala.inline
    def setMaxReservedRemoteStreams(value: Double): Self = this.set("maxReservedRemoteStreams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReservedRemoteStreams: Self = this.set("maxReservedRemoteStreams", js.undefined)
    @scala.inline
    def setProtocol(value: httpColon | httpsColon): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
  }
  
}

