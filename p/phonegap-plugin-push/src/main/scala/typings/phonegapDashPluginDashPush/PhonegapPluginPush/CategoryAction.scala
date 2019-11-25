package typings.phonegapDashPluginDashPush.PhonegapPluginPush

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
    if (maybe != null) __obj.updateDynamic("maybe")(maybe.asInstanceOf[js.Any])
    if (no != null) __obj.updateDynamic("no")(no.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(yes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryAction]
  }
}

