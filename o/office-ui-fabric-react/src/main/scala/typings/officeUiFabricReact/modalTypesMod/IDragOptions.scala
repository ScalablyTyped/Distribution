package typings.officeUiFabricReact.modalTypesMod

import typings.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragOptions extends js.Object {
  
  /**
    * The text to use for the modal close menu item
    */
  var closeMenuItemText: String = js.native
  
  /**
    * Optional selector for the element where the drag can be initiated. If not supplied when
    * isDraggable is true dragging can be initated by the whole contents of the modal
    */
  var dragHandleSelector: js.UndefOr[String] = js.native
  
  /**
    * Whether the draggable content should be prevented from going off-screen
    */
  var keepInBounds: js.UndefOr[Boolean] = js.native
  
  /**
    * IconProps for the icon used to indicate that the dialog is in keyboard move mode
    */
  var keyboardMoveIconProps: js.UndefOr[IIconProps] = js.native
  
  /**
    * The Draggable Control Menu so that the draggable zone can be moved via the keyboard
    */
  var menu: FunctionComponent[IContextualMenuProps] = js.native
  
  /**
    * The text to use for the modal move menu item
    */
  var moveMenuItemText: String = js.native
}
object IDragOptions {
  
  @scala.inline
  def apply(closeMenuItemText: String, menu: FunctionComponent[IContextualMenuProps], moveMenuItemText: String): IDragOptions = {
    val __obj = js.Dynamic.literal(closeMenuItemText = closeMenuItemText.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], moveMenuItemText = moveMenuItemText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragOptions]
  }
  
  @scala.inline
  implicit class IDragOptionsOps[Self <: IDragOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseMenuItemText(value: String): Self = this.set("closeMenuItemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenu(value: FunctionComponent[IContextualMenuProps]): Self = this.set("menu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveMenuItemText(value: String): Self = this.set("moveMenuItemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragHandleSelector(value: String): Self = this.set("dragHandleSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragHandleSelector: Self = this.set("dragHandleSelector", js.undefined)
    
    @scala.inline
    def setKeepInBounds(value: Boolean): Self = this.set("keepInBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepInBounds: Self = this.set("keepInBounds", js.undefined)
    
    @scala.inline
    def setKeyboardMoveIconProps(value: IIconProps): Self = this.set("keyboardMoveIconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardMoveIconProps: Self = this.set("keyboardMoveIconProps", js.undefined)
  }
}
