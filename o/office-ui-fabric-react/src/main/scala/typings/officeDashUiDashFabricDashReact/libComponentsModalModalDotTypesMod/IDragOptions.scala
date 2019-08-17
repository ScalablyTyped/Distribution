package typings.officeDashUiDashFabricDashReact.libComponentsModalModalDotTypesMod

import typings.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod.IIconProps
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragOptions extends js.Object {
  /**
    * The text to use for the modal close menu item
    */
  var closeMenuItemText: String
  /**
    * Optional selector for the element where the drag can be initiated. If not supplied when
    * isDraggable is true dragging can be initated by the whole contents of the modal
    */
  var dragHandleSelector: js.UndefOr[String] = js.undefined
  /**
    * IconProps for the icon used to indicate that the dialog is in keyboard move mode
    */
  var keyboardMoveIconProps: js.UndefOr[IIconProps] = js.undefined
  /**
    * The Draggable Control Menu so that the draggable zone can be moved via the keyboard
    */
  var menu: StatelessComponent[IContextualMenuProps]
  /**
    * The text to use for the modal move menu item
    */
  var moveMenuItemText: String
}

object IDragOptions {
  @scala.inline
  def apply(
    closeMenuItemText: String,
    menu: StatelessComponent[IContextualMenuProps],
    moveMenuItemText: String,
    dragHandleSelector: String = null,
    keyboardMoveIconProps: IIconProps = null
  ): IDragOptions = {
    val __obj = js.Dynamic.literal(closeMenuItemText = closeMenuItemText, menu = menu, moveMenuItemText = moveMenuItemText)
    if (dragHandleSelector != null) __obj.updateDynamic("dragHandleSelector")(dragHandleSelector)
    if (keyboardMoveIconProps != null) __obj.updateDynamic("keyboardMoveIconProps")(keyboardMoveIconProps)
    __obj.asInstanceOf[IDragOptions]
  }
}

