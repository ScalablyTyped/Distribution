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
    Register: js.Function2[mfilesLib.MFilesNs.Event, js.Function, scala.Double],
    Unregister: js.Function1[scala.Double, scala.Unit],
    OnContentChanged: js.Function1[/* items */ IShellItems, scala.Unit] = null,
    OnListingActivated: js.Function1[/* oldListing */ scala.Null | IShellListing, scala.Unit] = null,
    OnListingDeactivated: js.Function1[/* newListing */ scala.Null | IShellListing, scala.Unit] = null,
    OnSelectedItemsChanged: js.Function1[/* selectedItems */ IShellItems, scala.Unit] = null,
    OnSelectionChanged: js.Function1[/* selectedItems */ IShellItems, scala.Unit] = null,
    OnShowContextMenu: js.Function1[/* selectedItems */ IShellItems, scala.Unit] = null,
    OnShowMainMenu: js.Function1[/* selectedItems */ IShellItems, scala.Unit] = null,
    OnStarted: js.Function0[scala.Unit] = null,
    OnStop: js.Function0[scala.Unit] = null
  ): IShellListingEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Register")(Register)
    __obj.updateDynamic("Unregister")(Unregister)
    if (OnContentChanged != null) __obj.updateDynamic("OnContentChanged")(OnContentChanged)
    if (OnListingActivated != null) __obj.updateDynamic("OnListingActivated")(OnListingActivated)
    if (OnListingDeactivated != null) __obj.updateDynamic("OnListingDeactivated")(OnListingDeactivated)
    if (OnSelectedItemsChanged != null) __obj.updateDynamic("OnSelectedItemsChanged")(OnSelectedItemsChanged)
    if (OnSelectionChanged != null) __obj.updateDynamic("OnSelectionChanged")(OnSelectionChanged)
    if (OnShowContextMenu != null) __obj.updateDynamic("OnShowContextMenu")(OnShowContextMenu)
    if (OnShowMainMenu != null) __obj.updateDynamic("OnShowMainMenu")(OnShowMainMenu)
    if (OnStarted != null) __obj.updateDynamic("OnStarted")(OnStarted)
    if (OnStop != null) __obj.updateDynamic("OnStop")(OnStop)
    __obj.asInstanceOf[IShellListingEvents]
  }
}

