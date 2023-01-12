package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GradientRule extends StObject {
  
  /** The final interpolation point. */
  var maxpoint: js.UndefOr[InterpolationPoint] = js.undefined
  
  /** An optional midway interpolation point. */
  var midpoint: js.UndefOr[InterpolationPoint] = js.undefined
  
  /** The starting interpolation point. */
  var minpoint: js.UndefOr[InterpolationPoint] = js.undefined
}
object GradientRule {
  
  inline def apply(): GradientRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GradientRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GradientRule] (val x: Self) extends AnyVal {
    
    inline def setMaxpoint(value: InterpolationPoint): Self = StObject.set(x, "maxpoint", value.asInstanceOf[js.Any])
    
    inline def setMaxpointUndefined: Self = StObject.set(x, "maxpoint", js.undefined)
    
    inline def setMidpoint(value: InterpolationPoint): Self = StObject.set(x, "midpoint", value.asInstanceOf[js.Any])
    
    inline def setMidpointUndefined: Self = StObject.set(x, "midpoint", js.undefined)
    
    inline def setMinpoint(value: InterpolationPoint): Self = StObject.set(x, "minpoint", value.asInstanceOf[js.Any])
    
    inline def setMinpointUndefined: Self = StObject.set(x, "minpoint", js.undefined)
  }
}
