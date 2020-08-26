package typings.nock.mod

import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined node.http.RequestOptions & {  proto :string | undefined} */
@js.native
trait ReqOptions extends js.Object {
  var _defaultAgent: js.UndefOr[Agent] = js.native
  var agent: js.UndefOr[Agent | Boolean] = js.native
  var auth: js.UndefOr[String | Null] = js.native
  // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ this.type, 
      /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.native
  var defaultPort: js.UndefOr[Double | String] = js.native
  var family: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
  var host: js.UndefOr[String | Null] = js.native
  var hostname: js.UndefOr[String | Null] = js.native
  var localAddress: js.UndefOr[String] = js.native
  /**
    * @default 8192
    */
  var maxHeaderSize: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var path: js.UndefOr[String | Null] = js.native
  var port: js.UndefOr[Double | String | Null] = js.native
  var proto: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String | Null] = js.native
  var setHost: js.UndefOr[Boolean] = js.native
  var socketPath: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ReqOptions {
  @scala.inline
  def apply(): ReqOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReqOptions]
  }
  @scala.inline
  implicit class ReqOptionsOps[Self <: ReqOptions] (val x: Self) extends AnyVal {
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
    def set_defaultAgent(value: Agent): Self = this.set("_defaultAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_defaultAgent: Self = this.set("_defaultAgent", js.undefined)
    @scala.inline
    def setAgent(value: Agent | Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setAuthNull: Self = this.set("auth", null)
    @scala.inline
    def setCreateConnection(
      value: (ReqOptions, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket
    ): Self = this.set("createConnection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateConnection: Self = this.set("createConnection", js.undefined)
    @scala.inline
    def setDefaultPort(value: Double | String): Self = this.set("defaultPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPort: Self = this.set("defaultPort", js.undefined)
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHeaders(value: OutgoingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setHostNull: Self = this.set("host", null)
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    @scala.inline
    def setHostnameNull: Self = this.set("hostname", null)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setMaxHeaderSize(value: Double): Self = this.set("maxHeaderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHeaderSize: Self = this.set("maxHeaderSize", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPathNull: Self = this.set("path", null)
    @scala.inline
    def setPort(value: Double | String): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPortNull: Self = this.set("port", null)
    @scala.inline
    def setProto(value: String): Self = this.set("proto", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProtocolNull: Self = this.set("protocol", null)
    @scala.inline
    def setSetHost(value: Boolean): Self = this.set("setHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetHost: Self = this.set("setHost", js.undefined)
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

