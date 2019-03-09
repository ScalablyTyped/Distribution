package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var account: js.UndefOr[Account] = js.undefined
  var visitor: Visitor
}

object Identity {
  @scala.inline
  def apply(visitor: Visitor, account: Account = null): Identity = {
    val __obj = js.Dynamic.literal(visitor = visitor)
    if (account != null) __obj.updateDynamic("account")(account)
    __obj.asInstanceOf[Identity]
  }
}

