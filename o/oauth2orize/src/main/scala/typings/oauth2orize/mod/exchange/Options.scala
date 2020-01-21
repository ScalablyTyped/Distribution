package typings.oauth2orize.mod.exchange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // For maximum flexibility, multiple scope spearators can optionally be
  // allowed.  This allows the server to accept clients that separate scope
  // with either space or comma (' ', ',').  This violates the specification,
  // but achieves compatibility with existing client libraries that are already
  // deployed.
  var scopeSeparator: js.UndefOr[String] = js.undefined
  // The 'user' property of `req` holds the authenticated user.  In the case
  // of the token endpoint, the property will contain the OAuth 2.0 client.
  var userProperty: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(scopeSeparator: String = null, userProperty: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (userProperty != null) __obj.updateDynamic("userProperty")(userProperty.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

