package typings.popperjsCore.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateRects extends StObject {
  
  var popper: Rect
  
  var reference: Rect
}
object StateRects {
  
  inline def apply(popper: Rect, reference: Rect): StateRects = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateRects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateRects] (val x: Self) extends AnyVal {
    
    inline def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
