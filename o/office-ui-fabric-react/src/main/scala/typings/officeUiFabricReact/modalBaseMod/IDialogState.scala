package typings.officeUiFabricReact.modalBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogState extends js.Object {
  
  var hasBeenOpened: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var isInKeyboardMoveMode: js.UndefOr[Boolean] = js.native
  
  var isModalMenuOpen: js.UndefOr[Boolean] = js.native
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var isVisible: js.UndefOr[Boolean] = js.native
  
  var isVisibleClose: js.UndefOr[Boolean] = js.native
  
  var modalRectangleTop: js.UndefOr[Double] = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object IDialogState {
  
  @scala.inline
  def apply(x: Double, y: Double): IDialogState = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogState]
  }
  
  @scala.inline
  implicit class IDialogStateOps[Self <: IDialogState] (val x: Self) extends AnyVal {
    
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBeenOpened(value: Boolean): Self = this.set("hasBeenOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBeenOpened: Self = this.set("hasBeenOpened", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsInKeyboardMoveMode(value: Boolean): Self = this.set("isInKeyboardMoveMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInKeyboardMoveMode: Self = this.set("isInKeyboardMoveMode", js.undefined)
    
    @scala.inline
    def setIsModalMenuOpen(value: Boolean): Self = this.set("isModalMenuOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModalMenuOpen: Self = this.set("isModalMenuOpen", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    
    @scala.inline
    def setIsVisibleClose(value: Boolean): Self = this.set("isVisibleClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVisibleClose: Self = this.set("isVisibleClose", js.undefined)
    
    @scala.inline
    def setModalRectangleTop(value: Double): Self = this.set("modalRectangleTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalRectangleTop: Self = this.set("modalRectangleTop", js.undefined)
  }
}
