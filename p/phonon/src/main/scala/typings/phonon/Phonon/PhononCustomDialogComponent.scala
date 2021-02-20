package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
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
  implicit class PhononCustomDialogComponentMutableBuilder[Self <: PhononCustomDialogComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
