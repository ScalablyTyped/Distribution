package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  /**
    * Specifies if an error is thrown when a popout is blocked by the browser (e.g. by opening it programmatically).
    * If false, the popout call will fail silently.
    * Default: true
    */
  var blockedPopoutsThrowError: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if all popouts should be closed when the page that created them is closed. Popouts don't have a
    * strong dependency on their parent and can exist on their own, but can be quite annoying to close by hand. In
    * addition, any changes made to popouts won't be stored after the parent is closed.
    * Default: true
    */
  var closePopoutsOnUnload: js.UndefOr[Boolean] = js.native
  
  /**
    * Constrains the area in which items can be dragged to the layout's container. Will be set to false
    * automatically when layout.createDragSource() is called.
    * Default: true
    */
  var constrainDragToContainer: js.UndefOr[Boolean] = js.native
  
  /**
    * Turns headers on or off. If false, the layout will be displayed with splitters only.
    * Default: true
    */
  var hasHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * Decides what will be opened in a new window if the user clicks the popout icon. If true the entire stack will
    * be transferred to the new window, if false only the active component will be opened.
    * Default: false
    */
  var popoutWholeStack: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the user can re-arrange the layout by dragging items by their tabs to the desired location.
    * Default: true
    */
  var reorderEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the user can select items by clicking on their header. This sets the value of layout.selectedItem to
    * the clicked item, highlights its header and the layout emits a 'selectionChanged' event.
    * Default: false
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the close icon should be displayed in the header-bar.
    * Default: true
    */
  var showCloseIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the maximise icon should be displayed in the header-bar.
    * Default: true
    */
  var showMaximiseIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies if the popout icon should be displayed in the header-bar.
    * Default: true
    */
  var showPopoutIcon: js.UndefOr[Boolean] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setBlockedPopoutsThrowError(value: Boolean): Self = this.set("blockedPopoutsThrowError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedPopoutsThrowError: Self = this.set("blockedPopoutsThrowError", js.undefined)
    
    @scala.inline
    def setClosePopoutsOnUnload(value: Boolean): Self = this.set("closePopoutsOnUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosePopoutsOnUnload: Self = this.set("closePopoutsOnUnload", js.undefined)
    
    @scala.inline
    def setConstrainDragToContainer(value: Boolean): Self = this.set("constrainDragToContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstrainDragToContainer: Self = this.set("constrainDragToContainer", js.undefined)
    
    @scala.inline
    def setHasHeaders(value: Boolean): Self = this.set("hasHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasHeaders: Self = this.set("hasHeaders", js.undefined)
    
    @scala.inline
    def setPopoutWholeStack(value: Boolean): Self = this.set("popoutWholeStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoutWholeStack: Self = this.set("popoutWholeStack", js.undefined)
    
    @scala.inline
    def setReorderEnabled(value: Boolean): Self = this.set("reorderEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReorderEnabled: Self = this.set("reorderEnabled", js.undefined)
    
    @scala.inline
    def setSelectionEnabled(value: Boolean): Self = this.set("selectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionEnabled: Self = this.set("selectionEnabled", js.undefined)
    
    @scala.inline
    def setShowCloseIcon(value: Boolean): Self = this.set("showCloseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseIcon: Self = this.set("showCloseIcon", js.undefined)
    
    @scala.inline
    def setShowMaximiseIcon(value: Boolean): Self = this.set("showMaximiseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaximiseIcon: Self = this.set("showMaximiseIcon", js.undefined)
    
    @scala.inline
    def setShowPopoutIcon(value: Boolean): Self = this.set("showPopoutIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPopoutIcon: Self = this.set("showPopoutIcon", js.undefined)
  }
}
