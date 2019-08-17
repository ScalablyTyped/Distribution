package typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkCoachmarkDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmark extends js.Object {
  /**
    * Forces the Coachmark to dismiss
    */
  var dismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ICoachmark {
  @scala.inline
  def apply(dismiss: /* ev */ js.UndefOr[js.Any] => Unit = null): ICoachmark = {
    val __obj = js.Dynamic.literal()
    if (dismiss != null) __obj.updateDynamic("dismiss")(js.Any.fromFunction1(dismiss))
    __obj.asInstanceOf[ICoachmark]
  }
}

