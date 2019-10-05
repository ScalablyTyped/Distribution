package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellUIEvents extends IEvents {
  var OnNewCommonDialogShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewEmbeddedShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewNormalShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnNewShellFrame: js.UndefOr[js.Function1[/* shellFrame */ IShellFrame, Unit | IShellFrameEvents]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IShellUIEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => Double,
    Unregister: Double => Unit,
    OnNewCommonDialogShellFrame: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents = null,
    OnNewEmbeddedShellFrame: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents = null,
    OnNewNormalShellFrame: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents = null,
    OnNewShellFrame: /* shellFrame */ IShellFrame => Unit | IShellFrameEvents = null,
    OnStarted: () => Unit = null,
    OnStop: () => Unit = null
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

