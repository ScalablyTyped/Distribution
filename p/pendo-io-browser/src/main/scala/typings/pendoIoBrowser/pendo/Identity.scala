package typings.pendoIoBrowser.pendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var account: js.UndefOr[IdentityMetadata] = js.undefined
  /** visitor.id is required if user is logged in, otherwise an anonymous ID is generated and tracked by a cookie */
  var visitor: js.UndefOr[IdentityMetadata] = js.undefined
}

object Identity {
  @scala.inline
  def apply(account: IdentityMetadata = null, visitor: IdentityMetadata = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (visitor != null) __obj.updateDynamic("visitor")(visitor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

