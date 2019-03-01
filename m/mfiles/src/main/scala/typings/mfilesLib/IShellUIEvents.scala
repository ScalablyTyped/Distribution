package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IShellUIEvents {
  @scala.inline
  def apply(
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnNewCommonDialogShellFrame: js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents] = null,
    OnNewEmbeddedShellFrame: js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents] = null,
    OnNewNormalShellFrame: js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents] = null,
    OnNewShellFrame: js.Function1[/* shellFrame */ IShellFrame, scala.Unit | IShellFrameEvents] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null
  ): IShellUIEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnNewCommonDialogShellFrame != null) __obj.updateDynamic("OnNewCommonDialogShellFrame")(OnNewCommonDialogShellFrame)
    if (OnNewEmbeddedShellFrame != null) __obj.updateDynamic("OnNewEmbeddedShellFrame")(OnNewEmbeddedShellFrame)
    if (OnNewNormalShellFrame != null) __obj.updateDynamic("OnNewNormalShellFrame")(OnNewNormalShellFrame)
    if (OnNewShellFrame != null) __obj.updateDynamic("OnNewShellFrame")(OnNewShellFrame)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    __obj.asInstanceOf[IShellUIEvents]
  }
}

