package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: string | number | undefined} */ trait Account extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(id: java.lang.String = null): Account = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Account]
  }
}

