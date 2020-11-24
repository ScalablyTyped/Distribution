package typings.ot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAdapterCallbacks extends js.Object {
  
  def blur(): Unit = js.native
  
  def change(operation: TextOperation, inverse: TextOperation): Unit = js.native
  
  def selectionChange(): Unit = js.native
}
object ClientAdapterCallbacks {
  
  @scala.inline
  def apply(blur: () => Unit, change: (TextOperation, TextOperation) => Unit, selectionChange: () => Unit): ClientAdapterCallbacks = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), change = js.Any.fromFunction2(change), selectionChange = js.Any.fromFunction0(selectionChange))
    __obj.asInstanceOf[ClientAdapterCallbacks]
  }
  
  @scala.inline
  implicit class ClientAdapterCallbacksOps[Self <: ClientAdapterCallbacks] (val x: Self) extends AnyVal {
    
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
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChange(value: (TextOperation, TextOperation) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectionChange(value: () => Unit): Self = this.set("selectionChange", js.Any.fromFunction0(value))
  }
}
