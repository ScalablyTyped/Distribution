package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateRects extends StObject {
  
  var popper: Rect = js.native
  
  var reference: Rect = js.native
}
object StateRects {
  
  @scala.inline
  def apply(popper: Rect, reference: Rect): StateRects = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateRects]
  }
  
  @scala.inline
  implicit class StateRectsMutableBuilder[Self <: StateRects] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopper(value: Rect): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
