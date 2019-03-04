package typings
package phantomLib.phantomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[java.lang.String] = js.undefined
  var httponly: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var path: java.lang.String
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object ICookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    path: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expires: java.lang.String = null,
    httponly: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): ICookie = {
    val __obj = js.Dynamic.literal(name = name, path = path, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ICookie]
  }
}

