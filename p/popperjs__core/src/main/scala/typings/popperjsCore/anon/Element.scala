package typings.popperjsCore.anon

import typings.popperjsCore.libTypesMod.ClientRectObject
import typings.popperjsCore.libTypesMod.PositioningStrategy
import typings.popperjsCore.libTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: Rect | ClientRectObject
  
  var placement: js.UndefOr[typings.popperjsCore.libEnumsMod.Placement] = js.undefined
  
  var reference: Rect | ClientRectObject
  
  var strategy: PositioningStrategy
}
object Element {
  
  inline def apply(
    element: Rect | ClientRectObject,
    reference: Rect | ClientRectObject,
    strategy: PositioningStrategy
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Rect | ClientRectObject): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: typings.popperjsCore.libEnumsMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setReference(value: Rect | ClientRectObject): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
  }
}
