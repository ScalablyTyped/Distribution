package typings
package pkgcloudLib.pkgcloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientError
  extends stdLib.Error {
  var failCode: js.UndefOr[java.lang.String] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var provider: js.UndefOr[Providers] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
}

object ClientError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    failCode: java.lang.String = null,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    href: java.lang.String = null,
    method: java.lang.String = null,
    provider: Providers = null,
    result: js.Any = null,
    stack: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null
  ): ClientError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (failCode != null) __obj.updateDynamic("failCode")(failCode)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (href != null) __obj.updateDynamic("href")(href)
    if (method != null) __obj.updateDynamic("method")(method)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (result != null) __obj.updateDynamic("result")(result)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientError]
  }
}

