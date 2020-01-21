package typings.pkgcloud.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientError extends Error {
  var failCode: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var provider: js.UndefOr[Providers] = js.undefined
  var result: js.UndefOr[js.Any] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object ClientError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    failCode: String = null,
    headers: StringDictionary[String] = null,
    href: String = null,
    method: String = null,
    provider: Providers = null,
    result: js.Any = null,
    stack: String = null,
    statusCode: Int | Double = null
  ): ClientError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (failCode != null) __obj.updateDynamic("failCode")(failCode.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientError]
  }
}

