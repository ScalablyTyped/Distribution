package typings.popperjsCore.typesMod

import typings.std.ClientRect
import typings.std.DOMRect
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualElement extends js.Object {
  
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
  implicit class VirtualElementOps[Self <: VirtualElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBoundingClientRect(value: () => ClientRect | DOMRect): Self = this.set("getBoundingClientRect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContextElement(value: Element): Self = this.set("contextElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextElement: Self = this.set("contextElement", js.undefined)
  }
}
