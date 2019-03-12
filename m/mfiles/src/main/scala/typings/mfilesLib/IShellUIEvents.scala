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
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnNewCommonDialogShellFrame: /* shellFrame */ IShellFrame => scala.Unit | IShellFrameEvents = null,
    OnNewEmbeddedShellFrame: /* shellFrame */ IShellFrame => scala.Unit | IShellFrameEvents = null,
    OnNewNormalShellFrame: /* shellFrame */ IShellFrame => scala.Unit | IShellFrameEvents = null,
    OnNewShellFrame: /* shellFrame */ IShellFrame => scala.Unit | IShellFrameEvents = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null
  ): IShellUIEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnNewCommonDialogShellFrame != null) __obj.updateDynamic("OnNewCommonDialogShellFrame")(js.Any.fromFunction1(OnNewCommonDialogShellFrame))
    if (OnNewEmbeddedShellFrame != null) __obj.updateDynamic("OnNewEmbeddedShellFrame")(js.Any.fromFunction1(OnNewEmbeddedShellFrame))
    if (OnNewNormalShellFrame != null) __obj.updateDynamic("OnNewNormalShellFrame")(js.Any.fromFunction1(OnNewNormalShellFrame))
    if (OnNewShellFrame != null) __obj.updateDynamic("OnNewShellFrame")(js.Any.fromFunction1(OnNewShellFrame))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[IShellUIEvents]
  }
}

