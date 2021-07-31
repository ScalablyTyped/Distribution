package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAdapterCallbacks extends StObject {
  
  def blur(): Unit
  
  def change(operation: TextOperation, inverse: TextOperation): Unit
  
  def selectionChange(): Unit
}
object ClientAdapterCallbacks {
  
  @scala.inline
  def apply(blur: () => Unit, change: (TextOperation, TextOperation) => Unit, selectionChange: () => Unit): ClientAdapterCallbacks = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), change = js.Any.fromFunction2(change), selectionChange = js.Any.fromFunction0(selectionChange))
    __obj.asInstanceOf[ClientAdapterCallbacks]
  }
  
  @scala.inline
  implicit class ClientAdapterCallbacksMutableBuilder[Self <: ClientAdapterCallbacks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChange(value: (TextOperation, TextOperation) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectionChange(value: () => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction0(value))
  }
}
