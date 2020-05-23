package typings.nodemailer.fetchMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Writable
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.nodemailerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowErrorResponse: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[Buffer | String | StringDictionary[String]] = js.undefined
  var contentType: js.UndefOr[String | `false`] = js.undefined
  var cookie: js.UndefOr[String] = js.undefined
  var cookies: js.UndefOr[Cookies] = js.undefined
  var fetchRes: js.UndefOr[Writable] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var redirects: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[ms] = js.undefined
  var tls: js.UndefOr[TlsOptions] = js.undefined
  var userAgent: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowErrorResponse: js.UndefOr[Boolean] = js.undefined,
    body: Buffer | String | StringDictionary[String] = null,
    contentType: String | `false` = null,
    cookie: String = null,
    cookies: Cookies = null,
    fetchRes: Writable = null,
    headers: StringDictionary[String] = null,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    method: String = null,
    redirects: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[ms] = js.undefined,
    tls: TlsOptions = null,
    userAgent: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowErrorResponse)) __obj.updateDynamic("allowErrorResponse")(allowErrorResponse.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (fetchRes != null) __obj.updateDynamic("fetchRes")(fetchRes.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(redirects)) __obj.updateDynamic("redirects")(redirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (tls != null) __obj.updateDynamic("tls")(tls.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

