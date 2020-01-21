package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  var add: js.UndefOr[js.Any] = js.undefined
  var load: js.UndefOr[js.Any] = js.undefined
  var remove: js.UndefOr[js.Any] = js.undefined
}

object AnonAdd {
  @scala.inline
  def apply(add: js.Any = null, load: js.Any = null, remove: js.Any = null): AnonAdd = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdd]
  }
}

