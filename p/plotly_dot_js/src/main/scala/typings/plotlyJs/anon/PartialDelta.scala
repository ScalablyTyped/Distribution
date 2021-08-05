package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
trait PartialDelta extends StObject {
  
  var decreasing: js.UndefOr[Symbol] = js.undefined
  
  var increasing: js.UndefOr[Symbol] = js.undefined
  
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  
  var reference: js.UndefOr[Double] = js.undefined
  
  var relative: js.UndefOr[Boolean] = js.undefined
  
  var valueformat: js.UndefOr[String] = js.undefined
}
object PartialDelta {
  
  inline def apply(): PartialDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDelta]
  }
  
  extension [Self <: PartialDelta](x: Self) {
    
    inline def setDecreasing(value: Symbol): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
    inline def setDecreasingUndefined: Self = StObject.set(x, "decreasing", js.undefined)
    
    inline def setIncreasing(value: Symbol): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    inline def setIncreasingUndefined: Self = StObject.set(x, "increasing", js.undefined)
    
    inline def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
    
    inline def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
    
    inline def setValueformatUndefined: Self = StObject.set(x, "valueformat", js.undefined)
  }
}
