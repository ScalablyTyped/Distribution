package typings
package nodemailerLib.libFetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowErrorResponse: js.UndefOr[scala.Boolean] = js.undefined
  var body: js.UndefOr[
    nodeLib.Buffer | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] = js.undefined
  var contentType: js.UndefOr[java.lang.String | nodemailerLib.nodemailerLibNumbers.`false`] = js.undefined
  var cookie: js.UndefOr[java.lang.String] = js.undefined
  var cookies: js.UndefOr[Cookies] = js.undefined
  var fetchRes: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var maxRedirects: js.UndefOr[scala.Double] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var redirects: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[ms] = js.undefined
  var tls: js.UndefOr[nodeLib.tlsMod.TlsOptions] = js.undefined
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowErrorResponse: js.UndefOr[scala.Boolean] = js.undefined,
    body: nodeLib.Buffer | java.lang.String | org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    contentType: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = null,
    cookie: java.lang.String = null,
    cookies: Cookies = null,
    fetchRes: nodeLib.streamMod.Writable = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    maxRedirects: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    redirects: scala.Int | scala.Double = null,
    timeout: js.UndefOr[ms] = js.undefined,
    tls: nodeLib.tlsMod.TlsOptions = null,
    userAgent: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowErrorResponse)) __obj.updateDynamic("allowErrorResponse")(allowErrorResponse)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (cookies != null) __obj.updateDynamic("cookies")(cookies)
    if (fetchRes != null) __obj.updateDynamic("fetchRes")(fetchRes)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (maxRedirects != null) __obj.updateDynamic("maxRedirects")(maxRedirects.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    if (tls != null) __obj.updateDynamic("tls")(tls)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[Options]
  }
}

