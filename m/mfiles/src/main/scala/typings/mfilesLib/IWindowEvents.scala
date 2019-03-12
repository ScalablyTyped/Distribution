package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindowEvents extends IEvents {
  var OnCloseWindow: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object IWindowEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnCloseWindow: () => scala.Boolean = null
  ): IWindowEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnCloseWindow != null) __obj.updateDynamic("OnCloseWindow")(js.Any.fromFunction0(OnCloseWindow))
    __obj.asInstanceOf[IWindowEvents]
  }
}

