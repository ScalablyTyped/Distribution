package typings
package nodeDashFetchLib.nodeDashFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInit extends js.Object {
  // node-fetch extensions
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  // whatwg/fetch standard options
  var body: js.UndefOr[BodyInit] = js.undefined
   // =null http.Agent instance, allows custom proxy, certificate etc.
  var compress: js.UndefOr[scala.Boolean] = js.undefined
   // =true support gzip/deflate content encoding. false to disable
  var follow: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[HeaderInit | org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
   // =20 maximum redirect count. 0 to not follow redirect
  var size: js.UndefOr[scala.Double] = js.undefined
   // =0 maximum response body size in bytes. 0 to disable
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object RequestInit {
  @scala.inline
  def apply(
    agent: nodeLib.httpMod.Agent = null,
    body: BodyInit = null,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    follow: scala.Int | scala.Double = null,
    headers: HeaderInit | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    method: java.lang.String = null,
    redirect: RequestRedirect = null,
    size: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): RequestInit = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInit]
  }
}

