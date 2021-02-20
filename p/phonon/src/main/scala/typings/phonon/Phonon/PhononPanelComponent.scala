package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhononPanelComponent extends StObject {
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
}
object PhononPanelComponent {
  
  @scala.inline
  def apply(close: () => Unit, open: () => Unit): PhononPanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PhononPanelComponent]
  }
  
  @scala.inline
  implicit class PhononPanelComponentMutableBuilder[Self <: PhononPanelComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
