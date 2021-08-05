package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononSidePanelComponent extends StObject {
  
  def close(): Unit
  
  def open(): Unit
}
object PhononSidePanelComponent {
  
  inline def apply(close: () => Unit, open: () => Unit): PhononSidePanelComponent = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[PhononSidePanelComponent]
  }
  
  extension [Self <: PhononSidePanelComponent](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
