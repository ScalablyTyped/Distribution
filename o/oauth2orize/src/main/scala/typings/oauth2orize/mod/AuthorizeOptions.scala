package typings.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends js.Object {
  var idLength: js.UndefOr[Double] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(idLength: js.UndefOr[Double] = js.undefined, sessionKey: String = null): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(idLength)) __obj.updateDynamic("idLength")(idLength.get.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

