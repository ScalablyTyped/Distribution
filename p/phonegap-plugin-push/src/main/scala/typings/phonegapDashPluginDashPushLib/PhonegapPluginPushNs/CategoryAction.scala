package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryAction extends js.Object {
  var maybe: js.UndefOr[CategoryActionData] = js.undefined
  var no: js.UndefOr[CategoryActionData] = js.undefined
  var yes: js.UndefOr[CategoryActionData] = js.undefined
}

object CategoryAction {
  @scala.inline
  def apply(maybe: CategoryActionData = null, no: CategoryActionData = null, yes: CategoryActionData = null): CategoryAction = {
    val __obj = js.Dynamic.literal()
    if (maybe != null) __obj.updateDynamic("maybe")(maybe)
    if (no != null) __obj.updateDynamic("no")(no)
    if (yes != null) __obj.updateDynamic("yes")(yes)
    __obj.asInstanceOf[CategoryAction]
  }
}

