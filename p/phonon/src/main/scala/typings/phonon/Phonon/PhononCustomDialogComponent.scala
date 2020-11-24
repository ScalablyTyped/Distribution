package typings.phonon.Phonon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononCustomDialogComponent extends PhononDialogComponent {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
}
object PhononCustomDialogComponent {
  
  @scala.inline
  def apply(
    close: () => Unit,
    on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => PhononDialogComponent,
    open: () => Unit
  ): PhononCustomDialogComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PhononCustomDialogComponent]
  }
  
  @scala.inline
  implicit class PhononCustomDialogComponentOps[Self <: PhononCustomDialogComponent] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
  }
}
