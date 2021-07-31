package typings.popperjsCore.anon

import typings.popperjsCore.typesMod.ClientRectObject
import typings.popperjsCore.typesMod.PositioningStrategy
import typings.popperjsCore.typesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: Rect | ClientRectObject
  
  var placement: js.UndefOr[typings.popperjsCore.enumsMod.Placement] = js.undefined
  
  var reference: Rect | ClientRectObject
  
  var strategy: PositioningStrategy
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
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: Rect | ClientRectObject): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: typings.popperjsCore.enumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setReference(value: Rect | ClientRectObject): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
