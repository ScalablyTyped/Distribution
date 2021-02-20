package typings.popperjsCore.typesMod

import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualElement extends StObject {
  
  var contextElement: js.UndefOr[Element] = js.native
  
  def getBoundingClientRect(): ClientRect | DOMRect = js.native
}
object VirtualElement {
  
  @scala.inline
  def apply(getBoundingClientRect: () => ClientRect | DOMRect): VirtualElement = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
    __obj.asInstanceOf[VirtualElement]
  }
  
  @scala.inline
  implicit class VirtualElementMutableBuilder[Self <: VirtualElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextElement(value: Element): Self = StObject.set(x, "contextElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextElementUndefined: Self = StObject.set(x, "contextElement", js.undefined)
    
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect | DOMRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
  }
}
