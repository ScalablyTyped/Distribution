package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.ClientRectObject
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  var element: Rect | ClientRectObject = js.native
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.native
  
  var reference: Rect | ClientRectObject = js.native
  
  var strategy: PositioningStrategy = js.native
}
object Element {
  
  @scala.inline
  def apply(
    element: Rect | ClientRectObject,
    reference: Rect | ClientRectObject,
    strategy: PositioningStrategy
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Rect | ClientRectObject): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Rect | ClientRectObject): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
  }
}
