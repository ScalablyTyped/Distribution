package typings.phantom.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  var httponly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object ICookie {
  @scala.inline
  def apply(
    name: String,
    path: String,
    value: String,
    domain: String = null,
    expires: String = null,
    httponly: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined
  ): ICookie = {
    val __obj = js.Dynamic.literal(name = name, path = path, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ICookie]
  }
}

