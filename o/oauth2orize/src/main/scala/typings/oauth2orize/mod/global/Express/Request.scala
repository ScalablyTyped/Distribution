package typings.oauth2orize.mod.global.Express

import typings.oauth2orize.mod.OAuth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var oauth2: js.UndefOr[OAuth2] = js.undefined
}

object Request {
  @scala.inline
  def apply(oauth2: OAuth2 = null): Request = {
    val __obj = js.Dynamic.literal()
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

