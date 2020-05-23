package typings.openfin.GoldenLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /**
    * Specifies if an error is thrown when a popout is blocked by the browser (e.g. by opening it programmatically).
    * If false, the popout call will fail silently.
    * Default: true
    */
  var blockedPopoutsThrowError: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if all popouts should be closed when the page that created them is closed. Popouts don't have a
    * strong dependency on their parent and can exist on their own, but can be quite annoying to close by hand. In
    * addition, any changes made to popouts won't be stored after the parent is closed.
    * Default: true
    */
  var closePopoutsOnUnload: js.UndefOr[Boolean] = js.undefined
  /**
    * Constrains the area in which items can be dragged to the layout's container. Will be set to false
    * automatically when layout.createDragSource() is called.
    * Default: true
    */
  var constrainDragToContainer: js.UndefOr[Boolean] = js.undefined
  /**
    * Turns headers on or off. If false, the layout will be displayed with splitters only.
    * Default: true
    */
  var hasHeaders: js.UndefOr[Boolean] = js.undefined
  /**
    * Decides what will be opened in a new window if the user clicks the popout icon. If true the entire stack will
    * be transferred to the new window, if false only the active component will be opened.
    * Default: false
    */
  var popoutWholeStack: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the user can re-arrange the layout by dragging items by their tabs to the desired location.
    * Default: true
    */
  var reorderEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the user can select items by clicking on their header. This sets the value of layout.selectedItem to
    * the clicked item, highlights its header and the layout emits a 'selectionChanged' event.
    * Default: false
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the close icon should be displayed in the header-bar.
    * Default: true
    */
  var showCloseIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the maximise icon should be displayed in the header-bar.
    * Default: true
    */
  var showMaximiseIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies if the popout icon should be displayed in the header-bar.
    * Default: true
    */
  var showPopoutIcon: js.UndefOr[Boolean] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    blockedPopoutsThrowError: js.UndefOr[Boolean] = js.undefined,
    closePopoutsOnUnload: js.UndefOr[Boolean] = js.undefined,
    constrainDragToContainer: js.UndefOr[Boolean] = js.undefined,
    hasHeaders: js.UndefOr[Boolean] = js.undefined,
    popoutWholeStack: js.UndefOr[Boolean] = js.undefined,
    reorderEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionEnabled: js.UndefOr[Boolean] = js.undefined,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    showMaximiseIcon: js.UndefOr[Boolean] = js.undefined,
    showPopoutIcon: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blockedPopoutsThrowError)) __obj.updateDynamic("blockedPopoutsThrowError")(blockedPopoutsThrowError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closePopoutsOnUnload)) __obj.updateDynamic("closePopoutsOnUnload")(closePopoutsOnUnload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDragToContainer)) __obj.updateDynamic("constrainDragToContainer")(constrainDragToContainer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHeaders)) __obj.updateDynamic("hasHeaders")(hasHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(popoutWholeStack)) __obj.updateDynamic("popoutWholeStack")(popoutWholeStack.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reorderEnabled)) __obj.updateDynamic("reorderEnabled")(reorderEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionEnabled)) __obj.updateDynamic("selectionEnabled")(selectionEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMaximiseIcon)) __obj.updateDynamic("showMaximiseIcon")(showMaximiseIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPopoutIcon)) __obj.updateDynamic("showPopoutIcon")(showPopoutIcon.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

