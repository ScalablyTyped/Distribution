package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.VisualViewport
import typings.popperjsCore.typesMod.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popper extends StObject {
  
  var popper: js.Array[typings.std.Element | Window | VisualViewport]
  
  var reference: js.Array[typings.std.Element | Window | VisualViewport]
}
object Popper {
  
  @scala.inline
  def apply(
    popper: js.Array[typings.std.Element | Window | VisualViewport],
    reference: js.Array[typings.std.Element | Window | VisualViewport]
  ): Popper = {
    val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popper]
  }
  
  @scala.inline
  implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopper(value: js.Array[typings.std.Element | Window | VisualViewport]): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperVarargs(value: (typings.std.Element | Window | VisualViewport)*): Self = StObject.set(x, "popper", js.Array(value :_*))
    
    @scala.inline
    def setReference(value: js.Array[typings.std.Element | Window | VisualViewport]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceVarargs(value: (typings.std.Element | Window | VisualViewport)*): Self = StObject.set(x, "reference", js.Array(value :_*))
  }
}
