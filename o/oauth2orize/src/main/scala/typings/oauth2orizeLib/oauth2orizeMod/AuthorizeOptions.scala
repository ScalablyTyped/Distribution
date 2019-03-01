package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends js.Object {
  var idLength: js.UndefOr[scala.Double] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(idLength: scala.Int | scala.Double = null, sessionKey: java.lang.String = null): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (idLength != null) __obj.updateDynamic("idLength")(idLength.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

