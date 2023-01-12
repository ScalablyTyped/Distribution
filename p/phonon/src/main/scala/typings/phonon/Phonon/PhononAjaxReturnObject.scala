package typings.phonon.Phonon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhononAjaxReturnObject extends StObject {
  
  def cancel(): Unit
}
object PhononAjaxReturnObject {
  
  inline def apply(cancel: () => Unit): PhononAjaxReturnObject = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[PhononAjaxReturnObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhononAjaxReturnObject] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
