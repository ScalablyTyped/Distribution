package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononSidePanelComponent extends StObject {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
}
object PhononSidePanelComponent {
  
  @scala.inline
  def apply(close: () => Unit, open: () => Unit): PhononSidePanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PhononSidePanelComponent]
  }
  
  @scala.inline
  implicit class PhononSidePanelComponentMutableBuilder[Self <: PhononSidePanelComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
