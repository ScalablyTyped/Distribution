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

