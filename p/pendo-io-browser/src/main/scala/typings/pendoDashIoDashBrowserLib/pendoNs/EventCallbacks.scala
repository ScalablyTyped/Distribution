package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCallbacks extends js.Object {
  var guidesFailed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var guidesLoaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object EventCallbacks {
  @scala.inline
  def apply(
    guidesFailed: js.Function0[scala.Unit] = null,
    guidesLoaded: js.Function0[scala.Unit] = null,
    ready: js.Function0[scala.Unit] = null
  ): EventCallbacks = {
    val __obj = js.Dynamic.literal()
    if (guidesFailed != null) __obj.updateDynamic("guidesFailed")(guidesFailed)
    if (guidesLoaded != null) __obj.updateDynamic("guidesLoaded")(guidesLoaded)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[EventCallbacks]
  }
}

