package typings.popperjsCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateOffsets extends StObject {
  
  var arrow: js.UndefOr[Offsets] = js.undefined
  
  var popper: Offsets
}
object StateOffsets {
  
  @scala.inline
  def apply(popper: Offsets): StateOffsets = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateOffsets]
  }
  
  @scala.inline
  implicit class StateOffsetsMutableBuilder[Self <: StateOffsets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrow(value: Offsets): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    
    @scala.inline
    def setPopper(value: Offsets): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
  }
}
