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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICookie]
  }
}

