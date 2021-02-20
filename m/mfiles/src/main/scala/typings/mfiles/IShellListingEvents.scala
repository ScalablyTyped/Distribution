package typings.mfiles

import typings.mfiles.MFiles.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IShellListingEventsMutableBuilder[Self <: IShellListingEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnContentChanged(value: /* items */ IShellItems => Unit): Self = StObject.set(x, "OnContentChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnContentChangedUndefined: Self = StObject.set(x, "OnContentChanged", js.undefined)
    
    @scala.inline
    def setOnListingActivated(value: /* oldListing */ Null | IShellListing => Unit): Self = StObject.set(x, "OnListingActivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnListingActivatedUndefined: Self = StObject.set(x, "OnListingActivated", js.undefined)
    
    @scala.inline
    def setOnListingDeactivated(value: /* newListing */ Null | IShellListing => Unit): Self = StObject.set(x, "OnListingDeactivated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnListingDeactivatedUndefined: Self = StObject.set(x, "OnListingDeactivated", js.undefined)
    
    @scala.inline
    def setOnSelectedItemsChanged(value: /* selectedItems */ IShellItems => Unit): Self = StObject.set(x, "OnSelectedItemsChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectedItemsChangedUndefined: Self = StObject.set(x, "OnSelectedItemsChanged", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* selectedItems */ IShellItems => Unit): Self = StObject.set(x, "OnSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectionChangedUndefined: Self = StObject.set(x, "OnSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnShowContextMenu(value: /* selectedItems */ IShellItems => Unit): Self = StObject.set(x, "OnShowContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowContextMenuUndefined: Self = StObject.set(x, "OnShowContextMenu", js.undefined)
    
    @scala.inline
    def setOnShowMainMenu(value: /* selectedItems */ IShellItems => Unit): Self = StObject.set(x, "OnShowMainMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowMainMenuUndefined: Self = StObject.set(x, "OnShowMainMenu", js.undefined)
    
    @scala.inline
    def setOnStarted(value: () => Unit): Self = StObject.set(x, "OnStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStartedUndefined: Self = StObject.set(x, "OnStarted", js.undefined)
    
    @scala.inline
    def setOnStop(value: () => Unit): Self = StObject.set(x, "OnStop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnStopUndefined: Self = StObject.set(x, "OnStop", js.undefined)
  }
}
