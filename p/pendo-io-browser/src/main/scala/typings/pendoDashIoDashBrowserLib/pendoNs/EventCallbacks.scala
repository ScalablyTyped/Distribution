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
    guidesFailed: () => scala.Unit = null,
    guidesLoaded: () => scala.Unit = null,
    ready: () => scala.Unit = null
  ): EventCallbacks = {
    val __obj = js.Dynamic.literal()
    if (guidesFailed != null) __obj.updateDynamic("guidesFailed")(js.Any.fromFunction0(guidesFailed))
    if (guidesLoaded != null) __obj.updateDynamic("guidesLoaded")(js.Any.fromFunction0(guidesLoaded))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    __obj.asInstanceOf[EventCallbacks]
  }
}

