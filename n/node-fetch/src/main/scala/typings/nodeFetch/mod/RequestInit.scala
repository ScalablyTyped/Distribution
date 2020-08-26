package typings.nodeFetch.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.nodeFetch.externalsMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInit extends js.Object {
  // node-fetch extensions
  var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
  // whatwg/fetch standard options
  var body: js.UndefOr[BodyInit] = js.native
   // =null http.Agent instance, allows custom proxy, certificate etc.
  var compress: js.UndefOr[Boolean] = js.native
   // =true support gzip/deflate content encoding. false to disable
  var follow: js.UndefOr[Double] = js.native
  var headers: js.UndefOr[HeadersInit] = js.native
  var method: js.UndefOr[String] = js.native
  var redirect: js.UndefOr[RequestRedirect] = js.native
  var signal: js.UndefOr[AbortSignal | Null] = js.native
   // =20 maximum redirect count. 0 to not follow redirect
  var size: js.UndefOr[Double] = js.native
   // =0 maximum response body size in bytes. 0 to disable
  var timeout: js.UndefOr[Double] = js.native
}

object RequestInit {
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
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
    def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = this.set("agent", js.Any.fromFunction1(value))
    @scala.inline
    def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = this.set("agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

