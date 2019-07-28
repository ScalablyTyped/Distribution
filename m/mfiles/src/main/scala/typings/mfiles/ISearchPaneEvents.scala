package typings.mfiles

import typings.mfiles.MFilesNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPaneEvents extends IEvents {
  var OnHidePane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnShowPane: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ISearchPaneEvents {
  @scala.inline
  def apply(
    Register: (Event, js.Function) => Double,
    Unregister: Double => Unit,
    OnHidePane: () => Unit = null,
    OnShowPane: () => Unit = null,
    OnStarted: () => Unit = null,
    OnStop: () => Unit = null
  ): ISearchPaneEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnHidePane != null) __obj.updateDynamic("OnHidePane")(js.Any.fromFunction0(OnHidePane))
    if (OnShowPane != null) __obj.updateDynamic("OnShowPane")(js.Any.fromFunction0(OnShowPane))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[ISearchPaneEvents]
  }
}

