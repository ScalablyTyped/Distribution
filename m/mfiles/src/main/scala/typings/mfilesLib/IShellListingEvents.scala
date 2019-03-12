package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellListingEvents extends IEvents {
  var OnContentChanged: js.UndefOr[js.Function1[/* items */ IShellItems, scala.Unit]] = js.undefined
  var OnListingActivated: js.UndefOr[js.Function1[/* oldListing */ scala.Null | IShellListing, scala.Unit]] = js.undefined
  var OnListingDeactivated: js.UndefOr[js.Function1[/* newListing */ scala.Null | IShellListing, scala.Unit]] = js.undefined
  var OnSelectedItemsChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, scala.Unit]] = js.undefined
  var OnSelectionChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, scala.Unit]] = js.undefined
  var OnShowContextMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, scala.Unit]] = js.undefined
  var OnShowMainMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, scala.Unit]] = js.undefined
  var OnStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var OnStop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IShellListingEvents {
  @scala.inline
  def apply(
    Register: (mfilesLib.MFilesNs.Event, js.Function) => scala.Double,
    Unregister: scala.Double => scala.Unit,
    OnContentChanged: /* items */ IShellItems => scala.Unit = null,
    OnListingActivated: /* oldListing */ scala.Null | IShellListing => scala.Unit = null,
    OnListingDeactivated: /* newListing */ scala.Null | IShellListing => scala.Unit = null,
    OnSelectedItemsChanged: /* selectedItems */ IShellItems => scala.Unit = null,
    OnSelectionChanged: /* selectedItems */ IShellItems => scala.Unit = null,
    OnShowContextMenu: /* selectedItems */ IShellItems => scala.Unit = null,
    OnShowMainMenu: /* selectedItems */ IShellItems => scala.Unit = null,
    OnStarted: () => scala.Unit = null,
    OnStop: () => scala.Unit = null
  ): IShellListingEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    if (OnContentChanged != null) __obj.updateDynamic("OnContentChanged")(js.Any.fromFunction1(OnContentChanged))
    if (OnListingActivated != null) __obj.updateDynamic("OnListingActivated")(js.Any.fromFunction1(OnListingActivated))
    if (OnListingDeactivated != null) __obj.updateDynamic("OnListingDeactivated")(js.Any.fromFunction1(OnListingDeactivated))
    if (OnSelectedItemsChanged != null) __obj.updateDynamic("OnSelectedItemsChanged")(js.Any.fromFunction1(OnSelectedItemsChanged))
    if (OnSelectionChanged != null) __obj.updateDynamic("OnSelectionChanged")(js.Any.fromFunction1(OnSelectionChanged))
    if (OnShowContextMenu != null) __obj.updateDynamic("OnShowContextMenu")(js.Any.fromFunction1(OnShowContextMenu))
    if (OnShowMainMenu != null) __obj.updateDynamic("OnShowMainMenu")(js.Any.fromFunction1(OnShowMainMenu))
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(js.Any.fromFunction0(OnStarted))
    if (OnStop != null) __obj.updateDynamic("OnStop")(js.Any.fromFunction0(OnStop))
    __obj.asInstanceOf[IShellListingEvents]
  }
}

