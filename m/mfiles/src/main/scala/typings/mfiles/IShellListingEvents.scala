package typings.mfiles

import typings.mfiles.MFiles.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellListingEvents extends IEvents {
  var OnContentChanged: js.UndefOr[js.Function1[/* items */ IShellItems, Unit]] = js.native
  var OnListingActivated: js.UndefOr[js.Function1[/* oldListing */ Null | IShellListing, Unit]] = js.native
  var OnListingDeactivated: js.UndefOr[js.Function1[/* newListing */ Null | IShellListing, Unit]] = js.native
  var OnSelectedItemsChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnSelectionChanged: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnShowContextMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnShowMainMenu: js.UndefOr[js.Function1[/* selectedItems */ IShellItems, Unit]] = js.native
  var OnStarted: js.UndefOr[js.Function0[Unit]] = js.native
  var OnStop: js.UndefOr[js.Function0[Unit]] = js.native
}

object IShellListingEvents {
  @scala.inline
  def apply(Register: (Event, js.Function) => Double, Unregister: Double => Unit): IShellListingEvents = {
    val __obj = js.Dynamic.literal(Register = js.Any.fromFunction2(Register), Unregister = js.Any.fromFunction1(Unregister))
    __obj.asInstanceOf[IShellListingEvents]
  }
  @scala.inline
  implicit class IShellListingEventsOps[Self <: IShellListingEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnContentChanged(value: /* items */ IShellItems => Unit): Self = this.set("OnContentChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnContentChanged: Self = this.set("OnContentChanged", js.undefined)
    @scala.inline
    def setOnListingActivated(value: /* oldListing */ Null | IShellListing => Unit): Self = this.set("OnListingActivated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnListingActivated: Self = this.set("OnListingActivated", js.undefined)
    @scala.inline
    def setOnListingDeactivated(value: /* newListing */ Null | IShellListing => Unit): Self = this.set("OnListingDeactivated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnListingDeactivated: Self = this.set("OnListingDeactivated", js.undefined)
    @scala.inline
    def setOnSelectedItemsChanged(value: /* selectedItems */ IShellItems => Unit): Self = this.set("OnSelectedItemsChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectedItemsChanged: Self = this.set("OnSelectedItemsChanged", js.undefined)
    @scala.inline
    def setOnSelectionChanged(value: /* selectedItems */ IShellItems => Unit): Self = this.set("OnSelectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("OnSelectionChanged", js.undefined)
    @scala.inline
    def setOnShowContextMenu(value: /* selectedItems */ IShellItems => Unit): Self = this.set("OnShowContextMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowContextMenu: Self = this.set("OnShowContextMenu", js.undefined)
    @scala.inline
    def setOnShowMainMenu(value: /* selectedItems */ IShellItems => Unit): Self = this.set("OnShowMainMenu", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShowMainMenu: Self = this.set("OnShowMainMenu", js.undefined)
    @scala.inline
    def setOnStarted(value: () => Unit): Self = this.set("OnStarted", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStarted: Self = this.set("OnStarted", js.undefined)
    @scala.inline
    def setOnStop(value: () => Unit): Self = this.set("OnStop", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStop: Self = this.set("OnStop", js.undefined)
  }
  
}

