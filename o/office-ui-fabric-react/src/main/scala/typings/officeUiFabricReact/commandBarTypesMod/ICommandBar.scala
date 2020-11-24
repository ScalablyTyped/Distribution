package typings.officeUiFabricReact.commandBarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommandBar extends js.Object {
  
  /**
    * Sets focus to the active command in the list.
    */
  def focus(): Unit = js.native
  
  /**
    * Remeasures the available space.
    */
  def remeasure(): Unit = js.native
}
object ICommandBar {
  
  @scala.inline
  def apply(focus: () => Unit, remeasure: () => Unit): ICommandBar = {
    val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus), remeasure = js.Any.fromFunction0(remeasure))
    __obj.asInstanceOf[ICommandBar]
  }
  
  @scala.inline
  implicit class ICommandBarOps[Self <: ICommandBar] (val x: Self) extends AnyVal {
    
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
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemeasure(value: () => Unit): Self = this.set("remeasure", js.Any.fromFunction0(value))
  }
}
