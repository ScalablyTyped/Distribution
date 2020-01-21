package typings.nodeFetch.mod

import typings.node.httpMod.Agent
import typings.node.urlMod.URL_
import typings.nodeFetch.externalsMod.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  // node-fetch extensions
  var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.undefined
  // whatwg/fetch standard options
  var body: js.UndefOr[BodyInit] = js.undefined
   // =null http.Agent instance, allows custom proxy, certificate etc.
  var compress: js.UndefOr[Boolean] = js.undefined
   // =true support gzip/deflate content encoding. false to disable
  var follow: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var signal: js.UndefOr[AbortSignal | Null] = js.undefined
   // =20 maximum redirect count. 0 to not follow redirect
  var size: js.UndefOr[Double] = js.undefined
   // =0 maximum response body size in bytes. 0 to disable
  var timeout: js.UndefOr[Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    agent: Agent | (js.Function1[/* parsedUrl */ URL_, Agent]) = null,
    body: BodyInit = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    follow: Int | Double = null,
    headers: HeadersInit = null,
    method: String = null,
    redirect: RequestRedirect = null,
    signal: AbortSignal = null,
    size: Int | Double = null,
    timeout: Int | Double = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

